package org.example;
import lt.vcs.jdbc.Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class JDBCmySqlTest {


    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
        String user = "root";
        Connection con = null;
        Statement stmt;
        ResultSet rs;

        String query = "SELECT * FROM customers";

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
            ArrayList<Customer> customers = new ArrayList<>();

            while (rs.next()) {
           int custNr = rs.getInt("customerNumber");
                String custName = rs.getString(2);
                String custCity = rs.getString("city");
                String custPhoneNr = rs.getString("phone");
                //System.out.println("Customers data  : " + count);
               Customer customer = new Customer(custNr,custName,custPhoneNr,custCity);
                customers.add(customer);
            }
            con.close();
            customers.forEach(System.out::println);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
