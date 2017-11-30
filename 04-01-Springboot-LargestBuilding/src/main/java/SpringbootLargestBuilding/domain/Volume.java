package SpringbootLargestBuilding.domain;

public class Volume {
	
	private int rank;
	private String name;
	private String country;
	private String place;
	private String area;
	private String volume;
	private String image;
	
	public Volume(int rank, String name, String country, String place, String area, String volume, String image) {
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.area = area;
		this.volume = volume;
		this.image = image;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
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
