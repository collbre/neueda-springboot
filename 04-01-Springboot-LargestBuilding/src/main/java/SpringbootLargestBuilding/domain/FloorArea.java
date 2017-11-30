package SpringbootLargestBuilding.domain;

public class FloorArea {
	
	private int rank;
	private String name;
	private String country;
	private String place;
	private int area;
	private String image;
	
	
	public FloorArea(int rank, String name, String country, String place, int area, String image) {
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.area = area;
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
