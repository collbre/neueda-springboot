package SpringbootLargestBuilding.domain;

public class Footprint extends Building{
	
	private String footprint;
	private String image;
	
	public Footprint(int rank, String name, String country, String place, String footprint, String image) {
		super(rank, name, country, place);
		this.footprint = footprint;
		this.image = image;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
