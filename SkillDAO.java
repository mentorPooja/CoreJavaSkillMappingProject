package com.niit.repository;

import com.niit.entities.Skills;
import com.niit.utility.*;
import java.sql.*;
import java.util.ArrayList;

public class SkillDAO
{
	Connection con=null;
	Connectivity connObj=null;
	ResultSet result=null;
	PreparedStatement prepareSst=null;
	Statement stmt = null;
	
	SkillDAO()
	{
		con = connObj.getConection();
	}
	
	public ArrayList<Skills> retrive(Skills skl)
	{
		ArrayList<Skills> skllist =new ArrayList<>();
 	     
        try {
        	
		
        	result = stmt.executeQuery("select * from skills");
        	
        	while(result.next())
        	{
        		skl.setSkillId(result.getInt(1));
        		skl.setSkillName(result.getString(2));
        		
        		skllist.add(skl);
        	}
        	
        //	closeConnection();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return skllist;
        
    }
}
