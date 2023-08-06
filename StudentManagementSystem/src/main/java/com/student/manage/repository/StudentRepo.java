package com.student.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.manage.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
    public int save(int years);

	

}
