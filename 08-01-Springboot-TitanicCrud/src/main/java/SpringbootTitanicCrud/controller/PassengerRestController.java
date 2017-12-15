package SpringbootTitanicCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringbootTitanicCrud.domain.Passenger;
import SpringbootTitanicCrud.service.PassengerRestService;

@RestController
@RequestMapping("/api/passenger")
public class PassengerRestController {
	
	@Autowired
	PassengerRestService passengerRestService;
	
	public PassengerRestController(PassengerRestService passengerRestService) {
		super();
		this.passengerRestService = passengerRestService;
	}

	@GetMapping("/")
	public Iterable<Passenger>list(){
		return  passengerRestService.list();
	}
	
	@PostMapping("/")
	public Passenger create(@RequestBody Passenger passenger) {
		return passengerRestService.create(passenger);
	}
	
	@GetMapping("/{passengerId}")
	public Passenger read(@PathVariable("passengerId") Integer passengerId){
		return  passengerRestService.read(passengerId);
	}
	
	@PutMapping("/{passengerId}")
	public Passenger update(@PathVariable("passengerId") Integer passengerId, @RequestBody Passenger passenger ){
		return passengerRestService.update(passengerId, passenger);
	}
	
	@DeleteMapping("/{passengerId}")
	public void delete(@PathVariable("passengerId") Integer passengerId) {
		passengerRestService.delete(passengerId);
	}
	
}
