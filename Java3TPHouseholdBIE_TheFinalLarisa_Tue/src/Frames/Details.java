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
public class Details extends javax.swing.JDialog {

    private static Frames.Global gl;
    private static Welcome welcome;
    /**
     * Creates new form SeeBudget
     */
    public Details(java.awt.Frame parent, boolean modal, Global gl, Welcome welcome) {
        super(parent, modal);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.welcome=welcome;
        this.gl=gl;
        initComponents();
    }

    public void setDetailsComboBox(String choice) {
        Details_cmbChoice.setSelectedItem(choice);
    }
    private void updateTable(){
        
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
        lblStatus6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Details_cmbChoice = new javax.swing.JComboBox<>();
        jMenuBar7 = new javax.swing.JMenuBar();
        mnuOperations6 = new javax.swing.JMenu();
        frmSeeBudget_miAddIncome6 = new javax.swing.JMenuItem();
        frmSeeBudget_miAddExpenses6 = new javax.swing.JMenuItem();
        frmSeeBudget_miGoToReports6 = new javax.swing.JMenuItem();
        frmSeeBudget_miSeeBudgets6 = new javax.swing.JMenuItem();
        frmSeeBudget_miSeeExpenses6 = new javax.swing.JMenuItem();
        frmSeeBudget_miSeeIncome6 = new javax.swing.JMenuItem();
        mnuExport6 = new javax.swing.JMenu();
        frmSeeBudget_miCSV6 = new javax.swing.JMenuItem();
        frmSeeBudget_miPDF6 = new javax.swing.JMenuItem();
        frmSeeBudget_mnuExit6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblStatus6.setText("Status");
        getContentPane().add(lblStatus6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jLabel31.setText("Month");

        jLabel32.setText("Year");

        jLabel34.setText("You choice ");

        Details_cmbChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Income", "Expenses", "Budget" }));
        Details_cmbChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Details_cmbChoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details_cmbChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Details_cmbChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        mnuOperations6.setText("Operations");

        frmSeeBudget_miAddIncome6.setText("Add Income");
        frmSeeBudget_miAddIncome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miAddIncome6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miAddIncome6);

        frmSeeBudget_miAddExpenses6.setText("Add Expenses");
        frmSeeBudget_miAddExpenses6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miAddExpenses6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miAddExpenses6);

        frmSeeBudget_miGoToReports6.setText("Go To Reports");
        frmSeeBudget_miGoToReports6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miGoToReports6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miGoToReports6);

        frmSeeBudget_miSeeBudgets6.setText("See Budget");
        frmSeeBudget_miSeeBudgets6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miSeeBudgets6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miSeeBudgets6);

        frmSeeBudget_miSeeExpenses6.setText("See Expenses");
        frmSeeBudget_miSeeExpenses6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miSeeExpenses6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miSeeExpenses6);

        frmSeeBudget_miSeeIncome6.setText("See Income");
        frmSeeBudget_miSeeIncome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miSeeIncome6ActionPerformed(evt);
            }
        });
        mnuOperations6.add(frmSeeBudget_miSeeIncome6);

        jMenuBar7.add(mnuOperations6);

        mnuExport6.setText("Export");

        frmSeeBudget_miCSV6.setText("to CSV");
        frmSeeBudget_miCSV6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSeeBudget_miCSV6ActionPerformed(evt);
            }
        });
        mnuExport6.add(frmSeeBudget_miCSV6);

        frmSeeBudget_miPDF6.setText("to PDF");
        mnuExport6.add(frmSeeBudget_miPDF6);

        jMenuBar7.add(mnuExport6);

        frmSeeBudget_mnuExit6.setText("Exit");
        frmSeeBudget_mnuExit6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmSeeBudget_mnuExit6MouseClicked(evt);
            }
        });
        jMenuBar7.add(frmSeeBudget_mnuExit6);

        setJMenuBar(jMenuBar7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmSeeBudget_miSeeBudgets6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miSeeBudgets6ActionPerformed
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Budget");
        gl.closeWindow(this);
        details.pack();
        details.setVisible(true);    }//GEN-LAST:event_frmSeeBudget_miSeeBudgets6ActionPerformed

    private void frmSeeBudget_miAddIncome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miAddIncome6ActionPerformed
        AddIncome income = new AddIncome(null, true, gl,welcome);
        income.pack();
        income.setVisible(true);
        gl.closeWindow(this);

    }//GEN-LAST:event_frmSeeBudget_miAddIncome6ActionPerformed

    private void Details_cmbChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Details_cmbChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Details_cmbChoiceActionPerformed

    private void frmSeeBudget_miAddExpenses6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miAddExpenses6ActionPerformed
        AddExpenses expense = new AddExpenses(null, true, gl, welcome);
        expense.pack();
        expense.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_frmSeeBudget_miAddExpenses6ActionPerformed

    private void frmSeeBudget_miGoToReports6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miGoToReports6ActionPerformed
        GoToReports reports = new GoToReports(null, true, gl, welcome);
        reports.pack();
        reports.setVisible(true);
        gl.closeWindow(this);
    }//GEN-LAST:event_frmSeeBudget_miGoToReports6ActionPerformed

    private void frmSeeBudget_miSeeExpenses6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miSeeExpenses6ActionPerformed
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Expenses");
        gl.closeWindow(this);
        details.pack();
        details.setVisible(true);    }//GEN-LAST:event_frmSeeBudget_miSeeExpenses6ActionPerformed

    private void frmSeeBudget_miSeeIncome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miSeeIncome6ActionPerformed
        Details details = new Details(null, true, gl, welcome);
        details.setDetailsComboBox("Income");
        gl.closeWindow(this);
        details.pack();
        details.setVisible(true);     }//GEN-LAST:event_frmSeeBudget_miSeeIncome6ActionPerformed

    private void frmSeeBudget_miCSV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSeeBudget_miCSV6ActionPerformed
        gl.chooseFileCSV(fileChooser);
        gl.closeWindow(this);
    }//GEN-LAST:event_frmSeeBudget_miCSV6ActionPerformed

    private void frmSeeBudget_mnuExit6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmSeeBudget_mnuExit6MouseClicked
gl.closeApp();
    }//GEN-LAST:event_frmSeeBudget_mnuExit6MouseClicked

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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               Details dialog= new Details(null, true, gl, welcome);
               dialog.setVisible(true);
               /*dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Details_cmbChoice;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem frmSeeBudget_miAddExpenses6;
    private javax.swing.JMenuItem frmSeeBudget_miAddIncome6;
    private javax.swing.JMenuItem frmSeeBudget_miCSV6;
    private javax.swing.JMenuItem frmSeeBudget_miGoToReports6;
    private javax.swing.JMenuItem frmSeeBudget_miPDF6;
    private javax.swing.JMenuItem frmSeeBudget_miSeeBudgets6;
    private javax.swing.JMenuItem frmSeeBudget_miSeeExpenses6;
    private javax.swing.JMenuItem frmSeeBudget_miSeeIncome6;
    private javax.swing.JMenu frmSeeBudget_mnuExit6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblStatus6;
    private javax.swing.JMenu mnuExport6;
    private javax.swing.JMenu mnuOperations6;
    // End of variables declaration//GEN-END:variables
}
