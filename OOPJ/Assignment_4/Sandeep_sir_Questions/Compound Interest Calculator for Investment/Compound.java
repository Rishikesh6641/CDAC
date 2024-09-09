package CompoundIntrest;

public class Compound {
	
	private double intitalInvestment;
	private float annualntrest;
	private int terms;
	private float duration;
	
	public Compound()
	{
		this.intitalInvestment=0.0;
		this.annualntrest=0.0f;
		this.terms=0;
		this.duration=0.0f;
	}

	public double getIntitalInvestment() {
		return intitalInvestment;
	}

	public void setIntitalInvestment(double intitalInvestment) {
		this.intitalInvestment = intitalInvestment;
	}

	public float getAnnualntrest() {
		return annualntrest;
	}

	public void setAnnualntrest(float annualntrest) {
		this.annualntrest = annualntrest;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public double FutureValue()
	{
		double futurevalue=1+this.annualntrest/this.terms;
		futurevalue=Math.pow(futurevalue,(terms*duration));
		futurevalue=this.intitalInvestment+futurevalue;
		return futurevalue;
	}
	public double totalIntrest()
	{
		return FutureValue()-this.intitalInvestment;
	}
	
}
