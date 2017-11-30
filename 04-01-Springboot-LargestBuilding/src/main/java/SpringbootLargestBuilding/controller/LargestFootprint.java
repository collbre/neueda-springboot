package SpringbootLargestBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LargestFootprint {

	@GetMapping("/footprint")
	public String footprint(Model model) {
		model.addAttribute("pageTitle", "Largest Footprint!");
		return "largestFootprint";
	}
}
