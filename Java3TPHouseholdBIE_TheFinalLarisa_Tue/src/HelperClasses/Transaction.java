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
import java.util.List;

public class Transaction {

  int id;
  int userId;
  int categoryId;
  private String category;
  BigDecimal amount;
  Timestamp transDate;

  public int getCategoryId(String categoryName) throws SQLException {
    this.categoryId = db.getCategoryId(categoryName);
    return categoryId;
  }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getTransDate() {
        return transDate;
    }

    public void setTransDate(Timestamp transDate) {
        this.transDate = transDate;
    }

  Database db = new Database();

  public Transaction(int id, int userId, BigDecimal amount, Timestamp transDate, String category) throws SQLException {
    this.id = id;
    this.userId = userId;
    this.category = category;
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

  public Transaction(int userId) {
    this.userId = userId;

  }
  

//  @Override
//  public String toString() {
//    // user's name instead of userId?, category name for categoryId?
//    return "Transaction{" + "id=" + id + ", userId=" + userId + ", categoryId="
//            + categoryId + ", amount=" + amount + ", transDate=" + transDate + '}';
//  }

  public List<Transaction> getAll(int userId) throws SQLException {
    List<Transaction> list;
    return list = db.getAllTransactions(userId);
  }

  public BigDecimal getAllGeneralExpenses(int userId) throws SQLException {
    BigDecimal amount = null;
    return amount = db.getAllGeneralExpenses(userId, 6);
  }

  public BigDecimal getAllGeneralIncome(int userId) throws SQLException {
    BigDecimal amount = null;
    return amount = db.getAllGeneralIncome(userId, 5);
  }
 
  public String getCategoryName(int catId) throws SQLException {
    String catName;
      return catName=db.getCatName(catId);
    
  }
  @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId + 
                ", amount=" + amount + 
                ", transDate=" + transDate +
                ", category='" + category +'\'' +
                '}';
    }
}
