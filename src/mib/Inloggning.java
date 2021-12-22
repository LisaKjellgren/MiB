/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;

/**
 *
 * @author Lisa
 */
public class Inloggning extends javax.swing.JFrame {

    /**
     * Creates new form Inloggning
     */
    
    private InfDB idb;
    
    public Inloggning() {
        initComponents();
    }
    
    public Inloggning(InfDB db){
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

        pswlosen.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
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
                .addContainerGap(238, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        
        if(Validering.textFaltHarVarde(txtAnvandare)){
            
        }
        if(Validering.textFaltHarVarde(pswlosen)){
            
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
