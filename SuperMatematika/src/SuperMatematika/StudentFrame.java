/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Melida
 */
public class StudentFrame extends javax.swing.JFrame {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    int razred;
    String username;
    public StudentFrame(Connection c,Statement s,ResultSet rs,String un) throws SQLException {
        connection=c;
        statement=s;
        resultSet=rs;
        
        username=un;
        razred=dbGetRazred();
        initComponents();
        mainChoiceView newPnl;
        newPnl = new mainChoiceView(connection,statement,resultSet,razred,username);
        this.pnlMainContent.removeAll();
        this.pnlMainContent.revalidate();
        this.pnlMainContent.setLayout(new BorderLayout());
        this.pnlMainContent.add(newPnl);
        this.imePrezime.setText(getIme());
        setNav();
        this.pnlProfilMenu.setVisible(false);
    }

    StudentFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getIme(){
        try {
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery("SELECT ime,prezime from Student where username='"+username+"';");
             try{
                 while(resultSet.next()){
                     return resultSet.getString(1)+" "+resultSet.getString(2);
                 }
                
             }       
             catch(Exception e){
                 System.out.println(e);
             }
            // processing returned data and printing into console
          
        }
        catch(Exception E){
            System.out.println(E);
        }
        finally {

            // Step 3: Closing database connection
            try {
                if(null != connection) {

                    // cleanup resources, once after 
                    statement.close();

                    //connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
        return "";
    }
    public int dbGetRazred() throws SQLException{
        
         try {
            statement = (Statement) connection.createStatement();  
            resultSet = statement.executeQuery("SELECT razred from Student where username='"+username+"';");
             try{
                 while(resultSet.next()){
                     return resultSet.getInt("razred");
                 }
                
             }       
             catch(Exception e){
                 System.out.println(e);
             }
            // processing returned data and printing into console
          
        }
        catch(Exception E){
            System.out.println(E);
        }
        finally {

            // Step 3: Closing database connection
            try {
                if(null != connection) {

                    // cleanup resources, once after 
                    statement.close();

                    //connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
         return 0;
    }
    public void setNav(){
        //create the root node
        DefaultMutableTreeNode category = new DefaultMutableTreeNode("Navigacija");
        DefaultMutableTreeNode category1 = new DefaultMutableTreeNode("V Razred");
        //create the child nodes
        DefaultMutableTreeNode category1_1 = new DefaultMutableTreeNode("Skupovi");
        DefaultMutableTreeNode category1_2 = new DefaultMutableTreeNode("Deljivost brojeva");
        //add the child nodes to the root node
        category1.add(category1_1);
        category1.add(category1_2);
        category.add(category1);
        DefaultTreeModel defaultTreeModel= new DefaultTreeModel(category);
        Navigacija.setModel(defaultTreeModel);
         
         
    }
    
    public void hoverButton(JButton b){
        b.setBackground(Color.white);
        b.setForeground(Color.decode("#B9143C"));
    }
    public void hoverButtonExit(JButton b)
    {
        b.setBackground(Color.decode("#B9143C"));
        b.setForeground(Color.WHITE);
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
        pnlHeader = new javax.swing.JPanel();
        imePrezime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        pnlProfilMenu = new javax.swing.JPanel();
        btnProfil = new javax.swing.JButton();
        btnStatistika = new javax.swing.JButton();
        btnOcene = new javax.swing.JButton();
        btnOdjava = new javax.swing.JButton();
        pnlMainContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Navigacija = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(185, 20, 60));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imePrezime.setBackground(new java.awt.Color(255, 255, 255));
        imePrezime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        imePrezime.setForeground(new java.awt.Color(255, 255, 255));
        imePrezime.setText("Ime Prezime");
        pnlHeader.add(imePrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RAZRED");
        pnlHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnMenu.setBackground(new java.awt.Color(185, 20, 60));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/MenuIcon.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouseDragger(evt);
            }
        });
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseDragger(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenu(evt);
            }
        });
        pnlHeader.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 80, 60));

        pnlBackground.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 60));

        pnlProfilMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfil.setBackground(new java.awt.Color(185, 20, 60));
        btnProfil.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnProfil.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil.setText("Profil");
        btnProfil.setBorder(null);
        btnProfil.setFocusPainted(false);
        btnProfil.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeave(evt);
            }
        });
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        btnStatistika.setBackground(new java.awt.Color(185, 20, 60));
        btnStatistika.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnStatistika.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistika.setText("Statistika ");
        btnStatistika.setBorder(null);
        btnStatistika.setDefaultCapable(false);
        btnStatistika.setFocusPainted(false);
        btnStatistika.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnStatistika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeave(evt);
            }
        });
        btnStatistika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikaActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnStatistika, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 50));

        btnOcene.setBackground(new java.awt.Color(185, 20, 60));
        btnOcene.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnOcene.setForeground(new java.awt.Color(255, 255, 255));
        btnOcene.setText("Ocene");
        btnOcene.setBorder(null);
        btnOcene.setFocusPainted(false);
        btnOcene.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnOcene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeave(evt);
            }
        });
        pnlProfilMenu.add(btnOcene, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 50));

        btnOdjava.setBackground(new java.awt.Color(185, 20, 60));
        btnOdjava.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnOdjava.setForeground(new java.awt.Color(255, 255, 255));
        btnOdjava.setText("Odjava");
        btnOdjava.setBorder(null);
        btnOdjava.setFocusPainted(false);
        btnOdjava.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnOdjava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverHandler(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverLeave(evt);
            }
        });
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });
        pnlProfilMenu.add(btnOdjava, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 50));

        pnlBackground.add(pnlProfilMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 150, 200));

        pnlMainContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlBackground.add(pnlMainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 800, 650));

        jScrollPane1.setViewportView(Navigacija);

        pnlBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnStatistikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatistikaActionPerformed

    private void HoverHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverHandler
                hoverButton((JButton)evt.getSource());        
    }//GEN-LAST:event_HoverHandler

    private void HoverLeave(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverLeave
        // TODO add your handling code here:
        hoverButtonExit((JButton)evt.getSource());
    }//GEN-LAST:event_HoverLeave

    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        
        try {
            MainFrame m= new MainFrame();
            m.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnOdjavaActionPerformed

    private void showMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMenu
        this.pnlProfilMenu.setVisible(pnlProfilMenu.isVisible()?false:true);
    }//GEN-LAST:event_showMenu

    private void MouseDragger(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragger
      this.pnlProfilMenu.setVisible(pnlProfilMenu.isVisible()?false:true);  // TODO add your handling code here:
    }//GEN-LAST:event_MouseDragger

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new StudentFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Navigacija;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnOcene;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnStatistika;
    private javax.swing.JLabel imePrezime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainContent;
    private javax.swing.JPanel pnlProfilMenu;
    // End of variables declaration//GEN-END:variables
}
