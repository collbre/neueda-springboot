package uk.ac.belfastmet.belfastEvents.domain;

import java.util.ArrayList;

public class AllEvents {

	private ArrayList<Event> allEvents;

	public AllEvents() {
		super();
	}

	public AllEvents(ArrayList<Event> allEvents) {
		super();
		this.allEvents = allEvents;
	}

	public ArrayList<Event> getAllEvents() {
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents) {
		this.allEvents = allEvents;
	}
	
	public void findAnEvent(Integer identifier) {
		
	}


}
