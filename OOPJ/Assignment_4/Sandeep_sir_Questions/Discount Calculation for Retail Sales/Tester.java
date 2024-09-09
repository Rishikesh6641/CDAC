package teseter;

import discountUtil.discUtil;

public class Tester {
	
	public static void main(String[] args)
	{
		discUtil du=new discUtil();
		
		int choice;
		
		while((choice=du.menulist())!=0)
		{
			switch(choice)
			{
			case 1:du.accept();
			break;
			case 2:du.printRecord();
			break;
			}
		}
		
		du.closeResources();
	}

}
