package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcResultSet {
	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata97r";
		String username="root";
		String password ="Anithasivalasetty@2005";
		String query = "select*from student";
		try {
			Connection connection=	DriverManager.getConnection(URL,username,password);
				//stage 2
		Statement st = 	connection.createStatement();
				
				//stage 3
		ResultSet rs = st.executeQuery(query);
				
				//System.out.println(rs+" Inserted....");
				//stage 4
		System.out.println("ID\t name\t marks \t age");
		//rs.next();
		//	int id = 	rs.getInt(1);
		//	System.out.println(id);
		//	String name = rs.getString("name");
		//	System.out.println(name);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int marks = rs.getInt(3);
			int age = rs.getInt(4);
			System.out.println(id+"\t"+name+"\t"+marks+"\t"+age);
			
		}
			//stage 5
		
		connection.close();
		rs.close();
				
				
				
				
				
				
				
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
