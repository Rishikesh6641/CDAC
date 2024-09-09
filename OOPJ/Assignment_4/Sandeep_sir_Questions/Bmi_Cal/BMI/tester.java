package BMI;

public class tester {
	
	
	
	public static void main(String[] args)
	{
		int choice;
		BMIUtil bmiu = new BMIUtil();
		
		while((choice=bmiu.menulist())!=0)
		{
			switch(choice)
			{
			case 1: bmiu.acceptRcord();
			break;
			case 2: bmiu.printRecord();
			break;
			}
		}
		
		bmiu.Resourcerelease();
	}

}
