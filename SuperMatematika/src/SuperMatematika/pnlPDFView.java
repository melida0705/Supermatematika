/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.SerializationUtils;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author 1
 */
public class pnlPDFView extends javax.swing.JPanel {
    private JPanel previousPanel;
    private JFrame mainFrame;
    Statement statement = null;
    ResultSet resultSet = null;
    String file;
    Connection connection = null;
    int razred;
    SwingController control=new SwingController();
    String path=new File("").getAbsolutePath();
    /**
     * Creates new form pnlPDFView
     */
    public pnlPDFView(Connection c,Statement s,ResultSet rs,int rzrd,String putanja) {
        connection=c;
        statement=s;
        resultSet=rs;
        razred=rzrd;
        file=putanja;
        initComponents();
        openpdf(file);
        }
  
    void openpdf(String file){
  
    try {
            SwingViewBuilder factry=new SwingViewBuilder(control);
            JPanel veiwerCompntpnl=factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                    new org.icepdf.ri.common.MyAnnotationCallback(
                    control.getDocumentViewController()));
           control.openDocument(path+file);
        
        this.jScrollPane1.setViewportView(veiwerCompntpnl); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contain.setBackground(new java.awt.Color(255, 255, 255));
        contain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        contain.setPreferredSize(new java.awt.Dimension(800, 650));
        contain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 650));
        contain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 730, 650));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/backIcon.png"))); // NOI18N
        btnBack.setActionCommand("");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        contain.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        add(contain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.removeAll();
        this.revalidate();
        this.setLayout(new BorderLayout());
        try {
            System.out.println(razred);
            this.add(new pnlPredavanja(connection,statement,resultSet,razred));
        } catch (SQLException ex) {
            Logger.getLogger(pnlPDFView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel contain;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
