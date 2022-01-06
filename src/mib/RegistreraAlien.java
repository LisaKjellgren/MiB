/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// TODO Lägg till fler val vid registrering beroende på ras. Tex antal armar för Squid
// TODO sätt alienID automatiskt -> räkna uppåt från senaste inlagda (Rosa har nummer 4)
package mib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author luna
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
    public RegistreraAlien() {
        initComponents();
    }

    // kontruktor som tar in information som bland annat används till den översta MenuBar
    public RegistreraAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        nyttDatum();
        SQL s = new SQL(idb);
        s.plats(cmbPlats);
        s.agent(cmbAnsAgent);
        hamtaAlienID(regAlienID);
        doljText(txtRasInfo);
        doljLabel(lblRasInfo);
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
        jLabel2 = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        cmbAnsAgent = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        psw1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cmbPlats = new javax.swing.JComboBox<>();
        lblPersInfo = new javax.swing.JLabel();
        lblAktResInfo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        psw2 = new javax.swing.JPasswordField();
        lblAlienID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        lblAlienID2 = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();
        lblRasInfo = new javax.swing.JLabel();
        tbValjRas = new javax.swing.JToggleButton();
        btnTillbaka = new javax.swing.JButton();
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

        jLabel2.setText("Ras");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm", "Ingen" }));
        cmbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRasActionPerformed(evt);
            }
        });

        jLabel3.setText("Plats");

        lblConfirm.setForeground(new java.awt.Color(0, 204, 0));

        jLabel5.setText("Ansvarig agent");

        jLabel6.setText("Lösenord");

        psw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        jLabel7.setText("MiB REGISTRERINGSSERVICE");

        lblPersInfo.setText("Personlig information");

        lblAktResInfo.setText("Aktuell reseinfo");

        jLabel11.setText("Upprepa lösenord");

        psw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw2ActionPerformed(evt);
            }
        });

        lblAlienID.setText("AlienID");

        jLabel1.setText("Dagens datum");

        lblAlienID2.setText("ID");

        txtRasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRasInfoActionPerformed(evt);
            }
        });

        lblRasInfo.setText("Rasinfo");

        tbValjRas.setText("Välj ras");
        tbValjRas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbValjRasMouseClicked(evt);
            }
        });
        tbValjRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbValjRasActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

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
                .addComponent(jLabel7)
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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
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
                .addComponent(jLabel7)
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
                                .addComponent(jLabel3)
                                .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psw1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(psw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        // Utgår ifrån att det är klicket på sparaknappen som gör att all info sparas i DG
        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtDatum)
                && Validering.comboHarVarde(cmbAnsAgent) && Validering.comboHarVarde(cmbRas) && Validering.comboHarVarde(cmbPlats) && Validering.passwordHarVarde(psw1) && Validering.passwordHarVarde(psw2)) {

            String regNamn = txtNamn.getText();

            String regTelefon = txtTelefon.getText();

            String regPassword = psw1.getText();

            String regPasswordCheck = psw2.getText();

            String regPlats = cmbPlats.getSelectedItem().toString();

            String regRas = cmbRas.getSelectedItem().toString();
            //System.out.println(regRas);
            String rasInfo = txtRasInfo.getText();

            String regAnsAgent = cmbAnsAgent.getSelectedItem().toString();
            //Här behöver vi hämta Agent_ID baserat på namnet

            String regAlienIDGet = lblAlienID2.getText();
            int regAlienIDint = Integer.parseInt(regAlienIDGet);

            String dagensDatum = txtDatum.getText();

            if (regPassword.equals(regPasswordCheck)) {
                if (regPassword.length() <= 6 && regPassword.length() >= 3) {

                    try {

                        String platsID = idb.fetchSingle("SELECT Plats_ID FROM plats WHERE Benamning = '" + regPlats + "'");
                        String regAgentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE namn = '" + regAnsAgent + "'");

                        if (regRas.equals("Boglodite") && Validering.textFaltHarVarde(txtRasInfo)) {
                            // lägger till alien i databasen
                            idb.insert("INSERT INTO Alien VALUES (" + regAlienIDint + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                            idb.insert("INSERT INTO Boglodite VALUES ('" + regAlienIDGet + "', '" + rasInfo + "')");
                            JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                            btnTillbakaActionPerformed(evt);
                        } else if (regRas.equals("Squid") && Validering.textFaltHarVarde(txtRasInfo)) {
                            // lägger till alien i databasen
                            idb.insert("INSERT INTO Alien VALUES (" + regAlienIDint + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                            idb.insert("INSERT INTO Squid VALUES ('" + regAlienIDGet + "', '" + rasInfo + "')");
                            JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                            btnTillbakaActionPerformed(evt);
                        } else if (regRas.equals("Worm")) {
                            // lägger till alien i databasen
                            idb.insert("INSERT INTO Alien VALUES (" + regAlienIDint + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                            idb.insert("INSERT INTO Worm VALUES ('" + regAlienIDGet + "')");
                            JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                            btnTillbakaActionPerformed(evt);
                        } else if (regRas.equals("Ingen")) {
                            // lägger till alien i databasen
                            idb.insert("INSERT INTO Alien VALUES (" + regAlienIDint + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                            JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");
                            btnTillbakaActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
                        }

                    } catch (InfException e) {
                        JOptionPane.showMessageDialog(null, "Något gick fel!");
                        System.out.println("Internt felmeddelande" + e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lösenordet ska ha minst 3 tecken och som mest 6!");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    private void hamtaAlienID(String regAlienID) {

        try {
            regAlienID = idb.getAutoIncrement("Alien", "Alien_ID");
            lblAlienID2.setText(regAlienID);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void doljText(JTextField textAttDolja) {
        textAttDolja.setVisible(false);
    }

    private void doljLabel(JLabel labelAttDolja) {
        labelAttDolja.setVisible(false);
    }


    private void psw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw1ActionPerformed

    }//GEN-LAST:event_psw1ActionPerformed

    private void psw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw2ActionPerformed

    }//GEN-LAST:event_psw2ActionPerformed

    private void txtRasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRasInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRasInfoActionPerformed

    private void tbValjRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbValjRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbValjRasActionPerformed

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
            doljText(txtRasInfo);
            doljLabel(lblRasInfo);
        }
    }//GEN-LAST:event_tbValjRasMouseClicked

    private void cmbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRasActionPerformed

    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        SQL s = new SQL(idb);
        boolean admin = s.arAdmin(anvId);
        setVisible(false);
        
        if(admin){
            HanteraAliensAdmin h = new HanteraAliensAdmin(idb, anvId, anvTyp);
            h.setVisible(true);
        }
        else{
            HanteraAliens h = new HanteraAliens(idb, anvId, anvTyp);
            h.setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning i = new Inloggning(idb);
        i.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    private void nyttDatum() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAktResInfo;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAlienID2;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPersInfo;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
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
