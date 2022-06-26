package com.student.service;

import java.util.List;

import com.student.dto.StudentDto;
import com.student.dto.StudentRequest;
import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<Student> getStudents();

	StudentDto getStudentById(Integer studentId);

	List<Student> getStudentByName(String name);

	Student getStudentDetails(String longId, String password);

	String saveStudent(StudentRequest student);

	String deleteStudentById(Integer studentId);

	String updateStudentName(String name, Integer studentId);

}
