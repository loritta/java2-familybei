package Frames;

import HelperClasses.User;
import java.awt.Frame;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JDialog {

  private static Global gl;
  private static Welcome welcome;

  public Registration(Frame owner, boolean modal,
          Global gl, Welcome welcome) {
    super(owner, modal);
    setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    this.gl = gl;
    this.welcome = welcome;
    initComponents();
  }

  public Registration() {

    initComponents();
  }

  public void getUser() {

    String familyName = reg_tfFamilyName.getText();
    String name = reg_tfName.getText();
    String password = new String(reg_pfPassword.getPassword());
    String rePassword = new String(reg_pfRePassword.getPassword());
    try {
      gl.comparePassword(password, rePassword);

      Date dob = gl.db.strToDate(reg_tfDob.getText());
      int familyId = gl.db.getFamilyId(familyName);
      gl.db.insertUser(name, password, dob, familyId);
    } catch (InputMismatchException ex) {
      System.out.println(ex.getMessage());
      JOptionPane.showMessageDialog(this,
              "Password not matched or DOB is not formated \"DD/MM/YYYY\" " + ex.getMessage(),
              "Passwords not matched!!!",
              JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
      JOptionPane.showMessageDialog(null,
              "Fatal error connecting database\n" + ex.getMessage(),
              "Error connecting",
              JOptionPane.ERROR_MESSAGE);
    }
    JOptionPane.showMessageDialog(this,
            "Your information was registred",
            "Success!!!",
            JOptionPane.INFORMATION_MESSAGE);

  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        Registration = new javax.swing.JPanel();
        reg_btnRegister = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        reg_btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        reg_tfName = new javax.swing.JTextField();
        reg_pfPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        reg_pfRePassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        reg_tfFamilyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        reg_tfDob = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        reg_tfFamilyCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        Registration.setBackground(new java.awt.Color(204, 204, 255));
        Registration.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 1, 18))); // NOI18N

        reg_btnRegister.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        reg_btnRegister.setText("Register");
        reg_btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_btnRegisterActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel9.setText("Login name:");

        reg_btnCancel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        reg_btnCancel.setText("Cancel");
        reg_btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_btnCancelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel10.setText("Password:");

        reg_pfPassword.setText("jPasswordField1");
        reg_pfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reg_pfPasswordFocusGained(evt);
            }
        });
        reg_pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_pfPasswordMouseClicked(evt);
            }
        });
        reg_pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_pfPasswordActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel13.setText("Password verification:");

        reg_pfRePassword.setText("jPasswordField1");
        reg_pfRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reg_pfRePasswordFocusGained(evt);
            }
        });
        reg_pfRePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_pfRePasswordMouseClicked(evt);
            }
        });
        reg_pfRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_pfRePasswordActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel14.setText("Family name:");

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setText("DOB(YYYY/MM/DD)");

        reg_tfDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_tfDobActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel15.setText("Unified Family Code:");

        javax.swing.GroupLayout RegistrationLayout = new javax.swing.GroupLayout(Registration);
        Registration.setLayout(RegistrationLayout);
        RegistrationLayout.setHorizontalGroup(
            RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reg_btnCancel)
                        .addGap(27, 27, 27)
                        .addComponent(reg_btnRegister))
                    .addGroup(RegistrationLayout.createSequentialGroup()
                        .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reg_tfFamilyName)
                            .addComponent(reg_tfDob, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reg_pfRePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(reg_pfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reg_tfName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reg_tfFamilyCode))))
                .addContainerGap())
        );
        RegistrationLayout.setVerticalGroup(
            RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(reg_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(reg_pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_pfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_tfDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_tfFamilyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(reg_tfFamilyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_btnRegister)
                    .addComponent(reg_btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Registration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reg_btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_btnRegisterActionPerformed
      getUser();
      Login loginDialog = new Login(welcome, true, gl, welcome);
      setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
      loginDialog.pack();
      loginDialog.setVisible(true);
      gl.closeWindow(this);

    }//GEN-LAST:event_reg_btnRegisterActionPerformed

    private void reg_btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_btnCancelActionPerformed
      gl.closeApp();
    }//GEN-LAST:event_reg_btnCancelActionPerformed

    private void reg_tfDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_tfDobActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_reg_tfDobActionPerformed
//those two lines to check if it's ok with Tung to add.
  private void reg_pfRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_pfRePasswordActionPerformed
    reg_pfRePassword.setText("");    // TODO add your handling code here:
  }//GEN-LAST:event_reg_pfRePasswordActionPerformed

    private void reg_pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_pfPasswordActionPerformed
      reg_pfPassword.setText("");            // TODO add your handling code here:
    }//GEN-LAST:event_reg_pfPasswordActionPerformed

    private void reg_pfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_pfPasswordMouseClicked
      reg_pfPassword.setText("");
    }//GEN-LAST:event_reg_pfPasswordMouseClicked

    private void reg_pfRePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_pfRePasswordMouseClicked
reg_pfRePassword.setText("");    }//GEN-LAST:event_reg_pfRePasswordMouseClicked

    private void reg_pfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reg_pfPasswordFocusGained
reg_pfPassword.setText("");    }//GEN-LAST:event_reg_pfPasswordFocusGained

    private void reg_pfRePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reg_pfRePasswordFocusGained
reg_pfRePassword.setText("");      }//GEN-LAST:event_reg_pfRePasswordFocusGained

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
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {

        Registration dialog = new Registration(welcome, true, gl, welcome);
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
    private javax.swing.JPanel Registration;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton reg_btnCancel;
    private javax.swing.JButton reg_btnRegister;
    private javax.swing.JPasswordField reg_pfPassword;
    private javax.swing.JPasswordField reg_pfRePassword;
    private javax.swing.JTextField reg_tfDob;
    private javax.swing.JTextField reg_tfFamilyCode;
    private javax.swing.JTextField reg_tfFamilyName;
    private javax.swing.JTextField reg_tfName;
    // End of variables declaration//GEN-END:variables
}
