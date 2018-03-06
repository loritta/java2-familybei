/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import HelperClasses.Database;
import HelperClasses.User;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author larisasabalin
 */
public class Global {

    Database db;
    User currentUser;

    public Global() {
        db = new Database();
        currentUser = new User();
    }

    public File chooseFileCSV(javax.swing.JFileChooser fileChooser) {
        int ret = fileChooser.showDialog(null, "Save to the file");
        File file = null;
        if (ret == JFileChooser.APPROVE_OPTION) {

            file = fileChooser.getSelectedFile();
            String filename = file.getAbsolutePath();

            if (!filename.matches(".+\\.[A-Za-z0-9]{1,20}") /*file.getName().toLowerCase().endsWith(".csv")*/) {

                file = new File(filename + ".csv");

            }
        }
        return file;
    }

    public void closeApp() {
        int value = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Are you sure you would like to teminate your session?",
                 "Warning", value);

        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void closeWindow(Component e
    ) {
        Window frame = SwingUtilities.windowForComponent(e);
        frame.setVisible(false);
    }

    public boolean comparePassword(String password, String rePassword) {
        boolean result=false;
        if (password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords matched!");
            result=true;
            return result;
        } else {
            throw new InputMismatchException();
        }
    }
    
    public boolean userExistVerif(String username, int familyid, Date dob, String password, String rePassword){
        boolean result=false;
        if(db.userExists(username, familyid, dob, password)){
            try {
                if(comparePassword(password, rePassword)){
                    db.insertUser(username, password, dob, familyid);
                    result=true;
                }
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,
                    "Error connecting to database: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }

    public void insertTransaction(String amountStr, String type) {
        DecimalFormat formatter = new DecimalFormat("###.##");
        formatter.setParseBigDecimal(true);
        try {
            BigDecimal amount = (BigDecimal) formatter.parse(amountStr);
            db.insertTransaction(currentUser.getId(), db.getCategoryId(type), amount);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "The amount must be formatted as \"123.45\" ");
        } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        JOptionPane.showMessageDialog(null,
                "Fatal error connecting database\n" + ex.getMessage(),
                "Error connecting",
                JOptionPane.ERROR_MESSAGE);
      }
    }
}
