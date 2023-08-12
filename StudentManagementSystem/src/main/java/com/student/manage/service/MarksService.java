package com.student.manage.service;

import java.util.List;

import com.student.manage.entity.Marks;
import com.student.manage.entity.Student;


public interface MarksService{
	
    List<Marks> getAllMarks();
    
    Marks getMarksById(Long id);
	
	Marks saveMarks(Marks marks);
	
	Integer calculateTotal(Integer m1,Integer m2);

	Marks updateMarks(Marks mark);
}
