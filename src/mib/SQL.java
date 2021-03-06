/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SQL extends javax.swing.JFrame {

    private InfDB idb;

    public SQL(InfDB idb) {
        this.idb = idb;
    }

    /**
     * Hämta alla områden och lägg till dom i en combobox
     */
    public void omraden(JComboBox omrade) {
        try {
            // Hämta alla omraden och spara i lista
            ArrayList<String> omradeLista = idb.fetchColumn("SELECT Benamning FROM omrade ORDER BY Benamning");
            // Loopa igenom lista och lägg till dom i combobox, en efter en
            for (int i = 0; i < omradeLista.size(); i++) {
                String omradesNamn = omradeLista.get(i);
                omrade.addItem(omradesNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämta alla platser och lägg till dem i en combobox
     */
    public void plats(JComboBox plats) {
        try {
            // Hämta alla platser och spara i lista
            ArrayList<String> platsLista = idb.fetchColumn("SELECT Benamning FROM plats ORDER BY Benamning");
            // Loopa igenom lista och lägg till dom i combobox, en efter en
            for (int i = 0; i < platsLista.size(); i++) {
                String omradesNamn = platsLista.get(i);
                plats.addItem(omradesNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämtar alla agenter och lägger till dem i en combobox
     */
    public void agent(JComboBox x) {
        try {
            // Hämta alla agenter och spara i lista
            ArrayList<String> agentLista = idb.fetchColumn("SELECT namn FROM agent ORDER BY namn");
            // Loopa igenom lista och lägg till dom i combobox, en efter en
            for (int i = 0; i < agentLista.size(); i++) {
                String namn = agentLista.get(i);
                x.addItem(namn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämtar all utrustning och lägger till dem i en combobox
     */
    public void utrustning(JComboBox x) {
        try {
            // Hämta all utrustning och spara i lista
            ArrayList<String> utrustningsLista = idb.fetchColumn("SELECT Benamning FROM utrustning");
            // Loopa igenom lista och lägg till dom i combobox, en efter en
            for (int i = 0; i < utrustningsLista.size(); i++) {
                String namn = utrustningsLista.get(i);
                x.addItem(namn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämtar alla aliens och lägger till dem i en combobox
     */
    public void alien(JComboBox x) {
        try {
            // Hämta alla aliens och spara i lista
            ArrayList<String> alienLista = idb.fetchColumn("SELECT namn FROM alien ORDER BY namn");
            // Loopa igenom lista och lägg till dom i combobox, en efter en
            for (int i = 0; i < alienLista.size(); i++) {
                String agentNamn = alienLista.get(i);
                x.addItem(agentNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Fyll TextArea med lista över aliens från en vald plats
     *
     * @param valdPlatsID
     * @param txtLista
     */
    public void fyllListaAlienPlats(int valdPlatsID, JTextArea txtLista) {
        //Tömmer TextArea så att användaren kan göra flera sökningar utan
        // att listan blir längre och längre
        txtLista.setText("");
        // Skapar listor att spara data i
        ArrayList<HashMap<String, String>> alienIDLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> namnLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> telefonLista = new ArrayList<>();
        try {
            // Hämtar alien info från alien-tabellen och sparar i listor
            alienIDLista = idb.fetchRows("SELECT alien_ID from alien WHERE plats = " + valdPlatsID);
            namnLista = idb.fetchRows("SELECT namn from alien WHERE plats = " + valdPlatsID);
            telefonLista = idb.fetchRows("SELECT telefon from alien WHERE plats = " + valdPlatsID);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: fyllLista() " + e.getMessage());
        }
        // Lägger till en rubrik högst upp i listan
        txtLista.append("AlienID \t Namn \t\t Telefon \n");
        // Loopar igenom listorna och plockar ut info
        for (int i = 0; i < alienIDLista.size(); i++) {
            String a = alienIDLista.get(i).get("alien_ID");
            String n = namnLista.get(i).get("namn");
            String t = telefonLista.get(i).get("telefon");
            // Lägger till info i textArea, rad för rad
            txtLista.append(a + " \t " + n + " \t\t" + t + "\n");
        }
    }

    /**
     * Fyll text area med aliens efter vald ras
     *
     * @param valdRas
     * @param txtLista
     */
    public void fyllListaAlienRas(String valdRas, JTextArea txtLista) {
        // nollställ textarea inför en ny sökning
        txtLista.setText("");
        // Skapar listor att spara info i
        ArrayList<String> alienIDRasLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> namnLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> telefonLista = new ArrayList<>();

        // Listans rubriker
        txtLista.append("AlienID \t Namn \t\t Telefon \n");
        try {

            // hämta alla alienID i tabellen för vald ras
            alienIDRasLista = idb.fetchColumn("SELECT alien_ID from " + valdRas);

            // loopa igenom alien-tabellen och spara info om aliens med IDn från alienIDRasLista
            for (int i = 0; i < alienIDRasLista.size(); i++) {

                namnLista = idb.fetchRows("SELECT namn from alien WHERE alien_ID = " + alienIDRasLista.get(i));
                telefonLista = idb.fetchRows("SELECT telefon from alien WHERE alien_ID = " + alienIDRasLista.get(i));

                String a = alienIDRasLista.get(i);
                // tittar på indexplats 'i' i arraylisten och sedan under nyckeln 'namn' i hashmap
                String n = namnLista.get(i).get("namn");
                String t = telefonLista.get(i).get("telefon");
                // Skriver ut info i textarea, en rad per loop
                txtLista.append(a + " \t " + n + " \t\t" + t + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: fyllListaAlienRas() " + e.getMessage());
        }

    }

    /**
     * Hämta platser utifrån vilket område användaren valt och lägg till dom i
     * ComboBox
     *
     * @param valtOmrade
     * @param cmbPlats
     */
    public void getPlatser(String valtOmrade, JComboBox cmbPlats) {
        try {
            // Hämta ID för valt område
            String valtOmradeID = idb.fetchSingle("SELECT omrades_ID FROM omrade WHERE benamning = '" + valtOmrade + "'");
            // Spara alla platser som finns i området
            ArrayList<HashMap<String, String>> listaPlatser = idb.fetchRows("SELECT Benamning FROM plats WHERE Finns_I = " + valtOmradeID + "");
            // loopa igenom lista och lägg till alla områden i drop down menyn 
            for (int i = 0; i < listaPlatser.size(); i++) {
                String plats = listaPlatser.get(i).get("Benamning");
                cmbPlats.addItem(plats);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Kolla om agenten är ansvarig över någon alien
     *
     * @param soktID
     * @param idb
     * @return
     */
    public static boolean agentHarAlien(String soktID, InfDB idb) {
        boolean resultat = true;
        String count = "";

        try {
            // Kolla hur många aliens en agent är ansvarig över genom att räkna rader
            // I databasen i vilka det aktuella agentID:t förekommer
            count = idb.fetchSingle("SELECT count(alien_ID) FROM alien WHERE ansvarig_agent = " + soktID);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: agentHarAlien() " + e.getMessage());
        }
        // om agenten inte är ansvarig förnågra aliens, returnera false, annars true
        if (count.equals("0")) {
            resultat = false;
        }
        return resultat;
    }

    /**
     * Fyll text area med lista på vilka aliens en specifik agent är ansvarig
     * för
     *
     * @param agent_ID
     * @param txtAreaAliens
     */
    public void getAliensForAnsvaigAgent(String agent_ID, JTextArea txtAreaAliens) {
        // Töm textarea inför ny sökning
        txtAreaAliens.setText("");
        // Skriv ut rubrik i textares
        txtAreaAliens.append("Alien ID \t Namn \n");

        ArrayList<HashMap<String, String>> IdLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> namnLista = new ArrayList<>();

        try {
            // Hämta namn och ID för de aliens som har den specifika agenten som ansvarig
            IdLista = idb.fetchRows("SELECT alien_ID FROM alien WHERE ansvarig_agent = " + agent_ID + " ORDER BY alien_ID ASC");
            namnLista = idb.fetchRows("SELECT namn FROM alien WHERE ansvarig_agent = " + agent_ID + " ORDER BY alien_ID ASC");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: getAliensForAnsvarigAgent() " + e.getMessage());
        }
        // Loopa igenom lista och skriv ut info i textarea
        for (int i = 0; i < IdLista.size(); i++) {
            txtAreaAliens.append(IdLista.get(i).get("alien_ID") + "\t" + namnLista.get(i).get("namn") + "\n");
        }
    }

    /**
     * Fyll text area med lista över vilka aliens som registrerats under en viss
     * tidsperiod
     *
     * @param franDatum
     * @param tillDatum
     * @param txtAreaListaDatum
     * @param ordning
     */
    public void getRegistreringsdatum(String franDatum, String tillDatum, JTextArea txtAreaListaDatum, String ordning) {

        // Tar in användarinmatningen i en array. Användaren matar in ÅÅÅÅ-MM-DD, här splittas det upp så år, månad och dag hamnar
        // på varsin indexplats
        String[] fran = franDatum.split("-");
        String[] till = tillDatum.split("-");
        // Variabler att spara datumet i Stringformat utan bildestreck
        String franDatumString = "";
        String tillDatumString = "";

        // Variabler att spara datum i int-format för att kunna lista dem i datumordning i textarean
        int franDatumInt = 0;
        int tillDatumInt = 0;

        try {
            // Sätt ihop datumet till ett format som går att parsa, dvs ÅÅÅÅMMDD
            franDatumString = fran[0] + fran[1] + fran[2];
            tillDatumString = till[0] + till[1] + till[2];

            // Parsa string till int
            franDatumInt = Integer.parseInt(franDatumString);
            tillDatumInt = Integer.parseInt(tillDatumString);

            // Fånga upp tex indexOUtOfBounds pga felinmatning från användaren, eller om användaren inte skrivit siffror och 
            // då inte går att göra parseInt
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att datumen är korrekt ifyllda: ÅÅÅÅ-MM-DD");
        }

        // töm textarea inför ny sökning
        txtAreaListaDatum.setText("");
        // Listans rubriker
        txtAreaListaDatum.append("Reg. datum \t Alien ID \t Namn \n");

        // Listor att spara info i
        ArrayList<String> listaDatum = new ArrayList<>();
        ArrayList<String> listaID = new ArrayList<>();
        ArrayList<String> listaNamn = new ArrayList<>();

        // Variabler att spara SQL-frågor i
        String queryDatum;
        String queryID;
        String queryNamn;

        /* Olika frågor ska ställas till databasen beroende på i vilken ordning användaren vill lista aliens
        Talar också om i vilket format datumet ska hämtas för att kunna parsas till int*/
        if (ordning.equals("Äldsta först")) {
            queryDatum = "SELECT date_format(Registreringsdatum, '%Y%m%d') FROM alien ORDER BY Registreringsdatum ASC";
            queryID = "SELECT alien_ID FROM alien ORDER BY Registreringsdatum ASC";
            queryNamn = "SELECT namn FROM alien ORDER BY Registreringsdatum ASC";
        } else {
            queryDatum = "SELECT date_format(Registreringsdatum, '%Y%m%d') FROM alien ORDER BY Registreringsdatum DESC";
            queryID = "SELECT alien_ID FROM alien ORDER BY Registreringsdatum DESC";
            queryNamn = "SELECT namn FROM alien ORDER BY Registreringsdatum DESC";
        }

        try {
            // Hämta all data från tabellen alien och lägg in i listor
            // Databasfrågorna beror på if-satsen ovan, i vilken ordning som användaren vill visa datan
            listaDatum = idb.fetchColumn(queryDatum);
            listaID = idb.fetchColumn(queryID);
            listaNamn = idb.fetchColumn(queryNamn);

            // Loopa igenom datumlistan och skriv ut info i textarea för de datumDB som håller sig inom önskat spann
            for (int i = 0; i < listaDatum.size(); i++) {
                // Datum från databasen som ska jämföras med datumspann som användaren angett
                String datumDB = listaDatum.get(i);
                // Parsa till int för att kunna jämföra med datumen som användaren skrivit in (och som redan har parsats)
                int datumDBInt = Integer.parseInt(datumDB);

                // om datumet är inom spannet så skrivs aliens info ut i textarea
                if (datumDBInt >= franDatumInt && datumDBInt <= tillDatumInt) {
                    String id = listaID.get(i);
                    String namn = listaNamn.get(i);

                    txtAreaListaDatum.append(datumDB + "\t" + id + "\t" + namn + "\n");
                }
            }
        } catch (InfException e) { // Fångar upp fel i databasfrågorna
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att datumen är korrekt ifyllda: ÅÅÅÅ-MM-DD");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }

    }

    /**
     * Visa områdeschef utifrån ett valt område, setText i en label
     *
     * @param lblChef
     * @param omrade
     */
    public void getOmradeschef(JLabel lblChef, String omrade) {
        try {
            // Hämta ID för området som användaren valt
            String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + omrade + "'");
            // Hämta ID för den agent som är chef över område
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM omradeschef WHERE Omrade =" + omradesID);
            // Utifrån agent_ID hämtas namnet på agenten för att kunna presentera den för användaren
            String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID =" + agentID);

            lblChef.setText("Områdeschef för " + omrade + " är " + agentNamn + "");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Visa vilka kontor som finns i tabellen kontorschef, fyll combobox
     *
     * @param cmbKontor
     */
    public void getKontor(JComboBox cmbKontor) {
        ArrayList<String> kontorLista = new ArrayList<>();
        String kontor = "";
        // hämta alla kontor från DB
        try {
            kontorLista = idb.fetchColumn("SELECT kontorsbeteckning FROM kontorschef");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: hämta kontor" + e.getMessage());
        }
        // loopa igenom lista och lägg till alla kontor i drop down menyn 
        for (int i = 0; i < kontorLista.size(); i++) {
            kontor = kontorLista.get(i);
            cmbKontor.addItem(kontor);
        }
    }

    /**
     * Visa vilken agent som är chef över ett valt kontor, set text i en label
     *
     * @param kontor
     * @param lblNuvChef
     */
    public void getKontorschef(String kontor, JLabel lblNuvChef) {
        String chefID = "";
        String chefNamn = "";
        try {
            // Hämta först agent_ID för chefen och utifrån det hämtas sedan namnet på agenten
            chefID = idb.fetchSingle("SELECT agent_ID FROM kontorschef WHERE kontorsbeteckning = '" + kontor + "'");
            chefNamn = idb.fetchSingle("SELECT namn FROM agent WHERE agent_ID = " + chefID);
            lblNuvChef.setText("Kontorschef för " + kontor + " är " + chefNamn);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: hämta kontorschef" + e.getMessage());
        }
    }

    /**
     * Uppdatera tabellen Omradeschef med en ny chef
     *
     * @param nyChefNamn
     * @param omrade
     */
    public void uppdateraOmradeschef(String nyChefNamn, String omrade, JLabel lblNyChef) {
        String nyChefID = "";
        String omradeID = "";

        // Två listor skapas för att kunna leta upp relevanta agent- och områdeID.
        ArrayList<String> omradesChefsLista = new ArrayList<>();
        ArrayList<String> omradesLista = new ArrayList();

        try {
            //Hämta agentens ID beserat på vilken agent användaren valt i comboboxen
            nyChefID = idb.fetchSingle("SELECT agent_ID FROM agent WHERE namn = '" + nyChefNamn + "'");
            // Hämta områdesID utifrån vilket område användaren valt
            omradeID = idb.fetchSingle("SELECT omrades_ID FROM omrade WHERE benamning = '" + omrade + "'");

            // Hämta ID för alla områdeschefer
            omradesChefsLista = idb.fetchColumn("SELECT agent_ID FROM omradeschef");
            // Hämta alla områden som har en chef
            omradesLista = idb.fetchColumn("SELECT omrade FROM omradeschef");

            // Om den som användaren vill sätta som ny chef redan är chef för något område, dvs finns med i omradesChefsLista
            // Så visas ett meddelande att hen redan är områdeschef. Annars körs följande kod
            if (!omradesChefsLista.contains(nyChefID)) {

                // Om ett område finns med i tabellen uppdateras den, om inte så lägger man till denna information.
                if (omradesLista.contains(omradeID)) {
                    idb.update("UPDATE omradeschef SET agent_ID = " + nyChefID + " WHERE omrade = " + omradeID);
                    // Visar användaren vem som är ny chef. 
                    lblNyChef.setVisible(true);
                    // Visar användaren vem som är ny chef. 
                    lblNyChef.setVisible(true);
                    lblNyChef.setText("Ny chef för " + omrade + " är " + nyChefNamn);
                } else {
                    idb.insert("INSERT INTO omradeschef VALUES (" + nyChefID + ", " + omradeID + ")");
                }
            } else {
                JOptionPane.showMessageDialog(null, nyChefNamn + " är redan omradeschef!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: uppdateraOmradeschef() " + e.getMessage());
        }
        
    }

    /**
     * Uppdatera tabellen kontorschef med en ny chef
     *
     * @param nyChefNamn
     * @param kontor
     */
    public void uppdateraKontorschef(String nyChefNamn, String kontor, JLabel lblNyChef) {
        String nyChefID = "";

        // Två listor skapas för att kunna leta upp relevant agentID och kontorsbenämning.
        ArrayList<String> chefsLista = new ArrayList<>();
        ArrayList<String> kontorsLista = new ArrayList();

        try {
            // Från databasen hämtas information om agentID för vald agent
            nyChefID = idb.fetchSingle("SELECT agent_ID FROM agent WHERE namn = '" + nyChefNamn + "'");

            // Listorna fylls med alla ID  och kontorsnamn som finns i databasen.
            chefsLista = idb.fetchColumn("SELECT agent_ID FROM kontorschef");
            kontorsLista = idb.fetchColumn("SELECT kontorsbeteckning FROM kontorschef");

            // Kontrollerar om agenten redan är kontorschef, dvs den får inte finns med i chefslistan
            if (!chefsLista.contains(nyChefID)) {

                // Om ett kontor finns med i tabellen (dvs har en nyvarnade chef) uppdateras den, om inte så lägger man till denna information.
                if (kontorsLista.contains(kontor)) {
                    idb.update("UPDATE kontorschef SET agent_ID = " + nyChefID + " WHERE kontorsbeteckning = '" + kontor + "'");
                    // Visar användaren vem som är ny chef. 
                    lblNyChef.setVisible(true);
                } else {
                    idb.insert("INSERT INTO kontorschef VALUES (" + nyChefID + ", " + kontor + ")");
                }
            } else {
                JOptionPane.showMessageDialog(null, nyChefNamn + " är redan kontorschef!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: uppdateraKontorschef() " + e.getMessage());
        }
        // Visar användaren vem som är ny chef. 
        lblNyChef.setVisible(true);
        lblNyChef.setText("Ny chef för " + kontor + " är " + nyChefNamn);
    }

    /**
     * Kollar om en agent är administratör
     *
     * @param anvID
     * @return
     */
    public boolean arAdmin(String anvID) {
        boolean result = false;
        String admin = "";

        try {
            admin = idb.fetchSingle("SELECT administrator FROM agent WHERE agent_ID =" + anvID + "");
            if (admin.equals("J")) {
                result = true;
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: arAdmin() " + e.getMessage());
        }
        return result;
    }

    /**
     * Skickar tillbaka användaren till startsida, olika sidor beroende på
     * användartyp
     *
     * @param anvId
     * @param anvTyp
     */
    public void tillStartsida(String anvId, String anvTyp) {
        setVisible(false);
        // anropar metod för att kolla om agenten är admin

        if (anvTyp.equals("Alien")) {
            StartsidaAlien a = new StartsidaAlien(idb, anvId, anvTyp);
            a.setVisible(true);
        } 
        
        else {
        boolean arAdmin = arAdmin(anvId);
        if (arAdmin == true) {
            StartsidaAdmin a = new StartsidaAdmin(idb, anvId, anvTyp);
            a.setVisible(true);
        } else {
            StartsidaAgent a = new StartsidaAgent(idb, anvId, anvTyp);
            a.setVisible(true);
        }
    }
    }  
    /**
     * Kontrollerar så att ett agentnamn inte redan finns i tabellen agent
     *
     * @param rutaAttKolla
     * @return
     */
    public boolean namnFinnsInteAgent(JTextField rutaAttKolla) {
        boolean resultat = true;
        // Hämtar namn som användaren angett
        String namn = rutaAttKolla.getText();

        try {
            // Spara alla agentnamn i en lista
            ArrayList<String> namnLista = idb.fetchColumn("SELECT namn FROM agent");
            // kolla om listan innehåller det aktuella namnet
            if (namnLista.contains(namn)) {
                // Om listan innehåller namnet returneras false
                resultat = false;
                JOptionPane.showMessageDialog(null, "Namnet på agenten finns redan!");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return resultat;
    }

    /**
     * Kontrollerar så att ett agentnamn inte redan finns i tabellen alien
     *
     * @param rutaAttKolla
     * @return
     */
    public boolean namnFinnsInteAlien(JTextField rutaAttKolla) {
        boolean resultat = true;
        //Hämtar namn som användaren angett
        String namn = rutaAttKolla.getText();

        try {
            // Spara alla aliennamn i lista
            ArrayList<String> namnLista = idb.fetchColumn("SELECT namn FROM alien");
            if (namnLista.contains(namn)) {
                // om listan innehåller namnet returneras false
                resultat = false;
                JOptionPane.showMessageDialog(null, "Namnet på alien finns redan!");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return resultat;
    }
}
