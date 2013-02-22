
public class HardDrive extends Equipment {
	private final double hardDriveWatts;
	private final double hardDrivePrice;
	private final double hardDriveDiscountPrice;
	
	public HardDrive()
	{
		this.name = "hard drive";
		this.hardDriveWatts = 25.00;
		this.hardDrivePrice = 65;
		this.hardDriveDiscountPrice = (this.hardDrivePrice * .95);
	}

	@Override
	public double getWatts() {
		return this.hardDriveWatts;
	}

	@Override
	public double getNetPrice() {
		return this.hardDrivePrice;
	}

	@Override
	public double getDiscountPrice() {
		return this.hardDriveDiscountPrice;
	}
	
	@Override
	public String toString()
	{
		return this.getName();
	}
}
