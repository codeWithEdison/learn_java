package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    static final String DB_URL = "jdbc:mysql://localhost:5050/Assignment";
    static final String USER = "root";
    static final String PASS = "971040";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();
            String query = "INSERT INTO User (FirstName, LastName, Email, Tel, Username, Password, Gender, UserType, Photo_Id) " +
                    "VALUES ('edison', 'kvn', 'edsnkvn@gmail.com', '1234567890', 'johnny', 'password1', 'Male', 'Regular', 'photo1.jpg')";
            int rowsAffected = st.executeUpdate(query);
            System.out.println(rowsAffected + " row(s) inserted successfully.");

            // Close resources
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
