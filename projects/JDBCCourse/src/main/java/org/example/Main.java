package org.example;

import java.sql.*;

public class Main {
    static void main() throws ClassNotFoundException, SQLException {
        /*
            1. import package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7. close
         */

        String url = "jdbc:postgresql://localhost:5433/jdbc_demo";
        String username = "postgres";
        String password = "0000";
        String query = "select sname from student where sid=1";

//        not needed now
//        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to database successfully");

        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while (resultSet.next()) {
            String sname = resultSet.getString("sname");
            System.out.println(sname);
        }

        stmt.close();
        conn.close();
        System.out.println("Connection closed successfully");
    }
}
