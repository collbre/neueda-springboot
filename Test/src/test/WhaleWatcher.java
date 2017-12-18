package test;

import java.util.ArrayList;

public class WhaleWatcher {
	public static void main(String[]args) {
		
		ArrayList<Whale> whales = new ArrayList<Whale>();
		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		whales.add(right);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		whales.add(blue);
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		whales.add(sperm);
		Whale humpback = new Whale("Humpback", "Antartic", 919, 13, 13);
		whales.add(humpback);
		
		System.out.println(whales.toString());
		System.out.println();
		atlanicSwimmer(whales);
		System.out.println();
		fastestSwimmer(whales);
		System.out.println();
		averageLength(whales);
		System.out.println();
		heaviestWhale(whales);
		
	}
	
	public static void atlanicSwimmer(ArrayList<Whale> whales) {
		System.out.println("Whales that swimm mostly in the Atlantic: ");
		for(Whale whale : whales) {
			if(whale.getMainOcean().equals("Atlantic")) {
				System.out.println(whale.getName());
			}
		}
	}
	
	public static void fastestSwimmer(ArrayList<Whale> whales) {
		int max = 0;
		System.out.println("The fastest swimming whale(s): ");
		for(int i = 0; i < whales.size();i++) {
			Whale currentWhale = whales.get(i);
			if(currentWhale.getMaxSpeed()>max) {
				max = currentWhale.getMaxSpeed();
				System.out.println(currentWhale.getName());
			}
		}
	}
	
	public static void averageLength(ArrayList<Whale> whales) {
		int sum = 0;
		for(Whale whale : whales) {
			sum = sum + whale.getLength();
		}
		int average = sum/whales.size();
		System.out.println("The average length of the whales: " + average);
	}
	
	public static void heaviestWhale(ArrayList<Whale> whales) {
		int heaviest = 0;
		System.out.println("The heaviest whale(s): ");
		
		for(int i = 0; i < whales.size();i++) {
			Whale currentWhale = whales.get(i);
			if(currentWhale.getWeight()>heaviest) {
				heaviest = currentWhale.getWeight();
				System.out.println(currentWhale.getName());
			}
		}
	}
	
}
