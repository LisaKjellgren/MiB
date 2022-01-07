/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class VisaOmradesChef extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;

    public VisaOmradesChef(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;

        // Anropar en metod från klassen SQL. Metoden fyller rullisten områden med information från databasen.
        SQL s = new SQL(idb);
        s.omraden(cmbOmrade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikOmrade = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        cmbOmrade = new javax.swing.JComboBox<>();
        lblOmrade = new javax.swing.JLabel();
        btnSokOmrade = new javax.swing.JToggleButton();
        lblNorden = new javax.swing.JLabel();
        lblChef = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        menuBarStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikOmrade.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikOmrade.setText("Visa Områdeschef");

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        lblOmrade.setText("Område");

        btnSokOmrade.setText("Sök");
        btnSokOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokOmradeActionPerformed(evt);
            }
        });

        lblNorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/norden_karta.png"))); // NOI18N

        lblChef.setText("                    ");

        menuBarStartsida.setText("Gå till Startsida");
        menuBarStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarStartsidaMouseClicked(evt);
            }
        });
        menuBar1.add(menuBarStartsida);

        jMenu5.setText("                                                                                                            ");
        menuBar1.add(jMenu5);

        jMenu3.setText("Inloggad som Agent");
        menuBar1.add(jMenu3);

        menuBarLoggaUt.setText("Logga ut");
        menuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarLoggaUtMouseClicked(evt);
            }
        });
        menuBar1.add(menuBarLoggaUt);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblRubrikOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(btnSokOmrade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOmrade)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblChef)))
                        .addGap(38, 38, 38)
                        .addComponent(lblNorden))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnTillbaka)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRubrikOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNorden)
                .addGap(14, 56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmrade))
                .addGap(18, 18, 18)
                .addComponent(btnSokOmrade)
                .addGap(46, 46, 46)
                .addComponent(lblChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoden anropas när man klickar på sök-knappen. Metoden letar upp
     * information om vilken agent som är chef över vilket område.
     */
    private void btnSokOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokOmradeActionPerformed
        // Hämtar valt område från rullisten.
        String omraden = cmbOmrade.getSelectedItem().toString();
        try {
            // Hämtar information baserat på valt område.
            String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + omraden + "'");
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM omradeschef WHERE Omrade =" + omradesID);
            String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID =" + agentID);

            // Gör rubriken synlig och fyller den med information om valt område. 
            lblChef.setText("Områdeschef för " + omraden + " är " + agentNamn + "");
        } // Om något går fel visas information om detta.
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }//GEN-LAST:event_btnSokOmradeActionPerformed

    // Metoden gör nuvarande fönster osynligt och öppnar klassen Inloggning i nytt fönster. Denna metod gör så att man blir utloggad.
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAgent i nytt fönster.
    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        StartsidaAgent startsidaAgent = new StartsidaAgent(idb, anvId, anvTyp);
        startsidaAgent.setVisible(true);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAgent i nytt fönster.
    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        setVisible(false);
        StartsidaAgent startsidaAgent = new StartsidaAgent(idb, anvId, anvTyp);
        startsidaAgent.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSokOmrade;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblNorden;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRubrikOmrade;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarStartsida;
    // End of variables declaration//GEN-END:variables
}
