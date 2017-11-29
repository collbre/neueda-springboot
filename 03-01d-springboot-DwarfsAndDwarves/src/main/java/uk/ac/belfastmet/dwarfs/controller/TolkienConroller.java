package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tolkien/")
public class TolkienConroller {

	@GetMapping("/")
	public String tolkien(Model model) {
		return "tolkienPage";
	}
}
