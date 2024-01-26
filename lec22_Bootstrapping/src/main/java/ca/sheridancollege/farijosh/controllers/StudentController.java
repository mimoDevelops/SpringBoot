package ca.sheridancollege.farijosh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.farijosh.beans.Student;
import ca.sheridancollege.farijosh.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("")
	public String index(Model model) {
		
		model.addAttribute("student", new Student());
		model.addAttribute("studentList", studentRepository.findAll());
		return "index"; 
	}
	
	@PostMapping("/sendStudent")
	public String sendStudent(Model model, @ModelAttribute Student student) {
	    studentRepository.save(student);
	    model.addAttribute("student", new Student());
	    return "index";
	}

		
	}


