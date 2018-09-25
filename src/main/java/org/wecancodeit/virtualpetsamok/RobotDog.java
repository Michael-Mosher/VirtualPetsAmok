package org.wecancodeit.virtualpetsamok;

class RobotDog extends RoboticPet implements iDog
{

	public RobotDog(String name, String description) {
		super(name, description);
	}

	@Override
	public void walk() {
		this.incrementModestHealth();
		this.incrementSignificantStimulation();
	}

	@Override
	public String getDescription()
	{
		return super.getDescription() + " dog";
	}
}
