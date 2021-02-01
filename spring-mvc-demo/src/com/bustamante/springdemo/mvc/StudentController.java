package com.bustamante.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	@Value("#{favoriteLanguages}")
	private Map<String, String> favoriteLanguages;
	@Value("#{operatingSystems}")
	private Map<String, String> operatingSystems;
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a new student object
		//Student theStudent = new Student();
		//add an student object as model attribute
		theModel.addAttribute("student", new Student());
		theModel.addAttribute("theCountryOptions", countryOptions);
		theModel.addAttribute("theLanguageOptions", favoriteLanguages);
		theModel.addAttribute("theOperatingSystemOptions", operatingSystems);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() +" "+ theStudent.getLastName());
		
		return "student-confirmation";
		
	}
}
