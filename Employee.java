package com.niit.entities;


public class Employee 
{

	    int    empId;
	    String  empName;
	    String  empEmail;
	    String   empMobile;
	    String  empGender;
	    String  empAddress;;
	    String  empCity;
	    String  empNationality;
	    String  empDob;
	    String  empRole;
	    String empPassword;
	    String empStatus;
	    String IBUName;
	    
		 public String getEmpStatus() {
			return empStatus;
		}


		public void setEmpStatus(String empStatus) {
			this.empStatus = empStatus;
		}


		public String getIBUName() {
			return IBUName;
		}


		public void setIBUName(String iBUName) {
			this.IBUName = iBUName;
		}

			 
	    public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpEmail() {
			return empEmail;
		}
		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}
		public String getEmpMobile() {
			return empMobile;
		}
		public void setEmpMobile(String empMobile) {
			this.empMobile = empMobile;
		}
		public String getEmpGender() {
			return empGender;
		}
		public void setEmpGender(String empGender) {
			this.empGender = empGender;
		}
		public String getEmpAddress() {
			return empAddress;
		}
		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}
		public String getEmpCity() {
			return empCity;
		}
		public void setEmpCity(String empCity) {
			this.empCity = empCity;
		}
		public String getEmpNationality() {
			return empNationality;
		}
		public void setEmpNationality(String empNationality) {
			this.empNationality = empNationality;
		}
		public String getEmpDob() {
			return empDob;
		}
		public void setEmpDob(String empDob) {
			this.empDob = empDob;
		}
		public String getEmpRole() {
			return empRole;
		}
		public void setEmpRole(String empRole) {
			this.empRole=empRole;
		}
		public String getEmpPassword() {
			return empPassword;
		}
		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}
	    
	    
		 public String validate()
		    {
		        if((this.empId<0) ||(this.empId>999)||this.empAddress.length()==0 ||this.empCity.isEmpty()||this.empEmail.isEmpty() ||this.empName.isEmpty() || this.empPassword.length()==0||this.IBUName.isEmpty())
		        		return "Failed!!!";
		        else
		            return "Success!!!";
		    }
}
