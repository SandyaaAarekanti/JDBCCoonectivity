package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdao {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/db";
	private String username="root";
	private String password="pass123";
	
	public void getAllrecords() throws ClassNotFoundException, SQLException
	{
		System.out.println("inserted");
		//load the driver
		Class.forName(driver);
		
		//get the connection
		Connection con=DriverManager.getConnection(url,username,password);
		
		// execute query
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select *from db.student");
		while(rs.next()) {
			int studentId=rs.getInt(1);
			String studentname=rs.getNString(2);
			double hostelfee=rs.getDouble(3);
			String foodtype=rs.getNString(4);
			System.out.println(studentId+" "+studentname+" "+hostelfee+" "+foodtype);
		

			
		}
	}
		
		public void deleteStudent(int studentId) throws SQLException, ClassNotFoundException {
			//load the driver
			Class.forName(driver);
			
			//get the connection
			Connection con=DriverManager.getConnection(url,username,password);
			
			// execute query
			Statement smt=con.createStatement();
			smt.executeUpdate("delete from db.student where studentId="+studentId);
			System.out.println("deleted");
			
		}
		
		
	}

