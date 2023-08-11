package com.student.manage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.manage.entity.Marks;
import com.student.manage.entity.Student;
import com.student.manage.repository.MarksRepo;
import com.student.manage.repository.StudentRepo;
import com.student.manage.service.MarksService;
import com.student.manage.service.StudentService;

@Controller
public class MarksController {
	@Autowired
	private StudentRepo studentrepo;
	 @Autowired
	    private MarksService marksService;
	 @Autowired
	 StudentService studentservice;


	@Autowired
	private MarksRepo marksrepo;

	public MarksController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarksController(StudentRepo studentrepo, MarksRepo marksrepo) {
		super();
		this.studentrepo = studentrepo;
		this.marksrepo = marksrepo;
	}
	@GetMapping("/students/marks")
	public String AddingMarks(Model model) {
		
		model.addAttribute("mark", new Marks());
		model.addAttribute("students", studentservice.getAllStudents());

		return "Marks";
	}
	
	@PostMapping("/students/result")
	public String saveMarks(@ModelAttribute("mark") Marks mark,Model model) {
		mark.setTotal(marksService.calculateTotal(mark.getMark1(),mark.getMark2()));
		marksService.calculateTotal(mark.getMark1(),mark.getMark2());
		marksService.saveMarks(mark);
		
		return "redirect:/students/result";
	}
	@GetMapping("/students/result")
	public String AllMarks(Model model){
		model.addAttribute("mark", marksService.getAllMarks());
		return "result";
	}

}