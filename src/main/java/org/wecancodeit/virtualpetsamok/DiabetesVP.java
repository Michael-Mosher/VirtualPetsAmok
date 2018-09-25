package org.wecancodeit.virtualpetsamok;

class DiabetesVP extends AbstractDnaVP
{
	public DiabetesVP(OrganicPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.setHealthMultiplier(1.33);
		this.setDescription(" with a special diet");
	}
}
