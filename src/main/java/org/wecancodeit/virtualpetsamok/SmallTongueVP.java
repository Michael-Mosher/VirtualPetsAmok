package org.wecancodeit.virtualpetsamok;

class SmallTongueVP extends AbstractDnaVP {

	public SmallTongueVP(OrganicPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.setHydrationMultiplier(1.25);
		this.setDescription(" with a tiny tongue that can hardly drink");
	}
}
