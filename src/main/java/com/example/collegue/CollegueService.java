package com.example.collegue;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegueService {
	@Autowired
	CollegueRepository collegueRepository;
	
	public List<Collegue> getCollegue(String nom) {
		System.out.println(" hello coco!");
		return  collegueRepository.findByNom(nom);
		
	}
	
	

}
