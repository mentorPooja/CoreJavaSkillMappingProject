package com.niit.entities;
import com.niit.repository.*;
import java.sql.SQLException;

import com.niit.repository.EmpDAO;
import com.niit.utility.Connectivity;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connectivity conobj=new Connectivity();
        //conobj.getConection();
        //Employee emp = new Employee();
        
        //EmpDAO empcr = new EmpDAO();
     //  try {
		//empcr.insertEmp(emp);
//	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
        // empcr.retrieve();
       // System.out.println(1);
	
        ProfileDAO prf = new ProfileDAO();
        try {
			prf.insertProfile(new Profile());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}


