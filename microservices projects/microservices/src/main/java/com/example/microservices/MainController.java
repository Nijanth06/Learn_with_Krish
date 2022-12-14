package com.example.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.entity.Student;
import com.example.microservices.service.StudentService;

@RestController
public class MainController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greeting() {
		return "Hello World";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String welcome() {
		return "create post method";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);

	}
	
	@RequestMapping(value = "/student" , method = RequestMethod.GET)
	public ResponseEntity<Student> fetchStudent(@RequestParam int id){
		Student student =studentService.fetchStudentById(id);
		if(student==null) {
			return ResponseEntity.notFound().build();			
		}else {
			return ResponseEntity.ok().body(student);
		}
		
	}

}
