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

public class BudgetsMonthly {
      int id;
    int userId;
    int budgetMonthlyByCatId;
    String catName;
    BigDecimal amount;
    Timestamp monthOfYear;
    Database db = new Database();

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

    public int getBudgetMonthlyByCatId() {
        return budgetMonthlyByCatId;
    }

    public void setBudgetMonthlyByCatId(int budgetMonthlyByCatId) {
        this.budgetMonthlyByCatId = budgetMonthlyByCatId;
    }
  

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(Timestamp monthOfYear) {
        this.monthOfYear = monthOfYear;
    }
    

    public BudgetsMonthly(int id, int userId, String catName, BigDecimal amount, Timestamp monthOfYear) {
        this.id = id;
        this.userId = userId;
        this.catName = catName;
        this.amount = amount;
        this.monthOfYear = monthOfYear;
    }

    public BudgetsMonthly(int id, int userId, int budgetMonthlyByCatId, BigDecimal amount, Timestamp monthOfYear) {
        this.id = id;
        this.userId = userId;
        this.budgetMonthlyByCatId = budgetMonthlyByCatId;
        this.amount = amount;
        this.monthOfYear = monthOfYear;
    }

    public BudgetsMonthly(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        // change userId, budgetMonthlyByCatId?
        return "Budget{"
                + "id=" + id
                + ", userId=" + userId
                + ", amount=" + amount
                + ", monthOfYear=" + monthOfYear
                + ", catName='" + catName + '\''
                + '}';
    }

//  public ArrayList<BudgetsMonthly> getAll() {
//    String sql = "SELECT * FROM budgetsMonthly";
//    ArrayList<BudgetsMonthly> list = new ArrayList<>();
//
//    try (Connection conn = db.connect();
//          Statement stmt = conn.createStatement();
//          ResultSet result = stmt.executeQuery(sql)) {
//      
//      while (result.next()) {
//        int id = result.getInt("id");
//        int userId = result.getInt("userId");
//        int budgetMonthlyByCatId = result.getInt("budgetMonthlyByCatId");
//        BigDecimal amount = result.getBigDecimal("amount");
//        Date monthOfYear = result.getDate("monthOfYear");
//
//        BudgetsMonthly bm = new BudgetsMonthly(id, userId, budgetMonthlyByCatId, amount, monthOfYear);
//        list.add(bm);
//      }
//    }
//    catch (SQLException ex) {
//      System.out.println(ex.getMessage());
//    }
//    return list;
//  }
    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        String sql = "select sum(amount) as total\n"
                + "from budgetMonthlyByCats\n"
                + "where id = " + budgetMonthlyByCatId;
        try (Connection conn = db.connect();
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery(sql)) {
            if (result.next()) {
                total = result.getBigDecimal("total");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return total;
    }

    public void insert() {
        String sql = "INSERT INTO budgetsMonthly(userId, budgetsMonthlyByCatId, amount, monthOfYear)"
                + " VALUES(?,?,?,?)";

        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setInt(2, budgetMonthlyByCatId);
            pstmt.setBigDecimal(3, amount);
            pstmt.setTimestamp(4, monthOfYear);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete() {
        String sql = "DELETE from budgetsMonthly where id = ?";

        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update() {
        String sql = "update budgetsMonthly set "
                + "userId = ?,\n"
                + "budgetMonthlyByCatId = ?,\n"
                + "amount = ?,\n"
                + "monthOfYear = ?\n"
                + "where id = ?;";
        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setInt(2, budgetMonthlyByCatId);
            pstmt.setBigDecimal(3, amount);
            pstmt.setTimestamp(4, monthOfYear);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public BigDecimal getAllGeneralBudget(int userId) throws SQLException {
        BigDecimal amount = null;
        return amount = db.getAllGeneralBudget(userId, 5, 6);
    }

    public String getCategoryName(int catId) throws SQLException {
        String catName;
        return catName = db.getCatNameBudget(catId);

    }
}
