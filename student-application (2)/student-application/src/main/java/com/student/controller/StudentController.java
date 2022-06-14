package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudentData(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get/all-records")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> response = studentService.getStudents();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudentById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name")
	public ResponseEntity<List<Student>> getStudentByName(@RequestParam("name") String name) {
		List<Student> response = studentService.getStudentByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{longId}/{password}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("longId") String longId,
			@PathVariable("password") String password) {
		Student response = studentService.getStudentDetails(longId, password);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
