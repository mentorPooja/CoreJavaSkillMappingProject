package com.niit.entities;

public class EmployeeSkills 
{
	Employee empObj;
	Skills sklObj;
	String approvedStatus;
	
	public String getApprovedStatus() 
	{
		return approvedStatus;
	}
	
	public void setApprovedStatus(String approvedStatus) 
	{
		this.approvedStatus = approvedStatus;
	}
	
	public int getEmpId() {
		return empObj.empId;
	}
	
	public void setEmpId(int empId) {
		empObj.empId = empId;
	}
	
	public int getSkillId() {
		return sklObj.SkillId;
	}
	
	public void setSkillId(int skillId) {
		sklObj.SkillId = skillId;
	}
	
	
}
