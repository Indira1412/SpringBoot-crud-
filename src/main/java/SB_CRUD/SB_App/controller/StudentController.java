package SB_CRUD.SB_App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import SB_CRUD.SB_App.entity.StudentEntity;
import SB_CRUD.SB_App.repo.StudentRepo;


@RequestMapping("/api/crudapi")
@RestController
public class StudentController {
	
	
	
	@Autowired
	private StudentRepo repo;
	
	//localhost:8001/api/crudapi/getallapi
	@GetMapping("/getallapi")
	public List<StudentEntity> getAllStudents() {
	    List<StudentEntity> students = repo.findAll();
	    System.out.println("data1: " + students); // Printing the list to the console
	    return students;
	}
	//localhost:8001/api/crudapi/getbyid/1
	@GetMapping("/getbyid/{id}")
	public StudentEntity getstudent(@PathVariable Long id) {
		StudentEntity stu =repo.findById(id).get();
		return stu;
	}
	//localhost:8001/api/crudapi/addstudent/api
	@PostMapping("/addstudent/api")
	public void createstudent(@RequestBody StudentEntity studententity) {
		System.out.println("data2: " + studententity);
		repo.save(studententity);
	}
	//localhost:8001/api/crudapi/update/api/1
	@PutMapping("/update/api/{id}")
	public StudentEntity updatestu (@PathVariable Long id) {
		StudentEntity student=repo.findById(id).get();
		student.setName("raghul");
		student.setPercentage(78);
		repo.save(student);
		System.out.println("data3: " + student);
		return student;
	}
	//localhost:8001/api/crudapi/delete/api/1
	@DeleteMapping("/delete/api/{id}")
	public void deleteTask(@PathVariable Long id) {
		repo.deleteById(id);
		
		
	}
	

}
