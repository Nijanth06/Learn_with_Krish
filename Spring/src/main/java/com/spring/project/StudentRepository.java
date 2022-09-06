package com.spring.project;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	public List <Student> getAllStudents(){
		List<Student>students = new ArrayList<Student>();
		Student student = new Student();
		student.setName("Nijanth");
		student.setAddress("Kilinochchi");
		student.setAge(25);
		students.add(student);
		return students;
	}

}
