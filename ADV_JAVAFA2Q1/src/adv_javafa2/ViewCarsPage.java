/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adv_javafa2;

import javax.swing.ImageIcon;

/**
 *
 * @author curtc
 */
public class ViewCarsPage extends javax.swing.JFrame {

    /**
     * Creates new form ViewCarsPage
     */
    public ViewCarsPage() {
        initComponents();
    }
    
    public void loadImage(String imgPath){
        ImageIcon picture = new ImageIcon(imgPath);
        imgLbl.setIcon(picture);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        carCmb = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totCostLbl = new javax.swing.JLabel();
        installLbl = new javax.swing.JLabel();
        selPriceLbl = new javax.swing.JLabel();
        intRateLbl = new javax.swing.JLabel();
        depoLbl = new javax.swing.JLabel();
        balloonLbl = new javax.swing.JLabel();
        installmentsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Please choose your prefered car");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        imgLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(imgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 300, 255));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 366, 150, 50));

        carCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TSI", "Comfortline", "TCross", "TRoc" }));
        carCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carCmbActionPerformed(evt);
            }
        });
        getContentPane().add(carCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 125, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Installment");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Selling Price");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Interest Rate");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Deposit");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Balloon Payment");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Installments");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Total Cost of Credit");

        totCostLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        installLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        selPriceLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        intRateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        depoLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        balloonLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        installmentsLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(installmentsLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(balloonLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depoLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intRateLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selPriceLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(installLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(75, 75, 75)
                        .addComponent(totCostLbl))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(installLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selPriceLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(intRateLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(depoLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(balloonLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(installmentsLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totCostLbl)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 80, 310, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void carCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carCmbActionPerformed
        if(carCmb.getSelectedIndex() == 0){
            loadImage("D:\\Users\\curtc\\NetBeansProjects\\ADV_JAVAFA2Q1\\src\\Images\\poloTsi.png");
            
            installLbl.setText("R 3 404");
            selPriceLbl.setText("R 224 300");
            intRateLbl.setText("7.59%");
            depoLbl.setText("0%");
            balloonLbl.setText("R 118 879");
            installmentsLbl.setText("48");
            totCostLbl.setText("R 282 249");           
        }
        else if(carCmb.getSelectedIndex() == 1){
            loadImage("D:\\Users\\curtc\\NetBeansProjects\\ADV_JAVAFA2Q1\\src\\Images\\comfortline.png");
            
            installLbl.setText("R 3 116");
            selPriceLbl.setText("R 237 400");
            intRateLbl.setText("5.5%");
            depoLbl.setText("0%");
            balloonLbl.setText("R 94 960");
            installmentsLbl.setText("72");
            totCostLbl.setText("R 300 276");
        }
        else if(carCmb.getSelectedIndex() == 2){
            loadImage("D:\\Users\\curtc\\NetBeansProjects\\ADV_JAVAFA2Q1\\src\\Images\\tcross.png");
            
            installLbl.setText("R 4 450");
            selPriceLbl.setText("R 352 300");
            intRateLbl.setText("5.59%");
            depoLbl.setText("10%");
            balloonLbl.setText("R 183 196");
            installmentsLbl.setText("48");
            totCostLbl.setText("R 393 796");
        }
        else if(carCmb.getSelectedIndex() == 3){
            loadImage("D:\\Users\\curtc\\NetBeansProjects\\ADV_JAVAFA2Q1\\src\\Images\\troc.png");
            
            installLbl.setText("R 5 950");
            selPriceLbl.setText("R 494 300");
            intRateLbl.setText("7.59%");
            depoLbl.setText("10.49%");
            balloonLbl.setText("R 271 865");
            installmentsLbl.setText("48");
            totCostLbl.setText("R 557 465");
        }
    }//GEN-LAST:event_carCmbActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ViewCarsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCarsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCarsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCarsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCarsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel balloonLbl;
    private javax.swing.JComboBox<String> carCmb;
    private javax.swing.JLabel depoLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel installLbl;
    private javax.swing.JLabel installmentsLbl;
    private javax.swing.JLabel intRateLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selPriceLbl;
    private javax.swing.JLabel totCostLbl;
    // End of variables declaration//GEN-END:variables
}
