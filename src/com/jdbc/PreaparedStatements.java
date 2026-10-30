
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreaparedStatements {

    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost:3306/mydata97r";
        String username = "root";
        String password = "your_password";

        String query = "INSERT INTO student VALUES (?, ?, ?, ?)";

        try {
            Connection connection =
                    DriverManager.getConnection(URL, username, password);

            PreparedStatement ps = connection.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter id:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter marks:");
            int marks = Integer.parseInt(sc.nextLine());

            System.out.println("Enter age:");
            int age = Integer.parseInt(sc.nextLine());

            // Correct parameter mapping
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);
            ps.setInt(4, age);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully.");

            ps.close();
            connection.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
