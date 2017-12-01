package SpringbootSinglesAndAlbums.domain;

public class Single {
	
	private int position;
	private String artist;
	private String title;
	
	public Single(int position, String artist, String title) {
		this.position = position;
		this.artist = artist;
		this.title = title;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
