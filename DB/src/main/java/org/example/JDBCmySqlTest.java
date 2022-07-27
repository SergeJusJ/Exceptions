package org.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCmySqlTest {


    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/world?characterEncoding=utf8";
        String user = "root";
        Connection con;
        Statement stmt;
        ResultSet rs;



        String query = "SELECT * FROM classicmodels.orders LIMIT 0,10;";

        try {

            Properties props = new Properties();
            FileInputStream in = new FileInputStream("C:\\Users\\MARTIN\\IdeaProjects\\Exceptions\\DB\\src\\main\\resources\\db.properties");
            props.load(in);
            String password = props.getProperty("db.password") ;


            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

           // while (rs.next()) {
            rs.next();
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            //}

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
