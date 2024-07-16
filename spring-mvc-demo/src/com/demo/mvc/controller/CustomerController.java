package com.demo.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.mvc.model.CustomerModel;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// add an initBinder to make whitespace for all string to trim
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimEditor);
	}

	@RequestMapping("/showForm")
	public String showform(Model theModel) {
		theModel.addAttribute("customer", new CustomerModel());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") CustomerModel theCustomer,
			BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirm";
	}
}
