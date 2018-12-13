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
        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lUsername = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        lIme = new javax.swing.JLabel();
        lblRazred1 = new javax.swing.JLabel();
        lPrezime = new javax.swing.JLabel();
        lblDatumRodjenja = new javax.swing.JLabel();
        lDatumRodjenja = new javax.swing.JLabel();
        lblPol = new javax.swing.JLabel();
        lPol = new javax.swing.JLabel();
        lblRazred = new javax.swing.JLabel();
        lRazredIliFakultet = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUcenikPodaci.setBackground(new java.awt.Color(255, 255, 255));
        pnlUcenikPodaci.setAutoscrolls(true);
        pnlUcenikPodaci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(7, 2));

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 153, 153));
        lblUsername.setText("Username:");
        lblUsername.setAutoscrolls(true);
        lblUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblUsername);

        lUsername.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lUsername.setForeground(new java.awt.Color(153, 153, 153));
        lUsername.setText("username");
        lUsername.setAutoscrolls(true);
        lUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lUsername);

        lblIme.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIme.setForeground(new java.awt.Color(153, 153, 153));
        lblIme.setText("Ime:");
        lblIme.setAutoscrolls(true);
        lblIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblIme);

        lIme.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lIme.setForeground(new java.awt.Color(153, 153, 153));
        lIme.setText("ime");
        lIme.setAutoscrolls(true);
        lIme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lIme);

        lblRazred1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazred1.setForeground(new java.awt.Color(153, 153, 153));
        lblRazred1.setText("Prezime:");
        lblRazred1.setAutoscrolls(true);
        lblRazred1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblRazred1);

        lPrezime.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lPrezime.setForeground(new java.awt.Color(153, 153, 153));
        lPrezime.setText("pprezime");
        lPrezime.setAutoscrolls(true);
        lPrezime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lPrezime);

        lblDatumRodjenja.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDatumRodjenja.setForeground(new java.awt.Color(153, 153, 153));
        lblDatumRodjenja.setText("Datum rodjenja:");
        lblDatumRodjenja.setAutoscrolls(true);
        lblDatumRodjenja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblDatumRodjenja);

        lDatumRodjenja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lDatumRodjenja.setForeground(new java.awt.Color(153, 153, 153));
        lDatumRodjenja.setText("datum");
        lDatumRodjenja.setAutoscrolls(true);
        lDatumRodjenja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lDatumRodjenja);

        lblPol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPol.setForeground(new java.awt.Color(153, 153, 153));
        lblPol.setText("Pol:");
        lblPol.setAutoscrolls(true);
        lblPol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblPol);

        lPol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lPol.setForeground(new java.awt.Color(153, 153, 153));
        lPol.setText("pol");
        lPol.setAutoscrolls(true);
        lPol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lPol);

        lblRazred.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazred.setForeground(new java.awt.Color(153, 153, 153));
        lblRazred.setText("Razred:");
        lblRazred.setAutoscrolls(true);
        lblRazred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblRazred);

        lRazredIliFakultet.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lRazredIliFakultet.setForeground(new java.awt.Color(153, 153, 153));
        lRazredIliFakultet.setText("razred");
        lRazredIliFakultet.setAutoscrolls(true);
        lRazredIliFakultet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lRazredIliFakultet);

        pnlUcenikPodaci.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 280));

        add(pnlUcenikPodaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 650));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel lblRazred1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlUcenikPodaci;
    // End of variables declaration//GEN-END:variables
}
