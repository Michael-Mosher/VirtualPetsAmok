package org.wecancodeit.virtualpetsamok;

class RobotDog extends RobotPet implements iDog
{

	public RobotDog(String name, String description) {
		super(name, description);
	}

	@Override
	public void walk() {
		this.incrementModestHealth();
	}

}
