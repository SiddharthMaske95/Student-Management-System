package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;


public class HomeController implements ActionListener
{
Home h;

    public HomeController(Home home)
    {
      this.h=home;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
       if(e.getSource()==h.getInsert())
	   {
			new View.Registration();
			h.dispose();
    	}	
		if(e.getSource()==h.getUpdate())
		{
		new View.Update();
			h.dispose();
		}
		
		if(e.getSource()==h.getDelete())
		{
			new View.Delete();
			h.dispose();
		}
		
		if(e.getSource()==h.getShow())
		{
			new View.Show();
			h.dispose();
		}
		
		if(e.getSource()==h.getSearch())
		{
			new View.Search();
			h.dispose();
		}
	
	
	}

}
