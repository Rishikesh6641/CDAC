package org.implementation.tester;

import org.implementation.util.Menu;
import org.implementation.util.Util;

public class Tester {
	public static void main(String[] args)
	{
		Util u=new Util();
		Menu ch;	
		while((ch=u.menulist())!=Menu.exit)
		{
			switch(ch)
			{
			case accept:
				u.acceptRecord();
				break;
			case print:
				u.printRecord();
				break;
			case setdate:
				u.setJoiningDate();
				break;
			}
		}
		Util.closeResource();
	}
}
