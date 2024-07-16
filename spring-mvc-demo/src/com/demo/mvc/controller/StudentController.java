package com.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.mvc.model.StudentModel;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String ShowForm(Model themodel) {

		// create a model Object for student
		StudentModel theStudentModel = new StudentModel();

		// add student model object to model
		themodel.addAttribute("student", theStudentModel);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(
			@ModelAttribute("student") StudentModel theStudent) {
		return "student-confirm";
	}
}
