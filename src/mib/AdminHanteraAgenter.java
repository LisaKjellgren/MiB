/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author luna
 */
public class AdminHanteraAgenter extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;
    /**
     * Creates new form AdminHanteraAgenter
     */
    public AdminHanteraAgenter(InfDB idb) {
    initComponents();
    this.idb = idb;
    }
    
    public AdminHanteraAgenter(InfDB idb, String anvId, String anvTyp) {
    initComponents();
    this.idb = idb;
    this.anvId = anvId;
    this.anvTyp = anvTyp;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Sök agent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaBortAgentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTaBortAgent)
                    .addComponent(jButton1))
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(btnTaBortAgent)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        SokAgent sokAgent = new SokAgent (idb, anvId, anvTyp);
        sokAgent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTaBortAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaBortAgentMouseClicked
        setVisible(false);
        TaBortAgent t = new TaBortAgent (idb, anvId, anvTyp);
        t.setVisible(true);
    }//GEN-LAST:event_btnTaBortAgentMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
