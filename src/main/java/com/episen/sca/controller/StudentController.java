package com.episen.sca.controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.episen.sca.model.Student;
import com.episen.sca.repository.StudentRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/student")
	public List<Student> getStudents(){
		return this.studentRepository.findAll();
	}

	@GetMapping("/student/{id}")
	public Student findById(@PathVariable("id") String id) {
		return studentRepository.findById(Long.parseLong(id)).orElse(null);
	}
	@GetMapping("/student/findAll")
	public List<Student> findAll(){
		return this.studentRepository.findAll();
	}

	@PostMapping("/student/add")
	public Student add_student(@RequestBody Student student){
		return studentRepository.save(student);
	}

	@PostMapping("/student/update")
	public Student update_student(@RequestBody Student student){
		return studentRepository.save(student);
	}

	@DeleteMapping("/student/delete/{id}")
	public void delete(@PathVariable("id") String id){
		studentRepository.delete(studentRepository.findById(Long.parseLong(id)).orElse(null));
	}


}
