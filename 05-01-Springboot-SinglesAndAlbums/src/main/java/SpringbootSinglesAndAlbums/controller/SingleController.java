package SpringbootSinglesAndAlbums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootSinglesAndAlbums.service.SingleService;

@Controller
@RequestMapping("/")
public class SingleController {
	
	@Autowired
	private SingleService singlesChartService;
	
	@GetMapping("/singles")
	public String single(Model model) {
		model.addAttribute("pageTitle", "Singles Charts");
		this.singlesChartService = new SingleService();
		model.addAttribute("singles", this.singlesChartService.getSingles());
		return "singles";
	}

}
