/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import HelperClasses.User;
import javax.swing.SwingUtilities;

public class App {

    private static Welcome welcome;
    private static Global gl;
    //private static Login loginDialog;
    

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                gl = new Global();
                //welcome = new Welcome(gl);
                welcome=new Welcome(gl);
                welcome.pack();
                welcome.setVisible(true);
//                loginDialog = new Login(welcome, true, gl, welcome);
//                loginDialog.pack();
//                loginDialog.setVisible(true);

                //welcome.pack();
                //welcome.setVisible(true);
            }
        });
    }
}/*setVisible(false);
        gl = new Global(db);
        currentUser=new User();
        welcome=new Welcome();
           welcome.pack();
        welcome.setVisible(true);
        
        loginDialog = new Login(this, true, currentUser, gl);
        loginDialog.pack();
        loginDialog.setVisible(true);

 */
