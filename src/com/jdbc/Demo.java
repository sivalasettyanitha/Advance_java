package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL="jdbc:mysql://localhost:3306/mydata97r";
		String username="root";
		String password ="Anithasivalasetty@2005";
		String query = "insert into student values(103,'Anusha',80,21)";
		//String query = "update student set age = 18 where id = 101";
		//String query = "delete from student where id = 102";
		//stage 1
		try {
		Connection connection=	DriverManager.getConnection(URL,username,password);
			//stage 2
	Statement st = 	connection.createStatement();
			
			//stage 3
	int rows = st.executeUpdate(query);
			
			System.out.println(rows+" Inserted....");
		//stage 5
	connection.close();
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}