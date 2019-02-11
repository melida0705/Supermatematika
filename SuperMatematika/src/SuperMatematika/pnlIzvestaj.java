/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMatematika;

import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;

/**
 *
 * @author Melida
 */
public class pnlIzvestaj extends javax.swing.JPanel {

    /**
     * Creates new form pnlIzvestaj
     */
    ArrayList<RezultatiTesta> rt;
    Profesor trenutniKorisnik;
    
    ArrayList<Predmet> listaPredmeta;
    ArrayList<JRadioButton> RBlistaRazreda=new ArrayList();
    ArrayList<JRadioButton> RBListaOdeljenja=new ArrayList();
    ArrayList<JRadioButton> RBlistaPredmeta=new ArrayList();
    ArrayList<JRadioButton> RBlistaBrojTestova=new ArrayList();
    
    public pnlIzvestaj(Profesor tk) throws SQLException {
        trenutniKorisnik=tk;
         listaPredmeta=DBController.require().getProfPredmeti(trenutniKorisnik);
        rt=DBController.require().getRezultati(trenutniKorisnik);
        initComponents();
         RBlistaRazreda.add(this.jRadioButton1);
        RBlistaRazreda.add(this.jRadioButton3);
        RBlistaRazreda.add(this.jRadioButton2);
        RBlistaRazreda.add(this.jRadioButton4);
        
        RBListaOdeljenja.add(this.jRadioButton5);
        RBListaOdeljenja.add(this.jRadioButton7);
        RBListaOdeljenja.add(this.jRadioButton6);
        RBListaOdeljenja.add(this.jRadioButton8);
        RBListaOdeljenja.add(this.svaOdeljenja);
        RBlistaBrojTestova.add(this.jRadioButton9);
        RBlistaBrojTestova.add(this.jRadioButton10);
        RBlistaBrojTestova.add(this.jRadioButton11);
        RBlistaBrojTestova.add(this.jRadioButton12);
        RBlistaBrojTestova.add(this.sviTestovi);
        listaPredmeta.forEach(e->{
            RBlistaPredmeta.add(new JRadioButton(e.getNazivPredmeta()));
        });
        this.pnlPredmeti.removeAll();
        this.pnlPredmeti.revalidate();
        this.pnlPredmeti.setLayout(new FlowLayout());
        RBlistaPredmeta.forEach(e->{
            System.out.println(e.getText());
            this.btnPredmetiGroup.add(e);
           
            this.pnlPredmeti.add(e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnPredmetiGroup = new javax.swing.ButtonGroup();
        btnOdeljenjeGroup = new javax.swing.ButtonGroup();
        btnBrojTestaGroup = new javax.swing.ButtonGroup();
        pnlLeft = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlRazred = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        pnlRZ = new javax.swing.JPanel();
        lblRazred = new javax.swing.JLabel();
        pnlPR = new javax.swing.JPanel();
        lblPredmet = new javax.swing.JLabel();
        pnlPredmeti = new javax.swing.JPanel();
        pnlOD = new javax.swing.JPanel();
        lblOdeljenje = new javax.swing.JLabel();
        pnlOdeljenje = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        svaOdeljenja = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        sviTestovi = new javax.swing.JRadioButton();
        btnPR2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pnlRazred.setBackground(new java.awt.Color(255, 255, 255));
        pnlRazred.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("5");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("6");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("7");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("8");

        javax.swing.GroupLayout pnlRazredLayout = new javax.swing.GroupLayout(pnlRazred);
        pnlRazred.setLayout(pnlRazredLayout);
        pnlRazredLayout.setHorizontalGroup(
            pnlRazredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRazredLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlRazredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRazredLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButton3))
                    .addGroup(pnlRazredLayout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRazredLayout.setVerticalGroup(
            pnlRazredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRazredLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlRazredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addGap(27, 27, 27)
                .addGroup(pnlRazredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRZ.setBackground(new java.awt.Color(0, 161, 241));
        pnlRZ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRazred.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRazred.setForeground(new java.awt.Color(255, 255, 255));
        lblRazred.setText("RAZRED");
        pnlRZ.add(lblRazred, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 20));

        pnlPR.setBackground(new java.awt.Color(246, 83, 20));

        lblPredmet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPredmet.setForeground(new java.awt.Color(255, 255, 255));
        lblPredmet.setText("PREDMET");

        javax.swing.GroupLayout pnlPRLayout = new javax.swing.GroupLayout(pnlPR);
        pnlPR.setLayout(pnlPRLayout);
        pnlPRLayout.setHorizontalGroup(
            pnlPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPRLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(lblPredmet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPRLayout.setVerticalGroup(
            pnlPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPRLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblPredmet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPredmeti.setBackground(new java.awt.Color(255, 255, 255));
        pnlPredmeti.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlPredmeti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOD.setBackground(new java.awt.Color(255, 187, 0));
        pnlOD.setPreferredSize(new java.awt.Dimension(220, 40));
        pnlOD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOdeljenje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOdeljenje.setForeground(new java.awt.Color(255, 255, 255));
        lblOdeljenje.setText("ODELJENJE");
        pnlOD.add(lblOdeljenje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 20));

        pnlOdeljenje.setBackground(new java.awt.Color(255, 255, 255));
        pnlOdeljenje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlOdeljenje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        btnOdeljenjeGroup.add(jRadioButton5);
        jRadioButton5.setText("1");
        pnlOdeljenje.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        btnOdeljenjeGroup.add(jRadioButton7);
        jRadioButton7.setText("2");
        pnlOdeljenje.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        btnOdeljenjeGroup.add(jRadioButton8);
        jRadioButton8.setText("3");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        pnlOdeljenje.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        btnOdeljenjeGroup.add(jRadioButton6);
        jRadioButton6.setText("4");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        pnlOdeljenje.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        svaOdeljenja.setBackground(new java.awt.Color(255, 255, 255));
        btnOdeljenjeGroup.add(svaOdeljenja);
        svaOdeljenja.setText("all");
        pnlOdeljenje.add(svaOdeljenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        btnBrojTestaGroup.add(jRadioButton9);
        jRadioButton9.setText("1");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        btnBrojTestaGroup.add(jRadioButton10);
        jRadioButton10.setText("2");

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        btnBrojTestaGroup.add(jRadioButton11);
        jRadioButton11.setText("4");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        btnBrojTestaGroup.add(jRadioButton12);
        jRadioButton12.setText("3");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        sviTestovi.setBackground(new java.awt.Color(255, 255, 255));
        sviTestovi.setText("all");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(sviTestovi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jRadioButton9)
                            .addGap(59, 59, 59)
                            .addComponent(jRadioButton10))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jRadioButton12)
                            .addGap(59, 59, 59)
                            .addComponent(jRadioButton11)))
                    .addGap(0, 33, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sviTestovi)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 22, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton9)
                        .addComponent(jRadioButton10))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton12)
                        .addComponent(jRadioButton11))
                    .addGap(0, 23, Short.MAX_VALUE)))
        );

        btnPR2.setBackground(new java.awt.Color(124, 187, 0));
        btnPR2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPR2.setForeground(new java.awt.Color(255, 255, 255));
        btnPR2.setText("PRIKAZI");
        btnPR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPR2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(124, 187, 0));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("BROJ TESTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlPR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlPredmeti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pnlOD, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlOdeljenje, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRZ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRazred, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPredmeti, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRazred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOdeljenje, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnPR2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPR2ActionPerformed
        TestWrapper newTest=new TestWrapper();

        newTest.setNastavnik(this.trenutniKorisnik.getUsername());
        for(int i=0;i<4;i++){
            if(this.RBlistaRazreda.get(i).isSelected()){
                newTest.setRazred(i+5);
                break;
            }
        }
        System.out.println("PRE"+newTest.getRazred());
        for(int i=0;i<this.listaPredmeta.size();i++){
            if(this.RBlistaPredmeta.get(i).isSelected()){
                try {
                    newTest.setId_predmeta(DBController.require().getIdPredmeta(this.RBlistaPredmeta.get(i).getText(),newTest.getRazred()));
                } catch (SQLException ex) {
                    Logger.getLogger(pnlSastaviTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        for(int i=0;i<5;i++){
            if(this.RBListaOdeljenja.get(i).isSelected()){
                if(RBListaOdeljenja.get(i).getText().equals("all"))
                newTest.setOdeljenje(5);
                else
                newTest.setOdeljenje(Integer.parseInt(RBListaOdeljenja.get(i).getText()));
                break;
            }
        }

        for(int i=0;i<5;i++){
            if(this.RBlistaBrojTestova.get(i).isSelected()){
                if(RBlistaBrojTestova.get(i).getText().equals("all"))
                newTest.setRedni_broj_testa(5);
                else
                newTest.setRedni_broj_testa(Integer.parseInt(RBlistaBrojTestova.get(i).getText()));
                break;
            }
        }
        try{
            try {
                frmRezultatiPredmeta f=new frmRezultatiPredmeta(trenutniKorisnik,newTest);
                f.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(pnlRezultatiTesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(Exception e){
            System.out.println(newTest.getRazred());
            System.out.println(e);
        }

    }//GEN-LAST:event_btnPR2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnBrojTestaGroup;
    private javax.swing.ButtonGroup btnOdeljenjeGroup;
    private javax.swing.JButton btnPR2;
    private javax.swing.ButtonGroup btnPredmetiGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lblOdeljenje;
    private javax.swing.JLabel lblPredmet;
    private javax.swing.JLabel lblRazred;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlOD;
    private javax.swing.JPanel pnlOdeljenje;
    private javax.swing.JPanel pnlPR;
    private javax.swing.JPanel pnlPredmeti;
    private javax.swing.JPanel pnlRZ;
    private javax.swing.JPanel pnlRazred;
    private javax.swing.JRadioButton svaOdeljenja;
    private javax.swing.JRadioButton sviTestovi;
    // End of variables declaration//GEN-END:variables
}
