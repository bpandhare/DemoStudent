package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
       sr.save(s);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
