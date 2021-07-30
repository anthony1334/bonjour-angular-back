package com.example.collegue;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegueRepository extends JpaRepository<Collegue, Long> {
	

public List<Collegue> findByNom(String nom) ;

	


}
