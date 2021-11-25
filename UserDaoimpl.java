package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.impl.DbConnection;
import com.example.demo.User;
import com.example.demo.UserInterface;

@Component
public class UserDaoimpl implements UserInterface {
	
	@Autowired
	DbConnection db;
	@Autowired 
	User user=null;
	int row=0;
	public int addUser(User user) {
		try {
			 PreparedStatement ps = db.getConnection().prepareStatement("Insert into USER values(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,user.getUSER_ID());
			 ps.setString(2, user.getUSERNAME());
			 ps.setString(3, user.getEMAIL());
			 ps.setString(4, user.getFIRST_NAME());
			 ps.setString(5,user.getLAST_NAME());
			 ps.setString(6, user.getROLE());
			 ps.setLong(7, user.getCONTACT_NUMBER());
			 ps.setBoolean(8, user.getIS_ACTIVE());
			 ps.setString(9, user.getDOB());
			 ps.setString(10, user.getCREATED_ON());
			 
			 row = ps.executeUpdate();
			 db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		
		return row;
		
		
		
	}

}
