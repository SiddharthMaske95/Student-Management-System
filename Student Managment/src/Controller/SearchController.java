package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Student;
import View.*;


public class SearchController implements ActionListener {

	Search se;
	public SearchController(Home home) {
		// TODO Auto-generated constructor stub
	}

	public SearchController(Search search) {
		// TODO Auto-generated constructor stub
		se=search;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==se.getSrh())
	      {
			 String id=se.getTsr().getText();
			
			 Student s=new Student();
			 s.setid(id);
			
		     db.DAO d=new db.DAO();
		     try
		     {
		    	 if(d.find(s))
		    	 {
   	          
   	        	//JOptionPane.showMessageDialog(s," SuccessFully Inserted "); 
   	        	 System.out.println("Data Found ");  
   	        
		    	 }
   	         else
   	          {
   	        	 se.dispose();
   	        	 new View.Home();
   	          }
	      } catch (HeadlessException e1)
		     {
	    	 
				e1.printStackTrace();
			}
		    
	      }
		 else
		 {
			 JOptionPane.showMessageDialog(se," Data not  Found");
		 }
	}

}
