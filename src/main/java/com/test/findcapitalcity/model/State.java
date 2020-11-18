package com.test.findcapitalcity.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class State {
	
	@JsonProperty
	private String id;
	@JsonProperty
    private String country;
	@JsonProperty
    private String name;
	@JsonProperty
    private String abbr;
	@JsonProperty
    private String area;
	@JsonProperty
    private String capital_city;
	@JsonProperty
    private String capital;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbr() {
		return abbr;
	}
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getcapital_city() {
		return capital_city;
	}
	public void setcapital_city(String capital_city) {
		this.capital_city = capital_city;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}

}
