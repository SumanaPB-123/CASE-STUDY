package com.example.demo.impl;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
int row2=0;
public int addUser(User user) {
try {
PreparedStatement ps = db.getConnection().prepareStatement("Insert into USER values(?,?,?,?,?,?,?,?,?,?,?)");
ps.setInt(1,user.getUSER_ID());
ps.setString(2, user.getPASSWORD());
ps.setString(3, user.getUSERNAME());
ps.setString(4, user.getEMAIL());
ps.setString(5, user.getFIRST_NAME());
ps.setString(6,user.getLAST_NAME());
ps.setLong(7, user.getCONTACT_NUMBER());
ps.setString(8, user.getROLE());
ps.setBoolean(9, user.isIS_ACTIVE());
ps.setString(10, user.getDOB());
ps.setString(11, user.getCREATED_ON());

 row = ps.executeUpdate();
db.closeConnection();
}catch(SQLException e) {System.out.println(e);}

 return row;

 }

 public List<User> getallUser() {
List<User> UserList=new ArrayList<>();
try {
PreparedStatement cs= db.getConnection().prepareStatement("Select* from User");
ResultSet rs= cs.executeQuery();
while(rs.next()) {
User u=new User();
int User_ID=rs.getInt(1);
String PASSWOORD=rs.getString(2);
String USERNAME= rs.getString(3);
String EMAIL =rs.getString(4);
String FIRST_NAME= rs.getString(5);
String LAST_NAME=rs.getString(6);
Long CONTACT_NUMBER=rs.getLong(7);
String Role=rs.getString(8);
Boolean IS_ACTIVE=rs.getBoolean(9);
String DOB=rs.getString(10);
String CREATED_ON =rs.getString(11);
u.setUSER_ID(User_ID);
u.setPASSWORD(PASSWOORD);
u.setUSERNAME(USERNAME);
u.setEMAIL(EMAIL);
u.setFIRST_NAME(FIRST_NAME);
u.setLAST_NAME(LAST_NAME);
u.setCONTACT_NUMBER(CONTACT_NUMBER);
u.setROLE(Role);
u.setIS_ACTIVE(IS_ACTIVE);
u.setDOB(DOB);
u.setCREATED_ON(CREATED_ON);
UserList.add(u);
}
}catch(SQLException e) {System.out.println(e);}
 return UserList;
}

@Override
public void deleteUser(int User_ID) {
	try {
		PreparedStatement cs2 = db.getConnection().prepareStatement("delete from user where User_ID=?");
		cs2.setInt(1, User_ID);
		row=cs2.executeUpdate();
	}catch(SQLException e) {System.out.println(e);}
	
}

@Override
public User login(User user) {
	User u=new User();
	try {
		PreparedStatement cs3 = db.getConnection().prepareStatement("select * from user where USERNAME=?");
		cs3.setString(1, user.getUSERNAME());
		ResultSet rs= cs3.executeQuery();
		 
		
		int User_ID=rs.getInt(1);
		String PASSWOORD=rs.getString(2);
		String USERNAME= rs.getString(3);
		String EMAIL =rs.getString(4);
		String FIRST_NAME= rs.getString(5);
		String LAST_NAME=rs.getString(6);
		Long CONTACT_NUMBER=rs.getLong(7);
		String Role=rs.getString(8);
		Boolean IS_ACTIVE=rs.getBoolean(9);
		String DOB=rs.getString(10);
		String CREATED_ON =rs.getString(11);
		u.setUSER_ID(User_ID);
		u.setPASSWORD(PASSWOORD);
		u.setUSERNAME(USERNAME);
		u.setEMAIL(EMAIL);
		u.setFIRST_NAME(FIRST_NAME);
		u.setLAST_NAME(LAST_NAME);
		u.setCONTACT_NUMBER(CONTACT_NUMBER);
		u.setROLE(Role);
		u.setIS_ACTIVE(IS_ACTIVE);
		u.setDOB(DOB);
		u.setCREATED_ON(CREATED_ON);

		
	}catch(SQLException e) {System.out.println(e);}
	
	if(u.getPASSWORD().equals(user.getPASSWORD())) {
		return u;
	}
	return null;
}


}
