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
 * @author Josanna
 */
public class AndraLosenord extends javax.swing.JFrame {

    /**
     * Creates new form StartsidaAgent
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;

    public AndraLosenord(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuInloggad.setText("Inloggad som " + anvTyp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentBild = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        lblAnvandare = new javax.swing.JLabel();
        lblNuvLosen = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        pwNuvLosen = new javax.swing.JPasswordField();
        pwNyttLosen = new javax.swing.JPasswordField();
        txtAnvandare = new javax.swing.JTextField();
        lblMeddelande = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuTillStartsida = new javax.swing.JMenu();
        menuInget = new javax.swing.JMenu();
        menuInloggad = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentBild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgentBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/losenord.png"))); // NOI18N

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Ändra lösenord");

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblAnvandare.setText("Användarnamn:");
        lblAnvandare.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblNuvLosen.setText("Nuvarande lösenord:");

        lblNyttLosen.setText("Nytt lösenord:");

        btnAndraLosen.setText("Spara nytt lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        menuTillStartsida.setText("Tillbaka till startsida");
        menuTillStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTillStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTillStartsida);

        menuInget.setText("                                                                                                              ");
        jMenuBar1.add(menuInget);

        menuInloggad.setText("Inloggad som XXX");
        jMenuBar1.add(menuInloggad);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNyttLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNuvLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTillbaka))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAnvandare)
                            .addComponent(pwNyttLosen, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(pwNuvLosen))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAndraLosen)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))))
                .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnvandare)
                            .addComponent(txtAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNuvLosen)
                            .addComponent(pwNuvLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNyttLosen)
                            .addComponent(pwNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnAndraLosen)
                                .addGap(18, 18, 18)
                                .addComponent(lblMeddelande))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTillbaka)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        SQL s = new SQL(idb);
      s.tillStartsida(anvId, anvTyp);
       
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed

        String anvandare = txtAnvandare.getText();
        String nuvLosen = pwNuvLosen.getText();
        String nyttLosen = pwNyttLosen.getText();
        String losenFranDB = "";

        //Kollar att alla fält är ifyllda
        if (Validering.textFaltHarVarde(txtAnvandare) && Validering.textFaltHarVarde(pwNuvLosen) && Validering.textFaltHarVarde(pwNyttLosen)) {

            try {
                // Lösen för individen hämtas ur databasen
                losenFranDB = idb.fetchSingle("SELECT Losenord FROM " + anvTyp + " WHERE " + anvTyp + "_ID=" + anvandare);
                if (nyttLosen.length() <= 6 && nyttLosen.length() >= 3) {

                    //jämför inmatat nuvarande lösenord med lösenord från databas
                    if (nuvLosen.equals(losenFranDB)) {
                        // ändrar lösenordet i databasen
                        idb.fetchSingle("UPDATE " + anvTyp + " SET Losenord = '" + nyttLosen + "' where " + anvTyp + "_ID=" + anvandare);
                        JOptionPane.showMessageDialog(null, "Ditt lösenord är ändrat!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Användare och nuvarande lösenord stämmer inte överens");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lösenordet ska ha minst 3 tecken och som mest 6!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alla fält måste fyllas i");
        }
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void menuTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTillStartsidaMouseClicked
       setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuTillStartsidaMouseClicked

    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAgentBild;
    private javax.swing.JLabel lblAnvandare;
    private javax.swing.JLabel lblMeddelande;
    private javax.swing.JLabel lblNuvLosen;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JMenu menuInget;
    private javax.swing.JMenu menuInloggad;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuTillStartsida;
    private javax.swing.JPasswordField pwNuvLosen;
    private javax.swing.JPasswordField pwNyttLosen;
    private javax.swing.JTextField txtAnvandare;
    // End of variables declaration//GEN-END:variables
}
