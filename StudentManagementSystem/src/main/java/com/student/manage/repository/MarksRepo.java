package com.student.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.manage.entity.Marks;

public interface MarksRepo extends JpaRepository<Marks,Long> {


}
