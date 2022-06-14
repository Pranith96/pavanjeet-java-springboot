package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data not saved successfully";
		}
		return "Data is saved";
	}

	@Override
	public List<Student> getStudents() {
		List<Student> result = studentRepository.findAll();
		if (result.isEmpty() || result == null) {
			throw new RuntimeException("Data is Empty");
		}
		return result;
	}

	@Override
	public Student getStudentById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		Optional<List<Student>> response = studentRepository.findByName(name);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}
		return response.get();
	}

	@Override
	public Student getStudentDetails(String longId, String password) {
		Optional<Student> response = studentRepository.findByLongIdAndPassword(longId, password);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}
		return response.get();
	}

}
