package com.niit.JUnitTestCases;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.entities.Employee;
import com.niit.repository.EmpDAO;

public class EmpCrudTest {

	Employee emp=null;
	EmpDAO empcrd=null;
	@Before
	public void setUp() throws Exception 
	{
		emp = new Employee();
		empcrd=new EmpDAO();
		new EmpCrudTest();
	}
	 public EmpCrudTest() {
		// TODO Auto-generated constructor stub

		
	}
	@Ignore
	@Test
	public void insertTest() {
		try {

			emp.setEmpId(4);
			emp.setEmpName("Mahesh");
			emp.setEmpCity("Pune");
			emp.setEmpAddress("Camp,Pune");
			emp.setEmpEmail("kudalemahesh0@gmail.com");
			emp.setEmpGender("M");
			emp.setEmpMobile("8976432785");
			emp.setEmpNationality("Indian");
			emp.setEmpDob("22/12/1983");
			emp.setEmpRole("Manager");
			emp.setEmpStatus("ACTIVE");
			emp.setEmpPassword("mahesh@123");
			emp.setIBUName("GRB");
			assertEquals("Insertion Failed","1",empcrd.insertEmp(emp));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	
	@Ignore
	@Test
	public void updateTest()
	{
		try {
			
			emp.setEmpId(3);
			emp.setEmpName("sandeep");
			emp.setEmpCity("mumbai");
			emp.setEmpAddress("airoli");
			emp.setEmpEmail("gsandy@gmail.com");
			emp.setEmpGender("M");
			emp.setEmpMobile("8976432785");
			emp.setEmpNationality("Indian");
			emp.setEmpDob("15/06/1990");
			emp.setEmpRole("Developer");
			emp.setEmpStatus("ACTIVE");
			emp.setEmpPassword("sandeep@123");
			emp.setIBUName("ILS");
			
			assertEquals("Updation Failed","true",empcrd.updateEmp(emp));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
	}
	//@Ignore
	@Test
	public void deleteTest()
	{
		try {
			
			emp.setEmpId(4);
			assertEquals("deletion Failed","true",empcrd.deleteEmp(emp));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
