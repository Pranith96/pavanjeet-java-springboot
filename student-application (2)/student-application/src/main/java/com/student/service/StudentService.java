package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<Student> getStudents();

	Student getStudentById(Integer studentId);

	List<Student> getStudentByName(String name);

	Student getStudentDetails(String longId, String password);

}
