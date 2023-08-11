package com.student.manage.service;

import java.util.List;

import com.student.manage.entity.Marks;

public interface MarksService{
	
    List<Marks> getAllMarks();
	
	Marks saveMarks(Marks marks);
	
	Integer calculateTotal(Integer m1,Integer m2);
}
