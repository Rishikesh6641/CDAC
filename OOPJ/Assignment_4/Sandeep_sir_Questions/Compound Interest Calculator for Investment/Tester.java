package testerpack;

//import java.util.Scanner;

import CompoundUtil.CompoundUtil;

public class Tester {
	
	public static void main(String args[])
	{
		CompoundUtil cu=new CompoundUtil();	
		int choice=0;		
		while((choice=cu.menulist())!=0)
		{
			switch(choice)
			{
			case 1: cu.acceptRecords();
			break;
			case 2:cu.printRecord();
			break;
			case 3:System.out.printf("Future Value: %.2f ",cu.getCom().FutureValue());
			break;
			}
		}
	}
}
