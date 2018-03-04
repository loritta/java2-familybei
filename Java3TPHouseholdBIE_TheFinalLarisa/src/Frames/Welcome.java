/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author larisasabalin
 */
public class Welcome extends javax.swing.JFrame {

    private static Global gl;

    /**
     * Creates new form Welcome
     */
    public Welcome(Global gl) {
        this.gl = gl;
        initComponents();
        System.out.println(gl.currentUser.getId());
        callHistoryToTheDataBase(gl.currentUser.getId());
        lblUserName.setText(gl.currentUser.getName());
        getFamilyInfo(gl.currentUser.getFamilyId());

    }

    public Welcome() {
        initComponents();

        //this.setVisible(false);
    }

    public void callHistoryToTheDataBase(Integer id) {
        try {
            String empty = "empty";

            if (gl.db.transactionHistoryAvailable(id).equals(empty)) {
                InitialInfo initialInfo = new InitialInfo(this, true, gl, this);
                initialInfo.pack();
                initialInfo.setVisible(true);
            } else {
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getFamilyInfo(int familyId) {
        ArrayList<String> list = gl.db.getDatabaseFamilyMembersName(familyId);
        Iterator it = list.iterator();
        String setText="";
        while (it.hasNext()) {
            setText= setText+it.next();
        }
    lblFamilyMemeber1.setText(setText);
    }

    public void loadingTheData() {
        lblUserName.setText(gl.currentUser.getName());

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
        jPanel12 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        pnlFamily = new javax.swing.JPanel();
        lblFamilyMemeber1 = new javax.swing.JLabel();
        lblFamilyMemeber2 = new javax.swing.JLabel();
        lblFamilyMemeber3 = new javax.swing.JLabel();
        lblFamilyMemeber4 = new javax.swing.JLabel();
        lblFamilyMemeber5 = new javax.swing.JLabel();
        lblFamilyMemeber6 = new javax.swing.JLabel();
        lblFamilyMemeber7 = new javax.swing.JLabel();
        lblFamilyMemeber8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jMenuBar10 = new javax.swing.JMenuBar();
        frmWelcome_mnuOperations9 = new javax.swing.JMenu();
        frmWelcome_miAddIncome9 = new javax.swing.JMenuItem();
        frmWelcome_miAddExpenses9 = new javax.swing.JMenuItem();
        frmWelcome_miGoToReports9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeBudgets9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeExpenses9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeIncome9 = new javax.swing.JMenuItem();
        frmWelcome_mnuExport9 = new javax.swing.JMenu();
        frmWelcome_miCSV9 = new javax.swing.JMenuItem();
        frmWelcome_miPDF9 = new javax.swing.JMenuItem();
        frmWelcome_mnuExit9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 12))); // NOI18N

        lblUserName.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        lblUserName.setText("Name of the user");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName)
                .addContainerGap())
        );

        getContentPane().add(jPanel12, java.awt.BorderLayout.PAGE_START);

        pnlFamily.setBackground(new java.awt.Color(204, 204, 255));
        pnlFamily.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family Members", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 13))); // NOI18N

        lblFamilyMemeber1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        lblFamilyMemeber8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnlFamilyLayout = new javax.swing.GroupLayout(pnlFamily);
        pnlFamily.setLayout(pnlFamilyLayout);
        pnlFamilyLayout.setHorizontalGroup(
            pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamilyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblFamilyMemeber1)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber2)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber3)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber4)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber5)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber6)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber7)
                .addGap(18, 18, 18)
                .addComponent(lblFamilyMemeber8)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        pnlFamilyLayout.setVerticalGroup(
            pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamilyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFamilyMemeber1)
                    .addComponent(lblFamilyMemeber2)
                    .addComponent(lblFamilyMemeber3)
                    .addComponent(lblFamilyMemeber4)
                    .addGroup(pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFamilyMemeber5)
                        .addComponent(lblFamilyMemeber6)
                        .addComponent(lblFamilyMemeber7)
                        .addComponent(lblFamilyMemeber8)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFamily, java.awt.BorderLayout.CENTER);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "This month's statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 13))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel20.setText("Income");

        jLabel21.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel21.setText("Expences");

        jLabel22.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel22.setText("Budget");

        jLabel27.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel27.setText("Budget vs Income");

        jLabel37.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel37.setText("Budget vs Expenses");

        jLabel38.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel38.setText("...");

        jLabel39.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel39.setText("...");

        jLabel40.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel40.setText("...");

        jLabel41.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel41.setText("...");

        jLabel45.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        jLabel45.setText("...");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addGap(28, 28, 28)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(68, 68, 68)
                .addComponent(jLabel40)
                .addGap(92, 92, 92)
                .addComponent(jLabel41)
                .addGap(135, 135, 135)
                .addComponent(jLabel45)
                .addGap(89, 89, 89))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(jLabel37))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel45))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, java.awt.BorderLayout.PAGE_END);

        frmWelcome_mnuOperations9.setText("Operations");

        frmWelcome_miAddIncome9.setText("Add Income");
        frmWelcome_miAddIncome9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miAddIncome9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miAddIncome9);

        frmWelcome_miAddExpenses9.setText("Add Expenses");
        frmWelcome_miAddExpenses9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miAddExpenses9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miAddExpenses9);

        frmWelcome_miGoToReports9.setText("Go To Reports");
        frmWelcome_miGoToReports9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miGoToReports9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miGoToReports9);

        frmWelcome_miSeeBudgets9.setText("See Budget");
        frmWelcome_miSeeBudgets9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miSeeBudgets9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miSeeBudgets9);

        frmWelcome_miSeeExpenses9.setText("See Expenses");
        frmWelcome_miSeeExpenses9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miSeeExpenses9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miSeeExpenses9);

        frmWelcome_miSeeIncome9.setText("See Income");
        frmWelcome_miSeeIncome9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miSeeIncome9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuOperations9.add(frmWelcome_miSeeIncome9);

        jMenuBar10.add(frmWelcome_mnuOperations9);

        frmWelcome_mnuExport9.setText("Export");

        frmWelcome_miCSV9.setText("to CSV");
        frmWelcome_miCSV9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miCSV9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuExport9.add(frmWelcome_miCSV9);

        frmWelcome_miPDF9.setText("to PDF");
        frmWelcome_miPDF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_miPDF9ActionPerformed(evt);
            }
        });
        frmWelcome_mnuExport9.add(frmWelcome_miPDF9);

        jMenuBar10.add(frmWelcome_mnuExport9);

        frmWelcome_mnuExit9.setText("Exit");
        frmWelcome_mnuExit9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmWelcome_mnuExit9MouseClicked(evt);
            }
        });
        jMenuBar10.add(frmWelcome_mnuExit9);

        setJMenuBar(jMenuBar10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmWelcome_miAddIncome9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miAddIncome9ActionPerformed
        Frames.AddIncome income = new AddIncome(this, true, gl, this);
        income.pack();
        income.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miAddIncome9ActionPerformed

    private void frmWelcome_miAddExpenses9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miAddExpenses9ActionPerformed
        AddExpenses expense = new AddExpenses(this, true, gl, this);
        expense.pack();
        expense.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miAddExpenses9ActionPerformed

    private void frmWelcome_miGoToReports9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miGoToReports9ActionPerformed
        GoToReports reports = new GoToReports(this, true, gl, this);
        reports.pack();
        reports.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miGoToReports9ActionPerformed

    private void frmWelcome_miSeeBudgets9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeBudgets9ActionPerformed
        Details details = new Details(this, true, gl, this);
        details.setDetailsComboBox("Budget");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeBudgets9ActionPerformed

    private void frmWelcome_miSeeExpenses9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeExpenses9ActionPerformed
        Details details = new Details(this, true, gl, this);
        details.setDetailsComboBox("Expenses");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeExpenses9ActionPerformed

    private void frmWelcome_miSeeIncome9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeIncome9ActionPerformed
        Details details = new Details(this, true, gl, this);
        details.setDetailsComboBox("Income");
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeIncome9ActionPerformed

    private void frmWelcome_miCSV9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miCSV9ActionPerformed
        gl.chooseFileCSV(fileChooser);//We should make this as a function this is repeating for each frame
    }//GEN-LAST:event_frmWelcome_miCSV9ActionPerformed

    private void frmWelcome_miPDF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miPDF9ActionPerformed

    }//GEN-LAST:event_frmWelcome_miPDF9ActionPerformed

    private void frmWelcome_mnuExit9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmWelcome_mnuExit9MouseClicked
        gl.closeApp();
    }//GEN-LAST:event_frmWelcome_mnuExit9MouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome(gl).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem frmWelcome_miAddExpenses9;
    private javax.swing.JMenuItem frmWelcome_miAddIncome9;
    private javax.swing.JMenuItem frmWelcome_miCSV9;
    private javax.swing.JMenuItem frmWelcome_miGoToReports9;
    private javax.swing.JMenuItem frmWelcome_miPDF9;
    private javax.swing.JMenuItem frmWelcome_miSeeBudgets9;
    private javax.swing.JMenuItem frmWelcome_miSeeExpenses9;
    private javax.swing.JMenuItem frmWelcome_miSeeIncome9;
    private javax.swing.JMenu frmWelcome_mnuExit9;
    private javax.swing.JMenu frmWelcome_mnuExport9;
    private javax.swing.JMenu frmWelcome_mnuOperations9;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel lblFamilyMemeber1;
    private javax.swing.JLabel lblFamilyMemeber2;
    private javax.swing.JLabel lblFamilyMemeber3;
    private javax.swing.JLabel lblFamilyMemeber4;
    private javax.swing.JLabel lblFamilyMemeber5;
    private javax.swing.JLabel lblFamilyMemeber6;
    private javax.swing.JLabel lblFamilyMemeber7;
    private javax.swing.JLabel lblFamilyMemeber8;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlFamily;
    // End of variables declaration//GEN-END:variables
}