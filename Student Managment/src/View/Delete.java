package View;

import java.awt.*;

import javax.swing.*;

import Controller.DeleteController;
import Controller.MyWindowController;

public class Delete extends JFrame
{
 JLabel id;
 JTextField tid;
 JButton delete;
 Container c;
 public Delete()
 {
	 setTitle("Delete Student Data");
		
		 setBounds(190,120,550,570);
		 c = getContentPane();
	        c.setLayout(null);
		
		
	id=new JLabel("Enter Id No");
	id.setFont(new Font("Arial", Font.PLAIN,19));
	id.setSize(590,40);
	id.setLocation(60,60);
	  c.add(id);
	  
	  tid=new JTextField(20);
	  tid.setFont(new Font("Arial", Font.PLAIN,17));
	 tid.setSize(250,25);
	tid.setLocation(250,69);
      c.add(tid);
		
      delete=new JButton("Delete");
      delete.setFont(new Font("Arial", Font.PLAIN, 20));
      delete.setSize(120,30);
      delete.setLocation(220,99);
      c.add(delete);
	
	  MyWindowController mw=new MyWindowController(this);
		this.addWindowListener(mw);
		
		DeleteController dc=new DeleteController(this);
		delete.addActionListener(dc);
		setVisible(true);
 }
public JLabel getId() {
	return id;
}
public void setId(JLabel id) {
	this.id = id;
}
public JTextField getTid() {
	return tid;
}
public void setTid(JTextField tid) {
	this.tid = tid;
}
public JButton getDelete() {
	return delete;
}
public void setDelete(JButton delete) {
	this.delete = delete;
}
 
}
