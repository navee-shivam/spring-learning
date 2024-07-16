package com.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MVCDemoController {

	@RequestMapping("/")
	public String showForm() {
		return "home";
	}

	/**
	 * Unused method cant be called from anywhere
	 *
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/showMessage")
	public String showMessage(@RequestParam("studentName") String name,
			Model model) {
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "display-message";
	}
}
