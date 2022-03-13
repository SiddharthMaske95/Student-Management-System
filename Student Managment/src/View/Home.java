package View;
import javax.swing.*;


import Controller.HomeController;

import Controller.MyWindowController;
import Controller.RegistrationController;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Home extends JFrame 
{
	
	JLabel l;
	JButton insert,update,delete,show,search;
	Container c;
	public Home()
	{
	     setTitle("Home Page");
		
		setBounds(190,120,600,500);
		  c = getContentPane();
	        c.setLayout(null);
		
		
		l=new JLabel("Wellcome To Student Management System",JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 25));
		l.setSize(590,40);
        l.setLocation(0,0);
        c.add(l);
        
		
		
		insert=new JButton("Insert");
		insert.setFont(new Font("Arial", Font.PLAIN,16));
		 insert.setSize(90,30);
		 insert.setLocation(40,40);
	     c.add(insert);
	     
		update=new JButton("Update ");
		update.setFont(new Font("Arial", Font.PLAIN,16));
		 update.setSize(90,30);
		 update.setLocation(140,40);
	     c.add(update);
	     
		delete=new JButton("Delete ");
		delete.setFont(new Font("Arial", Font.PLAIN,16));
		delete.setSize(90,30);
		delete.setLocation(240,40);
	     c.add(delete);
	     
		show=new JButton("View ");
		show.setFont(new Font("Arial", Font.PLAIN,16));
		show.setSize(90,30);
		show.setLocation(340,40);
	     c.add(show);
	     
		search=new JButton("Search ");
		search.setFont(new Font("Arial", Font.PLAIN,16));
		search.setSize(90,30);
		search.setLocation(440,40);
	     c.add(search);
	     
		
		
		 
		
          

		MyWindowController mw=new MyWindowController(this);
		this.addWindowListener(mw);
		
		HomeController rc=new HomeController(this);
		insert.addActionListener(rc);
			

	
		delete.addActionListener(rc);
		
		search.addActionListener(rc);
	
		show.addActionListener(rc);
		
		update.addActionListener(rc);
	setVisible(true);
		
	}

	public JLabel getL() {
		return l;
	}

	public void setL(JLabel l) {
		this.l = l;
	}

	public JButton getInsert() {
		return insert;
	}

	public void setInsert(JButton insert) {
		this.insert = insert;
	}

	public JButton getUpdate() {
		return update;
	}

	public void setUpdate(JButton update) {
		this.update = update;
	}

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JButton getShow() {
		return show;
	}

	public void setShow(JButton show) {
		this.show = show;
	}

	public JButton getSearch() {
		return search;
	}

	public void setSearch(JButton search) {
		this.search = search;
	}

	
}
