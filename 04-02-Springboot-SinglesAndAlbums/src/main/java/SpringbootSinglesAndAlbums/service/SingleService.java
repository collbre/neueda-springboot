package SpringbootSinglesAndAlbums.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import SpringbootSinglesAndAlbums.domain.Single;

@Service
public class SingleService {
	
	public SingleService() {
		
	}
	
	public ArrayList<Single> getSingles(){
		ArrayList<Single> singles = new ArrayList<Single>();
		
		Single one = new Single(1, "Camila Cabello ft Young Thug", "Havana");
		singles.add(one);
		Single two = new Single(2, "Rita Ora", "Anywhere");
		singles.add(two);
		Single three = new Single(3, "Marshmello ft Khalid", "Silence");
		singles.add(three);
		Single four = new Single(4, "Ed Sheeran", "Perfect");
		singles.add(four);
		Single five = new Single(5, "Sam Smith", "Too Good At Goodbyes");
		singles.add(five);
		Single six = new Single(6, "Big Shaq", "Man's Not Hot");
		singles.add(six);
		Single seven = new Single(7, "Stormzy ft Minek", "Blinded by Your Grace - pt2");
		singles.add(seven);
		Single eight = new Single(8, "Post Malone ft 21 Savage", "Rockstar");
		singles.add(eight);
		Single nine = new Single(9, "Selena Gomez & Marshmello", "Wolves");
		singles.add(nine);
		Single ten = new Single(10, "Zayn ft Sia", "Dusk Till Dawn");
		singles.add(ten);
		
		return singles;
	}

}
