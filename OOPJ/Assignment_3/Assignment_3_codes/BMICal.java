package BMI_Calculator;
import java.util.Scanner;

public class BMICal {

	public static void main(String...args)
	{		
		Scanner sc=new Scanner(System.in);
		double weigth=sc.nextDouble();
		
		double height=sc.nextDouble();
		
		double bmi=weigth/(height*height);
		
		System.out.println(bmi);	
		if(bmi>=30)
			System.out.println("Over Weight");
		else if(bmi<30 && bmi>=18)
			System.out.println("Normal");
		else
			System.out.println("under Weight");
		
		sc.close();
		
	}
}
