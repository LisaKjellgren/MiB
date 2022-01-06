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
public class ListaAliensDatum extends javax.swing.JFrame {

    /**
     * Creates new form ListaAlienDatum
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;

    public ListaAliensDatum(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public ListaAliensDatum(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuBarInloggadSom.setText("Inloggad som " + anvTyp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaAliens = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();
        lblTill = new javax.swing.JLabel();
        lblFran = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        txtFran = new javax.swing.JTextField();
        lblFranTip = new javax.swing.JLabel();
        txtTill = new javax.swing.JTextField();
        lblTillTip = new javax.swing.JLabel();
        cmbOrdning = new javax.swing.JComboBox<>();
        btnOrdna = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuBarTillStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBarInloggadSom = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblListaAliens.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblListaAliens.setText("Lista aliens efter datum");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaTillbakaMouseClicked(evt);
            }
        });

        lblTill.setText("Till datum:");

        lblFran.setText("Från datum:");

        btnSok.setText("Sök");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane2.setViewportView(txtLista);

        txtFran.setToolTipText("");

        lblFranTip.setText("ÅÅÅÅ-MM-DD");

        lblTillTip.setText("ÅÅÅÅ-MM-DD");

        cmbOrdning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Äldsta först", "Senaste först" }));

        btnOrdna.setText("Ordna");
        btnOrdna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdnaMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGaTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblFran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFranTip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtFran, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTill, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTill, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTillTip, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(btnSok))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbOrdning, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdna)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFran)
                    .addComponent(lblTill))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSok)
                    .addComponent(txtFran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFranTip)
                    .addComponent(lblTillTip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrdning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdna))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnGaTillbaka)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Logga ut högst upp i MenuBar
     *
     * @param evt
     */
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    /**
     * Gå tillbaka till föregående sida
     *
     * @param evt
     */
    private void btnGaTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaTillbakaMouseClicked
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
    }//GEN-LAST:event_btnGaTillbakaMouseClicked

    /**
     * Gå till startsidan i MenuBar
     *
     * @param evt
     */
    private void menuBarTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarTillStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuBarTillStartsidaMouseClicked

   /**
     * Sök aliens efter valt registreringsintervall
     *
     * @param evt
     */
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
        txtLista.setText(""); //rensar textArea inför sökningen
        String franDatum = txtFran.getText().trim();  //ta bort aventuella mellanslag efter datumet
        String tillDatum = txtTill.getText().trim();
        
        String ordning = cmbOrdning.getSelectedItem().toString();
        SQL sql = new SQL(idb);
        sql.getRegistreringsdatum(franDatum, tillDatum, txtLista, ordning);
    }//GEN-LAST:event_btnSokMouseClicked

    private void btnOrdnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdnaMouseClicked
       
        // kör samma kod som Sök-knappen
        btnSokMouseClicked(evt);
    }//GEN-LAST:event_btnOrdnaMouseClicked


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnOrdna;
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cmbOrdning;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFran;
    private javax.swing.JLabel lblFranTip;
    private javax.swing.JLabel lblListaAliens;
    private javax.swing.JLabel lblTill;
    private javax.swing.JLabel lblTillTip;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInloggadSom;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarTillStartsida;
    private javax.swing.JTextField txtFran;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtTill;
    // End of variables declaration//GEN-END:variables
}
