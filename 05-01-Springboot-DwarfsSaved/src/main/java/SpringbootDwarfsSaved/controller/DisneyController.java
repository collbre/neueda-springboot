package SpringbootDwarfsSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootDwarfsSaved.repositories.DwarfRepository;


@Controller
@RequestMapping("/")
public class DisneyController {
	
	@Autowired
	private DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthorOrName("Disney", "Thorin"));
		return "disneyPage";
	}

}
