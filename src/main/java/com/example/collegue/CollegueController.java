package com.example.collegue;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegueController {
	@Autowired
	CollegueService collegueService;
	
	@CrossOrigin
	@GetMapping("/collegue/{nom}")
	public List<Collegue>  getCollegue(@PathVariable String nom) {
		List<Collegue> collegue = collegueService.getCollegue(nom);

		return collegue;


	}

	
}
