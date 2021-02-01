package com.bustamante.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> favoriteLanguages;
	private String operatingSystem;
	private LinkedHashMap<String, String> operatingSystems;
	


	public Student(){
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		//key=VE , value=Venezuela
		/*countryOptions.put("VE","Venezuela");
		countryOptions.put("PA","Panama");
		countryOptions.put("US","United States");
		countryOptions.put("CA","Canada");*/
		favoriteLanguages = new LinkedHashMap<>();
		operatingSystems = new LinkedHashMap<>();
	}
	

	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public LinkedHashMap<String, String> getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(LinkedHashMap<String, String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return favoriteLanguages;
	}
	public void setFavoriteLanguages(LinkedHashMap<String, String> favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
