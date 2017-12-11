package uk.ac.belfastmet.cereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	
	@Id
	@GeneratedValue
	private Integer cerealId;
	private String manufacturerName;
	private String cerealName;
	private Integer energy;
	private Integer calories;
	private double protein;
	private double carbohydrates;
	private double sugars;
	private double fat;
	private double saturates;
	private double fibre;
	private double sodium;
	private double salt;
	private double iron;
	
	public Cereal() {
		super();
	}

	public Cereal(Integer cerealId, String manufacturerName, String cerealName, Integer energy, Integer calories, double protein,
			double carbohydrates, double sugars, double fat, double saturates, double fibre, double sodium, double salt,
			double iron) {
		super();
		this.cerealId = cerealId;
		this.manufacturerName = manufacturerName;
		this.cerealName = cerealName;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}
	
	public Integer getCerealId() {
		return cerealId;
	}


	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}


	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getCerealName() {
		return cerealName;
	}
	public void setCerealName(String cerealName) {
		this.cerealName = cerealName;
	}
	public Integer getEnergy() {
		return energy;
	}
	public void setEnergy(Integer energy) {
		this.energy = energy;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public double getSugars() {
		return sugars;
	}
	public void setSugars(double sugars) {
		this.sugars = sugars;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public double getSaturates() {
		return saturates;
	}
	public void setSaturates(double saturates) {
		this.saturates = saturates;
	}
	public double getFibre() {
		return fibre;
	}
	public void setFibre(double fibre) {
		this.fibre = fibre;
	}
	public double getSodium() {
		return sodium;
	}
	public void setSodium(double sodium) {
		this.sodium = sodium;
	}
	public double getSalt() {
		return salt;
	}
	public void setSalt(double salt) {
		this.salt = salt;
	}
	public double getIron() {
		return iron;
	}
	public void setIron(double iron) {
		this.iron = iron;
	}
	
	

}
