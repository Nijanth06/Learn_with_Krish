package com.example.microservices.service;

import com.example.microservices.entity.Student;

public interface StudentService {

	Student save(Student student);

	Student fetchStudentById(int id);

}
