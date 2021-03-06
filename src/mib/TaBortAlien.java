/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class TaBortAlien extends javax.swing.JFrame {

   
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    
     //Vi skapar 3 ArrayLists för att lagra de tre olika rasalternativen i.
    ArrayList<String> squidLista;
    ArrayList<String> bogloditeLista;
    ArrayList<String> wormLista;

    public TaBortAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        
        //I konstruktorn anger vi att de rasunika fälten ska vara osynliga som default.
        lblBoogies.setVisible(false);
        lblBoogiesSvar.setVisible(false);
        lblAntalArmar.setVisible(false);
        lblAntalArmarSvar.setVisible(false);
        lblConfirm.setVisible(false);
        lblError.setVisible(false);

        // Metod anropas från klassen SQL för att fylla ComboBox med info.
        SQL s = new SQL(idb);
        s.alien(cmbNamn);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitel = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblAlienLosenord = new javax.swing.JLabel();
        lblAlienID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAlienTelefon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        lblAlienRas = new javax.swing.JLabel();
        lblAlienPlats = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblBoogies = new javax.swing.JLabel();
        lblBoogiesSvar = new javax.swing.JLabel();
        lblAntalArmar = new javax.swing.JLabel();
        lblAntalArmarSvar = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRadera = new javax.swing.JToggleButton();
        btnTillbaka = new javax.swing.JToggleButton();
        cmbNamn = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuStartsida = new javax.swing.JMenu();
        menuInget = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        lblTitel.setText("MiB ");

        lblNamn.setText("Namn");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Lösenord:");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblID.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblID.setText("ID:");
        lblID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAlienLosenord.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienLosenord.setText("**********");

        lblAlienID.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienID.setText("-");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Telefon:");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAlienTelefon.setText("-");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Ras:");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("Plats:");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setText("Ansvarig agent:");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSok.setText("SÖK");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        lblAlienRas.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienRas.setText("-");

        lblAlienPlats.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienPlats.setText("-");

        lblAnsvarigAgent.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAnsvarigAgent.setText("-");

        lblBoogies.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblBoogies.setText("Antal Boogies:");
        lblBoogies.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBoogiesSvar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblBoogiesSvar.setText("-");

        lblAntalArmar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAntalArmar.setText("Antal Armar:");
        lblAntalArmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAntalArmarSvar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAntalArmarSvar.setText("-");

        lblConfirm.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        lblConfirm.setForeground(new java.awt.Color(0, 255, 0));
        lblConfirm.setText("Sökningen lyckades. Förvärvad information om den aktuella livsformen:");

        lblError.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Sökningen misslyckades. Kontakta MiB Service Support.");

        jLabel3.setText("Ta bort alien");

        btnRadera.setText("Radera alien");
        btnRadera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRaderaMouseClicked(evt);
            }
        });

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        menuStartsida.setText("Gå till startsida");
        menuStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStartsida);

        menuInget.setText("                                                                                                                                                                                         ");
        jMenuBar1.add(menuInget);

        menuLoggaUt.setText("Logga ut");
        menuLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLoggaUtMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLoggaUt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addGap(208, 208, 208)
                        .addComponent(btnRadera))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(lblAntalArmar))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAlienLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAlienPlats)
                                        .addComponent(lblAnsvarigAgent)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAlienRas)
                                            .addGap(202, 202, 202)
                                            .addComponent(lblBoogiesSvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblAntalArmarSvar)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblID)
                                        .addComponent(jLabel5))
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(lblBoogies))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirm)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTitel)
                                            .addGap(9, 9, 9))
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNamn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSok)))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(btnSok)
                    .addComponent(cmbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblAlienID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAlienTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAlienLosenord))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblAlienPlats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAnsvarigAgent))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAlienRas)
                    .addComponent(lblBoogies)
                    .addComponent(lblBoogiesSvar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntalArmar)
                    .addComponent(lblAntalArmarSvar))
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnRadera))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metoden söker upp information om vald agent.
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked

        try {

            // ArrayListorna fylls på med ID-värden om de olika raserna. 
            squidLista = idb.fetchColumn("SELECT Alien_ID FROM squid ORDER BY Alien_ID");
            bogloditeLista = idb.fetchColumn("SELECT Alien_ID FROM boglodite ORDER BY Alien_ID");
            wormLista = idb.fetchColumn("SELECT Alien_ID FROM worm ORDER BY Alien_ID");

            // Valt värde hämtas från ComboBox.
            String namn = cmbNamn.getSelectedItem().toString();

            // Lokala variabler för fälten.
            String soktID = idb.fetchSingle("SELECT alien_ID FROM alien WHERE namn = '" + namn + "'");
            int soktIDint = Integer.parseInt(soktID);

            // Nästlad SQL-fråga för att kunna visa namnet på agenten i stället för dess AgentID.
            String alienAgentNamn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID IN (SELECT Ansvarig_Agent FROM Alien where Alien_ID = " + soktIDint + ")");

            // Nästlad SQL-fråga för att kunna visa namnet på platsen istället för platsID.
            String alienPlats = idb.fetchSingle("SELECT Benamning FROM Plats WHERE Plats_ID IN(SELECT Plats from Alien where Alien_ID =" + soktIDint + ")");

            // SQL-frågor som hämtar aliens lösenord, namn och telefon från databasen.  
            String alienLosenord = idb.fetchSingle("SELECT Losenord FROM Alien where Alien_ID = " + soktIDint + "");
            String alienNamn = idb.fetchSingle("SELECT Namn FROM Alien where Alien_ID = " + soktIDint + "");
            String alienTelefon = idb.fetchSingle("SELECT Telefon FROM Alien where Alien_ID = " + soktIDint + "");

            // Här anger vi vad vi vill ska stå i våra labels, det vill säga informationen om den eftersökta alien.
            lblAlienLosenord.setText(alienLosenord);
            lblAlienID.setText(alienNamn);
            lblAlienTelefon.setText(alienTelefon);
            lblAlienPlats.setText(alienPlats);
            lblAnsvarigAgent.setText(alienAgentNamn);

            // Rubriken visas när sökningen går igenom som en bekräftelse för användaren. 
            lblConfirm.setVisible(true);

            // Här arbetar vi med villkorssatser för att "söka" efter valt ID i våra listor.
            // Om ID finns i någon av dessa tillkommer viss information beroende på ras.
            if (squidLista.contains(soktID)) {
                String antalArmar = idb.fetchSingle("SELECT Antal_Armar FROM squid WHERE Alien_ID = '" + soktID + "'");
                lblAlienRas.setText("Squid");

                // Rubriker görs synliga och osynliga för användaren.
                lblAntalArmar.setVisible(true);
                lblAntalArmarSvar.setVisible(true);
                lblAntalArmarSvar.setText(antalArmar);
                lblBoogies.setVisible(false);
                lblBoogiesSvar.setVisible(false);

            } else if (bogloditeLista.contains(soktID)) {
                String antalBoogies = idb.fetchSingle("SELECT Antal_Boogies FROM boglodite WHERE Alien_ID = '" + soktID + "'");
                lblAlienRas.setText("Boglodite");

                // Rubriker görs synliga och osynliga för användaren.
                lblBoogies.setVisible(true);
                lblBoogiesSvar.setVisible(true);
                lblBoogiesSvar.setText(antalBoogies);
                lblAntalArmar.setVisible(false);
                lblAntalArmarSvar.setVisible(false);

            } else if (wormLista.contains(soktID)) {
                lblAlienRas.setText("Worm");

                // Rubriker görs synliga och osynliga för användaren.
                lblAntalArmar.setVisible(false);
                lblAntalArmarSvar.setVisible(false);
                lblBoogies.setVisible(false);
                lblBoogiesSvar.setVisible(false);

            } else {
                // Rubriker görs synliga och osynliga för användaren.
                lblAlienRas.setText("Okänd");

                // Rubriker görs synliga och osynliga för användaren.
                lblAntalArmar.setVisible(false);
                lblAntalArmarSvar.setVisible(false);
                lblBoogies.setVisible(false);
                lblBoogiesSvar.setVisible(false);
            }

        } //Hit kommer vi om det uppstår ett undantag, det vill säga att exempelvis villkorssatserna inte fungerar.
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");

            // Rubrik görs synlig för användaren.
            lblError.setVisible(true);
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }//GEN-LAST:event_btnSokMouseClicked

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAdmin i nytt fönster.
    private void menuStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_menuStartsidaMouseClicked

    // Metoden gör nuvarande fönster osynligt och öppnar klassen Inloggning i nytt fönster. Denna metod gör så att man blir utloggad.
    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked

    // Metoden raderar information om det valda ID:t som man har sökt upp.
    private void btnRaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRaderaMouseClicked

        // En dubbelkontroll för om man verkligen vill radera informationen sker. Detta görs med metoden showConfirmDialog. 
        int input = JOptionPane.showConfirmDialog(null, "Vill du verkligen radera vald alien?", "Är du säker?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Metoden använder 0 och 1 som input på svar. 0 = ja. Om detta väljs så går metoden vidare och raderar informationen. 
        if (input == 0) {
            try {

                // Valt värde hämtas från ComboBox.
                String namn = cmbNamn.getSelectedItem().toString();

                // ID hämtas från databas baserat på valt värde i ComboBox.§
                String alienID = idb.fetchSingle("SELECT alien_ID FROM alien WHERE namn = '" + namn + "'");

                // Här raderas information från tabellen alien.
                idb.delete("DELETE FROM alien WHERE Alien_ID = '" + alienID + "'");

                // För att kunna kontrollera vilken tabell som sökt ID finns inom (Ras) används tre ArrayLists där man lagrar information om värdena. 
                bogloditeLista = idb.fetchColumn("SELECT Alien_ID FROM boglodite ORDER BY Alien_ID");
                squidLista = idb.fetchColumn("SELECT Alien_ID FROM squid ORDER BY Alien_ID");
                wormLista = idb.fetchColumn("SELECT Alien_ID FROM worm ORDER BY Alien_ID");

                // Beroende på vilken tabell som används raderas värdena i rastabell baserat på sökt ID. 
                if (bogloditeLista.contains(alienID)) {
                    idb.delete("DELETE FROM Boglodite WHERE Alien_ID = '" + alienID + "'");
                } else if (squidLista.contains(alienID)) {
                    idb.delete("DELETE FROM Squid WHERE Alien_ID = '" + alienID + "'");
                } else if (wormLista.contains(alienID)) {
                    idb.delete("DELETE FROM Worm WHERE Alien_ID = '" + alienID + "'");
                }

                // Information skrivs ut till användaren om att det lyckades.
                JOptionPane.showMessageDialog(null, "Vald alien är raderad!");

                // Efter att ha raderat informationen skickas användaren tillbaka till sidan innan. 
                btnTillbakaMouseClicked(evt);

            } //Hit kommer vi om det uppstår ett undantag, det vill säga att exempelvis villkorssatserna inte fungerar.
            catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        }

    }//GEN-LAST:event_btnRaderaMouseClicked
// Metoden gör nuvarande fönster osynligt och öppnar klassen HanteraAliensAdmin i nytt fönster. Denna metod gör så att man blir utloggad.
    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        setVisible(false);
        HanteraAliensAdmin hanteraAliens = new HanteraAliensAdmin(idb, anvId, anvTyp);
        hanteraAliens.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRadera;
    private javax.swing.JButton btnSok;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbNamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAlienLosenord;
    private javax.swing.JLabel lblAlienPlats;
    private javax.swing.JLabel lblAlienRas;
    private javax.swing.JLabel lblAlienTelefon;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblAntalArmar;
    private javax.swing.JLabel lblAntalArmarSvar;
    private javax.swing.JLabel lblBoogies;
    private javax.swing.JLabel lblBoogiesSvar;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JMenu menuInget;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuStartsida;
    // End of variables declaration//GEN-END:variables
}
