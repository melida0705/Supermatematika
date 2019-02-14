/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika.UcenikPaneli;

import SuperMatematika.ZajednickeKlase.DBController;
import SuperMatematika.Model.Student;
import SuperMatematika.ZajednickeKlase.Navigacija;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melida
 */
public class PanelUcenikMainChoice extends javax.swing.JPanel {

    Student trenutniKorisnik;

    public PanelUcenikMainChoice(Student tk) throws SQLException {
        trenutniKorisnik = tk;
        initComponents();
        popuniTabelu();
    }

    public void hoverButton(JButton b) {
        b.setBackground(Color.decode("#F88457"));

    }

    public void hoverButtonExit(JButton b) {
        b.setBackground(Color.decode("#F65314"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void popuniTabelu() {

        String upit = "SELECT Predmet.Naziv, Rezultati_testa.redni_broj_testa, Rezultati_testa.broj_bodova "
                + "FROM Predmet INNER JOIN Rezultati_testa ON Predmet.ID_predmeta=Rezultati_testa.predmet "
                + "WHERE Rezultati_testa.student = '" + trenutniKorisnik.getUsername() + "' "
                + "ORDER BY Naziv, redni_broj_testa DESC;";

        System.out.println(upit);
        try {
            ResultSet rezultat = DBController.require().submitQuery(upit);
            while (rezultat.next()) {
                Object[] row = {rezultat.getString("Naziv"), rezultat.getInt("redni_broj_testa"), rezultat.getInt("broj_bodova") / 20 + 1};
                ((DefaultTableModel) jTable1.getModel()).insertRow(0, row);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(PanelOcene.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainContent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLekcije2 = new javax.swing.JButton();
        btnZadaci = new javax.swing.JButton();
        btnProbniTest = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        pnlMainContent.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnLekcije2.setBackground(new java.awt.Color(246, 83, 20));
        btnLekcije2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnLekcije2.setForeground(new java.awt.Color(255, 255, 255));
        btnLekcije2.setText("LEKCIJE");
        btnLekcije2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnLekcije2.setFocusPainted(false);
        btnLekcije2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLekcije2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeave(evt);
            }
        });
        btnLekcije2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLekcije2ActionPerformed(evt);
            }
        });

        btnZadaci.setBackground(new java.awt.Color(0, 161, 241));
        btnZadaci.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnZadaci.setForeground(new java.awt.Color(255, 255, 255));
        btnZadaci.setText("ZADACI");
        btnZadaci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnZadaci.setFocusPainted(false);
        btnZadaci.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnZadaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverZadaci(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeaveZadaci(evt);
            }
        });
        btnZadaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZadaciActionPerformed(evt);
            }
        });

        btnProbniTest.setBackground(new java.awt.Color(255, 187, 0));
        btnProbniTest.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnProbniTest.setForeground(new java.awt.Color(255, 255, 255));
        btnProbniTest.setText("PROBNI TEST");
        btnProbniTest.setToolTipText("");
        btnProbniTest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnProbniTest.setFocusPainted(false);
        btnProbniTest.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnProbniTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverProbni(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeaveProbni(evt);
            }
        });
        btnProbniTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbniTestActionPerformed(evt);
            }
        });

        btnTest.setBackground(new java.awt.Color(124, 187, 0));
        btnTest.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnTest.setForeground(new java.awt.Color(255, 255, 255));
        btnTest.setText("TEST");
        btnTest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnTest.setFocusPainted(false);
        btnTest.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverTest(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeaveTest(evt);
            }
        });
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnLekcije2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnZadaci, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProbniTest, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTest, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLekcije2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZadaci, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProbniTest, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Predmet", "Redni broj testa", "Ocena"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(27);
        jTable1.setSelectionBackground(new java.awt.Color(0, 161, 241));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlMainContentLayout = new javax.swing.GroupLayout(pnlMainContent);
        pnlMainContent.setLayout(pnlMainContentLayout);
        pnlMainContentLayout.setHorizontalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainContentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addGap(27, 27, 27))
        );
        pnlMainContentLayout.setVerticalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
@SuppressWarnings("unchecked")
    private void btnLekcije2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLekcije2ActionPerformed
    PanelBirajPredmet newPnl;
    try {
        newPnl = new PanelBirajPredmet(trenutniKorisnik, DBController.require().getPredmete(trenutniKorisnik.getRazred()), "predavanja");
        Navigacija.PromeniPanel(this, newPnl);
    } catch (Exception ex) {
        Logger.getLogger(FrameUcenik.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnLekcije2ActionPerformed

    private void btnZadaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZadaciActionPerformed
        PanelBirajPredmet newPnl;
        try {
            newPnl = new PanelBirajPredmet(trenutniKorisnik, DBController.require().getPredmete(trenutniKorisnik.getRazred()), "zadaci");
            Navigacija.PromeniPanel(this, newPnl);
        } catch (Exception ex) {
            Logger.getLogger(PanelUcenikMainChoice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnZadaciActionPerformed

    private void btnProbniTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbniTestActionPerformed
        Navigacija.PromeniPanel(this, new PanelBiranjeOblastiZaProbniTest(trenutniKorisnik));
    }//GEN-LAST:event_btnProbniTestActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        Navigacija.PromeniPanel(this, new PanelOdabirTesta(trenutniKorisnik));
    }//GEN-LAST:event_btnTestActionPerformed

    private void HoverHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverHandler
        // TODO add your handling code here:
        hoverButton((JButton) evt.getSource());
    }//GEN-LAST:event_HoverHandler

    private void HoverLeave(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverLeave
        // TODO add your handling code here:
        hoverButtonExit((JButton) evt.getSource());
    }//GEN-LAST:event_HoverLeave

    private void HoverZadaci(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverZadaci
        // TODO add your handling code here:
        this.btnZadaci.setBackground(Color.decode("#38BCFF"));


    }//GEN-LAST:event_HoverZadaci

    private void HoverProbni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverProbni
        // TODO add your handling code here:
        this.btnProbniTest.setBackground(Color.decode("#FFD76B"));
    }//GEN-LAST:event_HoverProbni

    private void HoverTest(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverTest
        // TODO add your handling code here:
        this.btnTest.setBackground(Color.decode("#8ED600"));
    }//GEN-LAST:event_HoverTest

    private void HoverLeaveZadaci(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverLeaveZadaci
        // TODO add your handling code here:
        this.btnZadaci.setBackground(Color.decode("#00A1F1"));
    }//GEN-LAST:event_HoverLeaveZadaci

    private void HoverLeaveProbni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverLeaveProbni
        // TODO add your handling code here:FFBB00
        this.btnProbniTest.setBackground(Color.decode("#FFBB00"));
    }//GEN-LAST:event_HoverLeaveProbni

    private void HoverLeaveTest(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverLeaveTest
        // TODO add your handling code here:7CBB00
        this.btnTest.setBackground(Color.decode("#7CBB00"));
    }//GEN-LAST:event_HoverLeaveTest


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLekcije2;
    private javax.swing.JButton btnProbniTest;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnZadaci;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlMainContent;
    // End of variables declaration//GEN-END:variables
}