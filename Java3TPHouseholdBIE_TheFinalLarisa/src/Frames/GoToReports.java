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
        this.welcome=welcome;
        this.gl=gl;
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
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

        jLabel15.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel15.setText("...");

        jLabel16.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel16.setText("Total Household Income for the");

        jLabel17.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel17.setText("...");

        jLabel18.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel18.setText("...");

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jButton1.setText("Details");

        jLabel19.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel19.setText("Budget vs Expenses per Household for the");

        jButton2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jButton2.setText("Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jButton3.setText("Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        jComboBox7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        jComboBox8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        jComboBox9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Quarter", "Year", " " }));

        jLabel20.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel20.setText("Budgets");

        jButton4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jButton4.setText("Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel21.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addComponent(jButton4)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
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
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Budget");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmGoToReports_miSeeBudgets2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //set the combo box in Details to Expenses
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Expenses");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //set the combo box in Details to Income
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Income");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //set the combo box in Details to Budgets
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Budget");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void frmGoToReports_miAddIncome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miAddIncome2ActionPerformed
        AddIncome income = new AddIncome(welcome, true, gl, welcome);
        income.pack();
        income.setVisible(true);
    }//GEN-LAST:event_frmGoToReports_miAddIncome2ActionPerformed

    private void frmGoToReports_miAddExpenses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miAddExpenses2ActionPerformed
        AddExpenses expense = new AddExpenses(welcome, true, gl, welcome);
        expense.pack();
        expense.setVisible(true);    }//GEN-LAST:event_frmGoToReports_miAddExpenses2ActionPerformed

    private void frmGoToReports_miSeeExpenses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miSeeExpenses2ActionPerformed
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Expenses");
        details.pack();
        details.setVisible(true);    }//GEN-LAST:event_frmGoToReports_miSeeExpenses2ActionPerformed

    private void frmGoToReports_miSeeIncome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGoToReports_miSeeIncome2ActionPerformed
        Details details = new Details(welcome, true, gl, welcome);
        details.setDetailsComboBox("Income");
        details.pack();
        details.setVisible(true);     }//GEN-LAST:event_frmGoToReports_miSeeIncome2ActionPerformed

    private void miCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCSV2ActionPerformed
        gl.chooseFileCSV(fileChooser);
    }//GEN-LAST:event_miCSV2ActionPerformed

    private void frmGoToReports_mnuExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmGoToReports_mnuExit2MouseClicked
       gl.closeApp();
    }//GEN-LAST:event_frmGoToReports_mnuExit2MouseClicked

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
               
        GoToReports dialog =new GoToReports(welcome, true, gl, welcome);
        dialog.setVisible(true);
               dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
    }
        });
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem miCSV2;
    private javax.swing.JMenuItem miPDF2;
    // End of variables declaration//GEN-END:variables
}
                