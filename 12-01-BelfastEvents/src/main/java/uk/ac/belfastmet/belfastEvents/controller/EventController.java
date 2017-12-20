package uk.ac.belfastmet.belfastEvents.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belfastEvents.domain.AllEvents;
import uk.ac.belfastmet.belfastEvents.domain.Event;


@Controller
@RequestMapping("/")
public class EventController {
	
	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("pageTitle", "Events in Belfast");	
		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		model.addAttribute("event" , allEvents.getAllEvents());
		
		return "homePage";
	}
	
	@GetMapping("/events/{identifier}")
	public String eventDetails(@PathVariable Integer identifier, Model model) {
		model.addAttribute("pageTitle", "Event Details");
		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		Event anEvent = new Event();
		
		for(Event event : allEvents.getAllEvents()) {
			if(event.getIdentifier().equals(identifier)) {
				anEvent = event;
			}
		}
		model.addAttribute("event" , anEvent);
		
		return "eventPage";
	}

}
