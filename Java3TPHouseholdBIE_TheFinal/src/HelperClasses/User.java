package HelperClasses;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;


public class User {

    /**
     * @return the familyId
     */
    
    Database db = new Database();
  private int id;
  private String name;
  private String family;
  private String password;
  private Date dob;
  private int familyId;
  

  public User(int id, String name, String password, Date dob, String family) {
    setId(id);
    this.name = name;
    this.password = password;
    this.dob = dob;
    this.familyId = getFamilyId(family);
  }
  public User(int id, String name, String password, Date dob, int familyId) {
    setId(id);
    this.name = name;
    this.password = password;
    this.dob = dob;
      setFamilyId(familyId);
  }
  
  public User(){
      
  }

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
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


  

  @Override
  public String toString() {
    return "#" + getId() + ", name=" + getName() + ", dob=" + getDob() + ", familyId=" + getFamilyId();
  }
  
  public int getFamilyId(String familyName) {
    String sql = "select id from family where name = '" + familyName + "' limit 1";
        int familyId=0;
    try (Connection conn = db.connect();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
          familyId = result.getInt("id");      
          System.out.println(getFamilyId(familyName));
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    
    return familyId ;
  }
  
  public String insertUser() {
      
    String sql = "INSERT INTO users(name, password, dob, familyid) VALUES(?,?,?,?)";
    String msg="";
   
    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, getName());
      pstmt.setString(2, getPassword());
      pstmt.setDate(3, getDob());
      pstmt.setInt(4, getFamilyId());
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
       msg=e.getMessage();
      System.out.println(e.getMessage());
    }
    return msg;
  }
 /* public String insertFamily() {
      
    String sql = "INSERT INTO family(name) VALUES(?)";
String msg="";
    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      
      pstmt.setString(1, family);
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
        msg=e.getMessage();
      System.out.println(e.getMessage());
    }
    return msg;
  }*/
  
  public void delete() {
    String sql = "DELETE from users where id = ?";

    try (Connection conn = db.connect();
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
    try (Connection conn = db.connect();
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
}
