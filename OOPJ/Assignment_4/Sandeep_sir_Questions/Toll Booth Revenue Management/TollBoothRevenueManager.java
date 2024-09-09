package tollBooth;

public class TollBoothRevenueManager {
	private static int car_r;
	private static int truck_r;
	private static int bike_r;
	private static float revenue;
	private static int total_cars;
	private static int total_truks;
	private static int total_bikes;
	
	public TollBoothRevenueManager()
	{
		car_r=0;
		truck_r=0;
		bike_r=0;
	}
	
	public static void setCar_r(int car_r) {
		TollBoothRevenueManager.car_r = car_r;
	}

	public static void setTruck_r(int truck_r) {
		TollBoothRevenueManager.truck_r = truck_r;
	}

	public static void setBike_r(int bike_r) {
		TollBoothRevenueManager.bike_r = bike_r;
	}

	public static int getCar_r() {
		return car_r;
	}
	public static int getTruck_r() {
		return truck_r;
	}
	public static int getBike_r() {
		return bike_r;
	}
	
	public static int getTotal_cars() {
		return total_cars;
	}

	public static int getTotal_truks() {
		return total_truks;
	}

	public static int getTotal_bikes() {
		return total_bikes;
	}

	public static void countCar()
	{
		total_cars++;
	}
	public static void countTruck()
	{
		total_truks++;
	}
	public static void countBike()
	{
		total_bikes++;
	}
	
	public static float revenueCounter()
	{
		revenue=(total_cars*getCar_r())+(total_bikes*getBike_r())+(total_truks*getTruck_r());
		return revenue;	
	}

}
