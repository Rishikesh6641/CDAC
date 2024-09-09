package tester;

import tollboothUtil.Util;

public class Tester {
	
	int choice;
	
	public static void main(String[] args)
	{
		Util u=new Util();
		Tester t=new Tester();
		while((t.choice=u.menulist())!=0)
		{		
			switch(t.choice)
			{
			case 1:u.setRates();
				break;
			case 2:u.getCounts();
				break;
			case 3:u.getRevenue();
				break;
			case 4:u.Entry();
				break;
			}
		}
	}
}
