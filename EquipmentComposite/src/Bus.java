import java.util.ArrayList;
import java.util.Iterator;

public class Bus extends CompositeEquipment {
	private final double busWatts;
	private final double busPrice;
	private final double discountBusPrice;
	private double netPrice;
	private double totalWatts;
	private double discountPrice;
	
	///////////////////////////////////////////////////////////////////////////
	// CONTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	public Bus() 
	{
		this.name = "bus";
		this.busWatts = 25;
		this.busPrice = 10.00;
		this.discountBusPrice = (this.busPrice * .90);
		this._equipment = new ArrayList<Equipment>();
	}
	
	@Override
	public double getWatts() {
		Iterator<Equipment> equipmentIterator = CreateIterator();
		this.totalWatts = this.busWatts;
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
		this.netPrice = this.busPrice;
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
		this.discountPrice = this.discountBusPrice;
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
