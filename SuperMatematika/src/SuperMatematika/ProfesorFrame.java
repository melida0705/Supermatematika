/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melida
 */
public class ProfesorFrame extends javax.swing.JFrame {
    Profesor trenutniKorisnik;
    /**
     * Creates new form ProfesorFrame
     */
   
    public ProfesorFrame(Profesor tk) throws SQLException {
        trenutniKorisnik=tk;
        initComponents();
        this.pnlProfilMenu.setVisible(false);
       
        
         this.imePrezime.setText(trenutniKorisnik.getIme()+" "+trenutniKorisnik.getPrezime());
       
    }

    private ProfesorFrame() {
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlBackground = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        imePrezime = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ProfesorViewLeft = new javax.swing.JPanel();
        pnlProfilMenu = new javax.swing.JPanel();
        btnRezultatiTesta = new javax.swing.JButton();
        btnIzvestaj = new javax.swing.JButton();
        btnSastaviTest = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        pnlMainContent = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setPreferredSize(new java.awt.Dimension(1140, 710));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(0, 115, 173));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imePrezime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        imePrezime.setForeground(new java.awt.Color(255, 255, 255));
        imePrezime.setText("IME I PREZIME");
        pnlHeader.add(imePrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 40));

        btnMenu.setBackground(new java.awt.Color(0, 115, 173));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/MenuIcon.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.setPreferredSize(new java.awt.Dimension(80, 60));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlHeader.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jButton2.setBackground(new java.awt.Color(0, 115, 173));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/homeIcon.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlHeader.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 70, 60));

        pnlBackground.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        ProfesorViewLeft.setBackground(new java.awt.Color(255, 255, 255));
        ProfesorViewLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ProfesorViewLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProfilMenu.setBackground(new java.awt.Color(0, 161, 241));
        pnlProfilMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRezultatiTesta.setBackground(new java.awt.Color(0, 115, 173));
        btnRezultatiTesta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRezultatiTesta.setForeground(new java.awt.Color(255, 255, 255));
        btnRezultatiTesta.setText("Rezultati testa");
        btnRezultatiTesta.setAlignmentY(0.0F);
        btnRezultatiTesta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnRezultatiTesta.setFocusPainted(false);
        btnRezultatiTesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRezultatiTesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRezultatiTestaMouseClicked(evt);
            }
        });
        btnRezultatiTesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezultatiTestaActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnRezultatiTesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 50));

        btnIzvestaj.setBackground(new java.awt.Color(0, 115, 173));
        btnIzvestaj.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIzvestaj.setForeground(new java.awt.Color(255, 255, 255));
        btnIzvestaj.setText("Izvestaj");
        btnIzvestaj.setToolTipText("");
        btnIzvestaj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnIzvestaj.setFocusPainted(false);
        btnIzvestaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIzvestajMouseClicked(evt);
            }
        });
        btnIzvestaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvestajActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnIzvestaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 50));

        btnSastaviTest.setBackground(new java.awt.Color(0, 115, 173));
        btnSastaviTest.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSastaviTest.setForeground(new java.awt.Color(255, 255, 255));
        btnSastaviTest.setText("Sastavi test");
        btnSastaviTest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSastaviTest.setFocusPainted(false);
        btnSastaviTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSastaviTestMouseClicked(evt);
            }
        });
        btnSastaviTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSastaviTestActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnSastaviTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        btnProfil.setBackground(new java.awt.Color(0, 115, 173));
        btnProfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnProfil.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil.setText("Moj Profil");
        btnProfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnProfil.setFocusPainted(false);
        btnProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfilMouseClicked(evt);
            }
        });
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 50));

        btnLogOut.setBackground(new java.awt.Color(0, 115, 173));
        btnLogOut.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log out");
        btnLogOut.setActionCommand("Odjava");
        btnLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnLogOut.setFocusPainted(false);
        btnLogOut.setPreferredSize(new java.awt.Dimension(280, 50));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 50));

        ProfesorViewLeft.add(pnlProfilMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 250));

        pnlBackground.add(ProfesorViewLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 650));

        pnlMainContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainContent.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlMainContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlMainContent.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 890, 50));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("TEST");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlMainContent.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 200, 180));

        jButton3.setBackground(new java.awt.Color(255, 204, 102));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LEKCIJE");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlMainContent.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 180));

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ZADACI");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jButton4.setFocusPainted(false);
        pnlMainContent.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 200, 180));

        pnlBackground.add(pnlMainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 890, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
         ProfesorPanel newPnl = new ProfesorPanel(trenutniKorisnik);
        this.pnlMainContent.removeAll();
        this.pnlMainContent.revalidate();
        this.pnlMainContent.setLayout(new BorderLayout());
        this.pnlMainContent.add(newPnl);
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
         try {
            MainFrame m = new MainFrame();
            m.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSastaviTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSastaviTestActionPerformed
        // TODO add your handling code here:
        pnlSastaviTest newPnl = new pnlSastaviTest(trenutniKorisnik);
        this.pnlMainContent.removeAll();
        this.pnlMainContent.revalidate();
        this.pnlMainContent.setLayout(new BorderLayout());
        this.pnlMainContent.add(newPnl);
    }//GEN-LAST:event_btnSastaviTestActionPerformed

    private void btnRezultatiTestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezultatiTestaActionPerformed
        // TODO add your handling code here:
        pnlRezultatiTesta newPnl = new pnlRezultatiTesta(trenutniKorisnik);
        this.pnlMainContent.removeAll();
        this.pnlMainContent.revalidate();
        this.pnlMainContent.setLayout(new BorderLayout());
        this.pnlMainContent.add(newPnl);
    }//GEN-LAST:event_btnRezultatiTestaActionPerformed

    private void btnSastaviTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSastaviTestMouseClicked
        // TODO add your handling code here:
         this.btnSastaviTest.setBackground(Color.decode("#00A1F1"));
        this.btnRezultatiTesta.setBackground(Color.decode("#0073AD"));
        this.btnIzvestaj.setBackground(Color.decode("#0073AD"));
        this.btnProfil.setBackground(Color.decode("#0073AD"));
        
    }//GEN-LAST:event_btnSastaviTestMouseClicked

    private void btnRezultatiTestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRezultatiTestaMouseClicked
        // TODO add your handling code here:
        this.btnRezultatiTesta.setBackground(Color.decode("#00A1F1"));
        this.btnSastaviTest.setBackground(Color.decode("#0073AD"));
         this.btnIzvestaj.setBackground(Color.decode("#0073AD"));
        this.btnProfil.setBackground(Color.decode("#0073AD"));
        
    }//GEN-LAST:event_btnRezultatiTestaMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.pnlProfilMenu.setVisible(pnlProfilMenu.isVisible() ? false : true);

    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnIzvestajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzvestajMouseClicked
        // TODO add your handling code here:
         this.btnRezultatiTesta.setBackground(Color.decode("#0073AD"));
        this.btnSastaviTest.setBackground(Color.decode("#0073AD"));
         this.btnIzvestaj.setBackground(Color.decode("#00A1F1"));
         this.btnProfil.setBackground(Color.decode("#0073AD"));
        
    }//GEN-LAST:event_btnIzvestajMouseClicked

    private void btnProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfilMouseClicked
        // TODO add your handling code here:
        this.btnProfil.setBackground(Color.decode("#00A1F1"));
        this.btnSastaviTest.setBackground(Color.decode("#0073AD"));
        
        this.btnRezultatiTesta.setBackground(Color.decode("#0073AD"));
        this.btnIzvestaj.setBackground(Color.decode("#0073AD"));
    }//GEN-LAST:event_btnProfilMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add 
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnIzvestajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvestajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzvestajActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProfesorViewLeft;
    private javax.swing.JButton btnIzvestaj;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnRezultatiTesta;
    private javax.swing.JButton btnSastaviTest;
    private javax.swing.JLabel imePrezime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainContent;
    private javax.swing.JPanel pnlProfilMenu;
    // End of variables declaration//GEN-END:variables
}
