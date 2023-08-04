package com.student.manage.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.manage.entity.Student;
import com.student.manage.repository.StudentRepo;
import com.student.manage.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);	
		
	}
	
}
