package HelperClasses;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    //for Larisa
    private final static String HOSTNAME = "den1.mysql6.gear.host";
    private final static String DBNAME = "myjac";
    private final static String USERNAME = "myjac";
    private final static String PASSWORD = "Yt6wOA_!6byy";
    public static final String DATE_FORMAT_SQL = "yyyy/MM/dd";
    //for Tung
    /*private final static String HOSTNAME = "den1.mysql6.gear.host";
    private final static String DBNAME = "familybei";
    private final static String USERNAME = "familybei";
    private final static String PASSWORD = "tp%ipd12"; *///correct password tp%ipd12 removed one letter to test
    //I changed it (Larisa 1March) can we somehow go around the connection to 
    //privatewhen an object s created from database?
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
   

    public Database() {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + HOSTNAME + "/" + DBNAME,
                    USERNAME, PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error connecting to database: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    //why didn't you do it in the constructor???
    public Connection connect() {

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + HOSTNAME + "/" + DBNAME,
                    USERNAME, PASSWORD);
        } catch (SQLException e) {
            //need to verify if null works
            JOptionPane.showMessageDialog(null,
                    "Error connecting to database: " + e.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("HelperClasses.Database.connect() - failed");
            System.exit(0); // can't continue if database connection failed
        }
        return conn;
    }

    public String loginVerif(String password, String username) {
        String sql = "select * from users where name = ? and password = ?";
        String msg = "";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                msg = "success";
                }
                else {
                JOptionPane.showMessageDialog(null, "Invalid username and password");
            }
                } catch (SQLException | NullPointerException e) {
                    JOptionPane.showMessageDialog(null,
                    "Error connecting to database: " + e.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
                }
                return msg;
            }

   //to work on the SQL phrasing here
    public User createUserObject(String password, String username) throws SQLException{
        String sql = "SELECT id, dob, familyid FROM users WHERE name = '" + username + "' and password ='"+ password+"'";
        int id=0;
        Date dob=null;
        int familyId = 0;
        
    try (Statement stmt = conn.createStatement();
            ResultSet result = (ResultSet)stmt.executeQuery(sql)) {
      while (result.next()) {
          id = result.getInt("id");  
          dob=result.getDate("dob");
          familyId = result.getInt("familyid");
          System.out.println(familyId);
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    
        User user =new User(id, username, password, dob, familyId);
        
        return user;
    }
public static Timestamp nowSQL() {
        Calendar cal = Calendar.getInstance();
        java.util.Date now = cal.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return currentTimestamp;
    }
 public Date strToDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        Date sqlDate = new Date(Calendar.getInstance().getTime().getTime());
        try {
            java.util.Date utilDate = sdf.parse(str);
            sqlDate = new Date(utilDate.getTime());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return sqlDate;
    }

    public void comparePassword(String password, String rePassword) {
        if (password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords matched!");
        } else {
            throw new InputMismatchException();
        }
    }
        }

    
