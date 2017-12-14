package uk.ac.belfastmet.rhi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repositories.RhiRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	RhiRepository rhiRepository; 
	
	public HomeController(RhiRepository rhiRepository) {
		super();
		this.rhiRepository = rhiRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("rhi", rhiRepository.findAll());
		return "homePage";
	}
	
	@GetMapping("/rhi/view/{rhiId}")
	public String viewRhi(@PathVariable("rhiId") Integer rhiId, Model model) {
		model.addAttribute("pageTitle", "View Details");
		model.addAttribute("rhi", rhiRepository.findOne(rhiId));
		return "viewDetail";
	}
	
	@GetMapping("/rhi/edit/{rhiId}")
	public String ediRhi(@PathVariable("rhiId") Integer rhiId, Model model) {
		model.addAttribute("pageTitle", "Edit Details");
		model.addAttribute("rhi", rhiRepository.findOne(rhiId));
		return "editRhi";
	}
	
	
	@GetMapping("/rhi/add")
	public String createRhi(Model model) {
		model.addAttribute("pageTitle", "Add RHI Recipient");
		model.addAttribute("rhi", new Rhi());
		return "editRhi";
	}
	
	@GetMapping("/rhi/delete/{rhiId}")
	public String deleteRhi(@PathVariable("rhiId") Integer rhiId,
			RedirectAttributes redirectAttrs) {
		rhiRepository.delete(rhiId);
		redirectAttrs.addFlashAttribute("message", "Recipient has been deleted");
		return "redirect:/rhi";
	}
	
	
	@PostMapping("/rhi/save")
	public String saveRhi(@Valid Rhi rhi, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "editRhi";
		}else {
			Rhi savedRhi = rhiRepository.save(rhi);
			return "redirect:/rhi/view/" + savedRhi.getRhiId();
		}
	}

	
	@PostMapping("/rhi/search")
	public String search(@RequestParam("searchField") String searchField, 
			@RequestParam("searchString") String searchString, Model model) {
		
		if(searchField.equals("name")) {
			model.addAttribute("pageTitle", "Search Results");
			model.addAttribute("rhi", rhiRepository.findByNameContaining(searchString));
			
		}else if(searchField.equals("capacity")) {
			Integer capacity = Integer.parseInt(searchString);
			model.addAttribute("pageTitle", "Search Results");
			model.addAttribute("rhi", rhiRepository.findByCapacity(capacity));
		}
		return "homePage";
	}

}
