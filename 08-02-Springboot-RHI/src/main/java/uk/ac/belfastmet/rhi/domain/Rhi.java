package uk.ac.belfastmet.rhi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rhi {
	
	@Id
	@GeneratedValue
	private Integer rhiId;
	private String name;
	private String dateOfApplication;
	private String businessOrInstallationLocation;
	private String technologyTypeInstallation;
	private Integer capacity;
	private Float amountOfPayments;
	
	public Rhi() {
		super();
	}
	public Rhi(Integer rhiId, String name, String dateOfApplication, String businessOrInstallationLocation,
			String technologyTypeInstallation, Integer capacity, Float amountOfPayments) {
		super();
		this.rhiId = rhiId;
		this.name = name;
		this.dateOfApplication = dateOfApplication;
		this.businessOrInstallationLocation = businessOrInstallationLocation;
		this.technologyTypeInstallation = technologyTypeInstallation;
		this.capacity = capacity;
		this.amountOfPayments = amountOfPayments;
	}
	public Integer getRhiId() {
		return rhiId;
	}
	public void setRhiId(Integer rhiId) {
		this.rhiId = rhiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public String getBusinessOrInstallationLocation() {
		return businessOrInstallationLocation;
	}
	public void setBusinessOrInstallationLocation(String businessOrInstallationLocation) {
		this.businessOrInstallationLocation = businessOrInstallationLocation;
	}
	public String getTechnologyTypeInstallation() {
		return technologyTypeInstallation;
	}
	public void setTechnologyTypeInstallation(String technologyTypeInstallation) {
		this.technologyTypeInstallation = technologyTypeInstallation;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Float getAmountOfPayments() {
		return amountOfPayments;
	}
	public void setAmountOfPayments(Float amountOfPayments) {
		this.amountOfPayments = amountOfPayments;
	}
	
	

}
