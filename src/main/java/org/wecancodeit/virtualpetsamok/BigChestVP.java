package org.wecancodeit.virtualpetsamok;

class BigChestVP extends AbstractDnaVP
{
	public BigChestVP(OrganicPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.shiftMaxHealthBy(5);
		this.setDescription(" a full chested alpha");
	}

}
