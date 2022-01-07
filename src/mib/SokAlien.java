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
 * @author luna
 */
public class SokAlien extends javax.swing.JFrame {

    //Vi skapar 3 Array Lists för att lagra de tre olika rasalternativen i.
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    ArrayList<String> squidLista;
    ArrayList<String> bogloditeLista;
    ArrayList<String> wormLista;

    //I konstruktorn anger vi att de rasunika fälten ska vara osynliga som default.
    public SokAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;        
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        lblBoogies.setVisible(false); //rätt
        lblBoogiesSvar.setVisible(false);
        lblAntalArmar.setVisible(false);
        lblAntalArmarSvar.setVisible(false);
        lblConfirm.setVisible(false);
        lblError.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitel = new javax.swing.JLabel();
        lblSokID = new javax.swing.JLabel();
        txtSokID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAlienLosenord = new javax.swing.JLabel();
        lblAlienNamn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAlienTelefon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        lblAlienRas = new javax.swing.JLabel();
        lblAlienPlats = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblBoogies = new javax.swing.JLabel();
        lblBoogiesSvar = new javax.swing.JLabel();
        lblAntalArmar = new javax.swing.JLabel();
        lblAntalArmarSvar = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        lblDatumlbl = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuStartsida = new javax.swing.JMenu();
        menuInget = new javax.swing.JMenu();
        menuInlogg = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        lblTitel.setText("MiB ALIENSÖK");

        lblSokID.setText("AlienID:");

        txtSokID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Lösenord:");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Namn:");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAlienLosenord.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienLosenord.setText("**********");

        lblAlienNamn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienNamn.setText("-");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Telefon:");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAlienTelefon.setText("-");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Ras:");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("Plats:");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setText("Ansvarig agent:");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSok.setText("SÖK");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lblAlienRas.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienRas.setText("-");

        lblAlienPlats.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAlienPlats.setText("-");

        lblAnsvarigAgent.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAnsvarigAgent.setText("-");

        lblBoogies.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblBoogies.setText("Antal Boogies:");
        lblBoogies.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBoogiesSvar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblBoogiesSvar.setText("-");

        lblAntalArmar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAntalArmar.setText("Antal Armar:");
        lblAntalArmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAntalArmarSvar.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblAntalArmarSvar.setText("-");

        lblConfirm.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        lblConfirm.setForeground(new java.awt.Color(0, 255, 0));
        lblConfirm.setText("Sökningen lyckades. Förvärvad information om den aktuella livsformen:");

        lblError.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Sökningen misslyckades. Kontakta MiB Service Support.");

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblDatumlbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblDatumlbl.setText("Registreringsdatum");
        lblDatumlbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDatum.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblDatum.setText("-");

        menuStartsida.setText("Tillbaka till startsida");
        menuStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStartsida);

        menuInget.setText("                                                                                                                                                     ");
        jMenuBar1.add(menuInget);

        menuInlogg.setText("Inloggad som Agent");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnTillbaka)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(lblTitel)
                        .addGap(364, 364, 364))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblError)
                                .addGap(309, 309, 309))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(lblSokID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSokID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSok))
                                    .addComponent(lblConfirm))
                                .addGap(262, 262, 262))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(lblAntalArmar)
                            .addComponent(lblDatumlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAntalArmarSvar)
                            .addComponent(lblAlienLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlienPlats)
                            .addComponent(lblAnsvarigAgent)
                            .addComponent(lblAlienRas)
                            .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblBoogies)))
                .addGap(29, 29, 29)
                .addComponent(lblBoogiesSvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSokID)
                    .addComponent(txtSokID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblConfirm)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAlienNamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAlienTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAlienLosenord))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblAlienPlats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAnsvarigAgent))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAlienRas)
                    .addComponent(lblBoogies)
                    .addComponent(lblBoogiesSvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntalArmar)
                    .addComponent(lblAntalArmarSvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumlbl)
                    .addComponent(lblDatum))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTillbaka)
                    .addComponent(lblError))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSokIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokIDActionPerformed
    }//GEN-LAST:event_txtSokIDActionPerformed
    
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
        if(Validering.textFaltHarVarde(txtSokID)){
        if(Validering.txtFaltHarSiffror(txtSokID)){
        lblConfirm.setVisible(false);
        lblError.setVisible(false);
        
        try {
            //Lokala variabler för fälten
            String soktID = txtSokID.getText();
            ArrayList<String> alienLista = idb.fetchColumn("SELECT alien_ID FROM alien");
            
            if (alienLista.contains(soktID)) {
                
                squidLista = idb.fetchColumn("SELECT Alien_ID FROM squid ORDER BY Alien_ID");
                bogloditeLista = idb.fetchColumn("SELECT Alien_ID FROM boglodite ORDER BY Alien_ID");
                wormLista = idb.fetchColumn("SELECT Alien_ID FROM worm ORDER BY Alien_ID");

                //Nästlad SQL-fråga för att kunna visa namnet på agenten i stället för dess AgentID.
                String alienAgentNamn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID IN (SELECT Ansvarig_Agent FROM Alien where Alien_ID = " + soktID + ")");

                //Nästlad SQL-fråga för att kunna visa namnet på platsen istället för platsID.
                String alienPlats = idb.fetchSingle("SELECT Benamning FROM Plats WHERE Plats_ID IN(SELECT Plats from Alien where Alien_ID =" + soktID + ")");

                //SQL-frågor som hämtar aliens lösenord, namn och telefon från databasen.  
                String alienLosenord = idb.fetchSingle("SELECT Losenord FROM Alien where Alien_ID = " + soktID + "");
                String alienNamn = idb.fetchSingle("SELECT Namn FROM Alien where Alien_ID = " + soktID + "");
                String alienTelefon = idb.fetchSingle("SELECT Telefon FROM Alien where Alien_ID = " + soktID + "");
                
                String datum = idb.fetchSingle("SELECT Registreringsdatum FROM alien WHERE Alien_ID = " + soktID + "");

                //Här anger vi vad vi vill ska stå i våra labels, det vill säga informationen om den eftersökta alien.
                lblAlienLosenord.setText(alienLosenord);
                lblAlienNamn.setText(alienNamn);
                lblAlienTelefon.setText(alienTelefon);
                lblAlienPlats.setText(alienPlats);
                lblAnsvarigAgent.setText(alienAgentNamn);
                lblDatum.setText(datum);

                //Här arbetr vi med villkorssatser för att "söka" efter det eftersökta ID:t i våra Arrayer.
                if (squidLista.contains(soktID)) {
                    String antalArmar = idb.fetchSingle("SELECT Antal_Armar FROM squid WHERE Alien_ID = '" + soktID + "'");
                    lblAlienRas.setText("Squid");
                    
                    lblAntalArmar.setVisible(true);
                    lblAntalArmarSvar.setVisible(true);
                    lblAntalArmarSvar.setText(antalArmar);
                    
                    lblBoogies.setVisible(false);
                    lblBoogiesSvar.setVisible(false);
                    lblConfirm.setVisible(true);
                    
                } else if (bogloditeLista.contains(soktID)) {
                    String antalBoogies = idb.fetchSingle("SELECT Antal_Boogies FROM boglodite WHERE Alien_ID = '" + soktID + "'");
                    lblAlienRas.setText("Boglodite");
                    
                    lblBoogies.setVisible(true);
                    lblBoogiesSvar.setVisible(true);
                    lblBoogiesSvar.setText(antalBoogies);
                    
                    lblAntalArmar.setVisible(false);
                    lblAntalArmarSvar.setVisible(false);
                    lblConfirm.setVisible(true);
                } else if (wormLista.contains(soktID)) {
                    lblAlienRas.setText("Worm");
                    lblAntalArmar.setVisible(false);
                    lblAntalArmarSvar.setVisible(false);
                    lblBoogies.setVisible(false);
                    lblBoogiesSvar.setVisible(false);
                    lblConfirm.setVisible(true);
                    
                } else {
                    lblAlienRas.setText("Okänd");
                    lblAntalArmar.setVisible(false);
                    lblAntalArmarSvar.setVisible(false);
                    lblBoogies.setVisible(false);
                    lblBoogiesSvar.setVisible(false);
                    lblConfirm.setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "AlienID finns inte!");
            }
        } //Hit kommer vi om det uppstår ett undantag, det vill säga att exempelvis villkorssatserna inte fungerar.
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            lblError.setVisible(true);
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "AlienID måste vara ifyllt!");
        }
        

    }//GEN-LAST:event_btnSokMouseClicked

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        SQL s = new SQL(idb);
        boolean admin = s.arAdmin(anvId);
        setVisible(false);
        
        if (admin) {
            HanteraAliensAdmin h = new HanteraAliensAdmin(idb, anvId, anvTyp);
            h.setVisible(true);
        } else {
            HanteraAliens h = new HanteraAliens(idb, anvId, anvTyp);
            h.setVisible(true);
        }
        
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void menuStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuStartsidaMouseClicked

    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAlienLosenord;
    private javax.swing.JLabel lblAlienNamn;
    private javax.swing.JLabel lblAlienPlats;
    private javax.swing.JLabel lblAlienRas;
    private javax.swing.JLabel lblAlienTelefon;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblAntalArmar;
    private javax.swing.JLabel lblAntalArmarSvar;
    private javax.swing.JLabel lblBoogies;
    private javax.swing.JLabel lblBoogiesSvar;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatumlbl;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblSokID;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JMenu menuInget;
    private javax.swing.JMenu menuInlogg;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuStartsida;
    private javax.swing.JTextField txtSokID;
    // End of variables declaration//GEN-END:variables
}
