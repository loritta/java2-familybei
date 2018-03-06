package HelperClasses;

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
import java.util.Collections;
import javax.swing.JOptionPane;

public class Database {

  //for Larisa
  private final static String HOSTNAME = "den1.mysql6.gear.host";
  private final static String DBNAME = "myjac";
  private final static String USERNAME = "myjac";
  private final static String PASSWORD = "Yt6wOA_!6byy";
  public static final String DATE_FORMAT_SQL = "yyyy/MM/dd";
  //for Tung
//  private final static String HOSTNAME = "den1.mysql6.gear.host";
//  private final static String DBNAME = "familybei";
//  private final static String USERNAME = "familybei";
//  private final static String PASSWORD = "tp%ipd12";
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
    String sql = "SELECT * FROM transactions WHERE userid='" + id + "' and Month(transdate)=MONTH(NOW())";
    String msg = "empty";
    Timestamp transDate = null;

    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        transDate = result.getTimestamp("transdate");
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }

    if (transDate != null) {
      msg = "not empty";
    }
    return msg;
  }

  public void insertUser(String name, String password, Date dob, int familyId)
          throws SQLException {
    String sql = "INSERT INTO users(name, password, dob, familyId) VALUES(?,?,?,?)";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name);
      pstmt.setString(2, password);
      pstmt.setDate(3, dob);
      pstmt.setInt(4, familyId);

      pstmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "Registered successfully.");
    }
  }

  /*public String userExists(String username, int familyid, String familyCode){
       String sql = "select * from users where name = ? and familyid = ? ";
    String msg = "";
    ArrayList<User> accounts=new ArrayList<User>();
    ArrayList<User> accounts2=new ArrayList<User>();
    try {
      pst = conn.prepareStatement(sql);
      pst.setString(1, username);
      pst.setInt(2, familyid);
      
      rs = pst.executeQuery();
      while (rs.next()) {
          accounts.add(new User(familyid, username));
      }
      accounts2.addAll(accounts);
      Collections.reverse(accounts2);
      for (User itemA : accounts) {
    accounts2.remove(accounts2.size()-1);
        for (User itemZ : accounts2) {
        if (())
    }
}
        JOptionPane.showMessageDialog(null, "Invalid username and password");
      
    } catch (SQLException | NullPointerException e) {
      JOptionPane.showMessageDialog(null,
              "Error connecting to database: " + e.getMessage(),
              "Database error",
              JOptionPane.ERROR_MESSAGE);
    }
    return msg;
      
  }*/
  public void deleteUser(int id) {
    String sql = "DELETE from users where id = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }

  public void updateUser(String name, String password, Date dob, int familyId, int id)
          throws SQLException {
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
    }
  }

  public int getFamilyId(String familyName) throws SQLException {
    String sql = "select id from family where name = '" + familyName + "' limit 1";
    int familyId = 0;
    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
        familyId = result.getInt("id");
      }
    }
    return familyId;
  }

  public int getCategoryId(String categoryName) throws SQLException {
    String sql = "select id from category where name = '" + categoryName + "'";
    int categoryId = 0;
    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
        categoryId = result.getInt("id");
      }
    }
    return categoryId;
  }

  public ArrayList<User> getDatabaseFamilyMembersName(int familyId)
          throws SQLException {
    String sql = "SELECT * FROM users WHERE familyid='" + familyId + "'";
    User userOfFamily;
    ArrayList<User> usersOfFamily=new ArrayList<>();

    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        String name = result.getString("name");
        int id=result.getInt("userid");
        userOfFamily=new User(id, name);
        usersOfFamily.add(userOfFamily);
      }
    }
    return usersOfFamily;
  }
  
 
  

  public ArrayList<Transaction> getAllTransactions() throws SQLException {
    String sql = "SELECT * FROM transactions";
    ArrayList<Transaction> list = new ArrayList<>();
    int id;
    int userId;
    int categoryId;
    BigDecimal amount;
    Timestamp transDate;
    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        id = result.getInt("id");
        userId = result.getInt("userId");
        categoryId = result.getInt("categoryId");
        amount = result.getBigDecimal("amount");
        transDate = result.getTimestamp("transDate");

        Transaction trans = new Transaction(id, userId, categoryId, amount, transDate);
        list.add(trans);
      }
    }
    return list;
  }

  public BigDecimal getAllGeneralExpenses(int userId, int categoryId) throws SQLException {
    String sql = "SELECT sum(amount) FROM transactions where userid='" + userId
            + "' and Month(transdate)=MONTH(NOW()) and categoryid<>'" + categoryId + "'";

    BigDecimal amount = null;

    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        amount = result.getBigDecimal("sum(amount)");
      }
    }
    if (amount == null) {
      amount = BigDecimal.valueOf(0);
    } else {
      amount = amount;
    }
    return amount;
  }

  public BigDecimal getAllGeneralIncome(int userId, int categoryId) throws SQLException {
    String sql = "SELECT amount FROM transactions where userid='" + userId
            + "' and Month(transdate)=MONTH(NOW()) and categoryid='" + categoryId + "'";

    BigDecimal amount = null;

    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        amount = result.getBigDecimal("amount");
      }
    }
    if (amount == null) {
      amount = BigDecimal.valueOf(0);
    } else {
      amount = amount;
    }
    return amount;
  }

  public BigDecimal getAllGeneralBudget(int userId, int categoryId)
          throws SQLException {
    String sql = "SELECT amount FROM budget where userid='" + userId
            + "' and Month(monthofyear)=MONTH(NOW()) and budgetcatid<>'" + categoryId + "'";

    BigDecimal amount = null;

    try (Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {

      while (result.next()) {
        amount = result.getBigDecimal("amount");
      }
    }
    if (amount == null) {
      amount = BigDecimal.valueOf(0);
    } else {
      amount = amount;
    }
    return amount;
  }

  public void insertTransaction(int userId, int categoryId, BigDecimal amount)
          throws SQLException {
    String sql = "INSERT INTO transactions(userId, categoryId, amount) "
            + "VALUES(?,?,?)";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, userId);
      pstmt.setInt(2, categoryId);
      pstmt.setBigDecimal(3, amount);

      pstmt.executeUpdate();
    }
  }

  public void deleteTransaction(int id) throws SQLException {
    String sql = "DELETE from transactions where id = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    }
  }

  public void updateTransaction(int userId, int categoryId, BigDecimal amount,
          Timestamp transDate, int id) throws SQLException {
    String sql = "update transactions set "
            + "userId = ?,\n"
            + "categoryId = ?,\n"
            + "amount = ?,"
            + "transDate = ?\n"
            + "where id = ?;";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, userId);
      pstmt.setInt(2, categoryId);
      pstmt.setBigDecimal(3, amount);
      pstmt.setTimestamp(4, transDate);
      pstmt.setInt(5, id);
      pstmt.executeUpdate();
    }
  }
}


