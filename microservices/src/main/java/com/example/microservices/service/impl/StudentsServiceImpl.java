package com.example.microservices.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.entity.Student;
import com.example.microservices.repository.StudentRepository;
import com.example.microservices.service.StudentService;



@Service
public class StudentsServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public Student fetchStudentById(int id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}

}
