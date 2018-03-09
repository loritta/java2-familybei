/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import HelperClasses.*;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author larisasabalin
 */
public class Welcome extends javax.swing.JFrame {

    private static Global gl;
    private Transaction trans;
    private BudgetsMonthly budg;
    private Login login;
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        gl = new Global();
        initComponents();
        logedIn(gl.currentUser);
    }
    
    public void logedIn(User currentUser){
        System.out.println(currentUser);
        if (currentUser.getId()==0){
        login=new Login(this, true, gl, this);
        login.pack();
        login.setVisible(true);
        callHistoryToTheDataBase(gl.currentUser.getId());
        lblUserName.setText(gl.currentUser.getName());
        getFamilyInfo(gl.currentUser.getFamilyId());
        getTransactionsAndBudget(gl.currentUser.getId());
        }
        else{
            System.out.println(gl.currentUser.getFamilyId());
            System.out.println(gl.currentUser.getName());
            System.out.println(gl.currentUser.getId());
            
        callHistoryToTheDataBase(gl.currentUser.getId());
        lblUserName.setText(gl.currentUser.getName());
        getFamilyInfo(gl.currentUser.getFamilyId());
        getTransactionsAndBudget(gl.currentUser.getId());
        }
      
    }

    public void callHistoryToTheDataBase(Integer id) {
        try {
            String empty = "empty";

            if (gl.db.transactionHistoryAvailable(id).equals(empty)) {
                InitialInfo initialInfo = new InitialInfo(this, true, gl, this);
                initialInfo.pack();
                initialInfo.setVisible(true);
            } else {
                this.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error connecting database(History)\n" + ex.getMessage(),
                    "Error connecting",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getFamilyInfo(int familyId) {
        ArrayList<String> lists = new ArrayList<>();
        String stText = "";
        try {
            lists = gl.db.getDatabaseFamilyMembersName(familyId);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Fatal error connecting database(family)\n" + ex.getMessage(),
                    "Error connecting",
                    JOptionPane.ERROR_MESSAGE);
        }
        stText = String.join("    ", lists);

        lblFamilyMemeber1.setText(stText);
    }

    public void getTransactionsAndBudget(int id) {
        try {
            trans = new Transaction(gl.currentUser.getId());
            budg = new BudgetsMonthly(gl.currentUser.getId());

            BigDecimal result;
            //setting expences
            BigDecimal expense = trans.getAllGeneralExpenses(id);
            lblExpenses.setText(expense.toString());

            //setting income
            BigDecimal income = trans.getAllGeneralIncome(id);
            lblIncome.setText(income.toString());
            //setting budget
            BigDecimal budget = budg.getAllGeneralBudget(id);
            lblBudget.setText(budget.toString());
            //setting budget vs Exp
            result = budget.subtract(expense);
            lblBudgetVsExpens.setText(result.toString());
            //setting budget vs income
            result = budget.subtract(income);
            lblBudgetVsIncome.setText(result.toString());

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Fatal error connecting database(trans)\n" + ex.getMessage(),
                    "Error connecting",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        pnlFamily = new javax.swing.JPanel();
        lblFamilyMemeber1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        lblExpenses = new javax.swing.JLabel();
        lblBudget = new javax.swing.JLabel();
        lblBudgetVsIncome = new javax.swing.JLabel();
        lblBudgetVsExpens = new javax.swing.JLabel();
        jMenuBar10 = new javax.swing.JMenuBar();
        frmWelcome_mnuOperations9 = new javax.swing.JMenu();
        frmWelcome_miAddIncome9 = new javax.swing.JMenuItem();
        frmWelcome_miAddExpenses9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeBudgets9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeExpenses9 = new javax.swing.JMenuItem();
        frmWelcome_miSeeIncome9 = new javax.swing.JMenuItem();
        frmWelcome_mnuExit9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");

        jPanel12.setBackground(new java.awt.Color(154, 226, 208));
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
                .addContainerGap(587, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnlFamilyLayout = new javax.swing.GroupLayout(pnlFamily);
        pnlFamily.setLayout(pnlFamilyLayout);
        pnlFamilyLayout.setHorizontalGroup(
            pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamilyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblFamilyMemeber1)
                .addContainerGap(701, Short.MAX_VALUE))
        );
        pnlFamilyLayout.setVerticalGroup(
            pnlFamilyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamilyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblFamilyMemeber1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFamily, java.awt.BorderLayout.CENTER);

        jPanel11.setBackground(new java.awt.Color(154, 226, 208));
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

        lblIncome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lblIncome.setText("...");

        lblExpenses.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lblExpenses.setText("...");

        lblBudget.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lblBudget.setText("...");

        lblBudgetVsIncome.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lblBudgetVsIncome.setText("...");

        lblBudgetVsExpens.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        lblBudgetVsExpens.setText("...");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(lblIncome))
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(lblExpenses))
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(lblBudget))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBudgetVsIncome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(lblBudgetVsExpens))
                .addGap(85, 85, 85))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel20, lblIncome});

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel21, lblExpenses});

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel22, lblBudget});

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel27, lblBudgetVsIncome});

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel37, lblBudgetVsExpens});

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
                    .addComponent(lblIncome)
                    .addComponent(lblExpenses)
                    .addComponent(lblBudget)
                    .addComponent(lblBudgetVsIncome)
                    .addComponent(lblBudgetVsExpens))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, java.awt.BorderLayout.PAGE_END);

        frmWelcome_mnuOperations9.setText("Operations");
        frmWelcome_mnuOperations9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmWelcome_mnuOperations9ActionPerformed(evt);
            }
        });

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

        frmWelcome_mnuExit9.setText("Exit");
        frmWelcome_mnuExit9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmWelcome_mnuExit9MouseClicked(evt);
            }
        });
        jMenuBar10.add(frmWelcome_mnuExit9);

        setJMenuBar(jMenuBar10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frmWelcome_miAddIncome9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miAddIncome9ActionPerformed
        Frames.AddIncome income = new AddIncome(null, true, gl, this);
        income.pack();
        income.setVisible(true);

    }//GEN-LAST:event_frmWelcome_miAddIncome9ActionPerformed

    private void frmWelcome_miAddExpenses9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miAddExpenses9ActionPerformed
        AddExpenses expense = new AddExpenses(null, true, gl, this);
        expense.pack();
        expense.setVisible(true);

    }//GEN-LAST:event_frmWelcome_miAddExpenses9ActionPerformed

    private void frmWelcome_miSeeBudgets9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeBudgets9ActionPerformed
       String comboChoice="Budget";
        Details details = new Details(null, true, gl, this, comboChoice);
        
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeBudgets9ActionPerformed
//do the same as on top
    private void frmWelcome_miSeeExpenses9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeExpenses9ActionPerformed
        
        String comboChoice="Expenses";
        Details details = new Details(null, true, gl, this, comboChoice);

        details.setDetailsComboBox("");

        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeExpenses9ActionPerformed

    private void frmWelcome_miSeeIncome9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_miSeeIncome9ActionPerformed
        String comboChoice="Income";
       Details details = new Details(null, true, gl, this, comboChoice);
        details.pack();
        details.setVisible(true);
    }//GEN-LAST:event_frmWelcome_miSeeIncome9ActionPerformed

    private void frmWelcome_mnuExit9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmWelcome_mnuExit9MouseClicked
        gl.closeApp();
    }//GEN-LAST:event_frmWelcome_mnuExit9MouseClicked


    private void frmWelcome_mnuOperations9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmWelcome_mnuOperations9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmWelcome_mnuOperations9ActionPerformed

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
                Welcome welcome = new Welcome();
                welcome.setVisible(true);
                welcome.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem frmWelcome_miAddExpenses9;
    private javax.swing.JMenuItem frmWelcome_miAddIncome9;
    private javax.swing.JMenuItem frmWelcome_miSeeBudgets9;
    private javax.swing.JMenuItem frmWelcome_miSeeExpenses9;
    private javax.swing.JMenuItem frmWelcome_miSeeIncome9;
    private javax.swing.JMenu frmWelcome_mnuExit9;
    private javax.swing.JMenu frmWelcome_mnuOperations9;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel lblBudget;
    private javax.swing.JLabel lblBudgetVsExpens;
    private javax.swing.JLabel lblBudgetVsIncome;
    private javax.swing.JLabel lblExpenses;
    private javax.swing.JLabel lblFamilyMemeber1;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlFamily;
    // End of variables declaration//GEN-END:variables
}
