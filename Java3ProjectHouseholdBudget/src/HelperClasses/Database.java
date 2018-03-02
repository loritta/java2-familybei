package HelperClasses;

import BIE.HouseholdBIE;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    //for Larisa
    private final static String HOSTNAME = "den1.mysql6.gear.host";
    private final static String DBNAME = "myjac";
    private final static String USERNAME = "myjac";
    private final static String PASSWORD = "Yt6wOA_!6byy";
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
        String sql = String.format("select id, dob, familyid from users where name = %s and password = %s", username, password);
        User user =new User();
        try (Statement stmt = conn.createStatement();
                        ResultSet result = stmt.executeQuery(sql)) {

                    while (result.next()) {
                        int id = result.getInt("id");

                        Date dob = result.getDate("dob");
                        int familyId = result.getInt("familyid");

                        user = new User(id, username, password, dob, familyId);
                    }}
        return user;
    }

        }

    
