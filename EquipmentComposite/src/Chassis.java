import java.util.ArrayList;
import java.util.Iterator;

public class Chassis extends CompositeEquipment {
	///////////////////////////////////////////////////////////////////////////
	// PRIVATE INSTANCE VARIABLES
	///////////////////////////////////////////////////////////////////////////
	private final double chassisWatts;
	private final double chassisPrice;
	private final double discountChassisPrice;
	private double netPrice;
	private double totalWatts;
	private double discountPrice;
	
	///////////////////////////////////////////////////////////////////////////
	// CONTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	public Chassis() 
	{
		this.name = "chassis";
		this.chassisWatts = 0;
		this.chassisPrice = 10.00;
		this.discountChassisPrice = (this.chassisPrice * .90);
		this._equipment = new ArrayList<Equipment>();
	}
	
	@Override
	public double getWatts() {
		Iterator<Equipment> equipmentIterator = CreateIterator();
		this.totalWatts = this.chassisWatts;
		while (equipmentIterator.hasNext())
		{
			this.totalWatts += ((equipmentIterator.next()).getWatts());
		}
		return totalWatts;
	}
	
	@Override
	public double getNetPrice()
	{
		Iterator<Equipment> equipmentIterator = CreateIterator();
		this.netPrice = this.chassisPrice;
		while (equipmentIterator.hasNext())
		{
			netPrice += ((equipmentIterator.next()).getNetPrice());
		}
		return netPrice;
	}
	
	@Override
	public double getDiscountPrice()
	{
		Iterator<Equipment> equipmentIterator = CreateIterator();
		this.discountPrice = this.discountChassisPrice;
		while (equipmentIterator.hasNext())
		{
			discountPrice += ((equipmentIterator.next()).getDiscountPrice());
		}
		return discountPrice;
	}
	
	@Override
	public String toString()
	{
		return this.getName();
	}
}
