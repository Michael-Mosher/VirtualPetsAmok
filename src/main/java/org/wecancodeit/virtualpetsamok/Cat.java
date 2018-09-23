package org.wecancodeit.virtualpetsamok;

class Cat extends OrganicPet implements iCat {

	public Cat(String name, String description)
	{
		super(name, description);
	}

	public void giveTuna() {
		super.giveTreat();
	}

	@Override
	public void herd() {
		this.incrementModestStimulation();
	}

}
