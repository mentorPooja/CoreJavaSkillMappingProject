package com.niit.repository;

//import com.niit.validation.*;
import com.niit.entities.Employee;
import com.niit.utility.Connectivity;
import java.sql.*;
//import java.io.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class EmpDAO {

	
		Connectivity conn=null;
		ResultSet rst=null;
		PreparedStatement prepareSst=null;
		Statement stmt = null;
		//Employee empcrd;
		Connection jdbcCon=null;
		boolean ans;
	public EmpDAO()
	{
		 conn=new Connectivity();
	       jdbcCon= conn.getConection();
	      //  empcrd = new Employee();
	}
	
	
	public void closeConnection() throws SQLException
	{
		prepareSst.close();
		jdbcCon.close();
		rst.close();
		stmt.close();
	}
	public ArrayList<Employee> retrieve(Employee employees)
	    {
	        
		ArrayList<Employee> emplist = new ArrayList();
             
	        try {
	        	
			
	        	rst = stmt.executeQuery("select * from employee");
	
	        	while(rst.next())
	        	{
	        		//Employee employees=new Employee();
	                employees.setEmpId(rst.getInt(1));
	                employees.setEmpName(rst.getString(2));
	                employees.setEmpEmail(rst.getString(3));
	                employees.setEmpMobile(rst.getString(4));
	                employees.setEmpGender(rst.getString(5));
	                employees.setEmpAddress(rst.getString(6));
	                employees.setEmpCity(rst.getString(7));
	                employees.setEmpDob(rst.getString(8));
	                employees.setEmpRole(rst.getString(9));
	                employees.setEmpNationality(rst.getString(10));
	                employees.setEmpPassword(rst.getString(11));
	                employees.setEmpStatus(rst.getString(12));
	                employees.setIBUName(rst.getString(13));
	                
	                emplist.add(employees);
	            }
	            }
	            catch(Exception h)
	            {
	            
	            }
	            return emplist;
	        }
	
	public int insertEmp(Employee emp) throws SQLException
	{
		
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		conn.getConection();
		prepareSst = jdbcCon.prepareStatement(query);
		
		prepareSst.setInt(1,emp.getEmpId());
		prepareSst.setString(2,emp.getEmpName());
		prepareSst.setString(3,emp.getEmpEmail());
		prepareSst.setString(4,emp.getEmpMobile());
		prepareSst.setString(5,emp.getEmpGender());
		prepareSst.setString(6,emp.getEmpAddress());
		prepareSst.setString(7,emp.getEmpCity());
		prepareSst.setString(8,emp.getEmpNationality());
		prepareSst.setString(9,emp.getEmpDob());
		prepareSst.setString(10,emp.getEmpRole());
		prepareSst.setString(11,emp.getEmpStatus());
		prepareSst.setString(12,emp.getEmpPassword());
		prepareSst.setString(13,emp.getIBUName());
		
		
		
		if(ans=prepareSst.executeUpdate() > 0)
			return 1;
		else
			return 0;
		
	}
	
	public boolean updateEmp(Employee empcrd) throws SQLException
	{
		String query = "update Employee set empmobile=?,empRole=?,empPassword=? where empid=?";
		
			prepareSst = jdbcCon.prepareStatement(query);
			
			//prepareSst.setString(1, empcrd.getEmpName());
			prepareSst.setString(1, empcrd.getEmpMobile());
			//prepareSst.setString(3, empcrd.getEmpAddress());
			//prepareSst.setString(4, empcrd.getEmpCity());
			prepareSst.setString(2, empcrd.getEmpRole());
			//prepareSst.setString(6, empcrd.getEmpEmail());
			//prepareSst.setString(7, empcrd.getEmpStatus());
			//prepareSst.setString(8, empcrd.getIBUName());
			prepareSst.setString(3, empcrd.getEmpPassword());
			prepareSst.setInt(4, empcrd.getEmpId());
			
			//closeConnection();
		
		if(ans=prepareSst.executeUpdate() > 0)
			return true;
		else
			return false;
	}
	
	public boolean deleteEmp(Employee emp) throws SQLException
	{
		String query = "delete from Employee where empId=?";
				
		
			 prepareSst = jdbcCon.prepareStatement(query);
		
			 prepareSst.setInt(1, emp.getEmpId());

			// closeConnection();
			 if(ans=prepareSst.executeUpdate() > 0)
					return true;
				else
					return false;
			
	}



}
