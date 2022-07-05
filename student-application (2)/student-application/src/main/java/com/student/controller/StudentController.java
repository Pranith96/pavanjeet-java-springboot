package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.dto.StudentRequest;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Qualifier(value = "student-service-1")
	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudentData(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@PostMapping("/save/temp")
	public ResponseEntity<String> saveStudentData(@RequestBody StudentRequest student) {
		String response = studentService.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get/all-records")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> response = studentService.getStudents();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	public ResponseEntity<StudentDto> getStudentById(@PathVariable("studentId") Integer studentId) {
		StudentDto response = studentService.getStudentById(studentId);
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

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudentById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/name/{name}/{studentId}")
	public ResponseEntity<String> updateStudentName(@PathVariable("name") String name,
			@PathVariable("studentId") Integer studentId) {
		String response = studentService.updateStudentName(name, studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
