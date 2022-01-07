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
public class TaBortAgent extends javax.swing.JFrame {

    /**
     * Creates new form TaBortAgent
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    private String soktID = "";
    private String agentNamn = "";

    public TaBortAgent(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuBarInloggadSom.setText("Inloggad som " + anvTyp);
        cmbNyAnsvarig.setVisible(false);
        txtAreaAliens.setVisible(false);
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
        lblAgentID = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        txtAgentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        btnTaBortAgent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblDennaAgent = new javax.swing.JLabel();
        lblVanligenAnge = new javax.swing.JLabel();
        cmbNyAnsvarig = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAliens = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuBarTillStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBarInloggadSom = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Ta bort agent");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaTillbakaMouseClicked(evt);
            }
        });

        lblAgentID.setText("Agent ID:");

        btnSok.setText("Sök");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        txtAgentID.setToolTipText("");

        jLabel1.setText("Namn:");

        lblNamn.setText("                      ");

        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaBortAgentMouseClicked(evt);
            }
        });

        jLabel2.setText("Ange ditt lösenord för att ta bort ovanstående agent från systemet:");

        lblDennaAgent.setText("                                    ");

        lblVanligenAnge.setText("                                 ");

        txtAreaAliens.setColumns(20);
        txtAreaAliens.setRows(5);
        jScrollPane1.setViewportView(txtAreaAliens);

        menuBarTillStartsida.setText("Gå till Startsida");
        menuBarTillStartsida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuBarTillStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarTillStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarTillStartsida);

        jMenu5.setText("                                                                                                             ");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGaTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaBortAgent)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAgentID)
                                            .addComponent(lblNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addComponent(btnSok))
                                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDennaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblVanligenAnge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(cmbNyAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDennaAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVanligenAnge)
                .addGap(18, 18, 18)
                .addComponent(cmbNyAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaBortAgent)
                .addGap(32, 32, 32)
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
        setVisible(false);
        AdminHanteraAgenter h = new AdminHanteraAgenter(idb, anvId, anvTyp);
        h.setVisible(true);
    }//GEN-LAST:event_btnGaTillbakaMouseClicked

    /**
     * Gå till startsidan i MenuBar
     *
     * @param evt
     */
    private void menuBarTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarTillStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_menuBarTillStartsidaMouseClicked

    /**
     * Sök agent utifrån ID
     *
     * @param evt
     */
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
       if(Validering.txtFaltHarSiffror(txtAgentID)){
        // Hämtar agentId som användaren söker efter
        soktID = txtAgentID.getText().trim();

        try {
            // hämta namn på agent utifrån ID
            agentNamn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = " + soktID + "");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
        // Visa namnet för den sökta agenten
        lblNamn.setText(agentNamn);

        // Kolla om agent är ansvarig över någon alien
        Validering val = new Validering();
        if (val.agentHarAlien(soktID, idb) == true) {
            // Visa info och val gällande att byta ansvarig agent
            cmbNyAnsvarig.setVisible(true);
            txtAreaAliens.setVisible(true);
            lblDennaAgent.setText("Denna agent är ansvarig över en eller flera aliens.");
            lblVanligenAnge.setText("Vänligen ange en ny ansvarig agent för dessa aliens:");
            // fyll combobox med agenter att välja mellan
            SQL s = new SQL(idb);
            s.agent(cmbNyAnsvarig);
            // visa vilka aliens som agenten är ansvarig för
            s.getAliensForAnsvaigAgent(soktID, txtAreaAliens);
        }
       }
    }//GEN-LAST:event_btnSokMouseClicked
    /**
     * Tar bort agenten från tabellen agent, uppdaterar aliens med nya ansvariga
     * agenter samt tar bort alla främmande nycklar som är länkade till agenten
     *
     * @param evt
     */
    private void btnTaBortAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaBortAgentMouseClicked
        if(Validering.textFaltHarVarde(txtLosenord)){
        String losenord = txtLosenord.getText().trim();
        String losenordDB = "";
        
        boolean ansvarig = false;
         ArrayList<HashMap<String, String>> harAnsvar = new ArrayList<>();
         
        
        
        String nyAnsvarig = "";       
        
               
        try {
            
            harAnsvar = idb.fetchRows("SELECT alien_ID FROM alien WHERE ansvarig_agent = " + soktID + " ORDER BY alien_ID ASC");
            
            if(!harAnsvar.isEmpty()){
                 nyAnsvarig = cmbNyAnsvarig.getSelectedItem().toString().trim();
            }
            
            // Hämta lösen från DB att jämföra med
            losenordDB = idb.fetchSingle("SELECT losenord FROM agent WHERE agent_ID =" + anvId);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: Hämta lösenord från DB" + e.getMessage());
        }
        // Kontrollera att användare angett rätt lösenord
        if (losenord.equals(losenordDB)) {
            try {

                // hämta agentID för ny ansvarig agent
                String nyID = idb.fetchSingle("SELECT agent_ID FROM agent WHERE namn = '" + nyAnsvarig + "'");
                // uppdatera ansvarig agent för aliens
                idb.update("UPDATE alien SET ansvarig_agent = " + nyID + " WHERE ansvarig_agent = " + soktID);
                //Ta bort agenten i relaterade tabeller
                idb.delete("DELETE FROM faltagent WHERE agent_ID = " + soktID);
                idb.delete("DELETE FROM innehar_fordon WHERE agent_ID = " + soktID);
                idb.delete("DELETE FROM innehar_utrustning WHERE agent_ID = " + soktID);
                idb.delete("DELETE FROM kontorschef WHERE agent_ID = " + soktID);
                idb.delete("DELETE FROM omradeschef WHERE agent_ID = " + soktID);
                // Ta bort agenten från tabellen Agent
                idb.delete("DELETE FROM agent WHERE agent_ID = " + soktID);
                // Bekräftelse till användaren att agenten tagits bort
                JOptionPane.showMessageDialog(null, agentNamn + " med ID " + soktID + " är nu borttagen");
                btnGaTillbakaMouseClicked(evt);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande:" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Du har angett fel lösenord, försök igen.");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Du måste fylla i ditt lösenord!");
        }


    }//GEN-LAST:event_btnTaBortAgentMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JComboBox<String> cmbNyAnsvarig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblDennaAgent;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblVanligenAnge;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInloggadSom;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarTillStartsida;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextArea txtAreaAliens;
    private javax.swing.JPasswordField txtLosenord;
    // End of variables declaration//GEN-END:variables
}
