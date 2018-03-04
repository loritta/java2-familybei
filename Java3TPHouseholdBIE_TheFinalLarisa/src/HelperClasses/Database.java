package HelperClasses;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
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
import java.util.ArrayList;
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
  private final static String PASSWORD = "tp%ipd12";*/
  //correct password tp%ipd12 removed one letter to test
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
        System.out.println("connecting");
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
      } else {
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
  public User createUserObject(String password, String username) throws SQLException {
    String sql = "SELECT id, dob, familyid FROM users WHERE name = '" + username + "' and password ='" + password + "'";
    int id = 0;
    Date dob = null;
    int familyId = 0;

    try (Statement stmt = conn.createStatement();
            ResultSet result = (ResultSet) stmt.executeQuery(sql)) {
      while (result.next()) {
        id = result.getInt("id");
        dob = result.getDate("dob");
        familyId = result.getInt("familyid");
        System.out.println(familyId);
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }

    User user = new User(id, username, password, dob, familyId);

    return user;
  }

  public static Timestamp nowSQL() {
    Calendar cal = Calendar.getInstance();
    java.util.Date now = cal.getTime();
    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
    return currentTimestamp;
  }

  public Date strToDate(String str) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_SQL);
    Date sqlDate = new Date(Calendar.getInstance().getTime().getTime());
    try {
      java.util.Date utilDate = sdf.parse(str);
      sqlDate = new Date(utilDate.getTime());
    } catch (ParseException ex) {
      System.out.println(ex.getMessage());
    }
    return sqlDate;
  }
  public String transactionHistoryAvailable(int id) throws SQLException {
        String sql = "SELECT * FROM transactions WHERE userid='"+id+"' and Month(transdate)=MONTH(NOW())";
    String msg="empty";
    Timestamp transDate=null;
      
    try (Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(sql)) {
      
      while (result.next()) {
        transDate=result.getTimestamp("transdate");
      }
    }
    catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
      
    if(transDate!=null)
    {
        msg="not empty";
    }
    return msg;
    }
  
  public void insertUser(String name, String password, Date dob, int familyId) {
    String sql = "INSERT INTO users(name, password, dob, familyId) VALUES(?,?,?,?)";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name);
      pstmt.setString(2, password);
      pstmt.setDate(3, dob);
      pstmt.setInt(4, familyId);
      
      pstmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "Registered successfully.");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      JOptionPane.showMessageDialog(null, 
              "Inserting error\n" + e.getMessage(),
              "Error insert into table",
              JOptionPane.ERROR_MESSAGE);
    }
  }
    
    public void deleteUser(int id) {
    String sql = "DELETE from users where id = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
    public void updateUser(String name, String password, Date dob, int familyId, int id) {
    String sql = "update users set "
            + "name = ?,\n"
            + "password = ?,\n"
            + "dob = ?,"
            + "familyId = ?\n"
            + "where id = ?;";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name);
      pstmt.setString(2, password);
      pstmt.setDate(3, dob);
      pstmt.setInt(4, familyId);
      pstmt.setInt(5, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
    public int getFamilyId(String familyName) {
    String sql = "select id from family where name = '" + familyName + "' limit 1";
    int familyId = 0;
    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
        familyId = result.getInt("id");
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return familyId;
  }
    public ArrayList<String> getDatabaseFamilyMembersName(int familyId) {
    String sql = "SELECT * FROM users WHERE familyid='"+familyId+"'";
    ArrayList<String> list = new ArrayList<>();

    try (   Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        String name = result.getString("name");
        
        list.add(name);
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return list;
  } 
  }
 

