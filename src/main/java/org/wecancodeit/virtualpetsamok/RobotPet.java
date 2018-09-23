package org.wecancodeit.virtualpetsamok;

abstract class RobotPet extends VirtualPet
{

	public RobotPet(String name, String description)
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
}
