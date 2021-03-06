/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Toolkit;

/**
 *
 * @author DELL
 */
public class FirstPageForm extends javax.swing.JFrame {

    /**
     * Creates new form FirstPageForm
     */
    public FirstPageForm() {
        initComponents();
        initiateComponents();
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
        RegisterDonor = new javax.swing.JLabel();
        bLoginHere = new javax.swing.JButton();
        lQuoteFirstline = new javax.swing.JLabel();
        lMisconception = new javax.swing.JLabel();
        lTips = new javax.swing.JLabel();
        lTagline = new javax.swing.JLabel();
        bBloodInfo = new javax.swing.JButton();
        lQuoteThirdLine = new javax.swing.JLabel();
        lQuoteSecondline = new javax.swing.JLabel();
        lBloodBankName = new javax.swing.JLabel();
        bHospitalOrder = new javax.swing.JButton();
        lAboutUs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank Management System");
        setResizable(false);

        RegisterDonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blood_bank.gif"))); // NOI18N
        RegisterDonor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterDonorMouseClicked(evt);
            }
        });

        bLoginHere.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        bLoginHere.setText("Login here ");
        bLoginHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bLoginHere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginHereActionPerformed(evt);
            }
        });

        lQuoteFirstline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lQuoteFirstline.setForeground(java.awt.Color.red);
        lQuoteFirstline.setText("\"Saving the world isn't Easy");

        lMisconception.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        lMisconception.setForeground(java.awt.Color.blue);
        lMisconception.setText("Misconception about Donating Blood");
        lMisconception.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lMisconception.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMisconceptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lMisconceptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lMisconceptionMouseExited(evt);
            }
        });

        lTips.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        lTips.setForeground(java.awt.Color.blue);
        lTips.setText("Tips on Blood Donating");
        lTips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lTips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lTipsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTipsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTipsMouseExited(evt);
            }
        });

        lTagline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lTagline.setForeground(new java.awt.Color(17, 124, 17));
        lTagline.setText("We are Always Ready for donating blood...");

        bBloodInfo.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        bBloodInfo.setText("Find Donors");
        bBloodInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBloodInfoActionPerformed(evt);
            }
        });

        lQuoteThirdLine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lQuoteThirdLine.setForeground(java.awt.Color.red);
        lQuoteThirdLine.setText("Donating 1 Pint of blood can save upto 3 lives.\"");

        lQuoteSecondline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lQuoteSecondline.setForeground(java.awt.Color.red);
        lQuoteSecondline.setText("Saving a Life is.");

        lBloodBankName.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lBloodBankName.setForeground(java.awt.Color.red);
        lBloodBankName.setText("Indian Blood Bank");

        bHospitalOrder.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        bHospitalOrder.setText("Hospital Order");
        bHospitalOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHospitalOrderActionPerformed(evt);
            }
        });

        lAboutUs.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        lAboutUs.setForeground(java.awt.Color.blue);
        lAboutUs.setText("About Us");
        lAboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lAboutUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lAboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lAboutUsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lTagline))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lBloodBankName)
                            .addComponent(lAboutUs)
                            .addComponent(lQuoteFirstline)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RegisterDonor)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBloodInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bLoginHere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bHospitalOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lQuoteSecondline)
                            .addComponent(lQuoteThirdLine)
                            .addComponent(lTips)
                            .addComponent(lMisconception))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBloodBankName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTagline)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(RegisterDonor)
                        .addGap(18, 18, 18)
                        .addComponent(lQuoteFirstline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lQuoteSecondline))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bLoginHere, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBloodInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bHospitalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lQuoteThirdLine)
                .addGap(25, 25, 25)
                .addComponent(lTips)
                .addGap(18, 18, 18)
                .addComponent(lMisconception)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lAboutUs)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bBloodInfo, bLoginHere});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lTipsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTipsMouseEntered
        lTips.setForeground(java.awt.Color.green);
    }//GEN-LAST:event_lTipsMouseEntered

    private void lTipsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTipsMouseExited
        lTips.setForeground(java.awt.Color.blue);
    }//GEN-LAST:event_lTipsMouseExited

    private void lMisconceptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMisconceptionMouseEntered
        lMisconception.setForeground(java.awt.Color.green);
    }//GEN-LAST:event_lMisconceptionMouseEntered

    private void lMisconceptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMisconceptionMouseExited
        lMisconception.setForeground(java.awt.Color.blue);
    }//GEN-LAST:event_lMisconceptionMouseExited

    private void RegisterDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterDonorMouseClicked
        Loginform login = new Loginform();
        login.setVisible(true);
        DonorRegistrationForm createnew = new DonorRegistrationForm();
        createnew.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterDonorMouseClicked

    private void bLoginHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginHereActionPerformed
        Loginform login = new Loginform();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bLoginHereActionPerformed

    private void lTipsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTipsMouseClicked
        DisplayTipsForm dispTips = new DisplayTipsForm();
        dispTips.setVisible(true);
    }//GEN-LAST:event_lTipsMouseClicked

    private void lMisconceptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMisconceptionMouseClicked
        DisplayMisconceptionForm misconcept = new DisplayMisconceptionForm();
        misconcept.setVisible(true);
    }//GEN-LAST:event_lMisconceptionMouseClicked

    private void bHospitalOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHospitalOrderActionPerformed
        HospitalOrderForm order = new HospitalOrderForm();
        order.setVisible(true);
    }//GEN-LAST:event_bHospitalOrderActionPerformed

    private void bBloodInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBloodInfoActionPerformed
        FindDonorForm find = new FindDonorForm();
        find.setVisible(true);
    }//GEN-LAST:event_bBloodInfoActionPerformed

    private void lAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAboutUsMouseClicked
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_lAboutUsMouseClicked

    private void lAboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAboutUsMouseEntered
        lAboutUs.setForeground(java.awt.Color.green);
    }//GEN-LAST:event_lAboutUsMouseEntered

    private void lAboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAboutUsMouseExited
        lAboutUs.setForeground(java.awt.Color.blue);
    }//GEN-LAST:event_lAboutUsMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FirstPageForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterDonor;
    private javax.swing.JButton bBloodInfo;
    private javax.swing.JButton bHospitalOrder;
    private javax.swing.JButton bLoginHere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAboutUs;
    private javax.swing.JLabel lBloodBankName;
    private javax.swing.JLabel lMisconception;
    private javax.swing.JLabel lQuoteFirstline;
    private javax.swing.JLabel lQuoteSecondline;
    private javax.swing.JLabel lQuoteThirdLine;
    private javax.swing.JLabel lTagline;
    private javax.swing.JLabel lTips;
    // End of variables declaration//GEN-END:variables

    private void initiateComponents() {
        //textAreaQuotes.setText("Saving the world isn't Easy \nSaving a Life IS. \nDonating 1 Pint of blood can save upto 3 lives.");
        setLocation(200, 100);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../resources/icon.png")));
    }
}
