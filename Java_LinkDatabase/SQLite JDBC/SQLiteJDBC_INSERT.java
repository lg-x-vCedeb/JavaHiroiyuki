//Insert operation
import java.lang.*;
import java.sql.*;

public class SQLiteJDBC_INSERT {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO RECIPE (RecipeID,RecipeName,Quantity,Unit)" +
                         "VALUES (1,'Gin',600,'ml');";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO RECIPE (RecipeID,RecipeName,Quantity,Unit)" +
                         "VALUES (2,'Sherry',520,'ml');";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}
