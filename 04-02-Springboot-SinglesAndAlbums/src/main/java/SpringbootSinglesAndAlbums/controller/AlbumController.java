package SpringbootSinglesAndAlbums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootSinglesAndAlbums.service.AlbumService;

@Controller
@RequestMapping("/")
public class AlbumController {
	
	@Autowired
	private AlbumService albumsChartService;
	
	@GetMapping("/albums")
	public String album(Model model) {
		model.addAttribute("pageTitle", "Albums Chart");
		this.albumsChartService = new AlbumService();
		model.addAttribute("albums", this.albumsChartService.getAlbums());
		return "albums";
	}

}
