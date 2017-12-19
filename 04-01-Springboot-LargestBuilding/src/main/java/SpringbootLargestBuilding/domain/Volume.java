package SpringbootLargestBuilding.domain;

public class Volume extends Building {

	private String area;
	private String volume;
	private String image;
	
	public Volume(int rank, String name, String country, String place, String area, String volume, String image) {
		super(rank, name, country, place);
		this.area = area;
		this.volume = volume;
		this.image = image;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	

}
