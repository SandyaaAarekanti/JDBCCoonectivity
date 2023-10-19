package com.example.jdbc;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Studentdao std=new Studentdao();
		std.getAllrecords();
      std.deleteStudent(2);
	}

}
