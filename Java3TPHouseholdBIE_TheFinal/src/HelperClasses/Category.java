package HelperClasses;


import HelperClasses.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Category {
  int id;
  Cat name;
  
  Database db = new Database();
  
  public enum Cat {
    Income, GeneralExpenses, Food, Chemicals, Car, House, Other
  }

  public Category(int id, Cat name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Category{" + "id=" + id + ", category=" + name + '}';
  }
  
  public void insert() {
    String sql = "INSERT INTO categories(name) VALUES(?)";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name + "");
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void delete() {
    String sql = "DELETE from categories where id = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  public void update() {
    String sql = "update categories set "
            + "name = ?,\n"
            + "where id = ?;";
    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name + "");
      pstmt.setInt(2, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
