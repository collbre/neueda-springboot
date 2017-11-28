import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Dwarves are Dwarfs!!!
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("Sleepy.png");
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("Happy.png");
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		thorin.setImage("Thorin.png");
		
		dwarfs.add(sleepy);
		dwarfs.add(happy);
		dwarfs.add(thorin);
		
		
	}

}
