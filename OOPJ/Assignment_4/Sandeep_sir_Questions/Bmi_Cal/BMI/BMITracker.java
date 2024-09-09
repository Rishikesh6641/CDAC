package BMI;

public class BMITracker {
	
	private double weight;
	private double height;
	
	public BMITracker()
	{
		this.weight=0.0;
		this.height=0.0;	
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double Calculate()
	{
		double bmi=this.weight/(this.height*this.height);
		return bmi;
	}
}
