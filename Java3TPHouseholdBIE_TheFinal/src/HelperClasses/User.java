package HelperClasses;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class User {

    /**
     * @return the db
     */
    public Database getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(Database db) {
        this.db = db;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the familyId
     */
    public int getFamilyId() {
        return familyId;
    }

    /**
     * @param familyId the familyId to set
     */
    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }
  private Database db = new Database();
  private int id;
  private String name;
  private String password;
  private Date dob;
  private int familyId;

  public User(String name, String password, Date dob, String familyName) {
    this.name = name;
    this.password = password;
    this.dob = dob;
    this.familyId = getFamilyId(familyName);
  }
  
  public User(int id, String name, String password, Date dob, int familyId) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.dob = dob;
    this.familyId = familyId;
  }
  
  public User() {}

  public int getId() {
    String sql = "select id from users where name = '" + name + "' limit 1";
    int userId = 0;
    try (Connection conn = getDb().connect();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
        userId = result.getInt("id");
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return userId;
  }
  
  @Override
  public String toString() {
    return "#" + getId() + ", name=" + getName() + ", dob=" + getDob() + ", familyId=" + getFamilyId();
  }
  
  public int getFamilyId(String familyName) {
    String sql = "select id from family where name = '" + familyName + "' limit 1";
    int familyId = 0;
    try (Connection conn = getDb().connect();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
        familyId = result.getInt("id");
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return familyId;
  }
  
  public void insert() {
    String sql = "INSERT INTO users(name, password, dob, familyId) VALUES(?,?,?,?)";

    try (Connection conn = getDb().connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, getName());
      pstmt.setString(2, getPassword());
      pstmt.setDate(3, getDob());
      pstmt.setInt(4, getFamilyId());
      
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
  
  public void delete() {
    String sql = "DELETE from users where id = ?";

    try (Connection conn = getDb().connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, getId());
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  public void update() {
    String sql = "update users set "
            + "name = ?,\n"
            + "password = ?,\n"
            + "dob = ?,"
            + "familyId = ?\n"
            + "where id = ?;";
    try (Connection conn = getDb().connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, getName());
      pstmt.setString(2, getPassword());
      pstmt.setDate(3, getDob());
      pstmt.setInt(4, getFamilyId());
      pstmt.setInt(5, getId());
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
