package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Model.Student;


import View.*;


public class DAO
{
	
	static  Registration r;
	static Search se;
	static Delete d;
	static Show s;
 static Update u;
   public boolean insert(Student s) 
  	{
	   
		  String insrt="insert into student" +
		  "(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values " +
				  "(?,?,?,?)";
		  int status=0;
		
    	try
    	{
    		   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "Siddharth@24");//Establishing connection
			   System.out.println("\nConnected With the database successfully");
		   PreparedStatement ps= connection.prepareStatement(insrt);
	   
	       ps.setString(1, s.getid());
	        ps.setString(2,s.getname());
	        ps.setString(3,s.getdob());
	        ps.setString(4,s.getdoj());
	     	        
	         status=ps.executeUpdate();
	        if(status!=0)
	          {
	        	
	        	
	        	 JOptionPane.showMessageDialog(r," SuccessFully Inserted \n");
	        	
	          }
         } 
    	 catch (SQLException |NullPointerException e) 
  	  {
  		   e.printStackTrace();
  		 System.out.println(" \nValid ID Number Required");
  	  }
 
   
		return false;
      }  

   public boolean  find(Student s)
   {
   
   	  String fnd="select * from student where STUDENT_NO=?" ;
   			  int status=0;
   			  ResultSet rs = null;
   			try
   			{
   				   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "Siddharth@24");//Establishing connection
   				   System.out.println("\nConnected With the database successfully");
   			   PreparedStatement ps= connection.prepareStatement(fnd);
	       
   	
   			  ps.setString(1, s.getid());
	       
	         rs=ps.executeQuery();
	         
	        if(rs.next())
	          {
	         	int id = rs.getInt("STUDENT_NO");
	        	 String name = rs.getString("STUDENT_NAME");
	                Date dob = rs.getDate("STUDENT_DOB");
	                Date doj = rs.getDate("STUDENT_DOB");
	                System.out.println("\nStudent id= "+id+"\nStudent Name= "+name+"\nStudent Date of Birth= "+dob+"\nStudent Date of Joining="+doj);
	            
	          }
	        else
	        {
	        	 System.out.println("Enter Correct Id No !!!"); 
	        }
        } 
   	catch (SQLException e) 
   	 {
   		  System.out.println("Error while connecting to the database");
   	 }
		return false;
   }
    
   public boolean delete(Student s)
    {
		   String dld="DELETE FROM student WHERE  STUDENT_NO=?"  ;
	 int status=0;
		try
		{
			
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "Siddharth@24");//Establishing connection
		
			   System.out.println("\nConnected With the database successfully");
		   PreparedStatement ps= connection.prepareStatement(dld);
		   ps.setString(1, s.getid());
	       
		   status=ps.executeUpdate();
	         if(status!=0)
	         {
	        	 System.out.println("record   deleted"); 
	        	 JOptionPane.showMessageDialog(d," SuccessFully Deleted ");
		         connection.close(); 
	         }
	         else
	         {
	        	 System.out.println("Entered valid id no!!!!"); 
	         }
	        
	       
         } 
    	catch (SQLException e) 
    	 {
    		 System.err.println("Got an exception! ");
    	      System.err.println(e.getMessage());
    		  System.out.println("Error while connecting to the database");
    	 }
		return false;
    }
    
   public boolean view(Student s)
    {
     	  String fnd="select * from student where STUDENT_NO= STUDENT_NO" ;
			  
			  ResultSet rs = null;
			try
			{
				   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "Siddharth@24");//Establishing connection
				   System.out.println("\nConnected With the database successfully");
			   PreparedStatement ps= connection.prepareStatement(fnd);
      
       
       
         rs=ps.executeQuery();
         System.out.println(" Query Executed");
        while(rs.next())
          {
        	int id = rs.getInt("STUDENT_NO");
        	 String name = rs.getString("STUDENT_NAME");
                Date dob = rs.getDate("STUDENT_DOB");
                Date doj = rs.getDate("STUDENT_DOJ");
        
        	System.out.println("\n Student Id="+id+"\n Student name="+name+"\n Student DOB="+dob+"\n Student DOJ="+doj);
        	
          }
    } 
	catch (SQLException e) 
	 {
		  System.out.println("Error while connecting to the database");
	 }
	return false;
}
    
   public boolean ud(Student s)
    {
	   String sql = "UPDATE student SET STUDENT_DOJ=?, STUDENT_DOB=? ,STUDENT_NAME=?     WHERE STUDENT_NO=?";
	   
		  ResultSet rs = null;
		try
		{
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "Siddharth@24");//Establishing connection
			   System.out.println("\nConnected With the database successfully");
			   PreparedStatement ps = connection.prepareStatement(sql); 
	
   		
			   
			   ps.setString(1,s.getdoj() );
			   ps.setString(2,s.getdob() );
			   ps.setString(3,s.getname() );
			   	   ps.setString(4,s.getid() );
	       
		     ps.execute();
		     connection.isClosed();
	         
	        	 System.out.println(" Record was updated ");
		}
catch (SQLException e) 
 {
	  System.out.println("Error while connecting to the database");
	  e.printStackTrace();
 }
	return false;
}


}
