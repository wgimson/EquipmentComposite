
public class EquipmentDriver {
	public static void main(String[] args)
	{
		// We'll create a couple composite objects
		Cabinet cabinet = new Cabinet();
		Chassis chassis = new Chassis();
		
		announceCreation(cabinet);
		announceCreation(chassis);
		
		// Add one to the other
		cabinet.Add(chassis);
		
		announceAddition(chassis, cabinet);
		
		// Create some more
		Bus bus = new Bus();
		
		announceCreation(bus);
		
		// I know this makes no sense from a hardware point of view
		// but just for the purposes of providing an example
		bus.Add(new HardDrive());
		
		announceAddition(new HardDrive(), bus);
		
		// Add some more composite objects to eachother
		chassis.Add(bus);
		
		announceAddition(bus, chassis);
		
		// add a leaf object
		chassis.Add(new Processor());
		
		announceAddition(new Processor(), chassis);
		
		// print output
		System.out.println("\nThe net price for the system is: " + cabinet.getNetPrice());
		System.out.println("\nThe discounted price for the system is: " + cabinet.getDiscountPrice());
		System.out.println("\nThe total watt demand for the system is: " + cabinet.getWatts());
		
		// remove a leaf object
		chassis.Remove(new Processor());

		announceRemoval(new Processor(), chassis);
		
		// now print output, should be cheaper and less power hungry
		System.out.println("\nThe net price for the system is: " + cabinet.getNetPrice());
		System.out.println("\nThe discounted price for the system is: " + cabinet.getDiscountPrice());
		System.out.println("\nThe total watt demand for the system is: " + cabinet.getWatts());
		
		// now we can try and add an Equipment object to a leaf object, see
		// what the default behavior of the Equipment class gives us 
		String errMssg = new Processor().Add(cabinet);
		System.out.println(errMssg);
	}
	
	public static void announceCreation(Equipment equip)
	{
		System.out.println("\nJust created " + equip);
	}
	
	public static void announceAddition(Equipment addedEquip, Equipment receivingEquip)
	{
		System.out.println("\nJust added " + addedEquip + " to " + receivingEquip);
	}
	
	public static void announceRemoval(Equipment removedEquip, Equipment losingEquip)
	{
		System.out.println("\nJust removed " + removedEquip + " from " + losingEquip + "\n");
	}
}
