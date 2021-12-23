package com.example.demo;

import java.util.List;

public interface TaskInterface {
	
	public List<Task> getallTask();

	public int setpriority(int taskid, String Priority);
	public int setbookmark(int taskid, String  bookmark);
	public int setnotes(int taskid, String  notes);
	public int setuser(int taskid, int ownerid);
	public List<Task> searchtask(int taskid);
    public List<Task> trackstatus(String status);
    public int addTask(Task task );
    public void deleteTask(int Task_ID);
}
