package com.spring.project;

import java.util.List;

public class StudentController {
	public static void main(String [] args) {
		StudentServiceImpl studentService = new StudentServiceImpl();
		List <Student>students = studentService.getAllStudents();
		for(Student student : students) {
			System.out.println("I am " +student.getName()+ " at " +student.getAddress());
			System.out.println( "My age is " +student.getAge());
		}
	}

}
