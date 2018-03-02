package BIE;



import HelperClasses.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
  
  public static void main(String[] args) {
    SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
    Date utilDate = new Date();
    try {
      utilDate = df.parse("12/8/2011");
    } catch (ParseException ex) {
      Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
    }
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
//    Category c = new Category(0, Category.Cat.valueOf("Electricity"));
//    c.insert();

//      Transaction t = new Transaction(0, 5, 2, new BigDecimal(245.75), null);
//      t.insert();
//      System.out.println(t.getAll());

//    BudgetMonthlyByCat bmbc = new BudgetMonthlyByCat(2, 1, new BigDecimal(180));
//    bmbc.insert();
//    System.out.println(bmbc.getAll());

//    BudgetsMonthly bm = new BudgetsMonthly(0, 4, 4, new BigDecimal(1250.75), sqlDate);
//    bm.insert();
//    System.out.println(bm.getTotal());

  }
}
