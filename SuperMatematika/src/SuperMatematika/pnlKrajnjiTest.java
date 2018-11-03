/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author 1
 */
public class pnlKrajnjiTest extends javax.swing.JPanel {
    
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    int razred;
    String username;
    JPanel mainPanel; //c
    private static int BROJ_ZADATAKA = 3;
    
    public pnlKrajnjiTest(Connection c,Statement s,ResultSet rs,int rz,String ss) {
        connection=c;
        statement=s;
        resultSet=rs;
        razred=rz;
        username=ss;
        initComponents();
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(5,0)); //c

        
        // Postavi novi test u pocetku
        jButton2.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JScrollPane();

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Novi test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Proveri resenja");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jPanel1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         mainChoiceView main;
        try{
            main=new mainChoiceView(connection,statement,resultSet,razred,username);
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

    // Novi test, nemam pojma kako se ovde menjanu nazivi textboxa, ipak sam ja noob za ovo
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainPanel.removeAll();
        mainPanel.revalidate();
        
        mainPanel.setLayout(new GridLayout(5,0));
        Test test = new Test(connection, statement, resultSet);
        List<Zadatak> zadaci = test.SastaviTest("skupovi", "peti", BROJ_ZADATAKA); 
        for (Zadatak z: zadaci)
            mainPanel.add(new ZadatakPanel(z));
        jPanel1.setViewportView(mainPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Proveri rezultate
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int brojTacnihOdgovora = 0;
        
        // Prolazi kroz sve komponente u jPanel1, kad naidje na komponentu tipa ZadatakPanel koristi funkcije te komponente da proveri
        // da li je pritisnut neki radioButton i da li je dati odgovor tacan
        // Prikazuje gresku ako nije pritisnut nijedan radio button za neki zadatak
        // I na kraju ispisuje rezultat
        for (Component c: mainPanel.getComponents())
            if (c instanceof ZadatakPanel)
            {
                if (!((ZadatakPanel) c).pritisnutJeNekiRadioButton()){
                    JOptionPane.showMessageDialog(this, "Niste dali odgovor na sve zadatke!");
                    return;
                }
                if (((ZadatakPanel) c).odgovorJeTacan())
                    brojTacnihOdgovora++;
            }
        
        JOptionPane.showMessageDialog(this, "Broj bodova: " + brojTacnihOdgovora + "/" + BROJ_ZADATAKA);
    }//GEN-LAST:event_jButton3ActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jPanel1;
    // End of variables declaration//GEN-END:variables
}
