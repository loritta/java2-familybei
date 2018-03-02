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

/**
 *
 * @author larisasabalin
 */
public class Global {
    public Database db = new Database();
    public User currentUser= new User();
    
    private void close() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
    
    
}
