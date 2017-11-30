package SpringbootLargestBuilding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootLargestBuilding.service.FloorAreaService;

@Controller
@RequestMapping("/")
public class LargestFloorAreaController {
	
	@Autowired
	private FloorAreaService areaService;

	@GetMapping("/floor")
	public String floorArea(Model model) {
		model.addAttribute("pageTitle", "Largest Floor Area!");
		this.areaService = new FloorAreaService();
		model.addAttribute("building", this.areaService.floorAreaBuilding());
		return "largestFloorArea";
	}
}
