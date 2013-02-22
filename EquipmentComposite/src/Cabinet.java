import java.util.ArrayList;
import java.util.Iterator;

public class Cabinet extends CompositeEquipment {
	///////////////////////////////////////////////////////////////////////////
	// PRIVATE INSTANCE VARIABLES
	///////////////////////////////////////////////////////////////////////////
	private final double cabinetWatts;
	private final double cabinetPrice;
	private final double discountCabinetPrice;
	private double netPrice;
	private double totalWatts;
	private double discountPrice;
	
	///////////////////////////////////////////////////////////////////////////
	// CONTRUCTOR
	///////////////////////////////////////////////////////////////////////////
	public Cabinet() 
	{
		this.name = "cabinet";
		this.cabinetWatts = 10;
		this.cabinetPrice = 30.00;
		this.discountCabinetPrice = (this.cabinetPrice * .90);
		this._equipment = new ArrayList<Equipment>();
	}
	
	@Override
	public double getWatts() {
		Iterator<Equipment> equipmentIterator = CreateIterator();
		this.totalWatts = this.cabinetWatts;
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
		this.netPrice = this.cabinetPrice;
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
		this.discountPrice = this.discountCabinetPrice;
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
