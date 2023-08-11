package com.student.manage.entity;


import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
	@Table(name = "students")
	public class Student {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long studentId;
		
		@Column(name = "first_name", nullable = false)
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email")
		private String email;
		
		@Column(name="mobile_no",length=10)
		private Long mobile_no;
		
		@Column(name="date_of_birth")
		private LocalDate date_of_birth;
		@Column(name="Age")
		private Integer age;
		 @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
		  private Marks marks;
		

		public Student() {
		}


		public Student(Long studentId, String firstName, String lastName, String email, Long mobile_no,
				LocalDate date_of_birth, Integer age) {
			super();
			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobile_no = mobile_no;
			this.date_of_birth = date_of_birth;
			this.age = age;
		}


		

         
		public Long getStudentId(Long id) {
			return studentId;
		}


		public void setStudentId(Long studentId) {
			this.studentId = studentId;
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


		public LocalDate getDate_of_birth() {
			return date_of_birth;
		}

		public void setDate_of_birth(LocalDate date_of_birth) {
			this.date_of_birth = date_of_birth;
		}

		

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}


		public Long getStudentId() {
			return studentId;
		}


		@Override
		public String toString() {
			return "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", mobile_no=" + mobile_no + ", date_of_birth=" + date_of_birth + ", age="
					+ age ;
		}

		

		
		}
		

		

		
		
	
