package com.ncu.models;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ncu.validations.CourseCode;

import com.ncu.validations.PasswordCode;


public class Users {

	
//	@NotNull(message="This field is required")
//	@Size(min=2, message="type more than 2 letters ")
	@NotNull
	private String userid;

	@NotNull(message="This field is required")
	@PasswordCode
	private String pwd;
	
	@NotNull(message="This field is required")
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Type email Correctly")
	private String email;
	private int age;
	private String gender;
	
	private Date dob;
	@NotNull(message="This field is required")
	private String area;
	@NotNull(message="This field is required")
	private String state;
	@NotNull(message="This field is required")
	private String country;

	@CourseCode(value={"CSE","ECE","CSL","SOM"}, message="must start with CSE,ECE,CSL,SOM")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
//	
	
	
	
	
	
}

