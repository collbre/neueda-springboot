package SpringbootLargestBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LargestFloorAreaController {

	@GetMapping("/floor")
	public String floorArea(Model model) {
		model.addAttribute("pageTitle", "Largest Floor Area!");
		return "largestFloorArea";
	}
}
