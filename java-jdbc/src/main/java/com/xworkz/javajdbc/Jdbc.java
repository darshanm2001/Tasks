package com.xworkz.javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		 
	
	
	String jdbcUrl="jdbc:mysql://localhost:3306/x_workz";
	String userName="root";
	String password="Xworkzodc@123";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated  catch block
		e.printStackTrace();
	}
	System.out.println("Establishing a Connection");
	String query="INSERT INTO location(id, name, city , state, pincode , country) VALUES(01,'rajajinagar','bangalore','karnataka',570010,'india')";
	String query1="INSERT INTO location(id, name, city , state, pincode , country) VALUES(02,'hubballi','Dharwad','karnataka',580020,'india')";
	String query2="INSERT INTO location(id, name, city , state, pincode , country) VALUES(03,'BTM','bangalore','karnataka',575010,'india')";

	try {
		
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		System.out.println("Connection is successfull");
		Statement statement=connection.createStatement();
		statement.execute(query);
		statement.execute(query1);
		statement.execute(query2);
		System.out.println("Data inserted into table");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}  
}
