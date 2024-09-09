package LoanUtil;

import org.loanAmotizationCalculator.LoanAmortization;

public class LoanUtil {
	
    private	LoanAmortization la;
    
    public LoanUtil()
    {
    	this.la=new LoanAmortization();
    }
    
    public void acceptRecord(float principal, float annualIntrest, int terms)
    {
    	
    	la.setPrincipal(principal);
    	la.setAnnualIntrest(annualIntrest);
    	la.setTerms(terms);
    }
    
    public void printRecord(float principal, float annualIntrest, int terms)
    {
    	System.out.printf("Monthly Paymet: %.2f ",la.monthlyPay(principal,annualIntrest,terms) );
    	System.out.println();
    	System.out.println(la.getPrincipal());
    }

	public LoanAmortization getLa() {
		return la;
	}
}
