package com.niit.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import com.niit.entities.Employee;
import com.niit.entities.Profile;
import com.niit.utility.Connectivity;

public class ProfileDAO 
{
	
	Connectivity conn=null;
	ResultSet rst=null;
	PreparedStatement prepareSst=null;
	Statement stmt = null;
	Connection jdbcCon=null;
	boolean ans;
public ProfileDAO()
{
	 conn=new Connectivity();
       jdbcCon= conn.getConection();
}


public void closeConnection() throws SQLException
{
	prepareSst.close();
	jdbcCon.close();
	rst.close();
	stmt.close();
}

	public ArrayList<Profile> retrieve(Profile prf)
    {
        
	
	ArrayList<Profile> prflist = new ArrayList();
    
        try {
        	
		
        	rst = stmt.executeQuery("select * from profile");
        	
        	while(rst.next())
        	{
        	//	System.out.println(result.getInt(0)+"\n"+result.getString(1)+"\n"+result.getString(2));
        		
        		prf.setProfileId(rst.getInt(1));
        		prf.setEmpId(rst.getInt(2));
        		prf.setSkills(rst.getString(3));
        		prf.setHscMks(rst.getFloat(4));
        		prf.setSscMks(rst.getFloat(5));
        		prf.setGraduation(rst.getFloat(6));
        		prf.setPostGraduation(rst.getFloat(7));
        		prf.setNoOfVisits(rst.getInt(8));
        		prf.setSupervisorId(rst.getInt(9));
        		prf.setSupervisorName(rst.getString(10));
        		prf.setSupervisorContact(rst.getString(11));
        		prf.setGraduationStream(rst.getString(12));
        		prf.setPostStream(rst.getString(13));
                prf.setYearsOfExperience(rst.getString(14));
                
                prflist.add(prf);
        	
        	}
        //	closeConnection();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return prflist;
    }

	
public int insertProfile(Profile prf) throws SQLException
{
	
	String query="insert into profile values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	conn.getConection();
	prepareSst = jdbcCon.prepareStatement(query);
	
	prepareSst.setInt(1,prf.getProfileId());
	prepareSst.setInt(2, prf.getEmpId());
	prepareSst.setString(3, prf.getSkills());
	prepareSst.setFloat(4,prf.getHscMks());
	prepareSst.setFloat(5,prf.getSscMks());
	prepareSst.setFloat(6,prf.getGraduation());
	prepareSst.setFloat(7,prf.getPostGraduation());
	prepareSst.setInt(8, prf.getNoOfVisits());
	prepareSst.setInt(9, prf.getSupervisorId());
	prepareSst.setString(10, prf.getSupervisorName());
	prepareSst.setString(11, prf.getSupervisorContact());
	prepareSst.setString(12, prf.getGraduationStream());
	prepareSst.setString(13, prf.getPostStream());
	prepareSst.setString(14, prf.getYearsOfExperience());
	
	if(ans=prepareSst.executeUpdate() > 0)
		return 1;
	else
		return 0;
	
}

public int updateProfile(Profile prf) throws SQLException
{
	String query = "update Profile set Skills=? where empid=?";
	
		prepareSst = jdbcCon.prepareStatement(query);
		//closeConnection();
	
		prepareSst.setString(1, prf.getSkills());
		prepareSst.setInt(2, prf.getEmpId());
			 		
	if(ans=prepareSst.executeUpdate() > 0)
		return 1;
	else
		return 0;
}

public boolean deleteEmp(Profile prf) throws SQLException
{
	String query = "delete from Profile where empId=?";
			
	
		 prepareSst = jdbcCon.prepareStatement(query);
	
		 prepareSst.setInt(1, prf.getEmpId());

		// closeConnection();
		 if(ans=prepareSst.executeUpdate() > 0)
				return true;
			else
				return false;
		
}



}
