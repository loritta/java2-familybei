package HelperClasses;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BudgetMonthlyByCat {
  int id;
  int categoryId;
  BigDecimal amount;
  
  
    Database db = new Database();


  public BudgetMonthlyByCat(int id, int categoryId, BigDecimal amount) {
    this.id = id;
    this.categoryId = categoryId;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "BudgetMonthlyByCat{" + "id=" + id + ", categoryId=" + categoryId + ", amount=" + amount + '}';
  }
  
  public ArrayList<BudgetMonthlyByCat> getAll() {
    String sql = "SELECT * FROM budgetMonthlyByCats";
    ArrayList<BudgetMonthlyByCat> list = new ArrayList<>();

    try (Connection conn = db.connect();
          Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(sql)) {
      
      while (result.next()) {
        int id = result.getInt("id");
        int categoryId = result.getInt("categoryId");
        BigDecimal amount = result.getBigDecimal("amount");

        BudgetMonthlyByCat bmbc = new BudgetMonthlyByCat(id, categoryId, amount);
        list.add(bmbc);
      }
    }
    catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return list;
  }
  
  public void insert() {
    String sql = "INSERT INTO budgetMonthlyByCats(categoryId, amount) VALUES(?,?)";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, categoryId);
      pstmt.setBigDecimal(2, amount);
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void delete() {
    String sql = "DELETE from budgetMonthlyByCats where id = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  public void update() {
    String sql = "update budgetMonthlyByCats set "
            + "categoryId = ?,\n"
            + "amount = ?"
            + "where id = ?;";
    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, categoryId);
      pstmt.setBigDecimal(2, amount);
      pstmt.setInt(2, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
