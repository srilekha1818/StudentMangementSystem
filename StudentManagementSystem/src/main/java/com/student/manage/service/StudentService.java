package com.student.manage.service;

import java.sql.Date;
import java.util.List;

import com.student.manage.entity.Student;

public interface StudentService  {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
