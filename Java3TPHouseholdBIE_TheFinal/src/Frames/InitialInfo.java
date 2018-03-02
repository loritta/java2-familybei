/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import HelperClasses.Database;
import HelperClasses.Transaction;
import HelperClasses.User;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author larisasabalin
 */
public class InitialInfo extends javax.swing.JDialog {

    Frames.Global gl = new Frames.Global();

    /**
     * Creates new form InitialInfo
     */
    public InitialInfo() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        tfInitialInfoIncome = new javax.swing.JTextField();
        tfInitialInfoExpenses = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        lbInitialInfoBudget = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        sldInitialInfoBudgetHome = new javax.swing.JSlider();
        lbInitialInfoBudgetHouse = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        sldInitialInfoBudgetFood = new javax.swing.JSlider();
        lbInitialInfoBudgetFood = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        sldInitialInfoBudgetChemicals = new javax.swing.JSlider();
        lbInitialInfoBudgetChemicals = new javax.swing.JLabel();
        sldInitialInfoBudgetCar = new javax.swing.JSlider();
        lbInitialInfoBudgetCar = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        sldInitialInfoBudgetOther = new javax.swing.JSlider();
        lbInitialInfoBudgetOther = new javax.swing.JLabel();
        InitialInfo_btnSave = new javax.swing.JButton();
        InitialInfo_btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entering initial financial information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 18))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel46.setText("Income for the last month:");

        jLabel47.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel47.setText("Expenses for the last month:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfInitialInfoIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfInitialInfoExpenses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tfInitialInfoIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInitialInfoExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Initial budgeting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 18))); // NOI18N

        jLabel56.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel56.setText("Total budget:");

        lbInitialInfoBudget.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        lbInitialInfoBudget.setText("...");

        jLabel63.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel63.setText("House(Rent/Morgage):");

        lbInitialInfoBudgetHouse.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lbInitialInfoBudgetHouse.setText("...");

        jLabel65.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel65.setText("Food:");

        lbInitialInfoBudgetFood.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lbInitialInfoBudgetFood.setText("...");

        jLabel67.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel67.setText("Household chemical and personal products:");

        lbInitialInfoBudgetChemicals.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lbInitialInfoBudgetChemicals.setText("...");

        lbInitialInfoBudgetCar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lbInitialInfoBudgetCar.setText("...");

        jLabel70.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel70.setText("Car:");

        jLabel71.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel71.setText("Other:");

        lbInitialInfoBudgetOther.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lbInitialInfoBudgetOther.setText("...");

        InitialInfo_btnSave.setText("Save");
        InitialInfo_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitialInfo_btnSaveActionPerformed(evt);
            }
        });

        InitialInfo_btnCancel.setText("Cancel");
        InitialInfo_btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitialInfo_btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(291, 291, 291)
                            .addComponent(jLabel56)
                            .addGap(92, 92, 92)
                            .addComponent(lbInitialInfoBudget))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(sldInitialInfoBudgetHome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbInitialInfoBudgetHouse))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(sldInitialInfoBudgetFood, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(lbInitialInfoBudgetFood))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(sldInitialInfoBudgetChemicals, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(lbInitialInfoBudgetChemicals))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(sldInitialInfoBudgetCar, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(lbInitialInfoBudgetCar))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(sldInitialInfoBudgetOther, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(lbInitialInfoBudgetOther))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InitialInfo_btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InitialInfo_btnSave)
                .addGap(31, 31, 31))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(lbInitialInfoBudget))
                .addGap(18, 18, 18)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldInitialInfoBudgetHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInitialInfoBudgetHouse))
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldInitialInfoBudgetFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInitialInfoBudgetFood))
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldInitialInfoBudgetChemicals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInitialInfoBudgetChemicals))
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldInitialInfoBudgetCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInitialInfoBudgetCar))
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldInitialInfoBudgetOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInitialInfoBudgetOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InitialInfo_btnSave)
                    .addComponent(InitialInfo_btnCancel))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel13, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InitialInfo_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitialInfo_btnSaveActionPerformed
        try {
            DecimalFormat formatter = new DecimalFormat("###.##");
            formatter.setParseBigDecimal(true);
            BigDecimal budget = (BigDecimal) formatter.parse(lbInitialInfoBudget.getText());
            BigDecimal expenses = (BigDecimal) formatter.parse(tfInitialInfoExpenses.getText());
            BigDecimal income = (BigDecimal) formatter.parse(tfInitialInfoIncome.getText());

            String categoryExpense = "GeneralExpenses";
            String categoryIncome = "Income";
            String categoryBudget = "GeneralBudget";

            Transaction tExpense = new Transaction(0, gl.currentUser.getId(), expenses, gl.db.nowSQL(), categoryExpense);
            tExpense.insert();
            Transaction tIncome = new Transaction(0, gl.currentUser.getId(), income, gl.db.nowSQL(), categoryIncome);
            tIncome.insert();
            //convert the constructor to reading the category type id
            //BudgetsMonthly bBudget =new BudgetsMonthly(0, user.getId(), categoryBudget, budget, nowSQL());
            //has to go to welcome page
            this.setVisible(false);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Re-enter the budgeted values" + ex.getMessage(),
                    "Decimal Format Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InitialInfo_btnSaveActionPerformed

    private void InitialInfo_btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitialInfo_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_InitialInfo_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(InitialInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitialInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitialInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitialInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //InitialInfo dialog = new InitialInfo(new javax.swing.JFrame(), true);
                InitialInfo dialog = new InitialInfo();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InitialInfo_btnCancel;
    private javax.swing.JButton InitialInfo_btnSave;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbInitialInfoBudget;
    private javax.swing.JLabel lbInitialInfoBudgetCar;
    private javax.swing.JLabel lbInitialInfoBudgetChemicals;
    private javax.swing.JLabel lbInitialInfoBudgetFood;
    private javax.swing.JLabel lbInitialInfoBudgetHouse;
    private javax.swing.JLabel lbInitialInfoBudgetOther;
    private javax.swing.JSlider sldInitialInfoBudgetCar;
    private javax.swing.JSlider sldInitialInfoBudgetChemicals;
    private javax.swing.JSlider sldInitialInfoBudgetFood;
    private javax.swing.JSlider sldInitialInfoBudgetHome;
    private javax.swing.JSlider sldInitialInfoBudgetOther;
    private javax.swing.JTextField tfInitialInfoExpenses;
    private javax.swing.JTextField tfInitialInfoIncome;
    // End of variables declaration//GEN-END:variables
}
