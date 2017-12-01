package SpringbootDwarfsSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootDwarfsSaved.repositories.DwarfRepository;


@Controller
@RequestMapping("/")
public class TolkienConroller {
	
	@Autowired
	private DwarfRepository dwarfRepository;

	public TolkienConroller(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));
		return "tolkienPage";
	}
	
}
