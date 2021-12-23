package com.example.demo;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.impl.TaskDaoimpl;
import com.example.demo.impl.UserDaoimpl;
@CrossOrigin(origins="http://localhost:3000")
@RestController
//@RequestMapping(value="/tasktracking")
public class Mycontroller{
	@Autowired
	TaskInterface task;
	@Autowired 
	Task task1;
	@Autowired 
	TaskDaoimpl  dao;
	@Autowired
	UserInterface user;
	@Autowired 
	UserDaoimpl  dao1;
	
	@RequestMapping(value = "/task", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getallTask() {
			
			return task.getallTask();	
			
	}
			
					
					
			
@RequestMapping(value="/taskid/{taskid}/priority/{priority}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
public List<Task> printTask(@PathVariable("taskid") int taskid, @PathVariable("priority") String priority, Model model) {
	model.addAttribute("taskid", taskid);
	model.addAttribute("priority", priority);
	int row = dao.setpriority(taskid, priority);
	return dao.getallTask();
}
	



@RequestMapping(value="/taskid/{taskid}/bookmark/{bookmark}",method = RequestMethod.GET,produces = {"application/json","application/xml"})	
public List<Task> printTask1(@PathVariable("taskid") int taskid, @PathVariable("bookmark") String bookmark, Model model) {
model.addAttribute("taskid", taskid);
model.addAttribute("priority", bookmark);
int row = dao.setbookmark(taskid, bookmark);
return dao.getallTask();
}

@RequestMapping(value="/taskid/{taskid}/notes/{notes}",method = RequestMethod.GET,produces = {"application/json","application/xml"})	
public List<Task> printTask2(@PathVariable("taskid") int taskid, @PathVariable("notes") String notes, Model model) {
model.addAttribute("taskid", taskid);
model.addAttribute("notes", notes);
int row = dao.setnotes(taskid, notes);
return dao.getallTask();


}

@RequestMapping(value="/taskid/{taskid}/ownerid/{ownerid}",method = RequestMethod.GET,produces = {"application/json","application/json"})	
public List<Task> printTask3(@PathVariable("taskid") int taskid, @PathVariable("ownerid") int ownerid, Model model) {
model.addAttribute("taskid", taskid);
model.addAttribute("ownerid", ownerid);
int row = dao.setuser(taskid, ownerid);
return dao.getallTask();
}
@RequestMapping(value="/taskid/{taskid}",method = RequestMethod.GET,produces = {"application/json","application/json"})	
public List<Task> printTask3(@PathVariable("taskid") int taskid,Model model) {
model.addAttribute("taskid", taskid);
List<Task> row = dao.searchtask(taskid);
return dao.searchtask(taskid);
}

@RequestMapping(value="/status/{status}",method = RequestMethod.GET,produces = {"application/json","application/xml"})	
public List<Task> printTask4(@PathVariable("status") String status,Model model) {
model.addAttribute("status", status);

return dao.trackstatus(status);
}





@PostMapping(value= "/addtask", consumes = "application/json", produces = "application/json")
public Task addTask(@RequestBody Task task) throws Exception
{
   dao.addTask(task);
   return task;

}
@PostMapping(value= "/adduser", consumes = "application/json", produces = "application/json")
public User addUser(@RequestBody User user) throws Exception
{
   dao1.addUser(user);
   return user;

}

@RequestMapping(value = "/user", method = RequestMethod.GET,produces = {"application/json","application/json"})
public List<User> getallUser() {
		
		return user. getallUser();
	
		
}
@DeleteMapping( value="/deleteuser/{User_ID}" , produces = "application/json" )
public void Deleteuser(@PathVariable int User_ID) {
	dao1.deleteUser(User_ID);
}
@DeleteMapping("/deletetask/{Task_ID}" )
public void Deletetask(@PathVariable int Task_ID) {
	dao.deleteTask(Task_ID);
}
@PostMapping(value="/login")
public User login(@RequestBody User user) {
	System.out.println(user.getPASSWORD());
	return dao1.login(user);
}
}







	
	
