package com.student.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.manage.entity.Marks;

@Repository
public interface MarksRepo extends JpaRepository<Marks,Long> {

}
