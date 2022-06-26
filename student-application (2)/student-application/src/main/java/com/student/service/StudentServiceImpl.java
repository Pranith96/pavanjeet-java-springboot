package com.student.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDto;
import com.student.dto.StudentRequest;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
@Transactional
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
	public StudentDto getStudentById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}

		StudentDto studentResponse = new StudentDto();
		studentResponse.setStudentId(response.get().getStudentId());
		studentResponse.setName(response.get().getName());
		studentResponse.setMobileNumber(response.get().getMobileNumber());
		studentResponse.setEmailId(response.get().getEmailId());
		return studentResponse;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		// Optional<List<Student>> response = studentRepository.findByName(name);
		Optional<List<Student>> response = studentRepository.getByName(name);
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

	@Override
	public String saveStudent(StudentRequest student) {
		Student st = new Student();
		st.setEmailId(student.getEmailId());
		st.setMobileNumber(student.getMobileNumber());
		st.setName(student.getName());
		st.setLongId("12345678");
		st.setPassword("123456789");

		Student response = studentRepository.save(st);
		if (response == null) {
			return "data not saved successfully";
		}
		return "Data is saved";
	}

	@Override
	public String deleteStudentById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("details not found");
		}
		// studentRepository.deleteById(studentId);
		studentRepository.delete(response.get());
		return "Deleted successfullys";
	}

	@Transactional
	@Override
	public String updateStudentName(String name, Integer studentId) {
		studentRepository.updateName(name, studentId);
		return "updated successfully";
	}

}
