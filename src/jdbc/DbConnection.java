package jdbc;

import java.sql.*;
import java.sql.Connection;

public class DbConnection {
        static final String DB_URL = "jdbc:mysql://localhost:5050/Assignment";
        static final String USER =  "root";
        static final String PASS =  "971040";
        static final String QUERY = " select * from user";

    public static void main(String[] args) {
    try {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st =  conn.createStatement();
        ResultSet rs=  st.executeQuery(QUERY);


        while (rs.next()){
            System.out.println("name: " + rs.getString("FirstName"));
        }
    } catch (SQLException e){
        e.printStackTrace();
    }

    }
}

