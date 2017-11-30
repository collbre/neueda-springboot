package SpringbootLargestBuilding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootLargestBuilding.service.LargeBuildingService;

@Controller
@RequestMapping("/")
public class LargestFootprintController {
	
	@Autowired
	private LargeBuildingService footprintService;

	@GetMapping("/footprint")
	public String footprint(Model model) {
		model.addAttribute("pageTitle", "Largest Footprint!");
		this.footprintService = new LargeBuildingService();
		model.addAttribute("building", this.footprintService.footprintBuilding());
		return "largestFootprint";
	}
}
