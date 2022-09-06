package com.spring.project;

import java.util.List;

public class StudentServiceImpl implements StudentService{
	StudentRepository studentRepository =new StudentRepository();

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.getAllStudents();
	}

}
