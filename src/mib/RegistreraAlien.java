/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Linda, Lisa, Josanna
 */
public class RegistreraAlien extends javax.swing.JFrame {

    // används till konstruktorn
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    private String regAlienID;

    /**
     * Creates new form RegistreraAlien
     */
    public RegistreraAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        // Skriver ut dagens datum i textfield för datum
        nyttDatum();
        // Fyller comboboxar med alternativ för plats ansvarig agent
        SQL s = new SQL(idb);
        s.plats(cmbPlats);
        s.agent(cmbAnsAgent);
        // Visar ett autogenererat ID
        hamtaAlienID(regAlienID);
        // Döljer comboboxar som endast ska synas för vissa raser
        txtRasInfo.setVisible(false);
        lblRasInfo.setVisible(false);
        // Text som visas i manuBar
        menuBarInlogg.setText("Inloggad som " + anvTyp);
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
        txtNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        txtTelefon = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        lblPlats = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        cmbAnsAgent = new javax.swing.JComboBox<>();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        psw1 = new javax.swing.JPasswordField();
        lblRubrik = new javax.swing.JLabel();
        cmbPlats = new javax.swing.JComboBox<>();
        lblPersInfo = new javax.swing.JLabel();
        lblAktResInfo = new javax.swing.JLabel();
        lblUpprepaLosen = new javax.swing.JLabel();
        psw2 = new javax.swing.JPasswordField();
        lblAlienID = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        lblAlienID2 = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();
        lblRasInfo = new javax.swing.JLabel();
        tbValjRas = new javax.swing.JToggleButton();
        btnTillbaka = new javax.swing.JButton();
        lblDatumTips = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarStartsida = new javax.swing.JMenu();
        menuBarTomt = new javax.swing.JMenu();
        menuBarInlogg = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitel.setText("Registrera ny alien");

        lblNamn.setText("Namn");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblTelefon.setText("Telefon");

        lblRas.setText("Ras");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm", "Ingen" }));

        lblPlats.setText("Plats");

        lblConfirm.setForeground(new java.awt.Color(0, 204, 0));

        lblAnsvarigAgent.setText("Ansvarig agent");

        lblLosenord.setText("Lösenord");

        lblRubrik.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        lblRubrik.setText("MiB REGISTRERINGSSERVICE");

        lblPersInfo.setText("Personlig information");

        lblAktResInfo.setText("Aktuell reseinfo");

        lblUpprepaLosen.setText("Upprepa lösenord");

        lblAlienID.setText("AlienID");

        lblDatum.setText("Dagens datum");

        lblAlienID2.setText("ID");

        lblRasInfo.setText("Rasinfo");

        tbValjRas.setText("Välj ras");
        tbValjRas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbValjRasMouseClicked(evt);
            }
        });

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblDatumTips.setText("ÅÅÅÅ-MM-DD");

        menuBarStartsida.setText("Gå till Startsida");
        menuBarStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuBarStartsida);

        menuBarTomt.setText("                                                                                                               ");
        jMenuBar1.add(menuBarTomt);

        menuBarInlogg.setText("Inloggad som Agent");
        jMenuBar1.add(menuBarInlogg);

        menuBarLoggaUt.setText("Logga ut");
        menuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarLoggaUtMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuBarLoggaUt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(lblRubrik)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPersInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn)
                                    .addComponent(txtTelefon)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbValjRas)))
                            .addComponent(btnTillbaka))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblTitel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAktResInfo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPlats)
                                            .addComponent(lblAnsvarigAgent)
                                            .addComponent(lblDatum))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDatumTips))))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLosenord)
                                    .addComponent(lblUpprepaLosen)
                                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(psw2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(psw1, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRasInfo)
                        .addGap(18, 18, 18)
                        .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlienID)
                        .addGap(18, 18, 18)
                        .addComponent(lblAlienID2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPersInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefon)
                                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAktResInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPlats)
                                .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAnsvarigAgent)
                                .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLosenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psw1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUpprepaLosen)
                        .addGap(8, 8, 8)
                        .addComponent(psw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbValjRas)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRasInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienID)
                    .addComponent(lblAlienID2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatumTips)
                        .addGap(7, 7, 7)
                        .addComponent(btnTillbaka)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatum)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Spara all inmatad information i databasen
     */
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        // Kollar om alla textfält som är obligatoriska har värden
        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtDatum)
                && Validering.comboHarVarde(cmbAnsAgent) && Validering.comboHarVarde(cmbRas) && Validering.comboHarVarde(cmbPlats)
                && Validering.passwordHarVarde(psw1) && Validering.passwordHarVarde(psw2)) {
            // Kollar så att aliennamnet inte redan finns i databasen
            SQL s = new SQL(idb);
            if (s.namnFinnsInteAlien(txtNamn)) {
                // Hämtar in alla värden som användaren fyllt i
                String regNamn = txtNamn.getText();
                String regTelefon = txtTelefon.getText();
                String regPassword = psw1.getText();
                String regPasswordCheck = psw2.getText();
                String regPlats = cmbPlats.getSelectedItem().toString();
                String regRas = cmbRas.getSelectedItem().toString();
                String rasInfo = txtRasInfo.getText();
                String regAnsAgent = cmbAnsAgent.getSelectedItem().toString();
                String regAlienID = lblAlienID2.getText();
                String dagensDatum = txtDatum.getText();

                // Kollar så att datum är inskrivet i rätt format
                if (Validering.kollaDatumFormat(dagensDatum)) {

                    // Kollar att de båda lösenordsinmatningar stämmer överens
                    if (regPassword.equals(regPasswordCheck)) {

                        // Kollar att lösenordet har rätt längd
                        if (regPassword.length() <= 6 && regPassword.length() >= 3) {

                            try {
                                //Hämtar ID för plats och ansvarig agent
                                String platsID = idb.fetchSingle("SELECT Plats_ID FROM plats WHERE Benamning = '" + regPlats + "'");
                                String regAgentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE namn = '" + regAnsAgent + "'");

                                // Körs om alien är Boglodite, textfältet med rasinfo måste vara ifyllt
                                if (regRas.equals("Boglodite") && Validering.textFaltHarVarde(txtRasInfo)) {
                                    // Kollar så att textfältet med rasinfo är ifyllt med siffror
                                    if (Validering.txtFaltHarSiffror(txtRasInfo)) {
                                        // lägger till alien i databasen; i tabellen för alien och i tabellen för rasen
                                        idb.insert("INSERT INTO Alien VALUES (" + regAlienID + ", '" + dagensDatum + "', '" + regPassword + "', '"
                                                + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                                        idb.insert("INSERT INTO Boglodite VALUES ('" + regAlienID + "', '" + rasInfo + "')");
                                        // Bekräftelse visas för användaren
                                        JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                                        // Användaren skickas tillbaka till föregående sida
                                        btnTillbakaActionPerformed(evt);
                                    }

                                    // Kollar om rasen är Squid och att rasinfo är ifyllt
                                } else if (regRas.equals("Squid") && Validering.textFaltHarVarde(txtRasInfo)) {
                                    // Kollar att rasinfo består av siffror
                                    if (Validering.txtFaltHarSiffror(txtRasInfo)) {
                                        //Lägger till ny alien i tabeller
                                        idb.insert("INSERT INTO Alien VALUES (" + regAlienID + ", '" + dagensDatum + "', '" + regPassword + "', '"
                                                + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                                        idb.insert("INSERT INTO Squid VALUES ('" + regAlienID + "', '" + rasInfo + "')");
                                        //Visar bekräftelse till användaren
                                        JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                                        //Skickar tillbaka användaren till föregående sida
                                        btnTillbakaActionPerformed(evt);
                                    }

                                    // Kollar om rasen är Worm (ingen rasinfo behöver fyllas i för rasen Worm)
                                } else if (regRas.equals("Worm")) {
                                    // Lägger till alien i databasen
                                    idb.insert("INSERT INTO Alien VALUES (" + regAlienID + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                                    idb.insert("INSERT INTO Worm VALUES ('" + regAlienID + "')");
                                    // Visar bekräftelse för användaren
                                    JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                                    //Skickar tillbaka användaren till föregående sida
                                    btnTillbakaActionPerformed(evt);

                                    // Om alien inte har någon ras så läggs den endast i i tabellen Alien, inte i någon rastabell
                                } else if (regRas.equals("Ingen")) {
                                    // lägger till alien i databasen
                                    idb.insert("INSERT INTO Alien VALUES (" + regAlienID + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                                    JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                                    btnTillbakaActionPerformed(evt);

                                    // Körs om rasinfo för Boglodite eller Squid inte är infyllt
                                } else {
                                    JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
                                }

                            } catch (InfException e) {  // Körs om databasfrågorna inte lyckas
                                JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att alla fält är korrekt ifyllda");
                                System.out.println("Internt felmeddelande" + e.getMessage());
                            }
                        } else { // Körs om lösenordet är fel ifyllt
                            JOptionPane.showMessageDialog(null, "Lösenordet ska ha minst 3 tecken och som mest 6!");
                        }
                    }
                }
            }
        } else { // Körs om alla obigatoriska fält inte är ifyllda
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
        }
    }//GEN-LAST:event_btnSparaActionPerformed
    /**
     * Metod för att generera ett ID automatiskt
     *
     * @param regAlienID
     */
    private void hamtaAlienID(String regAlienID) {

        try {
            regAlienID = idb.getAutoIncrement("Alien", "Alien_ID");
            lblAlienID2.setText(regAlienID);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    /**
     * När knappen välj ras klickas på så visas eventuellt individuell rasinfo
     * som ska fyllas i beroende vilken ras alien är
     */
    private void tbValjRasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbValjRasMouseClicked
        String ras = cmbRas.getSelectedItem().toString();

        if (ras.equals("Boglodite")) {
            txtRasInfo.setVisible(true);
            lblRasInfo.setVisible(true);
            lblRasInfo.setText("Antal Boogies");

        } else if (ras.equals("Squid")) {
            txtRasInfo.setVisible(true);
            lblRasInfo.setVisible(true);
            lblRasInfo.setText("Antal Armar");
        } else {
            txtRasInfo.setVisible(false);
            lblRasInfo.setVisible(false);
        }
    }//GEN-LAST:event_tbValjRasMouseClicked

    /**
     * Går tillbaka till startsidan. Metod som kontrollerar om användaren är admin eller agent anropas från klassen SQL.
     * @param evt
     */
    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    /**
     * Går tillbaka till föregående sida
     */
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        SQL s = new SQL(idb);
        /* Eftersom RegistreraAlien kan nås både av vanlig agent och av admin så
        måste användartypen kollas för att avgöra vilken sida användaren ska skickas tillbaka till
        En metod från klassen SQL används för detta
         */
        boolean admin = s.arAdmin(anvId);
        setVisible(false);

        if (admin) {
            HanteraAliensAdmin h = new HanteraAliensAdmin(idb, anvId, anvTyp);
            h.setVisible(true);
        } else {
            HanteraAliens h = new HanteraAliens(idb, anvId, anvTyp);
            h.setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * Logga ut och gå till inloggningssida
     */
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning i = new Inloggning(idb);
        i.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked
    /**
     * Autogenererar dagens datum som förifyllt
     */
    private void nyttDatum() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime time = LocalDateTime.now();
        String date = dtf.format(time);
        txtDatum.setText(date);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbAnsAgent;
    private javax.swing.JComboBox<String> cmbPlats;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAktResInfo;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAlienID2;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatumTips;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPersInfo;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel lblUpprepaLosen;
    private javax.swing.JMenu menuBarInlogg;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarStartsida;
    private javax.swing.JMenu menuBarTomt;
    private javax.swing.JPasswordField psw1;
    private javax.swing.JPasswordField psw2;
    private javax.swing.JToggleButton tbValjRas;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
