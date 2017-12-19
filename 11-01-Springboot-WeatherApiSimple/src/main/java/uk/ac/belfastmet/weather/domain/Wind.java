package uk.ac.belfastmet.weather.domain;

public class Wind {
	
	private int speed;
	private String direction;
	
	public Wind() {
		super();
	}
	
	public Wind(int speed, String direction) {
		super();
		this.speed = speed;
		this.direction = direction;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", direction=" + direction + "]";
	}
	
	
}
