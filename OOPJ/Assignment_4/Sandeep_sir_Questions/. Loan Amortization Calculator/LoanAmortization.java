package org.loanAmotizationCalculator;

public class LoanAmortization {
	
	private float principal;
	private float annualIntrest;
	private int terms;
	
	
	
	public LoanAmortization() {
		this.principal = 0.0f;
		this.annualIntrest = 0.0f;
		this.terms = 0;
	}
	

	public float getPrincipal() {	
		return this.principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	
	
	public float getAnnualIntrest() {
		return this.annualIntrest;
	}
	public void setAnnualIntrest(float annualIntrest) {
		this.annualIntrest = annualIntrest;
	}
	
	
	public void setTerms(int terms) {
		this.terms = terms;
	}
	public int getTerms() {
		return this.terms;
	}
	
	
	public double monthlyPay(float p, float annual, int terms) {
		double pd = Double.valueOf(p);     
		double ad = Double.valueOf(annual); 
		double monthlyInterest = monthlyIntrest(ad); 
		int totalMonths = Month(terms);     
		
	
		double mp = pd * (monthlyInterest * Math.pow(1 + monthlyInterest, totalMonths) 
		        / (Math.pow(1 + monthlyInterest, totalMonths) - 1));
		return mp;
	}
	
	public float monthlyIntrest(double annual) {
		return (float)(annual / 12); 
	}
	
	
	public int Month(int terms) {
		return terms * 12;
	}
}