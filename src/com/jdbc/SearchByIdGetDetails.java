package com.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class SearchByIdGetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL="jdbc:mysql://localhost:3306/mydata97r";
		String username="root";
		String password="Anithasivalasetty@2005";
		String query = "Select * from student where id = ?";
		try {
			Connection connection= DriverManager.getConnection(URL,username,password);
		PreparedStatement ps= connection.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = Integer.parseInt(sc.nextLine());
		ps.setInt(1,id);
		ResultSet rs= ps.executeQuery();
		if(rs.next()){
			 System.out.println("\nStudent Details:");
             System.out.println("ID: " + rs.getInt("id"));
             System.out.println("Name: " + rs.getString("name"));
             System.out.println("Marks: " + rs.getInt("marks"));
             System.out.println("Age: " + rs.getInt("age"));

         } else {
             System.out.println("No student found with ID: " + id);
         }
		connection.close();
         rs.close();
         ps.close();
         
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
