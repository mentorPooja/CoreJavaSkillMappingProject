package com.niit.entities;

public class Profile 
{
	Employee emp;
	int profileId ;
	String skills;
	
	float hscMks,sscMks,graduation,postGraduation;
	String graduationStream,postStream;
	int noOfVisits;
	String supervisorName,supervisorContact;
	
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	int supervisorId;
	String yearsOfExperience;
	
	public float getHscMks() {
		return hscMks;
	}

	public void setHscMks(float hscMks) {
		this.hscMks = hscMks;
	}

	public float getGraduation() {
		return graduation;
	}

	public void setGraduation(float graduation) {
		this.graduation = graduation;
	}


	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public float getSscMks() {
		return sscMks;
	}

	public void setSscMks(float sscMks) {
		this.sscMks = sscMks;
	}

	public float getPostGraduation() {
		return postGraduation;
	}

	public void setPostGraduation(float postGraduation) {
		this.postGraduation = postGraduation;
	}

	public int getEmpId() {
		return emp.empId;
	}

	public void setEmpId(int empId) {
		emp.empId = empId;
	}

	public String getGraduationStream() {
		return graduationStream;
	}

	public void setGraduationStream(String graduationStream) {
		this.graduationStream = graduationStream;
	}

	public String getPostStream() {
		return postStream;
	}

	public void setPostStream(String postStream) {
		this.postStream = postStream;
	}

	public int getNoOfVisits() {
		return noOfVisits;
	}

	public void setNoOfVisits(int noOfVisits) {
		this.noOfVisits = noOfVisits;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getSupervisorContact() {
		return supervisorContact;
	}

	public void setSupervisorContact(String supervisorContact) {
		this.supervisorContact = supervisorContact;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	
	

}
