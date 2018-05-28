package com.niit.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.niit.entities.Employee;
import com.niit.entities.EmployeeSkills;
import com.niit.utility.Connectivity;

public class EmployeeSkillsDAO 
{
	
	Connectivity conn=null;
	ResultSet rst=null;
	PreparedStatement prepareSst=null;
	Statement stmt = null;
	Connection jdbcCon=null;
	boolean ans;
	
	public EmployeeSkillsDAO()
	{
	 conn=new Connectivity();
     jdbcCon= conn.getConection();
    }

	
	public ArrayList<EmployeeSkills> retrieve(EmployeeSkills employees)
    {
        
	ArrayList<EmployeeSkills> empskllist = new ArrayList();
         
        try {
        	
		
        	rst = stmt.executeQuery("select * from employeeskills");

        	while(rst.next())
        	{
        		//Employee employees=new Employee();
                employees.setEmpId(rst.getInt(1));
                employees.setSkillId(rst.getInt(2));
                employees.setApprovedStatus(rst.getString(3));
                
                empskllist.add(employees);
        	}
        	
        }catch(Exception ex)
        {
        	System.out.println(ex);
        	
        }

	return empskllist;
    }

	public int insertEmpSkl(EmployeeSkills empskl) throws SQLException
	{
		
		String query="insert into employeeskills values(?,?,?)";
		conn.getConection();
		prepareSst = jdbcCon.prepareStatement(query);
		
		prepareSst.setInt(1,empskl.getEmpId());
		prepareSst.setInt(2,empskl.getSkillId());
		prepareSst.setString(3,empskl.getApprovedStatus());
		
		if(ans=prepareSst.executeUpdate() > 0)
			return 1;
		else
			return 0;
	}
	
	
	
}