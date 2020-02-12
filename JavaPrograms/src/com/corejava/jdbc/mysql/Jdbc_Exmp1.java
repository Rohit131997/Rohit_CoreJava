package com.corejava.jdbc.mysql;

//Program of connecting the core java to MySql database


import com.corejava.util.MyLogger;
//Step 1: importing the package (java.sql.*;)
import java.sql.*;


public class Jdbc_Exmp1 {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {

            String url = "jdbc:mysql://localhost:3306/database";
            String username = "root";
            String password = "Rohit@1997";
            String query;
            query = "SELECT * FROM database.employee_info where emp_id=101;";

            //Step 2: loading and registering the driver
            //registering the driver with forName method
            Class.forName("com.mysql.jdbc.Driver");

            //establishing the connection with interface "Connection"
            Connection con = DriverManager.getConnection(url, username, password);

            //creating the statement
            Statement st = con.createStatement();

            //processing the results
            ResultSet rs = st.executeQuery(query);

            rs.next();
            String name = rs.getString("emp_name");
            int age = rs.getInt("emp_age");

            MyLogger.consoleLogger.info(name);
            MyLogger.consoleLogger.info(age);

            //closing the Connection and Statement
            st.close();
            con.close();


        }

    }


