import java.util.Iterator;
import java.util.List;

// The only thing that makes this class abstract is the lack of a constructor -
// We will subclass to provide a constructor which assigns a name, but only
// leaves will have prices and wattages independent of subcomponents
public abstract class CompositeEquipment extends Equipment {

	///////////////////////////////////////////////////////////////////////////
	// PROTECTED MEMBERS - All subclasses will inherit their own copies of
	//						these members
	///////////////////////////////////////////////////////////////////////////
	protected List<Equipment> _equipment;

	///////////////////////////////////////////////////////////////////////////
	// ABSTRACT METHODS - these are left for subclasses to implement because
	// 					  calculating these totals will also include the
	//					  wattage/price/discount of the class itself, plus all
	//					  children, thus implementation will be a bit different
	//					  for each
	///////////////////////////////////////////////////////////////////////////
	public abstract double getWatts();
	public abstract double getNetPrice();
	public abstract double getDiscountPrice();
	
	///////////////////////////////////////////////////////////////////////////
	// METHODS - Default implementations; these include only those operations
	// 			 which will be the same for all composite classes
	///////////////////////////////////////////////////////////////////////////
	@Override
	public String Add(Equipment equip)
	{
		this._equipment.add(equip);
		return "\nThis is subclasses from the CompositeEquipment class, " +
				" there for other equipment can be added to it. We just added a " +
				equip.getName() + " to the " + this.getName();	
	}
	
	@Override
	public String Remove(Equipment equip)
	{
		Iterator<Equipment> rmvIter = CreateIterator();
		while (rmvIter.hasNext())
		{
			if (rmvIter.next().getName().equals(equip.getName()))
			{
				rmvIter.remove();
			}
		}
		return "\nThis is subclass of the CompositeEquipment class, " +
				"therefor other equipment can be removed from it. We just removed a " +
				equip.getName() + " from the " + this.getName();	
	}
	
	@Override
	public Iterator<Equipment> CreateIterator()
	{
		Iterator<Equipment> equipmentIterator = _equipment.iterator();
		return equipmentIterator;
	}
}
