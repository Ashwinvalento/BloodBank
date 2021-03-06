/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author DELL
 */
public class SellBloodForm extends javax.swing.JFrame {

    /**
     * Creates new form SellBloodFrom
     */
    public SellBloodForm() {
        initComponents();
        setLocation(200, 100);
        // spinnerQuantity.setm
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lHeading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bTransfer = new javax.swing.JButton();
        lQuantity = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        lBloodGroup = new javax.swing.JLabel();
        bDone = new javax.swing.JButton();
        comboBloodGroup = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood Management-Mediator");
        setAlwaysOnTop(true);
        setResizable(false);

        lHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lHeading.setText("Transfer Blood in Bulks");

        bTransfer.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bTransfer.setText("Transfer");
        bTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransferActionPerformed(evt);
            }
        });

        lQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lQuantity.setText("Quantity");

        spinnerQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        spinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        lBloodGroup.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lBloodGroup.setText("Blood Group");

        bDone.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bDone.setText("Done");
        bDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoneActionPerformed(evt);
            }
        });

        comboBloodGroup.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "AB+", "A-", "AB-", "O+", "O-", "B+", "B-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bDone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lBloodGroup)
                            .addComponent(lQuantity))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBloodGroup, 0, 89, Short.MAX_VALUE)
                            .addComponent(spinnerQuantity))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bDone, bTransfer});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQuantity)
                    .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lHeading)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoneActionPerformed
        this.dispose();
    }//GEN-LAST:event_bDoneActionPerformed

    private void bTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransferActionPerformed
        String bloodType = comboBloodGroup.getSelectedItem().toString();
        int count = Integer.parseInt(spinnerQuantity.getValue().toString());
        BusinessLogic.DonateBloodBL donate = new BusinessLogic.DonateBloodBL();
        donate.setBloodCount(count);
        donate.setBloodtype(bloodType);
        donate.transferBlood();
        comboBloodGroup.setSelectedIndex(comboBloodGroup.getSelectedIndex() + 1);
        spinnerQuantity.setValue(1);
    }//GEN-LAST:event_bTransferActionPerformed

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
            java.util.logging.Logger.getLogger(SellBloodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellBloodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellBloodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellBloodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SellBloodForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDone;
    private javax.swing.JButton bTransfer;
    private javax.swing.JComboBox comboBloodGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBloodGroup;
    private javax.swing.JLabel lHeading;
    private javax.swing.JLabel lQuantity;
    private javax.swing.JSpinner spinnerQuantity;
    // End of variables declaration//GEN-END:variables
}
