package com.student.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.manage.entity.Marks;
import com.student.manage.repository.MarksRepo;
import com.student.manage.service.MarksService;
@Service
public class MarkServiceImpl implements MarksService {
@Autowired
private MarksRepo marksrepo;

	public MarkServiceImpl(MarksRepo marksrepo) {
		super();
		this.marksrepo = marksrepo;
		
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
	public Integer calculateTotal(Integer m1, Integer m2) {
			Integer percentage=m1 + m2;
			return percentage;
	}



	@Override
	public Marks getMarksById(Long id) {
		return marksrepo.findById(id).get();
	}
	@Override
	public Marks updateMarks(Marks mark) {
		return marksrepo.save(mark);
	}


	




}