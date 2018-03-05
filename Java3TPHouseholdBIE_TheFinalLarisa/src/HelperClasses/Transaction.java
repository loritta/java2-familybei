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
    this.categoryId = db.getCategoryId(categoryName);
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

  public Transaction(int userId) {
    this.userId = userId;

  }

  @Override
  public String toString() {
    // user's name instead of userId?, category name for categoryId?
    return "Transaction{" + "id=" + id + ", userId=" + userId + ", categoryId="
            + categoryId + ", amount=" + amount + ", transDate=" + transDate + '}';
  }

  public ArrayList<Transaction> getAll() {
    ArrayList<Transaction> list;
    return list = db.getAllTransactions();
  }

  public BigDecimal getAllGeneralExpenses(int userId) {
    BigDecimal amount = null;
    return amount = db.getAllGeneralExpenses(userId, 1);
  }

  public BigDecimal getAllGeneralIncome(int userId) {
    BigDecimal amount = null;
    return amount = db.getAllGeneralIncome(userId, 1);
  }
}
