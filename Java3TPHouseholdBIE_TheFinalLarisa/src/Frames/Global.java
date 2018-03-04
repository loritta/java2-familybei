/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import HelperClasses.Database;
import HelperClasses.User;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author larisasabalin
 */
public class Global {
    
    Database db = new Database();
    User currentUser= new User();

    public Global() {
        db = new Database();
        currentUser= new User();
    }
    
    
    public File chooseFileCSV(javax.swing.JFileChooser fileChooser){
        int ret = fileChooser.showDialog(null, "Save to the file");
        File file=null;
        if (ret == JFileChooser.APPROVE_OPTION) {
            
                file = fileChooser.getSelectedFile();
                String filename = file.getAbsolutePath();

                if (!filename.matches(".+\\.[A-Za-z0-9]{1,20}") /*file.getName().toLowerCase().endsWith(".csv")*/) {

                    file = new File(filename + ".csv");
               
        }}
            return file;
    }
    
    public void closeApp(){
        int value = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog 
        (null, 
                "Are you sure you would like to teminate your session?"
                ,"Warning",value);
         
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    public void comparePassword(String password, String rePassword) {
    if (password.equals(rePassword)) {
      JOptionPane.showMessageDialog(null, "Passwords matched!");
    } else {
      throw new InputMismatchException();
    }
  }
    

    
}
