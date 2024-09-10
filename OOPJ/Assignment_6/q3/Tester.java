package q3;

public class Tester {	
	public static void main(String[] args)
	{
		Util u=new Util();
		IoOpreation  choice;
		while((choice=Util.menulist())!=IoOpreation.Exit)
		{
			switch(choice)
			{
			case Accept:u.acceptRecord();
			break;
			case Largest_Element:u.getLargest();
			break;
			case Min_Element:u.getmin();
			break;
			case Prin_Array:u.printRecord();
			break;
			}
		}
	}
}
