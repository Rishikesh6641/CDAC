package tollboothUtil;

import java.util.Scanner;

import tollBooth.TollBoothRevenueManager;

public class Util {
	
	private TollBoothRevenueManager trm;
	Scanner sc=new Scanner(System.in);
	
	public Util()
	{
		this.trm=new TollBoothRevenueManager();
	}

	public TollBoothRevenueManager getTrm() {
		return trm;
	}
	
	public void setRates()
	{
		System.out.println("Rates For Cars");
		TollBoothRevenueManager.setCar_r(sc.nextInt());
		
		System.out.println("Rates For Bikes");
		TollBoothRevenueManager.setBike_r(sc.nextInt());
		
		System.out.println("Rates For Trucks");
		TollBoothRevenueManager.setTruck_r(sc.nextInt());
	}
	public void getCounts()
	{
		System.out.println("Total_Cars: "+TollBoothRevenueManager.getTotal_cars());
		System.out.println("Total Bikes: "+TollBoothRevenueManager.getTotal_bikes());
		System.out.println("Total Trucks: "+TollBoothRevenueManager.getTotal_truks());
	}
	public void getRevenue()
	{
		System.out.println("Revenue Genrated: "+TollBoothRevenueManager.revenueCounter());
	}
	public void Entry()
	{
		int ch;
		
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("3.Truck");
		System.out.println("0.exit");
		
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:TollBoothRevenueManager.countCar();
		break;
		case 2:TollBoothRevenueManager.countBike();
		break;
		case 3:TollBoothRevenueManager.countTruck();
		break;
		}
		
	}
	public int menulist()
	{	
		System.out.println("1.Set Rates:");
		System.out.println("2.Get Count:");
		System.out.println("3.Get Revenue:");
		System.out.println("4.Entry");
		System.out.println("0.Exit:");
		
		return sc.nextInt();
	}

}
