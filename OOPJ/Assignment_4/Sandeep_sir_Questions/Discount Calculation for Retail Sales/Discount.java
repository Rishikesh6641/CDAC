package discount;


public class Discount {
	
	private float original_p;
	private float per;
	
	public Discount()
	{
		this.original_p=0;
		this.per=0.0f;
	}

	public float getOriginal_p() {
		return original_p;
	}

	public void setOriginal_p(float original_p) {
		this.original_p = original_p;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	
	public float discount()
	{
		float disc=(per/100)*this.original_p;
		return disc;
	}
	public float finalprice()
	{
		return this.original_p-discount();
	}
}
