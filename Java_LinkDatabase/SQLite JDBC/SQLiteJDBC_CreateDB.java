//Connect to a existing database or create one if it's not existing
import java.lang.*;
import java.sql.*;

public class SQLiteJDBC_CreateDB
{
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.sqlite.JDBC"); //Load Driver * class.forName("Company name.Database name.Driver name")
            c = DriverManager.getConnection("jdbc:sqlite:test.db"); //The url format for sqlite-jdbc-3.27.2.1.jar: "jdbc:sqlite:<database name>"
        } catch (Exception e ) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
