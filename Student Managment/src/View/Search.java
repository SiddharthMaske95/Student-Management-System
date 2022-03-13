package View;

import java.awt.*;

import javax.swing.*;

import Controller.MyWindowController;
import Controller.RegistrationController;
import Controller.SearchController;


public class Search  extends JFrame 
{
    JLabel sr;
    JTextField tsr;
    JButton srh;
    Container c;
    public Search()
    {
    	  setTitle("Student Registration Form");
    		
 		 setBounds(190,120,540,570);
 		 c = getContentPane();
 	        c.setLayout(null);
 		
 	  
 	  sr=new JLabel("Enter Student ID No");
 	  sr.setFont(new Font("Arial", Font.PLAIN,19));
 	  sr.setSize(590,40);
 	  sr.setLocation(60,60);
 	  c.add(sr);
 	  
 	  tsr=new JTextField(20);
 	 tsr.setFont(new Font("Arial", Font.PLAIN,17));
 	tsr.setSize(250,25);
 	tsr.setLocation(250,69);
       c.add(tsr);
		
       srh=new JButton("Search");
       srh.setFont(new Font("Arial", Font.PLAIN, 25));
       srh.setSize(120,40);
       srh.setLocation(220,99);
       c.add(srh);
    	
    	  MyWindowController mw=new MyWindowController(this);
  		this.addWindowListener(mw);
  		
  		SearchController rc=new SearchController(this);
  		srh.addActionListener(rc);
  		this.setVisible(true);
    }

	public JLabel getSr() {
		return sr;
	}

	public void setSr(JLabel sr) {
		this.sr = sr;
	}

	public JTextField getTsr() {
		return tsr;
	}

	public void setTsr(JTextField tsr) {
		this.tsr = tsr;
	}

	public JButton getSrh() {
		return srh;
	}

	public void setSrh(JButton srh) {
		this.srh = srh;
	}
    
}
