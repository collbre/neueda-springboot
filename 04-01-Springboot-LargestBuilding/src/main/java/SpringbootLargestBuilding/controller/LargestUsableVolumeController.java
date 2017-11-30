package SpringbootLargestBuilding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootLargestBuilding.service.LargeBuildingService;

@Controller
@RequestMapping("/")
public class LargestUsableVolumeController {
	
	@Autowired
	private LargeBuildingService volumeService;
	

	@GetMapping("/volume")
	public String home(Model model) {
		model.addAttribute("pageTitle", "LargestUsableVolume!");
		this.volumeService = new LargeBuildingService();
		model.addAttribute("building", this.volumeService.volumeBuilding());
		return "largestUsableVolume";
	}
}
