package crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository repo;
	
	
	@RequestMapping(value="/create")
	@ResponseBody
	public  void create(@RequestBody Student student){
		System.out.println("hiii");
		repo.save(student);
		
	}
	
	
	/*
	 creating the data base without view  
	  public void create(Student student){
		student = (Student) repo.save(student);
		return student;
	}
	*/
	

	
	
	@RequestMapping(value="/view")
	public List<Student> view(){
		List<Student> students=(List<Student>)repo.findAll();
		return students;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public void delete(@RequestBody long id){
		Student student1=repo.findOne(id);
		repo.delete(student1);
	}
	
	
	
}
