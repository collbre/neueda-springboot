package SpringbootLargestBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LargestUsableVolume {

	@GetMapping("/volume")
	public String home(Model model) {
		model.addAttribute("pageTitle", "LargestUsableVolume!");
		return "largestUsableVolume";
	}
}
