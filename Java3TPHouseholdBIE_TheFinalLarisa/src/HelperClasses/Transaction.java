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

    public int getCategoryId(String categoryName) {
        this.categoryId=db.getCategoryId(categoryName);
        return categoryId;
    }
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
  public Transaction(int userId){
      this.userId=userId;
      
  }

  @Override
  public String toString() {
    // user's name instead of userId?, category name for categoryId?
    return "Transaction{" + "id=" + id + ", userId=" + userId + ", categoryId="
            + categoryId + ", amount=" + amount + ", transDate=" + transDate + '}';
  }

  public ArrayList<Transaction> getAll() {
    ArrayList<Transaction> list;
    return list=db.getAllTransactions();
  }
  public BigDecimal getAllGeneralExpenses(int userId) {
    BigDecimal amount=null;
    return amount=db.getAllGeneralExpenses(userId,1);
  }
  public BigDecimal getAllGeneralIncome(int userId) {
    BigDecimal amount=null;
    return amount=db.getAllGeneralIncome(userId,1);
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

  
}
