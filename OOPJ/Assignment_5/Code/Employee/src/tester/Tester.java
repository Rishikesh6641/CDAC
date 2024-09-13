package tester;

import EmployeeUtil.EmployeeUtil;

public class Tester {
	
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		EmployeeUtil util=new EmployeeUtil();
		int choice;
		
		while((choice=util.menulist())!=0)
		{
			switch(choice)
			{
			case 1:util.accept();
			break;
			case 2:util.getemp().raise();
			break;
			case 3:util.printRecord();
			break;
			case 4:util.CompanyRecord();
			break;
			}
		}
		
		util.closeResource();
	}

}
