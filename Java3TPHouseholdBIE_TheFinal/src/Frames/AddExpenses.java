/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author larisasabalin
 */
public class AddExpenses extends javax.swing.JDialog {
Frames.Global gl=new Frames.Global();
    /**
     * Creates new form AddExpenses
     */
    public AddExpenses(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        frmExpences_tfAmount = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        frmExpences_cmbType = new javax.swing.JComboBox<>();
        frmExpences_btnSave = new javax.swing.JButton();
        frmExpences_lblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        frmExpences_mnuOperations = new javax.swing.JMenu();
        frmExpences_miAddIncome = new javax.swing.JMenuItem();
        frmExpences_miAddExpenses = new javax.swing.JMenuItem();
        frmExpences_miGoToReports = new javax.swing.JMenuItem();
        frmExpences_miSeeBudgets = new javax.swing.JMenuItem();
        frmExpences_miSeeExpenses = new javax.swing.JMenuItem();
        frmExpences_miSeeIncome = new javax.swing.JMenuItem();
        frmExpences_mnuExport = new javax.swing.JMenu();
        frmExpences_miCSV = new javax.swing.JMenuItem();
        frmExpences_miPDF = new javax.swing.JMenuItem();
        frmExpences_mnuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registering Expenses:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 1, 12))); // NOI18N

        jLabel23.setFont(new java.awt.Font("American Typewriter", 1, 12)); // NOI18N
        jLabel23.setText("Name");

        jLabel24.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        jLabel24.setText("...");

        jLabel25.setFont(new java.awt.Font("American Typewriter", 1, 12)); // NOI18N
        jLabel25.setText("Amount");

        frmExpences_tfAmount.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        frmExpences_tfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_tfAmountActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("American Typewriter", 1, 12)); // NOI18N
        jLabel26.setText("On what?");

        frmExpences_cmbType.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        frmExpences_cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        frmExpences_btnSave.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        frmExpences_btnSave.setText("Save");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(frmExpences_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(frmExpences_tfAmount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(frmExpences_cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(frmExpences_tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(frmExpences_cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(frmExpences_btnSave)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        frmExpences_lblStatus.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        frmExpences_lblStatus.setText("Status");
        getContentPane().add(frmExpences_lblStatus, java.awt.BorderLayout.PAGE_END);

        frmExpences_mnuOperations.setText("Operations");
        frmExpences_mnuOperations.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N

        frmExpences_miAddIncome.setText("Add Income");
        frmExpences_miAddIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miAddIncomeActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miAddIncome);

        frmExpences_miAddExpenses.setText("Add Expenses");
        frmExpences_miAddExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miAddExpensesActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miAddExpenses);

        frmExpences_miGoToReports.setText("Go To Reports");
        frmExpences_miGoToReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miGoToReportsActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miGoToReports);

        frmExpences_miSeeBudgets.setText("See Budget");
        frmExpences_miSeeBudgets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miSeeBudgetsActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miSeeBudgets);

        frmExpences_miSeeExpenses.setText("See Expenses");
        frmExpences_miSeeExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miSeeExpensesActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miSeeExpenses);

        frmExpences_miSeeIncome.setText("See Income");
        frmExpences_miSeeIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miSeeIncomeActionPerformed(evt);
            }
        });
        frmExpences_mnuOperations.add(frmExpences_miSeeIncome);

        jMenuBar1.add(frmExpences_mnuOperations);

        frmExpences_mnuExport.setText("Export");
        frmExpences_mnuExport.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N

        frmExpences_miCSV.setText("to CSV");
        frmExpences_miCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miCSVActionPerformed(evt);
            }
        });
        frmExpences_mnuExport.add(frmExpences_miCSV);

        frmExpences_miPDF.setText("to PDF");
        frmExpences_miPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmExpences_miPDFActionPerformed(evt);
            }
        });
        frmExpences_mnuExport.add(frmExpences_miPDF);

        jMenuBar1.add(frmExpences_mnuExport);

        frmExpences_mnuExit.setText("Exit");
        frmExpences_mnuExit.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jMenuBar1.add(frmExpences_mnuExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmExpences_tfAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_tfAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmExpences_tfAmountActionPerformed

    private void frmExpences_miSeeBudgetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miSeeBudgetsActionPerformed
        //set the combo box in Details to Budgets
        Details details =new Details(null, true);
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmExpences_miSeeBudgetsActionPerformed

    private void frmExpences_miAddIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miAddIncomeActionPerformed
         AddIncome income=new AddIncome(null, true);
        income.pack();
        income.setVisible(true);

    }//GEN-LAST:event_frmExpences_miAddIncomeActionPerformed

    private void frmExpences_miAddExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miAddExpensesActionPerformed
     AddExpenses expense = new AddExpenses(null, true);
        expense.pack();
        expense.setVisible(true);
    }//GEN-LAST:event_frmExpences_miAddExpensesActionPerformed

    private void frmExpences_miGoToReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miGoToReportsActionPerformed
        GoToReports reports = new GoToReports(null, true);
        reports.pack();
        reports.setVisible(true);
    }//GEN-LAST:event_frmExpences_miGoToReportsActionPerformed

    private void frmExpences_miSeeExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miSeeExpensesActionPerformed
       //set the combo box in Details to Expenses
 Details details =new Details(null, true);
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmExpences_miSeeExpensesActionPerformed

    private void frmExpences_miSeeIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miSeeIncomeActionPerformed
    //set the combo box in Details to Income
Details details =new Details(null, true);
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmExpences_miSeeIncomeActionPerformed

    private void frmExpences_miCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miCSVActionPerformed
        //We should make this as a function this is repeating for each frame
       
        //.seeFileChooser();
    }//GEN-LAST:event_frmExpences_miCSVActionPerformed

    private void frmExpences_miPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmExpences_miPDFActionPerformed
         //gl.currentSession.seeFileChooser();
    }//GEN-LAST:event_frmExpences_miPDFActionPerformed

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
            java.util.logging.Logger.getLogger(AddExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddExpenses dialog = new AddExpenses(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton frmExpences_btnSave;
    private javax.swing.JComboBox<String> frmExpences_cmbType;
    private javax.swing.JLabel frmExpences_lblStatus;
    private javax.swing.JMenuItem frmExpences_miAddExpenses;
    private javax.swing.JMenuItem frmExpences_miAddIncome;
    private javax.swing.JMenuItem frmExpences_miCSV;
    private javax.swing.JMenuItem frmExpences_miGoToReports;
    private javax.swing.JMenuItem frmExpences_miPDF;
    private javax.swing.JMenuItem frmExpences_miSeeBudgets;
    private javax.swing.JMenuItem frmExpences_miSeeExpenses;
    private javax.swing.JMenuItem frmExpences_miSeeIncome;
    private javax.swing.JMenu frmExpences_mnuExit;
    private javax.swing.JMenu frmExpences_mnuExport;
    private javax.swing.JMenu frmExpences_mnuOperations;
    private javax.swing.JTextField frmExpences_tfAmount;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
