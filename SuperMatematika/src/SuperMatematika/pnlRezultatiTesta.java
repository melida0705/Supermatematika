/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1
 */
public class pnlRezultatiTesta extends javax.swing.JPanel {

    /**
     * Creates new form pnlRezultatiTesta
     */
    Profesor trenutniKorisnik;
    public pnlRezultatiTesta(Profesor tk) {
        trenutniKorisnik=tk;
       
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOcene = new javax.swing.JButton();
        btnPredmeti = new javax.swing.JButton();
        btnUcenici = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(890, 650));

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setPreferredSize(new java.awt.Dimension(890, 650));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ime", "Prezime", "Predmet", "Razred", "Odeljenje", "Ocena"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnlBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 650));

        btnOcene.setBackground(new java.awt.Color(246, 100, 43));
        btnOcene.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnOcene.setForeground(new java.awt.Color(255, 255, 255));
        btnOcene.setText("Sortiraj po ocenama");
        btnOcene.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnOcene.setFocusPainted(false);
        btnOcene.setPreferredSize(new java.awt.Dimension(190, 40));
        btnOcene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOceneMouseClicked(evt);
            }
        });
        btnOcene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOceneActionPerformed(evt);
            }
        });
        pnlBackground.add(btnOcene, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        btnPredmeti.setBackground(new java.awt.Color(246, 100, 43));
        btnPredmeti.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnPredmeti.setForeground(new java.awt.Color(255, 255, 255));
        btnPredmeti.setText("Sortiraj po predmetima");
        btnPredmeti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPredmeti.setFocusPainted(false);
        btnPredmeti.setPreferredSize(new java.awt.Dimension(190, 40));
        btnPredmeti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPredmetiActionPerformed(evt);
            }
        });
        pnlBackground.add(btnPredmeti, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        btnUcenici.setBackground(new java.awt.Color(246, 100, 43));
        btnUcenici.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnUcenici.setForeground(new java.awt.Color(255, 255, 255));
        btnUcenici.setText("Sortiraj po ucenicima");
        btnUcenici.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnUcenici.setFocusPainted(false);
        btnUcenici.setPreferredSize(new java.awt.Dimension(190, 40));
        btnUcenici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUceniciActionPerformed(evt);
            }
        });
        pnlBackground.add(btnUcenici, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOceneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOceneActionPerformed

    private void btnOceneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOceneMouseClicked
        // TODO add your handling code here: 
        this.btnOcene.setBackground(Color.decode("#F77E4E"));
         this.btnPredmeti.setBackground(Color.decode("#F6642B"));
         this.btnUcenici.setBackground(Color.decode("#F6642B"));
        
    }//GEN-LAST:event_btnOceneMouseClicked

    private void btnPredmetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPredmetiActionPerformed
        // TODO add your handling code here:
        
        this.btnPredmeti.setBackground(Color.decode("#F77E4E"));
         this.btnUcenici.setBackground(Color.decode("#F6642B"));
        this.btnOcene.setBackground(Color.decode("#F6642B"));
    }//GEN-LAST:event_btnPredmetiActionPerformed

    private void btnUceniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUceniciActionPerformed
        // TODO add your handling code here:
        
        this.btnUcenici.setBackground(Color.decode("#F77E4E"));
        this.btnOcene.setBackground(Color.decode("#F6642B"));
        this.btnPredmeti.setBackground(Color.decode("#F6642B"));
    }//GEN-LAST:event_btnUceniciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOcene;
    private javax.swing.JButton btnPredmeti;
    private javax.swing.JButton btnUcenici;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
