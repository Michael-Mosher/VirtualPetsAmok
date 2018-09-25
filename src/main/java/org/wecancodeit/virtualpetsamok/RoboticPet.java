package org.wecancodeit.virtualpetsamok;

abstract class RoboticPet extends VirtualPet
{

	public RoboticPet(String name, String description)
	{
		super(name, description);
	}

	public void oil() {
		this.incrementSignificantHealth();
	}

	@Override
	public void tick() {
		this.decrementHealthBy(10);
		this.decrementStimulationBy(10);
	}

	public void giveSolidStateMemory() {
		this.incrementSignificantStimulation();
		this.incrementModestHealth();
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " a synthetic";
	}
}
