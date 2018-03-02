package HelperClasses;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Transaction {
  int id;
  int userId;
  int categoryId;
  private String category;
  BigDecimal amount;
  Timestamp transDate;
  
  Database db = new Database();

  public Transaction(int id, int userId, BigDecimal amount, Timestamp transDate, String category) {
    this.id = id;
    this.userId = userId;
    this.categoryId = getCategoryId(category);
    this.amount = amount;
    this.transDate = transDate;
  }
  public Transaction(int id, int userId, int categoryId, BigDecimal amount, Timestamp transDate) {
    this.id = id;
    this.userId = userId;
    this.categoryId = categoryId;
    this.amount = amount;
    this.transDate = transDate;
  }
  @Override
  public String toString() {
    // user's name instead of userId?, category name for categoryId?
    return "Transaction{" + "id=" + id + ", userId=" + userId + ", categoryId=" 
          + categoryId + ", amount=" + amount + ", transDate=" + transDate + '}';
  }
  
  public ArrayList<Transaction> getAll() {
    String sql = "SELECT * FROM transactions";
    ArrayList<Transaction> list = new ArrayList<>();

    try (Connection conn = db.connect();
          Statement stmt = conn.createStatement();
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
    catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    return list;
  }
  
  public void insert() {
    String sql = "INSERT INTO transactions(userId, categoryId, amount, transDate) "
            + "VALUES(?,?,?,?)";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, userId);
      pstmt.setInt(2, categoryId);
      pstmt.setBigDecimal(3, amount);
      pstmt.setTimestamp(4, transDate);
      
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void delete() {
    String sql = "DELETE from transactions where id = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  public void update() {
    String sql = "update transactions set "
            + "userId = ?,\n"
            + "categoryId = ?,\n"
            + "amount = ?,"
            + "transDate = ?\n"
            + "where id = ?;";
    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, userId);
      pstmt.setInt(2, categoryId);
      pstmt.setBigDecimal(3, amount);
      pstmt.setTimestamp(4, transDate);
      pstmt.setInt(5, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
  public int getCategoryId(String catName) {
    String sql = "select id from category where name = '" + catName + "' limit 1";
        int catId=0;
    try (Connection conn = db.connect();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) {
      if (result.next()) {
          catId = result.getInt("id");      
          System.out.println(getCategoryId(catName));
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
    
    return catId ;
  }
}
