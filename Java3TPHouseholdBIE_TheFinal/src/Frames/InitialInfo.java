package Frames;

import HelperClasses.Database;
import HelperClasses.Transaction;
import HelperClasses.User;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InitialInfo extends javax.swing.JDialog {

  Frames.Global gl = new Frames.Global();

  /**
   * Creates new form InitialInfo
   */
  public InitialInfo(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  private InitialInfo() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  public void insertTransaction(String amountStr, String type) {
    DecimalFormat formatter = new DecimalFormat("###.##");
    formatter.setParseBigDecimal(true);
    try {
      BigDecimal amount = (BigDecimal) formatter.parse(amountStr);
      Transaction trans = new Transaction(0, user.getId(), amount, gl.db.nowSQL(), type);
      trans.insert();
    } catch (ParseException ex) {
      JOptionPane.showMessageDialog(null, "The amount must be formatted as \"123.45\" ");
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

        jPanel9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        init_tfIncome = new javax.swing.JTextField();
        init_tfExpense = new javax.swing.JTextField();
        JPanel10 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        init_lblBudgetRequired = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        init_slMortgage = new javax.swing.JSlider();
        init_lblMortgage = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        init_slFood = new javax.swing.JSlider();
        init_lblFood = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        init_slChemical = new javax.swing.JSlider();
        init_lblChemical = new javax.swing.JLabel();
        init_slCar = new javax.swing.JSlider();
        init_lblCar = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        init_slOther = new javax.swing.JSlider();
        init_lblOther = new javax.swing.JLabel();
        init_btnSave = new javax.swing.JButton();
        init_btnCancel = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_tfIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_tfExpense, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(init_tfIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(init_tfExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel9, java.awt.BorderLayout.PAGE_START);

        JPanel10.setBackground(new java.awt.Color(204, 204, 255));
        JPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Initial budgeting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 18))); // NOI18N
        JPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPanel10MouseMoved(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel56.setText("Budget required:");

        init_lblBudgetRequired.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        init_lblBudgetRequired.setText("0");

        jLabel63.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel63.setText("House(Rent/Morgage):");

        init_slMortgage.setMaximum(3000);
        init_slMortgage.setMinorTickSpacing(10);
        init_slMortgage.setValue(0);
        init_slMortgage.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                init_slMortgageStateChanged(evt);
            }
        });

        init_lblMortgage.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        init_lblMortgage.setText("0");

        jLabel65.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel65.setText("Food:");

        init_slFood.setMaximum(3000);
        init_slFood.setMinorTickSpacing(10);
        init_slFood.setValue(0);
        init_slFood.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                init_slFoodStateChanged(evt);
            }
        });

        init_lblFood.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        init_lblFood.setText("0");

        jLabel67.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel67.setText("Household chemical and personal products:");

        init_slChemical.setMaximum(3000);
        init_slChemical.setMinorTickSpacing(10);
        init_slChemical.setValue(0);
        init_slChemical.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                init_slChemicalStateChanged(evt);
            }
        });

        init_lblChemical.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        init_lblChemical.setText("0");

        init_slCar.setMaximum(3000);
        init_slCar.setMinorTickSpacing(10);
        init_slCar.setValue(0);
        init_slCar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                init_slCarStateChanged(evt);
            }
        });

        init_lblCar.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        init_lblCar.setText("0");

        jLabel70.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel70.setText("Car:");

        jLabel71.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel71.setText("Other:");

        init_slOther.setMaximum(3000);
        init_slOther.setMinorTickSpacing(10);
        init_slOther.setValue(0);
        init_slOther.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                init_slOtherStateChanged(evt);
            }
        });

        init_lblOther.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        init_lblOther.setText("0");

        init_btnSave.setText("Save");
        init_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_btnSaveActionPerformed(evt);
            }
        });

        init_btnCancel.setText("Cancel");
        init_btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel10Layout = new javax.swing.GroupLayout(JPanel10);
        JPanel10.setLayout(JPanel10Layout);
        JPanel10Layout.setHorizontalGroup(
            JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel10Layout.createSequentialGroup()
                            .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(JPanel10Layout.createSequentialGroup()
                            .addComponent(init_slFood, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(init_lblFood))
                        .addGroup(JPanel10Layout.createSequentialGroup()
                            .addComponent(init_slOther, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(init_lblOther))
                        .addGroup(JPanel10Layout.createSequentialGroup()
                            .addComponent(init_slCar, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(init_lblCar))
                        .addGroup(JPanel10Layout.createSequentialGroup()
                            .addComponent(init_slChemical, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(init_lblChemical))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel10Layout.createSequentialGroup()
                            .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel56)
                                .addComponent(init_slMortgage, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                            .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(init_lblMortgage, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(init_lblBudgetRequired, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(init_btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(init_btnSave)
                .addGap(31, 31, 31))
        );
        JPanel10Layout.setVerticalGroup(
            JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(init_lblBudgetRequired))
                .addGap(18, 18, 18)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_slMortgage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_lblMortgage))
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_slFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_lblFood))
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_slChemical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_lblChemical))
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_slCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_lblCar))
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addGap(18, 18, 18)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_slOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(init_lblOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(init_btnSave)
                    .addComponent(init_btnCancel))
                .addGap(16, 16, 16))
        );

        getContentPane().add(JPanel10, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    User user;
//    int userId = user.getId();
    private void init_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_btnSaveActionPerformed
//      System.out.println(user.getId());
//      Transaction trans = new Transaction(0, 70, BigDecimal.TEN, gl.db.nowSQL(), "income");
//      System.out.println(trans);
      insertTransaction(init_tfIncome.getText(), "Income");
//      insertTransaction(init_tfExpense.getText(), "Expense");
//      insertTransaction(init_lblMortgage.getText(), "Mortgage");
//      insertTransaction(init_lblFood.getText(), "Food");
//      insertTransaction(init_lblChemical.getText(), "Chemical");
//      insertTransaction(init_lblCar.getText(), "Car");
//      insertTransaction(init_lblOther.getText(), "Other");
      // insertTransaction(init_lblBudgetRequired.getText(), "BudgetRequired");
    }//GEN-LAST:event_init_btnSaveActionPerformed

    private void init_btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_btnCancelActionPerformed
     gl.closeApp();
    }//GEN-LAST:event_init_btnCancelActionPerformed

  private void init_slMortgageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_init_slMortgageStateChanged
    init_lblMortgage.setText(init_slMortgage.getValue() + "");
  }//GEN-LAST:event_init_slMortgageStateChanged

  private void init_slFoodStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_init_slFoodStateChanged
    init_lblFood.setText(init_slFood.getValue() + "");
  }//GEN-LAST:event_init_slFoodStateChanged

  private void init_slChemicalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_init_slChemicalStateChanged
    init_lblChemical.setText(init_slChemical.getValue() + "");
  }//GEN-LAST:event_init_slChemicalStateChanged

  private void init_slCarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_init_slCarStateChanged
    init_lblCar.setText(init_slCar.getValue() + "");
  }//GEN-LAST:event_init_slCarStateChanged

  private void init_slOtherStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_init_slOtherStateChanged
    init_lblOther.setText(init_slOther.getValue() + "");
  }//GEN-LAST:event_init_slOtherStateChanged

  BigDecimal totalBudget = BigDecimal.ZERO;
  private void JPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel10MouseMoved
    totalBudget = new BigDecimal(
            init_slFood.getValue() + init_slMortgage.getValue()
            + init_slChemical.getValue() + init_slCar.getValue()
            + init_slOther.getValue());

    init_lblBudgetRequired.setText(totalBudget + "");
  }//GEN-LAST:event_JPanel10MouseMoved

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
        InitialInfo dialog = new InitialInfo(null, true);
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
    private javax.swing.JPanel JPanel10;
    private javax.swing.JButton init_btnCancel;
    private javax.swing.JButton init_btnSave;
    private javax.swing.JLabel init_lblBudgetRequired;
    private javax.swing.JLabel init_lblCar;
    private javax.swing.JLabel init_lblChemical;
    private javax.swing.JLabel init_lblFood;
    private javax.swing.JLabel init_lblMortgage;
    private javax.swing.JLabel init_lblOther;
    private javax.swing.JSlider init_slCar;
    private javax.swing.JSlider init_slChemical;
    private javax.swing.JSlider init_slFood;
    private javax.swing.JSlider init_slMortgage;
    private javax.swing.JSlider init_slOther;
    private javax.swing.JTextField init_tfExpense;
    private javax.swing.JTextField init_tfIncome;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
