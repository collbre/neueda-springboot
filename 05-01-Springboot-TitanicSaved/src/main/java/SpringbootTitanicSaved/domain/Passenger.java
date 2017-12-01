package SpringbootTitanicSaved.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived;
	private Integer pClass;
	private String name;
	private String sex;
	private Float age;
	private Integer sibSp;
	private Integer parch;
	private String ticket;
	private Float fare;
	private String cabin;
	private String embarked;
	
	public Passenger() {
		super();
	}
	public Passenger(Integer passengerId, int survived, int pClass, String name, String sex, Float age, int sibSp,
			int parch, String ticket, Float fare, String cabin, String embarked) {
		super();
		this.passengerId = passengerId;
		this.survived = survived;
		this.pClass = pClass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sibSp = sibSp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.cabin = cabin;
		this.embarked = embarked;
	}
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}
	public int getSurvived() {
		return survived;
	}
	public void setSurvived(int survived) {
		this.survived = survived;
	}
	public int getpClass() {
		return pClass;
	}
	public void setpClass(int pClass) {
		this.pClass = pClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public int getSibSp() {
		return sibSp;
	}
	public void setSibSp(int sibSp) {
		this.sibSp = sibSp;
	}
	public int getParch() {
		return parch;
	}
	public void setParch(int parch) {
		this.parch = parch;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public Float getFare() {
		return fare;
	}
	public void setFare(Float fare) {
		this.fare = fare;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getEmbarked() {
		return embarked;
	}
	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}
	
	
	

}