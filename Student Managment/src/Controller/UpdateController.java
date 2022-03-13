package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Student;
import View.Home;

import View.Update;

public class UpdateController implements ActionListener {

	Update u;
	public UpdateController(Home home) {
		// TODO Auto-generated constructor stub
	}

	public UpdateController(Update update) {
		// TODO Auto-generated constructor stub
		u=update;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==u.getUpdate())
		{
			
			 String id=u.getTid().getText();
			 String name=u.getTname().getText();
		 String dob=u.getTdob().getText(); 
		 String doj=u.getTdoj().getText();
	      
			 Student s=new Student();
			 s.setid(id);
			 s.setname(name);
			 s.setdob(dob);
			 s.setdoj(doj);
		     db.DAO d=new db.DAO();
		     try
		     {
   	         d.ud(s);
   		       JOptionPane.showMessageDialog(u," SuccessFully Updated ");
   		  
       	      u.dispose();
	        	 new View.Home();
   	         }
		catch (HeadlessException e1) 
		     {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      }
		 else
		 {
			 JOptionPane.showMessageDialog(u," SuccessFully Inserted ");
		 }
		
	}

}
