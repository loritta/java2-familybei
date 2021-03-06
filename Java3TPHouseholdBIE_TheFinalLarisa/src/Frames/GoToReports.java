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
public class GoToReports extends javax.swing.JDialog {

    private static Frames.Global gl;
    private static Welcome welcome;

    /**
     * Creates new form GoToReports
     */
    public GoToReports(java.awt.Frame parent, boolean modal, Global gl, Welcome welcome) {
        super(parent, modal);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.welcome = welcome;
        this.gl = gl;
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        dlgReport_lblExp = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dlgReport_lblIncome = new javax.swing.JLabel();
        dlgReport_lblBudExp = new javax.swing.JLabel();
        dlgReport_btnBdgExp = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        dlgReport_btnExp = new javax.swing.JButton();
        dlgReport_btnIncome = new javax.swing.JButton();
        dlgReport_cmbIncome = new javax.swing.JComboBox<>();
        dlgReport_cmbExpenses = new javax.swing.JComboBox<>();
        dlgReport_cmbBdgExp = new javax.swing.JComboBox<>();
        dlgReport_cmbBudget = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        dlgReport_btnBdg = new javax.swing.JButton();
        dlgReport_lblBudget = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        frmGoToReports_mnuOperations2 = new javax.swing.JMenu();
        frmGoToReports_miAddIncome2 = new javax.swing.JMenuItem();
        frmGoToReports_miAddExpenses2 = new javax.swing.JMenuItem();
        frmGoToReports_miGoToReports2 = new javax.swing.JMenuItem();
        frmGoToReports_miSeeBudgets2 = new javax.swing.JMenuItem();
        frmGoToReports_miSeeExpenses2 = new javax.swing.JMenuItem();
        frmGoToReports_miSeeIncome2 = new javax.swing.JMenuItem();
        frmGoToReports_mnuExport2 = new javax.swing.JMenu();
        miCSV2 = new javax.swing.JMenuItem();
        miPDF2 = new javax.swing.JMenuItem();
        frmGoToReports_mnuExit2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 12))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel14.setText("Total Household Expenses for the");

        dlgReport_lblExp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_lblExp.setText("...");

        jLabel16.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel16.setText("Total Household Income for the");

        dlgReport_lblIncome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_lblIncome.setText("...");

        dlgReport_lblBudExp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_lblBudExp.setText("...");

        dlgReport_btnBdgExp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_btnBdgExp.setText("Details");

        jLabel19.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel19.setText("Budget vs Expenses per Household for the");

        dlgReport_btnExp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_btnExp.setText("Details");
        dlgReport_btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgReport_btnExpActionPerformed(evt);
            }
        });

        dlgReport_btnIncome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_btnIncome.setText("Details");
        dlgReport_btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgReport_btnIncomeActionPerformed(evt);
            }
        });

        dlgReport_cmbIncome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_cmbIncome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));
        dlgReport_cmbIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgReport_cmbIncomeActionPerformed(evt);
            }
        });

        dlgReport_cmbExpenses.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_cmbExpenses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        dlgReport_cmbBdgExp.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_cmbBdgExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        dlgReport_cmbBudget.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_cmbBudget.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        jLabel20.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel20.setText("Budgets");

        dlgReport_btnBdg.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_btnBdg.setText("Details");
        dlgReport_btnBdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgReport_btnBdgActionPerformed(evt);
            }
        });

        dlgReport_lblBudget.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        dlgReport_lblBudget.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dlgReport_btnBdgExp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dlgReport_btnExp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dlgReport_lblExp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dlgReport_cmbBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dlgReport_cmbExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(dlgReport_btnIncome))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(dlgReport_cmbIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dlgReport_lblIncome))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(dlgReport_cmbBdgExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dlgReport_lblBudExp))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dlgReport_lblBudget))
                    .addComponent(dlgReport_btnBdg)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dlgReport_lblExp)
                    .addComponent(dlgReport_cmbExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dlgReport_btnExp)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dlgReport_cmbIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgReport_lblIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dlgReport_btnIncome)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dlgReport_cmbBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgReport_lblBudget))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgReport_btnBdg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(dlgReport_cmbBdgExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgReport_lblBudExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgReport_btnBdgExp)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        frmGoToReports_mnuOperations2.setText("Operations");
        frmGoToReports_mnuOperations2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N

        frmGoToReports_miAddIncome2.setText("Add Income");
        frmGoToReports_miAddIncome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGoToReports_miAddIncome2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuOperations2.add(frmGoToReports_miAddIncome2);

        frmGoToReports_miAddExpenses2.setText("Add Expenses");
        frmGoToReports_miAddExpenses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGoToReports_miAddExpenses2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuOperations2.add(frmGoToReports_miAddExpenses2);

        frmGoToReports_miGoToReports2.setText("Go To Reports");
        frmGoToReports_mnuOperations2.add(frmGoToReports_miGoToReports2);

        frmGoToReports_miSeeBudgets2.setText("See Budget");
        frmGoToReports_miSeeBudgets2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGoToReports_miSeeBudgets2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuOperations2.add(frmGoToReports_miSeeBudgets2);

        frmGoToReports_miSeeExpenses2.setText("See Expenses");
        frmGoToReports_miSeeExpenses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGoToReports_miSeeExpenses2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuOperations2.add(frmGoToReports_miSeeExpenses2);

        frmGoToReports_miSeeIncome2.setText("See Income");
        frmGoToReports_miSeeIncome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGoToReports_miSeeIncome2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuOperations2.add(frmGoToReports_miSeeIncome2);

        jMenuBar3.add(frmGoToReports_mnuOperations2);

        frmGoToReports_mnuExport2.setText("Export");
        frmGoToReports_mnuExport2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N

        miCSV2.setText("to CSV");
        miCSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCSV2ActionPerformed(evt);
            }
        });
        frmGoToReports_mnuExport2.add(miCSV2);

        miPDF2.setText("to PDF");
        frmGoToReports_mnuExport2.add(miPDF2);

        jMenuBar3.add(frmGoToReports_mnuExport2);

        frmGoToReports_mnuExit2.setText("Exit");
        frmGoToReports_mnuExit2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        frmGoToReports_mnuExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmGoToReports_mnuExit2MouseClicked(evt);
            }
        });
        jMenuBar3.add(frmGoToReports_mnuExit2);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmGoToReports_miSeeBudgets2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miSeeBudgets2ActionPerformed
        String cmbBdgExp=dlgReport_cmbBdgExp.getSelectedItem().toString();
        String cmbBdg=dlgReport_cmbBudget.getSelectedItem().toString();
        String cmbExp=dlgReport_cmbExpenses.getSelectedItem().toString();
        String cmbIncome=dlgReport_cmbIncome.getSelectedItem().toString();
        //call the getFamilyNAme  from db
        dlgReport_lblBudExp.setText(cmbExp);
        dlgReport_lblBudget.setText(cmbExp);
        dlgReport_lblExp.setText(cmbExp);
        dlgReport_lblIncome.setText(cmbExp);
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Budget");
        details.pack();
        details.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_frmGoToReports_miSeeBudgets2ActionPerformed

    private void dlgReport_btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgReport_btnExpActionPerformed
        //set the combo box in Details to Expenses
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Expenses");
        details.pack();
        details.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_dlgReport_btnExpActionPerformed

    private void dlgReport_btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgReport_btnIncomeActionPerformed
        //set the combo box in Details to Income
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Income");
        details.pack();
        details.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_dlgReport_btnIncomeActionPerformed

    private void dlgReport_btnBdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgReport_btnBdgActionPerformed
        //set the combo box in Details to Budgets
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Budget");
        details.pack();
        details.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_dlgReport_btnBdgActionPerformed

    private void frmGoToReports_miAddIncome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miAddIncome2ActionPerformed
        AddIncome income = new AddIncome(null, true, gl, welcome);
        income.pack();
        income.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_frmGoToReports_miAddIncome2ActionPerformed

    private void frmGoToReports_miAddExpenses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miAddExpenses2ActionPerformed
        AddExpenses expense = new AddExpenses(null, true, gl, welcome);
        gl.closeWindow(this);
        expense.pack();
        expense.setVisible(true);    }//GEN-LAST:event_frmGoToReports_miAddExpenses2ActionPerformed

    private void frmGoToReports_miSeeExpenses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miSeeExpenses2ActionPerformed
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Expenses");
        gl.closeWindow(this);
        details.pack();
        details.setVisible(true);    }//GEN-LAST:event_frmGoToReports_miSeeExpenses2ActionPerformed

    private void frmGoToReports_miSeeIncome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miSeeIncome2ActionPerformed
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Income");
        gl.closeWindow(this);
        details.pack();
        details.setVisible(true);     }//GEN-LAST:event_frmGoToReports_miSeeIncome2ActionPerformed

    private void miCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCSV2ActionPerformed
        gl.chooseFileCSV(fileChooser);
        gl.closeWindow(this);
    }//GEN-LAST:event_miCSV2ActionPerformed

    private void frmGoToReports_mnuExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmGoToReports_mnuExit2MouseClicked
        gl.closeApp();
        gl.closeWindow(this);
    }//GEN-LAST:event_frmGoToReports_mnuExit2MouseClicked

    private void dlgReport_cmbIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgReport_cmbIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlgReport_cmbIncomeActionPerformed

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
            java.util.logging.Logger.getLogger(GoToReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoToReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoToReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoToReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                GoToReports dialog = new GoToReports(null, true, gl, welcome);
                dialog.setVisible(true);
                /*dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        gl.closeWindow();
                    }
                });*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dlgReport_btnBdg;
    private javax.swing.JButton dlgReport_btnBdgExp;
    private javax.swing.JButton dlgReport_btnExp;
    private javax.swing.JButton dlgReport_btnIncome;
    private javax.swing.JComboBox<String> dlgReport_cmbBdgExp;
    private javax.swing.JComboBox<String> dlgReport_cmbBudget;
    private javax.swing.JComboBox<String> dlgReport_cmbExpenses;
    private javax.swing.JComboBox<String> dlgReport_cmbIncome;
    private javax.swing.JLabel dlgReport_lblBudExp;
    private javax.swing.JLabel dlgReport_lblBudget;
    private javax.swing.JLabel dlgReport_lblExp;
    private javax.swing.JLabel dlgReport_lblIncome;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem frmGoToReports_miAddExpenses2;
    private javax.swing.JMenuItem frmGoToReports_miAddIncome2;
    private javax.swing.JMenuItem frmGoToReports_miGoToReports2;
    private javax.swing.JMenuItem frmGoToReports_miSeeBudgets2;
    private javax.swing.JMenuItem frmGoToReports_miSeeExpenses2;
    private javax.swing.JMenuItem frmGoToReports_miSeeIncome2;
    private javax.swing.JMenu frmGoToReports_mnuExit2;
    private javax.swing.JMenu frmGoToReports_mnuExport2;
    private javax.swing.JMenu frmGoToReports_mnuOperations2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem miCSV2;
    private javax.swing.JMenuItem miPDF2;
    // End of variables declaration//GEN-END:variables
}
