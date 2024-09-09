public class Logger {
	
	private static Logger logger=null;
	private String msg;
	private Logger()
	{
	}
	
	public static Logger getInstance()
	{
		if(logger==null)
			return logger=new Logger();
			
		return logger;
	}
	
	public void log(String msg)
	{
		this.msg=msg;
	}
	public String getLog()
	{
		return this.msg;
	}
	
	public void clearLog()
	{
		this.msg="";
	}
}

class Main
{
	public static void main(String args[])
	{
		Logger instance=Logger.getInstance();
		
		Logger instance2=Logger.getInstance();
		
		instance.log("I am using Logger Instance instance 1");
		
		System.out.println(instance2.getLog());
		
		instance2.clearLog();
		
		System.out.println(" **"+instance.getLog());
		
		instance2.log("I am using Logger Instance instance 2");
		
		System.out.println(" **"+instance.getLog());
		

	}
}
