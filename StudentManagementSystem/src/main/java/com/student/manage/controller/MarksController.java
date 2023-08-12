package com.student.manage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	    private MarksService marksService;
	 @Autowired
	 StudentService studentservice;


	public MarksController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public MarksController(MarksService marksService, StudentService studentservice) {
		super();
		this.marksService = marksService;
		this.studentservice = studentservice;
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
		marksService.saveMarks(mark);
		return "redirect:/students/result";
	}
	@GetMapping("/students/result")
	public String AllMarks(Model model){
		model.addAttribute("mark", marksService.getAllMarks());
		return "result";
	}
	@GetMapping("/students/result/edit/{id}")
	public String editMarksForm(@PathVariable Long id,@ModelAttribute("mark") Marks mark, Model model) {
		model.addAttribute("mark", marksService.getMarksById(id)); 
		return "edit_Marks";
	}

	@PostMapping("/students/result/{id}")
	public String updateMarks(@PathVariable Long id, @ModelAttribute("mark") Marks mark, Model model) {

		// get student from database by id
		Marks existingMarks=marksService.getMarksById(id);
		existingMarks.setId(id);
		existingMarks.setMark1(mark.getMark1());
		existingMarks.setMark2(mark.getMark2());
		existingMarks.setSubject1(mark.getSubject1());
		existingMarks.setSubject2(mark.getSubject2());
		existingMarks.setTotal(marksService.calculateTotal(mark.getMark1(), mark.getMark2()));
		marksService.updateMarks(existingMarks);

		return "redirect:/students/result";

	}

}