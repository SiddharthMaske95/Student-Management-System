package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Student;
import View.Home;
import View.Show;

public class ShowController implements ActionListener {

	Show sh;
	public ShowController(Home home) {
		// TODO Auto-generated constructor stub
	}

	public ShowController(Show show) {
		sh=show;// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sh.getClick())
		{
			
	      Student s=new Student();
		     db.DAO d=new db.DAO();
   	         try
   	        {
   	        	 if(d.view(s))
   	        	 {
   	 				   JOptionPane.showMessageDialog(sh," Data On Console \n");
   	        	 } 
   	        	 else
   	        	 {

   	   	        	 sh.dispose();
   	   	        	 new View.Home();
   	        	 }
   	 				
   	 			} 
		     catch (HeadlessException e1) 
   	         {
   	 				// TODO Auto-generated catch block
   	 				e1.printStackTrace();
   	 			}
		}
		 else
		 {
			 JOptionPane.showMessageDialog(sh," SuccessFully Inserted ");
		 }
		
	}

}
