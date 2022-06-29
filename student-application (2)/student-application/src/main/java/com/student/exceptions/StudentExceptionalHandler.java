package com.student.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionalHandler {

	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleStudentNotFoundException(StudentNotFoundException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setDetails("Student Records Not exists");
		response.setMessage(ex.getMessage());
		System.out.println(ex.fillInStackTrace());
		response.setStatusCode(HttpStatus.NOT_FOUND.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ExceptionResponse> handleHttpRequestMethodNotSupportedException(
			HttpRequestMethodNotSupportedException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDateTime(LocalDateTime.now());
		response.setDetails("Put Method is not allowed here, use Get");
		response.setMessage(ex.getMessage());
		response.setStatusCode(HttpStatus.METHOD_NOT_ALLOWED.toString());
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(response);
	}
}
