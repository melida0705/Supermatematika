/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Melida
 */
public class UcenikPredmetiPanel extends javax.swing.JPanel {

    /**
     * Creates new form UcenikPredmetiPanel
     */
    Student trenutniKorisnik;
    ArrayList<Predmet> predmeti;
    ArrayList<JLabel> listaPredmeta = new ArrayList();
    ArrayList<JLabel> listaProfesora = new ArrayList();
    public UcenikPredmetiPanel(Student tk) {
        trenutniKorisnik=tk;
        System.out.println(trenutniKorisnik.getRazred());
        try {
            predmeti=DBController.require().getPredmete(trenutniKorisnik.getRazred());
        } catch (SQLException ex) {
            Logger.getLogger(UcenikPredmetiPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        createForm();
    }
   private void createForm() {
        this.MainPanel.removeAll();
        this.MainPanel.revalidate();
        this.MainPanel.setLayout(new GridLayout(predmeti.size(), 2));
        Font f = new Font("Arial", Font.ITALIC, 24);
        predmeti.forEach(elemn->{
            JLabel b = new JLabel(elemn.getNazivPredmeta());
            b.setBackground(Color.white);
            b.setPreferredSize(new Dimension(40, 40));
            b.setFont(f);
            
            JLabel prof=new JLabel(elemn.getPredavac());
            prof.setBackground(Color.green);
            prof.setPreferredSize(new Dimension(40,40));
            prof.setFont(f);
            listaPredmeta.add(b);
            this.MainPanel.add(b);
            this.MainPanel.add(prof);
            this.MainPanel.setVisible(true);
        });

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(300, 300));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(300, 300));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    // End of variables declaration//GEN-END:variables
}
