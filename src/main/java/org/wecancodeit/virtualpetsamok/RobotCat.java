package org.wecancodeit.virtualpetsamok;

class RobotCat extends RoboticPet implements iCat
{

	public RobotCat(String name, String description)
	{
		super(name, description);
	}

	@Override
	public void herd() {
		this.incrementModestStimulation();
	}

	@Override
	public String getDescription()
	{
		return super.getDescription() + " cat";
	}
}