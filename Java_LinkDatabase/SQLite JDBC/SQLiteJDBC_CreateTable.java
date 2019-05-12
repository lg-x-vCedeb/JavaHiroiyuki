//Create an SQL table RECIPE
import java.lang.*;
import java.sql.*;

public class SQLiteJDBC_CreateTable
{
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try{
            //Connect to the database(test.db)
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");

            //Create an SQL table Recipe
            stmt = c.createStatement();//New a Statement object that sends query instructions to the database
            String sql = "CREATE TABLE RECIPE(" +
                         "RecipeID INT PRIMARY KEY NOT NULL ," +
                         "RecipeName CHAR(50)," +
                         "Quantity   REAL," +
                         "Unit       CHAR(50))";
            stmt.executeUpdate(sql);//Execute operations CREATE, INSERT, SELECT, UPDATE and DELETE. And return an Integer that indicates the number of rows affected.

            //void close():Close the connection to the database and release the occupied JDBC resources
            stmt.close();
            c.close();
        } catch (Exception e ) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}
