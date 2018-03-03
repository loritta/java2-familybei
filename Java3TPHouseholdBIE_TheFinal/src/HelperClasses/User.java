package HelperClasses;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class User {
  Database db = new Database();
  int id;
  String name;
  String password;
  Date dob;
  int familyId;

  public User(int id, String name, String password, Date dob, String familyName) {
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

  public int getId() {
    return id;
  }
  
  @Override
  public String toString() {
    return "#" + id + ", name=" + name + ", dob=" + dob + ", familyId=" + familyId;
  }
  
  public int getFamilyId(String familyName) {
    String sql = "select id from family where name = '" + familyName + "' limit 1";
    int familyId = 0;
    try (Connection conn = db.connect();
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

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
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
  
  public void delete() {
    String sql = "DELETE from users where id = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
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
}
