package SpringbootSinglesAndAlbums.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import SpringbootSinglesAndAlbums.domain.Album;

@Service
public class AlbumService {
	
	public AlbumService() {
		
	}
	
	public ArrayList<Album> getAlbums(){
		ArrayList<Album> albums = new ArrayList<Album>();
		
		Album one = new Album(1, "Paloma Faith", "The Architect");
		albums.add(one);
		Album two = new Album(2, "Sam Smith", "The Thrill of it All");
		albums.add(two);
		Album three = new Album(3, "Michael Ball & Alfie Boe", "Together Again");
		albums.add(three);
		Album four = new Album(4, "Tokio Myers", "Our Generation");
		albums.add(four);
		Album five = new Album(5, "Morrissey", "Low in High School");
		albums.add(five);
		Album six = new Album(6, "Ed Sheeran", "Divide");
		albums.add(six);
		Album seven = new Album(7, "Roy Orbision/RPO", "A Love So Beautiful");
		albums.add(seven);
		Album eight = new Album(8, "Taylor Swift", "Reputation");
		albums.add(eight);
		Album nine = new Album(9, "Jeff Lynne's Elo", "Wembley or Bust");
		albums.add(nine);
		Album ten = new Album(10, "Elton John", "Diamonds");
		albums.add(ten);
		
		
		return albums;
	}

}
