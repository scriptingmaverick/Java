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
        String selectQuery = "select * from student;";
//        String insertQuery = "insert into student values (3, 'liyaz', 90);";
        String updateQuery = "update student set marks = ? where sid = 3";

//        not needed now
//        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to database successfully");

        PreparedStatement pstmt = conn.prepareStatement(updateQuery);

        pstmt.setInt(1, 99);
        pstmt.executeUpdate();

        System.out.println("Updated successfully");

        Statement stmt = conn.createStatement();
//        stmt.execute(insertQuery);
        ResultSet resultSet = stmt.executeQuery(selectQuery);
        while (resultSet.next()) {
            String sname = resultSet.getString("sname");
            System.out.println(sname);
        }

        stmt.close();
        pstmt.close();
        conn.close();
        System.out.println("Connection closed successfully");
    }
}
