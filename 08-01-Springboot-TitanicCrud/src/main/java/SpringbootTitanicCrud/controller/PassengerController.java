package SpringbootTitanicCrud.controller;

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
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import SpringbootTitanicCrud.domain.Passenger;
import SpringbootTitanicCrud.repositories.PassengerRepository;

@Controller
@RequestMapping("/")
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("/passenger")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findAll());
		return "passengersPage";
	}
	
	@GetMapping("/passenger/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerID, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerID));
		
		return "viewPassengers";
	}
	
	@GetMapping("/passenger/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerID, Model model) {
		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerID));
		
		return "editPassengers";
	}
	
	@GetMapping("/passenger/add")
	public String createPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		
		return "editPassengers";
	}
	
	@GetMapping("/passenger/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId,
			RedirectAttributes redirectAttrs) {
		passengerRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger has been deleted");
		return "redirect:/passenger";
	}
	
	
	@PostMapping("/passenger/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "editPassengers";
		}else {
			Passenger savedPassenger = passengerRepository.save(passenger);
			return "redirect:/passenger/view/" + savedPassenger.getPassengerId();
		}
	}
	
//	@GetMapping("/passenger/search")
//	public String search(@RequestParam("searchString") String searchString, Model model) {
//		model.addAttribute("pageTitle", "Passengers");
//		model.addAttribute("passengers", passengerRepository.findByNameContaining(searchString));
//		return "/passenger";
//	}
	
	@PostMapping("/passenger/search")
	public String search(@RequestParam("searchField") String searchField, 
			@RequestParam("searchString") String searchString, Model model) {
		
		if(searchField.equals("name")) {
			model.addAttribute("pageTitle", "Search Results");
			model.addAttribute("passengers", passengerRepository.findByNameContaining(searchString));
			
		}else if(searchField.equals("embarked")) {
			model.addAttribute("pageTitle", "Search Results");
			model.addAttribute("passengers", passengerRepository.findByEmbarked(searchString));
			
		}else if(searchField.equals("pClass")) {
			Integer pClass = Integer.parseInt(searchString);
			model.addAttribute("pageTitle", "Search Results");
			model.addAttribute("passengers", passengerRepository.findBypClass(pClass));
		}
		return "passengersPage";
	}
	
	
	
	
	@GetMapping("/survivors")
	public String survivors(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBySurvived(1));
		return "passengersPage";
	}
	
	@GetMapping("/first-class")
	public String firstClass(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClass(1));
		return "passengersPage";
	}
	
	@GetMapping("/first-class-survived")
	public String firstClassSurvived(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClassAndSurvived(1, 1));
		return "passengersPage";
	}
	
	@GetMapping("/second-class")
	public String secondClass(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClass(2));
		return "passengersPage";
	}
	
	@GetMapping("/second-class-survived")
	public String secondClassSurvived(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClassAndSurvived(2, 1));
		return "passengersPage";
	}
	
	@GetMapping("/third-class")
	public String thirdClass(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClass(3));
		return "passengersPage";
	}
	
	@GetMapping("/third-class-survived")
	public String thirdClassSurvived(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBypClassAndSurvived(3, 1));
		return "passengersPage";
	}
	
	@GetMapping("/parent-child")
	public String parch(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByParchGreaterThan(0));
		return "passengersPage";
	}
	
	@GetMapping("/sibling-spouse")
	public String sibSp(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findBySibSpGreaterThan(0));
		return "passengersPage";
	}
	
	@GetMapping("/embarkedSouthampton")
	public String embarkedSouthampton(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByEmbarked("S"));
		return "passengersPage";
	}
	
	@GetMapping("/embarkedCherbourg")
	public String embarkedCherbourg(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByEmbarked("C"));
		return "passengersPage";
	}
	
	@GetMapping("/embarkedQueenstown")
	public String embarkedQueenstown(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findByEmbarked("Q"));
		return "passengersPage";
	}
	
}
