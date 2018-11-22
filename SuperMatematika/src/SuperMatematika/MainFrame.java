/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.Color;
import java.awt.LayoutManager;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 1
 */
public class MainFrame extends javax.swing.JFrame {

    String currPath = new File("").getAbsolutePath();

    public MainFrame() throws SQLException {
        
        // To increase speed later on, is not required
        DBController startConnection=DBController.require();
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

        pnlPozadina = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblWrongUser = new javax.swing.JLabel();
        pnlPrijaviteSe = new javax.swing.JPanel();
        lblPrijaviteSe = new javax.swing.JLabel();
        lblDangerIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSlika6 = new javax.swing.JLabel();
        lblSlika7 = new javax.swing.JLabel();
        lblSlika8 = new javax.swing.JLabel();
        lblSlika5 = new javax.swing.JLabel();
        lblDobroDosli = new javax.swing.JLabel();
        lblBoljaOcena = new javax.swing.JLabel();
        pnlHeader1 = new javax.swing.JPanel();
        lblSuperMatematika1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 520));
        setPreferredSize(new java.awt.Dimension(1140, 710));

        pnlPozadina.setBackground(new java.awt.Color(255, 255, 255));
        pnlPozadina.setMinimumSize(new java.awt.Dimension(1110, 700));
        pnlPozadina.setPreferredSize(new java.awt.Dimension(1140, 710));
        pnlPozadina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), java.awt.Color.lightGray, new java.awt.Color(153, 153, 153)));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setToolTipText("");
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, null, null, java.awt.Color.lightGray));
        txtUser.setPreferredSize(new java.awt.Dimension(64, 23));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClicked(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterHandle(evt);
            }
        });
        pnlLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 290, 30));

        btnLogin.setBackground(new java.awt.Color(205, 19, 31));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, null, null, java.awt.Color.black));
        btnLogin.setFocusPainted(false);
        btnLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
        });
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HoverOnReleased(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterHandle(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, null, null, java.awt.Color.lightGray));
        txtPass.setPreferredSize(new java.awt.Dimension(64, 20));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterHandle(evt);
            }
        });
        pnlLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 290, 30));

        lblWrongUser.setForeground(new java.awt.Color(255, 0, 0));
        pnlLogin.add(lblWrongUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 20));

        pnlPrijaviteSe.setBackground(new java.awt.Color(34, 31, 31));
        pnlPrijaviteSe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlPrijaviteSe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrijaviteSe.setBackground(new java.awt.Color(255, 255, 255));
        lblPrijaviteSe.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblPrijaviteSe.setForeground(new java.awt.Color(255, 255, 255));
        lblPrijaviteSe.setText("PRIJAVITE SE");
        pnlPrijaviteSe.add(lblPrijaviteSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        pnlLogin.add(pnlPrijaviteSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));
        pnlLogin.add(lblDangerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 20, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 70, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 70, 30));

        pnlPozadina.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 430, 410));

        pnlHeader.setBackground(new java.awt.Color(34, 31, 31));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPozadina.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1140, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlPozadina.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 10, 560));

        lblSlika6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/broj6Icon.png"))); // NOI18N
        pnlPozadina.add(lblSlika6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 230));

        lblSlika7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/broj7Icon.png"))); // NOI18N
        pnlPozadina.add(lblSlika7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 278, -1, 230));

        lblSlika8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/broj8Icon.png"))); // NOI18N
        pnlPozadina.add(lblSlika8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 278, -1, 230));

        lblSlika5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/broj5Icon.png"))); // NOI18N
        pnlPozadina.add(lblSlika5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 240));

        lblDobroDosli.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblDobroDosli.setText("Dobrodosli na E-Matematiku");
        pnlPozadina.add(lblDobroDosli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblBoljaOcena.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblBoljaOcena.setText("I BOLJA OCENA I VISE ZNANJA");
        pnlPozadina.add(lblBoljaOcena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        pnlHeader1.setBackground(new java.awt.Color(34, 31, 31));
        pnlHeader1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSuperMatematika1.setBackground(new java.awt.Color(255, 255, 255));
        lblSuperMatematika1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblSuperMatematika1.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperMatematika1.setText("SuperMatematika");
        pnlHeader1.add(lblSuperMatematika1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 330, 50));

        pnlPozadina.add(pnlHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPozadina, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        txtUser.setText("");
        txtUser.setForeground(Color.black);

    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            handleLogin();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setText("");
        txtUser.setForeground(Color.black);
        txtUser.setBorder(BorderFactory.createSoftBevelBorder(1, Color.darkGray, Color.lightGray, Color.lightGray, Color.lightGray));

    }//GEN-LAST:event_txtUserFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setText("");
        txtPass.setForeground(Color.black);
        txtPass.setBorder(BorderFactory.createSoftBevelBorder(1, Color.darkGray, Color.lightGray, Color.lightGray, Color.lightGray));
    }//GEN-LAST:event_txtPassFocusGained

    private void HoverOnReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverOnReleased
        this.btnLogin.setBackground(Color.decode("#CD131F"));
        this.btnLogin.setForeground(Color.white);
    }//GEN-LAST:event_HoverOnReleased

    private void HoverHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverHandler
        this.btnLogin.setBackground(Color.white);
        this.btnLogin.setForeground(Color.decode("#CD131F"));
    }//GEN-LAST:event_HoverHandler

    private void HoverExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverExited
        this.btnLogin.setBackground(Color.decode("#CD131F"));
        this.btnLogin.setForeground(Color.white);
    }//GEN-LAST:event_HoverExited

    private void enterHandle(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterHandle
        if (evt.getKeyCode() == 10) {
            try {
                handleLogin();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_enterHandle

    private void txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClicked
        // TODO add your handling code here:
        txtUser.setBorder(BorderFactory.createSoftBevelBorder(1, Color.black, Color.lightGray, Color.lightGray, Color.lightGray));
    }//GEN-LAST:event_txtMouseClicked

    public void handleLogin() throws SQLException {
        Korisnik tr=DBController.require().loginValid(this.txtUser.getText(),this.txtPass.getText());
        if(tr!=null){
            System.out.println("USPESAN LOGIN");
            
            //HANDLE GRAPHICS
            switch(tr.getUserType()){
                case "ucenik":
                    StudentFrame newMain=new StudentFrame(new Student(tr));
                    newMain.setVisible(true);
                    this.dispose();
                    break;
                case "nastavnik":
                    ProfesorFrame newMain2=new ProfesorFrame(new Profesor(tr));
                    newMain2.setVisible(true);
                    this.dispose();
                    break;
                case "admin":
                    AdminFrame newMain3=new AdminFrame(new Admin(tr));
                    newMain3.setVisible(true);
                    this.dispose();
                    break;
            }
        }
        else{
            
            // HANDLE GRAHPICS
            this.lblWrongUser.setText("Wrong user or pass!");
            this.lblDangerIcon.setIcon(new ImageIcon(new File("").getAbsolutePath()+"\\src\\SlikeDizajn\\DangerIcon.png"));
        }
        
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBoljaOcena;
    private javax.swing.JLabel lblDangerIcon;
    private javax.swing.JLabel lblDobroDosli;
    private javax.swing.JLabel lblPrijaviteSe;
    private javax.swing.JLabel lblSlika5;
    private javax.swing.JLabel lblSlika6;
    private javax.swing.JLabel lblSlika7;
    private javax.swing.JLabel lblSlika8;
    private javax.swing.JLabel lblSuperMatematika1;
    private javax.swing.JLabel lblWrongUser;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHeader1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPozadina;
    private javax.swing.JPanel pnlPrijaviteSe;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
