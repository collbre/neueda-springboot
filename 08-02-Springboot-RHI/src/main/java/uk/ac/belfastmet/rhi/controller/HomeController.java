package uk.ac.belfastmet.rhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.rhi.repositories.RhiRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	RhiRepository rhiRepository; 
	
	public HomeController(RhiRepository rhiRepository) {
		super();
		this.rhiRepository = rhiRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("rhi", rhiRepository.findAll());
		return "homePage";
	}
	
	@GetMapping("/rhi/view/{rhiId}")
	public String viewRhi(@PathVariable("rhiId") Integer rhiId, Model model) {
		model.addAttribute("pageTitle", "View Details");
		model.addAttribute("rhi", rhiRepository.findOne(rhiId));
		return "viewDetail";
	}

}
