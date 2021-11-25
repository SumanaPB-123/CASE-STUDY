package com.example.demo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DbConnection {
	Connection connection;

	public Connection getConnection() {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","admin@123");
			
		}
		catch (ClassNotFoundException e)
		{
			 e.printStackTrace();
		}
		catch(SQLException e1)
		{
			 e1.printStackTrace();
		}
		return connection;
	}
	public void closeConnection() {
		try
		{
			if(connection != null)
			{
				connection.close();
			}
			
		}
		catch(SQLException e3)
		{
			e3.printStackTrace();
		}
	}
	

	}


