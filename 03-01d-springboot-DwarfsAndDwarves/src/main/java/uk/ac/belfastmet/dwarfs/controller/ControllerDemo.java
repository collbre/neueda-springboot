package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ControllerDemo {

	@GetMapping("/")
	public String disney(Model model) {
		return "Hello World";
	}
	
	@GetMapping("/bingo")
	public String bingo(Model model) {
		return "There was a dog in our back yard...";
	}
	
	@GetMapping("/princess")
	public String princess(Model model) {
		return "Meghan Markle";
	}
}
