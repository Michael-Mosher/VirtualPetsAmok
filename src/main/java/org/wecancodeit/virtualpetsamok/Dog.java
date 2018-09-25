package org.wecancodeit.virtualpetsamok;

class Dog extends OrganicPet implements iDog {

	public Dog(String name, String description) {
		super(name, description);
	}

	@Override
	public void walk() {
		this.incrementSignificantHappiness();
		this.incrementModestHealth();
		this.incrementSignificantStimulation();
	}

	public void giveBacon() {
		super.giveTreat();
	}

	@Override
	public String getDescription()
	{
		return super.getDescription() + " dog";
	}
}
