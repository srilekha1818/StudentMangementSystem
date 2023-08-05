package com.student.manage.entity;


import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "students")
	public class Student {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "first_name", nullable = false)
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email")
		private String email;
		
		@Column(name="mobile_no")
		private Long mobile_no;
		
		@Column(name="date_of_birth")
		private Date date_of_birth;
		
		@Column(name="Age")
		private Integer age;
		
		
	
		public Student() {
		}

		public Student(Long id, String firstName, String lastName, String email, Long mobile_no, Date date_of_birth,Integer age) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobile_no = mobile_no;
			this.date_of_birth = date_of_birth;
			this.age=age;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getMobile_no() {
			return mobile_no;
		}

		public void setMobile_no(Long mobile_no) {
			this.mobile_no = mobile_no;
		}

		public Date getDate_of_birth() {
			return date_of_birth;
		}

		public void setDate_of_birth(Date date_of_birth) {
			this.date_of_birth = date_of_birth;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
      	
		
		
	}