package uk.ac.belfastmet.cereals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereals.repositories.CerealRepository;

@Controller
@RequestMapping("/")
public class CerealController {
	
	@Autowired
	public CerealRepository cerealRepository;
	
	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/")
	public String cereal(Model model) {
		model.addAttribute("cereal", cerealRepository.findAll());
		return "cerealList";
	}

}
