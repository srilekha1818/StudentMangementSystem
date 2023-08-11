package com.student.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.manage.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    public int save(int years);

	

}
