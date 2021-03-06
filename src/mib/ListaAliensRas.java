/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class ListaAliensRas extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;
    //Vi skapar 3 ArrayList för att kunna orientera oss i squid-, worm- och bogloditetabellerna.
    ArrayList<String> squidLista;
    ArrayList<String> bogloditeLista;
    ArrayList<String> wormLista;

    public ListaAliensRas(InfDB idb, String anvId, String anvTyp) {
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

        lblListaAliens = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();
        lblRas = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        btnRas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuBarTillStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblListaAliens.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblListaAliens.setText("Lista aliens efter ras");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaTillbakaMouseClicked(evt);
            }
        });

        lblRas.setText("Välj ras:");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bologdite", "Squid", "Worm", "Ingen ras" }));
        cmbRas.setToolTipText("");

        btnRas.setText("Välj");
        btnRas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRasMouseClicked(evt);
            }
        });

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane2.setViewportView(txtLista);

        menuBarTillStartsida.setText("Gå till Startsida");
        menuBarTillStartsida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuBarTillStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarTillStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarTillStartsida);

        jMenu5.setText("                                                                                                                                                      ");
        menuBar.add(jMenu5);

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
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnRas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRas)
                    .addComponent(lblRas))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Logga ut-knapp som tar användaren tillbaka till inloggningssidan.
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    //Tillbaka-knapp som tar användaren till det föregående fönstret baserat på om denne är vanlig agent eller admin.
    private void btnGaTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaTillbakaMouseClicked
        SQL s = new SQL(idb);
        boolean admin = s.arAdmin(anvId);
        setVisible(false);

        //Två olika fönster
        if (admin) {
            HanteraAliensAdmin h = new HanteraAliensAdmin(idb, anvId, anvTyp);
            h.setVisible(true);
        } else {
            HanteraAliens h = new HanteraAliens(idb, anvId, anvTyp);
            h.setVisible(true);
        }
    }//GEN-LAST:event_btnGaTillbakaMouseClicked

    //Knapp som skickar användaren tillbaka till startsidan.
    private void menuBarTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarTillStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuBarTillStartsidaMouseClicked

    //Bekräfta valet av ras och visa detta i text-area:n.
    private void btnRasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRasMouseClicked
        txtLista.setText("");
        String valdRas = cmbRas.getSelectedItem().toString();
        //Listans olika rubriker.
        txtLista.append("AlienID \t Namn \t\t Telefon \n");
        try {

            //Fyller listorna med information om varje ras.
            bogloditeLista = idb.fetchColumn("SELECT Alien_ID FROM boglodite ORDER BY Alien_ID");
            squidLista = idb.fetchColumn("SELECT Alien_ID FROM squid ORDER BY Alien_ID");
            wormLista = idb.fetchColumn("SELECT Alien_ID FROM worm ORDER BY Alien_ID");

            // Beroende på vilken ras en väljer fylls fältet med information om tillhörande aliens.
            if (valdRas.equals("Bologdite")) {

                //Loopar igenom listan för att hämta och skriva ut informationen. 
                for (int i = 0; i < bogloditeLista.size(); i++) {
                    String ID = bogloditeLista.get(i);
                    String namn = idb.fetchSingle("SELECT namn FROM alien WHERE alien_ID = " + ID);
                    String telefon = idb.fetchSingle("SELECT telefon FROM alien WHERE alien_ID = " + ID);
                    txtLista.append(ID + " \t " + namn + " \t\t" + telefon + "\n");
                }

            } else if (valdRas.equals("Squid")) {

                // Loopar igenom listan för att hämta och skriva ut informationen. 
                for (int i = 0; i < squidLista.size(); i++) {
                    String ID = squidLista.get(i);
                    String namn = idb.fetchSingle("SELECT namn FROM alien WHERE alien_ID = " + ID);
                    String telefon = idb.fetchSingle("SELECT telefon FROM alien WHERE alien_ID = " + ID);
                    txtLista.append(ID + " \t " + namn + " \t\t" + telefon + "\n");
                }
            } else if (valdRas.equals("Worm")) {

                // Loopar igenom listan för att hämta och skriva ut informationen. 
                for (int i = 0; i < wormLista.size(); i++) {
                    String ID = squidLista.get(i);
                    String namn = idb.fetchSingle("SELECT namn FROM alien WHERE alien_ID = " + ID);
                    String telefon = idb.fetchSingle("SELECT telefon FROM alien WHERE alien_ID = " + ID);
                    txtLista.append(ID + " \t " + namn + " \t\t" + telefon + "\n");
                }
            } /* Om en alien inte hör till någon ras alls ska en kunna söka upp dessa också. 
            Det gör vi genom att skapa två listor - en med alla aliens, och en för alla som tillhör en ras. */ else {
                ArrayList<String> rasLista = new ArrayList<>();
                rasLista.addAll(bogloditeLista);
                rasLista.addAll(squidLista);
                rasLista.addAll(wormLista);

                ArrayList<String> alienLista = idb.fetchColumn("SELECT alien_ID FROM alien");

                //Loopar igenom listan med alla aliens och undersöker vilka alienID som inte finns med i den raslistan.
                for (int i = 0; i < alienLista.size(); i++) {
                    String ID = alienLista.get(i);

                    //Om alien inte tillhör en ras så listas de i alternativet "Ingen ras".
                    if (!rasLista.contains(ID)) {
                        String namn = idb.fetchSingle("SELECT namn FROM alien WHERE alien_ID = " + ID);
                        String telefon = idb.fetchSingle("SELECT telefon FROM alien WHERE alien_ID = " + ID);
                        txtLista.append(ID + " \t " + namn + " \t\t" + telefon + "\n");
                    }
                }
            }
            //Om ett undantag uppstår visas detta meddelande.
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnRasMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnRas;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblListaAliens;
    private javax.swing.JLabel lblRas;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarTillStartsida;
    private javax.swing.JTextArea txtLista;
    // End of variables declaration//GEN-END:variables
}
