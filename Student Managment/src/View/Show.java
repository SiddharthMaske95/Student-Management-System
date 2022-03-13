package View;

import java.awt.*;

import javax.swing.*;

import Controller.MyWindowController;
import Controller.RegistrationController;
import Controller.ShowController;

public class Show  extends JFrame
{
  JLabel show;
  JButton click;
  Container c;
  public Show()
  {
	  setTitle("All Student Information");
	 
		 this.setBounds(190,120,540,570);
		 c = getContentPane();
	        c.setLayout(null);
	  
	  show=new JLabel(" All Data");
	  show.setFont(new Font("Arial", Font.PLAIN,19));
	  show.setSize(590,40);
	  show.setLocation(60,60);
	  c.add(show);
	  
	  click=new JButton("Click Here");
	  
	  click.setFont(new Font("Arial", Font.PLAIN, 19));
	  click.setSize(140,30);
	  click.setLocation(180,64);
      c.add(click);
	  
	  MyWindowController mw=new MyWindowController(this);
		this.addWindowListener(mw);
		
		ShowController rc=new ShowController(this);
		click.addActionListener(rc);
		 setVisible(true);
  }

public JLabel getShow() {
	return show;
}

public void setShow(JLabel show) {
	this.show = show;
}

public JButton getClick() {
	return click;
}

public void setClick(JButton click) {
	this.click = click;
}
  
}
