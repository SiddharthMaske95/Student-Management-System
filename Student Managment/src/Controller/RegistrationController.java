package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Student;


import View.Registration;

public class RegistrationController implements ActionListener
{
	Registration r;
	
/*	public RegistrationController(Home home) {
		// TODO Auto-generated constructor stub
		h=home;
	}*/
	public RegistrationController(Registration reg) {
		r=reg;
	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		 if(e.getSource()==r.getSubmit())
	      {
			 String id=r.getTid().getText();
			 String name=r.getTname().getText();
			 String dob=r.getTdob().getText();
			 String doj=r.getTdoj().getText();
			 System.out.println("getting values");  
			 Student s=new Student();
			 s.setid(id);
			 s.setname(name);
			 s.setdob(dob);
			 s.setdoj(doj);
		     db.DAO d=new db.DAO();
		    
   	         try 
   	         {
				if(d.insert(s))
				{
					
					 System.out.println(" SuccessFully Inserted ");
				}
				else
				{
					r.dispose();
					new View.Home();
				}
			} catch (HeadlessException e1) {
				
				 System.out.println("You Entered Id No Already Present \n\n");  
				e1.printStackTrace();
			}
	      }
		 else
		 {
		      System.out.println("\n Enterd Valid Information ");
		 }
		
	}

}
