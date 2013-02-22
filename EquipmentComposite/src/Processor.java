
public class Processor extends Equipment{
	private final double processorWatts;
	private final double processorPrice;
	private final double processorDiscountPrice;
	
	public Processor()
	{
		this.name = "processor";
		this.processorWatts = 250.00;
		this.processorPrice = 275;
		this.processorDiscountPrice = (this.processorPrice * .95);
	}

	@Override
	public double getWatts() {
		return this.processorWatts;
	}

	@Override
	public double getNetPrice() {
		return this.processorPrice;
	}

	@Override
	public double getDiscountPrice() {
		return this.processorDiscountPrice;
	}
	
	@Override
	public String toString()
	{
		return this.getName();
	}
}
