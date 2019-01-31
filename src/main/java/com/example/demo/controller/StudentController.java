package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Student;
import com.example.demo.jpa.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> retrieveAllStudents() {

		return this.studentRepository.findAll();
	}

}
