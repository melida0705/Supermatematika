/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import SuperMatematika.DBController.GreskaNemaDovoljnoPitanja;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

/**
 *
 * @author 1
 */
public class pnlTest extends javax.swing.JPanel {
    
    Student trenutniKorisnik;
    private boolean zapamtiUBazi;
    private int ID_predmeta;
    private int redniBrojTesta;
    private ArrayList<String> oblasti; // ovo sluzi samo za random test
    private final int BROJ_ZADATAKA = 5;
    
    private int trenutni=0;
    List<Zadatak> zadaci; 
    Timer t;
    private int timerDuration=3600;
    ArrayList<ZadatakPanel> resenjaZadataka=new ArrayList();   
    
    // Ovaj konstruktor se koristi za probni test, sastavlja random test
    public pnlTest(Student tr, ArrayList<String> oblasti) {
        trenutniKorisnik=tr;
        this.oblasti = oblasti;
        initComponents();
        // Rezultati probnog testa se ne pamte u bazi
        zapamtiUBazi = false;
  
        // Postavi novi test u pocetku
        bNoviTest.doClick();     
    }
    
    // Ovaj konstruktor se koristi za pravi test, u njemu se sastavlja test od upared odrenjenih zadataka od strane nastavnika
    // I btw dubme bNoviTest se gasi jer nema smisla
    public pnlTest(Student tr, int ID_predmeta, int redniBrojTesta){
        trenutniKorisnik=tr;
        this.ID_predmeta = ID_predmeta;
        this.redniBrojTesta = redniBrojTesta;
        initComponents();
        // Rezultati pravog testa se pamte u bazi
        zapamtiUBazi = true;
        try {
            zadaci = DBController.require().SastaviTest(tr.getRazred(), tr.getOdeljenje(), ID_predmeta, redniBrojTesta);
        } catch (SQLException ex) {
            Logger.getLogger(pnlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Moram ovako, ali cu to sigurno da ispravim, 100%, sigurno necu da zaborvim
        // Jer mi je tako trenutno najlakse
        bNoviTest.doClick();
        
        // Nema mogucnost odabira novog testa
        bNoviTest.setEnabled(false);
        
    }
            
    
    private void krajTesta() throws SQLException{
        this.btnPrethodni.setEnabled(false);
        this.btnSledeci.setEnabled(false);
        this.bProverResenja.setEnabled(false);
        if (zapamtiUBazi)
            DBController.require().submitTest(resenjaZadataka,trenutniKorisnik, ID_predmeta, redniBrojTesta);
        t.stop();
    }
    private String sekundeUMinute(int seconds){
        int s=seconds%60;
        int m=seconds/60;
        String str=m+":"+s;
        
        return str;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timer = new javax.swing.JLabel();
        bNoviTest = new javax.swing.JButton();
        bProverResenja = new javax.swing.JButton();
        btnPrethodni = new javax.swing.JButton();
        btnSledeci = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlZadaci = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timer.setBackground(new java.awt.Color(153, 255, 153));
        timer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timer.setForeground(new java.awt.Color(51, 51, 51));
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        bNoviTest.setText("Novi test");
        bNoviTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoviTestActionPerformed(evt);
            }
        });

        bProverResenja.setBackground(new java.awt.Color(0, 161, 241));
        bProverResenja.setForeground(new java.awt.Color(255, 255, 255));
        bProverResenja.setText("PREDAJ TEST");
        bProverResenja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProverResenjaActionPerformed(evt);
            }
        });

        btnPrethodni.setBackground(new java.awt.Color(0, 161, 241));
        btnPrethodni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/arrow-left-drop-circle-outline.png"))); // NOI18N
        btnPrethodni.setFocusPainted(false);
        btnPrethodni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrethodniActionPerformed(evt);
            }
        });

        btnSledeci.setBackground(new java.awt.Color(0, 161, 241));
        btnSledeci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlikeDizajn/arrow-right-drop-circle-outline.png"))); // NOI18N
        btnSledeci.setFocusPainted(false);
        btnSledeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSledeciActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(730, 620));

        pnlZadaci.setBackground(new java.awt.Color(255, 255, 255));
        pnlZadaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlZadaci.setMaximumSize(new java.awt.Dimension(728, 546));

        javax.swing.GroupLayout pnlZadaciLayout = new javax.swing.GroupLayout(pnlZadaci);
        pnlZadaci.setLayout(pnlZadaciLayout);
        pnlZadaciLayout.setHorizontalGroup(
            pnlZadaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlZadaciLayout.setVerticalGroup(
            pnlZadaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlZadaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlZadaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPrethodni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                        .addComponent(bProverResenja, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bNoviTest, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(btnSledeci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bProverResenja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bNoviTest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrethodni, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSledeci)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrethodniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrethodniActionPerformed

       this.pnlZadaci.removeAll();
          this.pnlZadaci.revalidate();
          this.pnlZadaci.setLayout(new GridLayout(1,0,1,0));
           trenutni--;
           this.pnlZadaci.add(resenjaZadataka.get(trenutni));
       
           this.btnSledeci.setEnabled(trenutni!=BROJ_ZADATAKA-1);
           this.btnPrethodni.setEnabled(trenutni!=0);

    }//GEN-LAST:event_btnPrethodniActionPerformed

    private void bNoviTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoviTestActionPerformed
      this.pnlZadaci.removeAll();
        this.pnlZadaci.revalidate();
        
        this.pnlZadaci.setLayout(new GridLayout(1,0,1,0));
        try {
            
            try{
                this.t.stop();
            }catch(Exception e){}
            timerDuration=3600;
            trenutni=0;
            // Znam da je ovo glupo ali...
            // Na osnovu varijable zapamtiUBazi odredjujem da li cu da sastavljam random test ili predefinisani test
            if (!zapamtiUBazi)
                zadaci = DBController.require().SastaviTest(oblasti, BROJ_ZADATAKA);
            // Ako treba da se pamti u bazi onda se to radi u konstruktoru jer se u tom slucaju to radi samo jednom
            
            
            resenjaZadataka.clear();
            for (Zadatak z: zadaci){
                resenjaZadataka.add(new ZadatakPanel(z));
            }
            this.pnlZadaci.add(resenjaZadataka.get(trenutni));
            this.btnPrethodni.setEnabled(false);
            this.btnSledeci.setEnabled(true);
            this.bProverResenja.setEnabled(true);
   //     jPanel1.setViewportView(mainPanel);
            ActionListener actListner = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(timerDuration<=0){
                        JOptionPane.showMessageDialog(null, "Isteklo je vreme");
                        try {
                            krajTesta();
                        } catch (SQLException ex) {
                            Logger.getLogger(pnlTest.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        resenjaZadataka.forEach(er->{
                            System.out.println("D"+ er);
                        });
                        System.out.println();
                        timerDuration--;
                        timer.setText(sekundeUMinute(timerDuration));
                      //  timer.setText(String.valueOf(timerDuration));
                    }
                }
            };
            t=new Timer(1000,actListner);
            t.start();
        } catch (SQLException ex) {
            Logger.getLogger(pnlTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GreskaNemaDovoljnoPitanja g) {
                 JOptionPane.showMessageDialog(this, g.getMessage() + "Ovo sto sledi je bug, ne bi smeo da otvori sledeci prozor, resicu to, sad nemam vremena");
         
        }
    }//GEN-LAST:event_bNoviTestActionPerformed

    private void bProverResenjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProverResenjaActionPerformed
        int brojTacnihOdgovora = 0;
        
        // Prolazi kroz sve komponente u jPanel1, kad naidje na komponentu tipa ZadatakPanel koristi funkcije te komponente da proveri
        // da li je pritisnut neki radioButton i da li je dati odgovor tacan
        // Prikazuje gresku ako nije pritisnut nijedan radio button za neki zadatak
        // I na kraju ispisuje rezultat
        
        /**
         * 
         */
        for (Component c: resenjaZadataka)
            if (c instanceof ZadatakPanel)
            {
                if (!((ZadatakPanel) c).pritisnutJeNekiRadioButton()){
                    JOptionPane.showMessageDialog(this, "Niste dali odgovor na sve zadatke!");
                    return;
                }
                if (((ZadatakPanel) c).odgovorJeTacan())
                    brojTacnihOdgovora++;
            }
        try {
            krajTesta();
        } catch (SQLException ex) {
            Logger.getLogger(pnlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Broj bodova: " + brojTacnihOdgovora + "/" + BROJ_ZADATAKA);
    }//GEN-LAST:event_bProverResenjaActionPerformed

    private void btnSledeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSledeciActionPerformed
        this.pnlZadaci.removeAll();
        this.pnlZadaci.revalidate();
        this.pnlZadaci.setLayout(new GridLayout(1,0,1,0));  
           trenutni++;
        this.pnlZadaci.add(resenjaZadataka.get(trenutni));
        this.btnSledeci.setEnabled(trenutni!=BROJ_ZADATAKA-1);
        this.btnPrethodni.setEnabled(trenutni!=0);
        
    }//GEN-LAST:event_btnSledeciActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNoviTest;
    private javax.swing.JButton bProverResenja;
    private javax.swing.JButton btnPrethodni;
    private javax.swing.JButton btnSledeci;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlZadaci;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
}
