import java.util.Iterator;

public abstract class Equipment {
	///////////////////////////////////////////////////////////////////////////
	// PROTECTED MEMBERS - All subclasses will inherit these members
	///////////////////////////////////////////////////////////////////////////
	protected String name;
	
	///////////////////////////////////////////////////////////////////////////
	// ABSTRACT METHODS
	///////////////////////////////////////////////////////////////////////////
    public abstract double getWatts();
    public abstract double getNetPrice();
    public abstract double getDiscountPrice();
    
    ///////////////////////////////////////////////////////////////////////////
    // INSTANCE METHODS - Methods that make sense for a leaf and will be 
    // 				      overridden for a composite
    ///////////////////////////////////////////////////////////////////////////
    public String getName()
    {
    	return this.name;
    }
    
    public String Add(Equipment equip){
    	return "\nCannot add anything; leaf implementations are not " +
                "composites and contain no children\n";
    }
    public String Remove(Equipment equip)
    {
    	return "\nCannot remove anything; leaf implementations are not " +
                "composites and contain no children\n";
    	
    }
    public Iterator<Equipment> CreateIterator()
    {
    	return null;
    }
}
