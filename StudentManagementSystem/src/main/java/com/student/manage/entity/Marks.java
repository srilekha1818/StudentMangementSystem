package com.student.manage.entity;

import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Marks")
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Subject_1")
	private String subject1;
	@Column(name = "Subject_2")
	private String subject2;
	@Column(name = "Grade1")
	private Integer mark1;
	@Column(name = "Grade2")
	private Integer mark2;
	@Column(name = "percentage")
	private Integer total;
	 @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentid_fk",referencedColumnName="studentId")
    Student student;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(Long id, String subject1, String subject2, Integer mark1, Integer mark2, Integer total,
			Student student) {
		super();
		this.id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.total = total;
		this.student = student;
	}
	public Long getId(Long id) {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public Integer getMark1() {
		return mark1;
	}
	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}
	public Integer getMark2() {
		return mark2;
	}
	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Marks [id=" + id + ", subject1=" + subject1 + ", subject2=" + subject2 + ", mark1=" + mark1 + ", mark2="
				+ mark2 + ", total=" + total + ", student=" + student + "]";
	}
	
	
	
}
