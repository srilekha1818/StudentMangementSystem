package com.student.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.manage.entity.Marks;
import com.student.manage.entity.Student;
import com.student.manage.repository.MarksRepo;
import com.student.manage.repository.StudentRepo;
import com.student.manage.service.MarksService;
@Service
public class MarkServiceImpl implements MarksService {
@Autowired
private MarksRepo marksrepo;
	private StudentRepo studentrepo;

	@Autowired
	public MarkServiceImpl(MarksRepo marksrepo, StudentRepo studentrepo) {
		super();
		this.marksrepo = marksrepo;
		this.studentrepo = studentrepo;
	}


	@Override
	public List<Marks> getAllMarks() {
		
		return marksrepo.findAll();
	}

	@Override
	public Marks saveMarks(Marks marks) {

		return marksrepo.save(marks);
	}

	@Override
	public Marks getMarksById(Long id) {
		return marksrepo.findById(id).get();
	}

	@Override
	public Marks updateMarks(Marks marks) {
		// TODO Auto-generated method stub
		return marksrepo.save(marks);
	}

	@Override
	public void deleteMarksById(Long id) {
		marksrepo.deleteById(id);

	}

	@Override
	public Integer calculateTotal(Integer m1, Integer m2) {
			Integer percentage=m1 + m2;
			return percentage;
	}

	public StudentRepo getStudentrepo() {
		return studentrepo;
	}

	public void setStudentrepo(StudentRepo studentrepo) {
		this.studentrepo = studentrepo;
	}


	




}