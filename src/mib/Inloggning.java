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
 * @author Lisa
 */
public class Inloggning extends javax.swing.JFrame {

    /**
     * Creates new form Inloggning
     */
    private InfDB idb;

    public Inloggning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikAgentInlogg = new javax.swing.JLabel();
        lblInlogg = new javax.swing.JLabel();
        lblAnvandare = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        cmbList = new javax.swing.JComboBox<>();
        txtAnvandare = new javax.swing.JTextField();
        btnLoggain = new javax.swing.JToggleButton();
        pswlosen = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Inlogg"); // NOI18N

        RubrikAgentInlogg.setText("Välkommen till MiB Service System");

        lblInlogg.setText("Inloggningstyp");

        lblAnvandare.setText("Användarnamn");

        lblLosen.setText("Lösenord");

        cmbList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Alien" }));
        cmbList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListActionPerformed(evt);
            }
        });

        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnLoggain))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAnvandare)
                                .addComponent(lblInlogg)
                                .addComponent(lblLosen, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pswlosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtAnvandare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(RubrikAgentInlogg)))
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(RubrikAgentInlogg)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInlogg)
                    .addComponent(cmbList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnvandare)
                    .addComponent(txtAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosen)
                    .addComponent(pswlosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoggain)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed

        // Hämtar värden från textFields
        String anvandarText = txtAnvandare.getText();
        String losenText = pswlosen.getText();
        //Variabler att spara SQL frågor i
        String inloggTyp = "";
        String losenTyp = "";
        //Hämta värde från comboBox/rullist.
        String typVal = cmbList.getSelectedItem().toString();

        //Kontrollera om användarnamn och lösenord fylls i. 
        if (Validering.textFaltHarVarde(txtAnvandare) && Validering.textFaltHarVarde(pswlosen)) {
            //Kontrollera om anv valt Agent eller Alien i comboBox
            if (typVal.equals("Agent")) {
                inloggTyp = "SELECT Agent_ID FROM agent WHERE Agent_ID=";
                losenTyp = "SELECT Losenord FROM agent WHERE Agent_ID=";
            } else {
                inloggTyp = "SELECT Alien_ID FROM alien WHERE Alien_ID=";
                losenTyp = "SELECT Losenord FROM alien WHERE Alien_ID=";
            }
            try {

                String anvandare = idb.fetchSingle(inloggTyp + anvandarText);
                String losen = idb.fetchSingle(losenTyp + anvandarText);

                System.out.println("Fetch anv: " + anvandare); //test
                System.out.println("Fetch losen: " + losen); // test

                //Kontrollerar man att användare/lösenord stämmer överens.
                if (anvandarText.equals(anvandare) && losenText.equals(losen)) {
                    //Här ska koden för att komma till nästa fönster, startsidan, finnas.
                    JOptionPane.showMessageDialog(null, "Inloggning lyckades!");
                    //if (ADMINISTRATÖR) {

                    //}
                } else {
                    JOptionPane.showMessageDialog(null, "Lösenordet är fel!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        } else { //Alien

        }
    }//GEN-LAST:event_btnLoggainActionPerformed

    private void cmbListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbListActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RubrikAgentInlogg;
    private javax.swing.JToggleButton btnLoggain;
    private javax.swing.JComboBox<String> cmbList;
    private javax.swing.JLabel lblAnvandare;
    private javax.swing.JLabel lblInlogg;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JPasswordField pswlosen;
    private javax.swing.JTextField txtAnvandare;
    // End of variables declaration//GEN-END:variables
}
