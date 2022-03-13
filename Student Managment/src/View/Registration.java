package View;

import Controller.MyWindowController;
import Controller.RegistrationController;

import java.awt.*;

import javax.swing.*;

public class Registration extends JFrame
{
 JLabel id,dob,doj,name;

   JTextField tid,tname,tdob,tdoj;
   JButton submit;
  Container c;
  public Registration()
  {
	  setTitle("Student Registration Form");
	
		 setBounds(190,120,540,570);
		 c = getContentPane();
	        c.setLayout(null);
		
	  
	  id=new JLabel("ID No");
	  id.setFont(new Font("Arial", Font.PLAIN,19));
	  id.setSize(590,40);
	  id.setLocation(60,60);
	  c.add(id);
	  
	  tid=new JTextField(20);
	  tid.setFont(new Font("Arial", Font.PLAIN,17));
		tid.setSize(250,25);
      tid.setLocation(250,69);
      c.add(tid);
      
      name=new JLabel("Name");
	  name.setFont(new Font("Arial", Font.PLAIN, 19));
		name.setSize(590,40);
      name.setLocation(60,90);
      c.add(name);
      
         
	  tname=new JTextField(20);
	  tname.setFont(new Font("Arial", Font.PLAIN, 17));
		tname.setSize(250,25);
      tname.setLocation(250,99);
      c.add(tname);
      
	  dob=new JLabel("DOB");
	  dob.setFont(new Font("Arial", Font.PLAIN, 19));
		dob.setSize(590,40);
      dob.setLocation(60,120);
      c.add(dob);
      
        tdob=new JTextField(20);
	  tdob.setFont(new Font("Arial", Font.PLAIN, 17));
		tdob.setSize(250,25);
      tdob.setLocation(250,129);
      c.add(tdob);
      
	  doj=new JLabel( "DOJ");
	  doj.setFont(new Font("Arial", Font.PLAIN, 19));
		doj.setSize(590,40);
      doj.setLocation(60,150);
      c.add(doj);
      
	
      
	  tdoj=new JTextField(20);
	  tdoj.setFont(new Font("Arial", Font.PLAIN, 17));
		tdoj.setSize(250,25);
      tdoj.setLocation(250,159);
      c.add(tdoj);
	  
	  submit=new JButton("Submit");
	  submit.setFont(new Font("Arial", Font.PLAIN, 25));
		submit.setSize(120,40);
      submit.setLocation(180,210);
      c.add(submit);
	  
	
	  
	  MyWindowController mw=new MyWindowController(this);
		this.addWindowListener(mw);
		
		RegistrationController rc=new RegistrationController(this);
		submit.addActionListener(rc);
		
		setVisible(true);
		
  }

public JLabel getId() {
	return id;
}

public void setId(JLabel id) {
	this.id = id;
}
/*
public JLabel getName() {
	return name;
}*/

public void setName(JLabel Name) {
	this.name = Name;
}

public JLabel getDob() {
	return dob;
}

public void setDob(JLabel dob) {
	this.dob = dob;
}

public JLabel getDoj() {
	return doj;
}

public void setDoj(JLabel doj) {
	this.doj = doj;
}

public JTextField getTid() {
	return tid;
}

public void setTid(JTextField tid) {
	this.tid = tid;
}

public JTextField getTname() {
	return tname;
}

public void setTname(JTextField tname) {
	this.tname = tname;
}

public JTextField getTdob() {
	return tdob;
}

public void setTdob(JTextField tdob) {
	this.tdob = tdob;
}

public JTextField getTdoj() {
	return tdoj;
}

public void setTdoj(JTextField tdoj) {
	this.tdoj = tdoj;
}

public JButton getSubmit() {
	return submit;
}

public void setSubmit(JButton submit) {
	this.submit = submit;
}
  
}
