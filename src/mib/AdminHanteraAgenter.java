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

        btnSok = new javax.swing.JButton();
        btnUppdateraAgent = new javax.swing.JButton();
        btnRegistrera = new javax.swing.JButton();
        lblBild = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        lblRubrik = new javax.swing.JLabel();
        btnRadera = new javax.swing.JButton();
        btnUppdateraChef = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuStartsida = new javax.swing.JMenu();
        menuInget = new javax.swing.JMenu();
        menuInlogg = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSok.setText("Sök agent");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        btnUppdateraAgent.setText("Uppdatera agent");
        btnUppdateraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraAgentActionPerformed(evt);
            }
        });

        btnRegistrera.setText("Registrera agent");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        lblBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Men-In-Black-Siluett.png"))); // NOI18N

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Hantera agenter");

        btnRadera.setText("Ta bort Agent");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        btnUppdateraChef.setText("Uppdatera chefer");
        btnUppdateraChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraChefActionPerformed(evt);
            }
        });

        btnAdmin.setText("Gör till administratör");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        menuStartsida.setText("Gå till startsida");
        menuStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStartsida);

        menuInget.setText("                                                                                                                                               ");
        jMenuBar1.add(menuInget);

        menuInlogg.setText("Inloggad som administratör");
        jMenuBar1.add(menuInlogg);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRubrik)
                    .addComponent(lblBild))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUppdateraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUppdateraChef, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTillbaka))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrera)
                        .addGap(18, 18, 18)
                        .addComponent(btnUppdateraAgent)
                        .addGap(18, 18, 18)
                        .addComponent(btnSok)
                        .addGap(18, 18, 18)
                        .addComponent(btnRadera)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnUppdateraChef)
                        .addGap(46, 46, 46)
                        .addComponent(btnTillbaka))
                    .addComponent(lblBild))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        setVisible(false);
        SokAgent sokAgent = new SokAgent (idb, anvId, anvTyp);
        sokAgent.setVisible(true);
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        setVisible(false);
        RegistreraAgent registreraAgent = new RegistreraAgent (idb, anvId, anvTyp);
        registreraAgent.setVisible(true);
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        setVisible(false);
        TaBortAgent radera = new TaBortAgent(idb, anvId, anvTyp);
        radera.setVisible(true);
    }//GEN-LAST:event_btnRaderaActionPerformed

    private void btnUppdateraChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraChefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUppdateraChefActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void menuStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);        
    }//GEN-LAST:event_menuStartsidaMouseClicked

    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked

    private void btnUppdateraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraAgentActionPerformed
        setVisible(false);
        UppdateraAgent updAgent = new UppdateraAgent(idb, anvId, anvTyp);
        updAgent.setVisible(true);
    }//GEN-LAST:event_btnUppdateraAgentActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnSok;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JButton btnUppdateraAgent;
    private javax.swing.JButton btnUppdateraChef;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBild;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JMenu menuInget;
    private javax.swing.JMenu menuInlogg;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuStartsida;
    // End of variables declaration//GEN-END:variables
}
