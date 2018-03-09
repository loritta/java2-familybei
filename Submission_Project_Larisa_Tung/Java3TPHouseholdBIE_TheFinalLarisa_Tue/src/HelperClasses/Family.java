package HelperClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Family {

    /**
     * @return the familyCode
     */
    public String getFamilyCode() {
        return familyCode;
    }

    /**
     * @param familyCode the familyCode to set
     */
    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    private int id;
    private String name;
    private String familyCode;

    public Family(int id, String name, String familyCode) {
        this.id = id;
        this.name = name;
        this.familyCode=familyCode;
    }

    @Override
    public String toString() {
        return "#" + id + ": Family " + name;
    }

    public String insert() {
        Database db = new Database();
        //we need to check if a family with the same name exists and and the memebers to it. 
        //Normaly it should be another dialog with the user but I would skip it.
        // it can e checked by a Family password
        String sql = "INSERT INTO family(name, familycode) VALUES(?, ?)";
        String msg = "";
        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, familyCode);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            msg = e.getMessage();
            System.out.println(e.getMessage());
        }
        return msg;
    }
    public void deleteId() {
    Database db = new Database();
    String sql = "DELETE from family where id = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
    public void deleteName() {
    Database db = new Database();
    String sql = "DELETE from family where name = ?";

    try (Connection conn = db.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, name);
      pstmt.executeUpdate();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
