package com.example.demo;

import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
	public int addUser(User user);
	public List<User> getallUser();
	public void deleteUser(int User_ID);
	public User login(User user);
	 
}
