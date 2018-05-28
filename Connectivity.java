package com.niit.utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

public class Connectivity {


	Properties property = new Properties();
	   InputStream input = null;
	   String driver="com.mysql.jdbc.Driver";
	   String url="jdbc:mysql://localhost:3306/skillmapping";
	   String username="root";
	   String password="niit@123";
	   String dbname="skillmapping";
	    
	    public String getConnect()
	    {
	        
	        try {
	            input = new FileInputStream("D:\\FullStackTraining\\config.properties");
	            // load a properties file
	            property.load(input);
	            System.out.println(1);
	            // get the property value and print it out
	            driver=property.getProperty("driver");
	            username=property.getProperty("dbuser");
	            password=property.getProperty("dbpassword");
	            url=property.getProperty("url");
	            dbname=property.getProperty("db_name");
	            
	            System.out.println("Connected");
	            return "Connection Established";
	        } catch (IOException ex) {
	            return "Connection Failure..";
	        }
	    }
	    
	    
	    public Connection getConection()
	    {
	        Connection con=null;
	                    getConnect();
	                    try
	                    {
	                        Class.forName(driver);
	                        con=DriverManager.getConnection(url,username,password);
	                        System.out.println("MY Connection Established");
	                    }
	                    catch(Exception e)
	                    {
	                        System.out.println("Exception : "+e.toString());
	                        //System.out.println(e.printStackTrace());
	                    }
	        return con;
	    }

}
