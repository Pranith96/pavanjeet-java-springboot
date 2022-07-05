package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_pavneet")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	@Column(name = "student_name")
	private String name;
	@Column(name = "mobile_number", length = 10)
	private String mobileNumber;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "login_id", unique = true)
	private String longId;
	// @NotNull
	@Column(name = "password") // nullable=false
	private String password;

}
