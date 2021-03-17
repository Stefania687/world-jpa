package it.objectmethod.world.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "Code")
	private String countryCode;

	@Column(name = "Name")
	private String countryName;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Region")
	private String region;

	@Column(name = "SurfaceArea")
	private Integer surfaceArea;

	@Column(name = "Population")
	private Integer population;

	@Column(name = "IndepYear")
	private String indepYear;

	@Column(name = "LifeExpectancy")
	private Float lifeExpectancy;

	@Column(name = "GNP")
	private Float gnp;

	@Column(name = "GNPOld")
	private Float gnpOld;

	@Column(name = "LocalName")
	private String localName;

	@Column(name = "GovernmentForm")
	private String governmentForm;

	@Column(name = "HeadOfState")
	private String headOfState;

	@Column(name = "Capital")
	private String capital;

	@Column(name = "Code2")
	private String cityCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Integer surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(String indepYear) {
		this.indepYear = indepYear;
	}

	public Float getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Float getGnp() {
		return gnp;
	}

	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	public Float getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(Float gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}