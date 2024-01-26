package ca.sheridancollege.farijosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.farijosh.repository.AccountRepository;
import ca.sheridancollege.farijosh.repository.StudentRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class StudentController {
	
	private StudentRepository studentRepository;
	private AccountRepository accounntRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("studentList",
				studentRepository.findByAccount_IdIsNotNull());
	return "index"	;
	}
	}

