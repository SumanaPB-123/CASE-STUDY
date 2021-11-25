package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.impl.DbConnection;
import com.example.demo.Task;
import com.example.demo.TaskInterface;


@Component
public class TaskDaoimpl implements TaskInterface {
	
	private static final int Resultset = 0;
	@Autowired
	DbConnection db;
	@Autowired
	Task task=null;
	
	
	int row1=0;
	public List<Task> getallTask(){
		List<Task> taskList=new ArrayList<>();
		try {
			PreparedStatement cs= db.getConnection().prepareStatement("Select* from TASK");
			ResultSet rs= cs.executeQuery();
			
			while(rs.next()) {
				Task t=new Task();
			int TASK_ID=rs.getInt(1);
			int OWNER_ID=rs.getInt(2);
			int  CREATOR_ID= rs.getInt(3);
			String NAME= rs.getString(4);
			String DESCRIPTION =rs.getString(5);
			String STATUS= rs.getString(6);
			String PRIORITY=rs.getString(7);
			String NOTES=rs.getString(8);
			Boolean IS_BOOKMARKED=rs.getBoolean(9);
			String CREATED_ON =rs.getString(10);
			String STATUS_CHANGED_ON=rs.getString(11);
			
			t.setTASK_ID(TASK_ID);
			t.setOWNER_ID(OWNER_ID);
			t.setCREATOR_ID(CREATOR_ID);
			t.setNAME(NAME);
			t.setDESCRIPTION(DESCRIPTION);
			t.setSTATUS(STATUS);
			t.setPRIORITY(PRIORITY);
			t.setNOTES(NOTES);
			t.setISBOOKMARKED(IS_BOOKMARKED);
			t.setCREATED_ON(CREATED_ON);
			t.setSTATUS_CHANGED_ON(STATUS_CHANGED_ON);
			
			
			taskList.add(t);
			}
			
			}catch(SQLException e) {System.out.println(e);}
		return  taskList;
	}
	
	

@Override
public int setpriority(int taskid, String priority) {
	try {
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("Update TASK  set PRIORITY=? where TASK_ID=?");
		 ps.setString(1, priority);
		 ps.setInt(2, taskid);
		 row1 = ps.executeUpdate();
		 db.closeConnection();
		 
	 }catch(SQLException sqe) {sqe.printStackTrace();}
	 
	return row1;

}

@Override
public int setbookmark(int taskid, String bookmark) {
	try {
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("Update TASK  set ISBOOKMARKED=? where TASK_ID=?");
		 ps.setString(1, bookmark);
		 ps.setInt(2, taskid);
		 row1 = ps.executeUpdate();
		 db.closeConnection();
		 
	 }catch(SQLException sqe) {sqe.printStackTrace();}
	 
	return row1;

}

@Override
public int setnotes(int taskid, String notes) {
	try {
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("Update TASK  set NOTES=? where TASK_ID=?");
		 ps.setString(1, notes);
		 ps.setInt(2, taskid);
		 row1 = ps.executeUpdate();
		 db.closeConnection();
		 
	 }catch(SQLException sqe) {sqe.printStackTrace();}
	 
	return row1;

}

@Override
public int setuser(int taskid, int  ownerid) {
	try {
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("Update TASK  set OWNER_ID=? where TASK_ID=?");
		 ps.setInt(1, ownerid);
		 ps.setInt(2, taskid);
		 row1 = ps.executeUpdate();
		 db.closeConnection();
		 
	 }catch(SQLException sqe) {sqe.printStackTrace();}
	 
	return row1;
}

@Override

public List<Task> searchtask(int taskid) {
	List<Task> taskList=new ArrayList<>();
	try {
		
	
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("select * from TASK where TASK_ID=? ");
		 
		ps.setInt(1, taskid);
		 ResultSet rs = ps.executeQuery();
		 
		 
		 while(rs.next()) {
				Task t=new Task();
			int TASK_ID=rs.getInt(1);
			int OWNER_ID=rs.getInt(2);
			int  CREATOR_ID= rs.getInt(3);
			String NAME= rs.getString(4);
			String DESCRIPTION =rs.getString(5);
			String STATUS= rs.getString(6);
			String PRIORITY=rs.getString(7);
			String NOTES=rs.getString(8);
			Boolean IS_BOOKMARKED=rs.getBoolean(9);
			String CREATED_ON =rs.getString(10);
			String STATUS_CHANGED_ON=rs.getString(11);
			
			t.setTASK_ID(TASK_ID);
			t.setOWNER_ID(OWNER_ID);
			t.setCREATOR_ID(CREATOR_ID);
			t.setNAME(NAME);
			t.setDESCRIPTION(DESCRIPTION);
			t.setSTATUS(STATUS);
			t.setPRIORITY(PRIORITY);
			t.setNOTES(NOTES);
			t.setISBOOKMARKED(IS_BOOKMARKED);
			t.setCREATED_ON(CREATED_ON);
			t.setSTATUS_CHANGED_ON(STATUS_CHANGED_ON);
			
			
			taskList.add(t);
			}
			
			}catch(SQLException e) {System.out.println(e);}
		return  taskList;
}
@Override

public List<Task> trackstatus(String status) {
	List<Task> taskList=new ArrayList<>();
	try {
		
	
		 
		 PreparedStatement ps = db.getConnection().prepareStatement("select * from TASK where STATUS=? ");
		 
		ps.setString(1, status);
		 ResultSet rs = ps.executeQuery();
		 
		 
		 while(rs.next()) {
				Task t=new Task();
			int TASK_ID=rs.getInt(1);
			int OWNER_ID=rs.getInt(2);
			int  CREATOR_ID= rs.getInt(3);
			String NAME= rs.getString(4);
			String DESCRIPTION =rs.getString(5);
			String STATUS= rs.getString(6);
			String PRIORITY=rs.getString(7);
			String NOTES=rs.getString(8);
			Boolean IS_BOOKMARKED=rs.getBoolean(9);
			String CREATED_ON =rs.getString(10);
			String STATUS_CHANGED_ON=rs.getString(11);
			
			t.setTASK_ID(TASK_ID);
			t.setOWNER_ID(OWNER_ID);
			t.setCREATOR_ID(CREATOR_ID);
			t.setNAME(NAME);
			t.setDESCRIPTION(DESCRIPTION);
			t.setSTATUS(STATUS);
			t.setPRIORITY(PRIORITY);
			t.setNOTES(NOTES);
			t.setISBOOKMARKED(IS_BOOKMARKED);
			t.setCREATED_ON(CREATED_ON);
			t.setSTATUS_CHANGED_ON(STATUS_CHANGED_ON);
			
			
			taskList.add(t);
			}
			
			}catch(SQLException e) {System.out.println(e);}
		return  taskList;
}
@Override
public int addTask(Task task) {
	try {
		 PreparedStatement ps = db.getConnection().prepareStatement("Insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
		 ps.setInt(1, task.getTASK_ID());
		 ps.setInt(2, task.getOWNER_ID());
		 ps.setInt(3, task.getCREATOR_ID());
		 ps.setString(4, task.getNAME());
		 ps.setString(5, task.getDESCRIPTION());
		 ps.setString(6, task.getSTATUS());
		 ps.setString(7, task.getPRIORITY());
		 ps.setString(8, task.getNOTES());
		 ps.setBoolean(9, task.getISBOOKMARKED());
		 ps.setString(10, task.getCREATED_ON());
		 ps.setString(11, task.getSTATUS_CHANGED_ON());
		 row1 = ps.executeUpdate();
		 db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	
	return row1;
	
}
}

