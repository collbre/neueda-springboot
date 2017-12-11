package SpringbootTitanicSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SpringbootTitanicSaved.repositories.PassengerRepository;

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
