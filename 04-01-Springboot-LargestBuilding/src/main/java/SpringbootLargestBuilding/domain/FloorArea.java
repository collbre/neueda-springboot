package SpringbootLargestBuilding.domain;

public class FloorArea extends Building {
	
	private String area;
	private String image;
	
	
	public FloorArea(int rank, String name, String country, String place, String area, String image) {
		super(rank, name, country, place);
		this.area = area;
		this.image = image;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
