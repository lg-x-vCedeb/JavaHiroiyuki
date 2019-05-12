//Select operation
import java.lang.*;
import java.sql.*;

public class SQLiteJDBC_SELECT {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);//Set false to use conn.commit() manually commit update (Here Select operation don't need conn.commit())
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM RECIPE;");
            while(rs.next()){
                int RecipeID = rs.getInt("RecipeID");
                String RecipeName = rs.getString("RecipeName");
                double Quantity = rs.getDouble("Quantity");
                String Unit = rs.getString("Unit");

                System.out.println("RecipeID = " + RecipeID);
                System.out.println("RecipeName = " + RecipeName);
                System.out.println("Quantity = " + Quantity);
                System.out.println("Unit = " + Unit);
                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();
        } catch(Exception e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
