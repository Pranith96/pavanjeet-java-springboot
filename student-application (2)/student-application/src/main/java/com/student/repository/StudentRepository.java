package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// Optional<List<Student>> findByName(String name);

	Optional<Student> findByLongIdAndPassword(String longId, String password);

	// @Query("select s from Student s where s.name=:studentName")
	// Optional<List<Student>> getByName(String studentName);

	@Query(value = "select * from student_pavneet where student_name=:studentName", nativeQuery = true)
	Optional<List<Student>> getByName(String studentName);

	@Modifying
	@Query("update Student s set s.name=:name where s.studentId=:studentId")
	void updateName(String name, Integer studentId);
}