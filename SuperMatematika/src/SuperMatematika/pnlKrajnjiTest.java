/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author 1
 */
public class pnlKrajnjiTest extends javax.swing.JPanel {
    
    Student trenutniKorisnik;
    private static int BROJ_ZADATAKA = 3;
    private int trenutni=0;
    List<Zadatak> zadaci; 
    Timer t;
    private int timerDuration=3600;
    ArrayList<ZadatakPanel> resenjaZadataka=new ArrayList();    
    public pnlKrajnjiTest(Student tr) {
        trenutniKorisnik=tr;
        initComponents();

        
        // Postavi novi test u pocetku
        bNoviTest.doClick();
    }
    
    private void krajTesta() throws SQLException{
        this.btnPrethodni.setEnabled(false);
        this.btnSledeci.setEnabled(false);
        this.bProverResenja.setEnabled(false);
        DBController.require().submitTest(resenjaZadataka,trenutniKorisnik);
        t.stop();
    }
    private String sekundeUMinute(int seconds){
        int s=seconds%60;
        int m=seconds/60;
        String str=m+":"+s;
        
        return str;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlZadaci = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        timer = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPrethodni = new javax.swing.JButton();
        bProverResenja = new javax.swing.JButton();
        btnSledeci = new javax.swing.JButton();
        bNoviTest = new javax.swing.JButton();

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnlZadaci.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlZadaciLayout = new javax.swing.GroupLayout(pnlZadaci);
        pnlZadaci.setLayout(pnlZadaciLayout);
        pnlZadaciLayout.setHorizontalGroup(
            pnlZadaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlZadaciLayout.setVerticalGroup(
            pnlZadaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timer.setBackground(new java.awt.Color(153, 255, 153));
        timer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timer.setForeground(new java.awt.Color(51, 51, 51));
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        btnPrethodni.setText("prethodni");
        btnPrethodni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrethodniActionPerformed(evt);
            }
        });

        bProverResenja.setBackground(new java.awt.Color(153, 255, 51));
        bProverResenja.setText("PREDAJ TEST");
        bProverResenja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProverResenjaActionPerformed(evt);
            }
        });

        btnSledeci.setText("sledeci");
        btnSledeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSledeciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnPrethodni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSledeci, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bProverResenja, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnPrethodni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSledeci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bProverResenja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bNoviTest.setText("Novi test");
        bNoviTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoviTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bNoviTest, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlZadaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bNoviTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pnlZadaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainChoiceView main;
        try{
            main=new mainChoiceView(trenutniKorisnik);
            this.removeAll();
            this.revalidate();
            this.setLayout(new BorderLayout());
            this.add(main);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPrethodniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrethodniActionPerformed
        this.pnlZadaci.removeAll();
        this.pnlZadaci.revalidate();
        
        pnlZadaci.setLayout(new GridLayout(1,0));
           // for (Zadatak z: zadaci)
        trenutni--;
                
        pnlZadaci.add(resenjaZadataka.get(trenutni));
       //     jPanel1.setViewportView(mainPanel);
       
        this.btnSledeci.setEnabled(trenutni != BROJ_ZADATAKA-1);
        this.btnPrethodni.setEnabled(trenutni != 0);      
    }//GEN-LAST:event_btnPrethodniActionPerformed

    private void bNoviTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoviTestActionPerformed
      this.pnlZadaci.removeAll();
        pnlZadaci.revalidate();
        
        pnlZadaci.setLayout(new GridLayout(1,0));
        try {
            
            try{
                this.t.stop();
            }catch(Exception e){}
            timerDuration=3600;
            trenutni=0;
            zadaci = DBController.require().SastaviTest("skupovi", BROJ_ZADATAKA);
            resenjaZadataka.clear();
            for (Zadatak z: zadaci){
                resenjaZadataka.add(new ZadatakPanel(z));
            }
            pnlZadaci.add(resenjaZadataka.get(trenutni));
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
                            Logger.getLogger(pnlKrajnjiTest.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        timerDuration--;
                        timer.setText(sekundeUMinute(timerDuration));
                      //  timer.setText(String.valueOf(timerDuration));
                    }
                }
            };
            t=new Timer(1000,actListner);
            t.start();
        } catch (SQLException ex) {
            Logger.getLogger(pnlKrajnjiTest.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(pnlKrajnjiTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Broj bodova: " + brojTacnihOdgovora + "/" + BROJ_ZADATAKA);
    }//GEN-LAST:event_bProverResenjaActionPerformed

    private void btnSledeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSledeciActionPerformed
this.pnlZadaci.removeAll();
        pnlZadaci.revalidate();
        
        pnlZadaci.setLayout(new GridLayout(1,0));
           // for (Zadatak z: zadaci)
                trenutni++;
                
                pnlZadaci.add(resenjaZadataka.get(trenutni));
       //     jPanel1.setViewportView(mainPanel);
        this.btnSledeci.setEnabled(trenutni != BROJ_ZADATAKA-1);
        this.btnPrethodni.setEnabled(trenutni != 0);     
    }//GEN-LAST:event_btnSledeciActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNoviTest;
    private javax.swing.JButton bProverResenja;
    private javax.swing.JButton btnPrethodni;
    private javax.swing.JButton btnSledeci;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlZadaci;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
}
