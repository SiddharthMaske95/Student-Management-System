package Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Student;
import View.Delete;
import View.Home;


public class DeleteController implements ActionListener{
 Delete d;
	public DeleteController(Home home) {
		// TODO Auto-generated constructor stub
	}

	public DeleteController(Delete del) {
		// TODO Auto-generated constructor stub
		d=del;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	 if(e.getSource()==d.getDelete())
	 {
		 String id=d.getTid().getText();
		 Student s=new Student();
		 s.setid(id);
	     db.DAO db=new db.DAO();
	     try 
	     {
	         db.delete(s);
	        
   	      d.dispose();

        	 new View.Home();
	        
	     } catch (HeadlessException e1)
	     {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
	 else
	 {
		 JOptionPane.showMessageDialog(d," SuccessFully Inserted ");
	 }
	}

}
