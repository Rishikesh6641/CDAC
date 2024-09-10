package q4;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		Array array=new Array(sc.nextInt());
		
		array.setElement();
		array.getElement();
		System.out.println("After**************** ");
		array.removeDuplicate();
		array.getElement();
		
		sc.close();
	}

}
