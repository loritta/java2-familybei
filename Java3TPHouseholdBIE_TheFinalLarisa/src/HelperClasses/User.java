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
    Database db=new Database();
  private int id;
  private String name;
  private String password;
  private Date dob;
  private int familyId;

  public User(int id, String name, String password, Date dob, String familyName) throws SQLException {
    this.id = id;
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
  
  public User(int familyId, String name) {
  this.familyId = familyId;
  this.name = name;
  }

  public int getId() {
    return id;
  }
  
  @Override
  public String toString() {
    return "#" + getId() + ", name=" + getName() + ", dob=" + getDob() + ", familyId=" + getFamilyId();
  }
  
  public int getFamilyId(String familyName) throws SQLException {
    return familyId=db.getFamilyId(familyName);
    
  }
  
  public void insert(String name, String password, Date dob, int familyId) throws SQLException {
    db.insertUser(name, password, dob, familyId);
  }
  
  public void delete(int id) {
    db.deleteUser(id);
  }
  
  public void update(int id) throws SQLException {
    db.updateUser(name, password, dob, familyId, id);
  }
  
}
