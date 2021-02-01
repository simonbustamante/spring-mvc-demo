package com.bustamante.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bustamante.springdemo.mvc.validation.CourseCode;



public class Customer {

	private String firstName;
	
	@NotNull(message="The lastname is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="This is required")
	@Min(value=0, message="Should be greater that 0 or equal to 0")
	@Max(value=10, message="Must be less than or equal to 10")
	private Integer freePasses;//changing int to integer refactored field to validate numbers on field
	
	@Pattern(regexp="[a-zA-Z0-9]{5}", message="only 5 char digits")
	private String postalCode;
	
	//Custom Annotation
	//default defined on CourseCode.java
	//@CourseCode
	@NotNull(message="Course Code is required")
	@CourseCode(value= {"TOPS","BUST"},message="must start with TOPS or BUST")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {//changing int to integer refactored field   to validate numbers on field
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {//changing int to integer refactored field   to validate numbers on field
		this.freePasses = freePasses;
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
