package q8;

import java.util.Scanner;
//import q8.Array;

public class Main {
	public static void main(String[] args)
	{
		Array a=new Array(5);
		Scanner sc=new Scanner(System.in);
		a.setArray();
		System.out.print("Enter Index");
		a.getArray(sc.nextInt());
		sc.close();
	}

}
