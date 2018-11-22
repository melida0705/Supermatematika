/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import java.sql.SQLException;

/**
 *
 * @author Melida
 */
public class UcenikPodaciPanel extends javax.swing.JPanel {

    /**
     * Creates new form UcenikPodaciPanel
     */
    Student trenutniKorisnik;
    public UcenikPodaciPanel(Student tk) {
        trenutniKorisnik=tk;
        initComponents();
        popuniLabele();
    }
      private void popuniLabele() {
        lUsername.setText(trenutniKorisnik.username);
        lIme.setText(trenutniKorisnik.ime);
        lPrezime.setText(trenutniKorisnik.prezime);
        lDatumRodjenja.setText(trenutniKorisnik.datumRodjenja.toString());
        lPol.setText(trenutniKorisnik.pol);
        
        // Za student se pamti razred dok se za nastavnika pamti njegov fakultet
            lRazredIliFakultet.setText(((Student)trenutniKorisnik).getRazred() + "");
            // Umesto razred treba da pise fakultet
          
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUcenikPodaci = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        lblDatumRodjenja = new javax.swing.JLabel();
        lblPol = new javax.swing.JLabel();
        lblRazred = new javax.swing.JLabel();
        lRazredIliFakultet = new javax.swing.JLabel();
        lUsername = new javax.swing.JLabel();
        lIme = new javax.swing.JLabel();
        lPrezime = new javax.swing.JLabel();
        lDatumRodjenja = new javax.swing.JLabel();
        lPol = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUcenikPodaci.setBackground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlUcenikPodaci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 153, 153));
        lblUsername.setText("Username");
        pnlUcenikPodaci.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 53, 70, 20));

        lblIme.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIme.setForeground(new java.awt.Color(153, 153, 153));
        lblIme.setText("Ime i prezime");
        pnlUcenikPodaci.add(lblIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 90, -1));

        lblDatumRodjenja.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDatumRodjenja.setForeground(new java.awt.Color(153, 153, 153));
        lblDatumRodjenja.setText("Datum rodjenja");
        pnlUcenikPodaci.add(lblDatumRodjenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 97, -1, -1));

        lblPol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPol.setForeground(new java.awt.Color(153, 153, 153));
        lblPol.setText("Pol");
        pnlUcenikPodaci.add(lblPol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, -1));

        lblRazred.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazred.setForeground(new java.awt.Color(153, 153, 153));
        lblRazred.setText("Razred");
        pnlUcenikPodaci.add(lblRazred, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lRazredIliFakultet.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lRazredIliFakultet.setForeground(new java.awt.Color(102, 102, 102));
        lRazredIliFakultet.setText("razred");
        pnlUcenikPodaci.add(lRazredIliFakultet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, 20));

        lUsername.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lUsername.setForeground(new java.awt.Color(102, 102, 102));
        lUsername.setText("username");
        pnlUcenikPodaci.add(lUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 53, 90, 20));

        lIme.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lIme.setForeground(new java.awt.Color(102, 102, 102));
        lIme.setText("ime");
        pnlUcenikPodaci.add(lIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 13, 70, -1));

        lPrezime.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lPrezime.setForeground(new java.awt.Color(102, 102, 102));
        lPrezime.setText("pprezime");
        pnlUcenikPodaci.add(lPrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 13, 70, -1));

        lDatumRodjenja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lDatumRodjenja.setForeground(new java.awt.Color(102, 102, 102));
        lDatumRodjenja.setText("datum");
        pnlUcenikPodaci.add(lDatumRodjenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 97, 130, -1));

        lPol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lPol.setForeground(new java.awt.Color(102, 102, 102));
        lPol.setText("pol");
        pnlUcenikPodaci.add(lPol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 618, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 618, 10));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 618, 10));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 618, 10));
        pnlUcenikPodaci.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        pnlUcenikPodaci.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 618, 10));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        pnlUcenikPodaci.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 618, 10));

        add(pnlUcenikPodaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 650));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lDatumRodjenja;
    private javax.swing.JLabel lIme;
    private javax.swing.JLabel lPol;
    private javax.swing.JLabel lPrezime;
    private javax.swing.JLabel lRazredIliFakultet;
    private javax.swing.JLabel lUsername;
    private javax.swing.JLabel lblDatumRodjenja;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPol;
    private javax.swing.JLabel lblRazred;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlUcenikPodaci;
    // End of variables declaration//GEN-END:variables
}
