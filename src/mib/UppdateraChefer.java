/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna
 */
public class UppdateraChefer extends javax.swing.JFrame {

    /**
     * Creates new form UppdateraChefer
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    private String omradePlats = "";

    public UppdateraChefer(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuBarInloggadSom.setText("Inloggad som " + anvTyp);
        lblOmrade.setVisible(false);
        lblPlats.setVisible(false);
        btnValjOmrade.setVisible(false);
        btnValjPlats.setVisible(false);
        cmbOmrade.setVisible(false);
        cmbKontor.setVisible(false);
        lblNuvChef.setVisible(false);
        lblNyChefAr.setVisible(false);
        lblValjNy.setVisible(false);
        cmbNyChef.setVisible(false);
        btnBekraftaVal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();
        lblPlats = new javax.swing.JLabel();
        cmbKontor = new javax.swing.JComboBox<>();
        btnValjOmrade = new javax.swing.JButton();
        lblOmrade = new javax.swing.JLabel();
        cmbOmrade = new javax.swing.JComboBox<>();
        btnValjPlats = new javax.swing.JButton();
        btnOmrade = new javax.swing.JButton();
        btnPlats = new javax.swing.JButton();
        lblRubrikVal = new javax.swing.JLabel();
        lblNuvChef = new javax.swing.JLabel();
        lblValjNy = new javax.swing.JLabel();
        cmbNyChef = new javax.swing.JComboBox<>();
        lblNyChefAr = new javax.swing.JLabel();
        btnBekraftaVal = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuBarTillStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBarInloggadSom = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Uppdatera chefer");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaTillbakaMouseClicked(evt);
            }
        });

        lblPlats.setText("Välj plats:");

        cmbKontor.setToolTipText("");

        btnValjOmrade.setText("Välj");
        btnValjOmrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValjOmradeMouseClicked(evt);
            }
        });

        lblOmrade.setText("Välj område:");

        btnValjPlats.setText("Välj");
        btnValjPlats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValjPlatsMouseClicked(evt);
            }
        });

        btnOmrade.setText("Område");
        btnOmrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOmradeMouseClicked(evt);
            }
        });

        btnPlats.setText("Plats");
        btnPlats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlatsMouseClicked(evt);
            }
        });

        lblRubrikVal.setText("Jag vill uppdatera:");

        lblNuvChef.setText("Nuvarande chef:");

        lblValjNy.setText("Välj ny chef:");

        lblNyChefAr.setText("Ny chef är:");

        btnBekraftaVal.setText("Bekräfta val");
        btnBekraftaVal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBekraftaValMouseClicked(evt);
            }
        });

        menuBarTillStartsida.setText("Gå till Startsida");
        menuBarTillStartsida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuBarTillStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarTillStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarTillStartsida);

        jMenu5.setText("                                                                                 ");
        menuBar.add(jMenu5);

        menuBarInloggadSom.setText("Inloggad som XXX");
        menuBar.add(menuBarInloggadSom);

        menuBarLoggaUt.setText("Logga ut");
        menuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarLoggaUtMouseClicked(evt);
            }
        });
        menuBar.add(menuBarLoggaUt);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGaTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrikVal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOmrade)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValjOmrade)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnValjPlats))
                            .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNuvChef, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValjNy, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNyChef, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBekraftaVal))
                    .addComponent(lblNyChefAr, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikVal)
                    .addComponent(btnOmrade)
                    .addComponent(btnPlats))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrade)
                    .addComponent(lblPlats))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValjOmrade)
                    .addComponent(cmbKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValjPlats))
                .addGap(18, 18, 18)
                .addComponent(lblNuvChef)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjNy)
                    .addComponent(cmbNyChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBekraftaVal))
                .addGap(18, 18, 18)
                .addComponent(lblNyChefAr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Logga ut högst upp i MenuBar
     */
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    /**
     * Gå tillbaka till föregående sida
     */
    private void btnGaTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaTillbakaMouseClicked
        setVisible(false);
        AdminHanteraAgenter a = new AdminHanteraAgenter(idb, anvId, anvTyp);
        a.setVisible(true);
    }//GEN-LAST:event_btnGaTillbakaMouseClicked

    /**
     * Gå till startsidan i MenuBar
     */
    private void menuBarTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarTillStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin s = new StartsidaAdmin(idb, anvId, anvTyp);
        s.setVisible(true);
    }//GEN-LAST:event_menuBarTillStartsidaMouseClicked

    private void btnPlatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlatsMouseClicked
        setVisibleUppdateraOmrade(false);
        setVisibleUppdateraPlats(true);
        setVisibleNyChef(false);
        
        SQL s = new SQL(idb);
        s.getPlatsKontor(cmbKontor);
    }//GEN-LAST:event_btnPlatsMouseClicked

    private void btnValjOmradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValjOmradeMouseClicked

        setVisibleNyChef(true);
        
        omradePlats = cmbOmrade.getSelectedItem().toString();
        SQL s = new SQL(idb);
        s.getChefForOmrade(lblNuvChef, omradePlats);
    }//GEN-LAST:event_btnValjOmradeMouseClicked

    private void btnValjPlatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValjPlatsMouseClicked
        setVisibleNyChef(true);
        omradePlats = cmbKontor.getSelectedItem().toString();
        SQL s = new SQL(idb);
        s.getKontorschef(omradePlats, lblNuvChef);
        
         
    }//GEN-LAST:event_btnValjPlatsMouseClicked

    private void btnOmradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOmradeMouseClicked
        setVisibleUppdateraPlats(false);
        setVisibleUppdateraOmrade(true);
        setVisibleNyChef(false);
        
        SQL s = new SQL(idb);
        s.omraden(cmbOmrade);
    }//GEN-LAST:event_btnOmradeMouseClicked

    private void btnBekraftaValMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBekraftaValMouseClicked
        lblNyChefAr.setVisible(true);
    }//GEN-LAST:event_btnBekraftaValMouseClicked

    private void setVisibleUppdateraOmrade(boolean bool){
        if (bool == false){
        // dölj områdesval-knapp, lbl och combobox
        lblOmrade.setVisible(false);
        btnValjOmrade.setVisible(false);
        cmbOmrade.setVisible(false);
    }
        else{
        lblOmrade.setVisible(true);
        btnValjOmrade.setVisible(true);
        cmbOmrade.setVisible(true);
    }
    }
    
    private void setVisibleUppdateraPlats(boolean bool){
        if (bool == false){
        // dölj ev platsval-knapp, lbl och combobox
        lblPlats.setVisible(false);
        btnValjPlats.setVisible(false);
        cmbKontor.setVisible(false);
        }
        else{
        lblPlats.setVisible(true);
        btnValjPlats.setVisible(true);
        cmbKontor.setVisible(true);
        }
    }
    
    private void setVisibleNyChef(boolean bool){
        if(bool == false){
        lblNuvChef.setVisible(false);
        lblValjNy.setVisible(false);
        cmbNyChef.setVisible(false);
        btnBekraftaVal.setVisible(false);
        }
        else{
        lblNuvChef.setVisible(true);
        lblValjNy.setVisible(true);
        cmbNyChef.setVisible(true);
        btnBekraftaVal.setVisible(true);
        }
           
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBekraftaVal;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnOmrade;
    private javax.swing.JButton btnPlats;
    private javax.swing.JButton btnValjOmrade;
    private javax.swing.JButton btnValjPlats;
    private javax.swing.JComboBox<String> cmbKontor;
    private javax.swing.JComboBox<String> cmbNyChef;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JLabel lblNuvChef;
    private javax.swing.JLabel lblNyChefAr;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblRubrikVal;
    private javax.swing.JLabel lblValjNy;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInloggadSom;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarTillStartsida;
    // End of variables declaration//GEN-END:variables
}
