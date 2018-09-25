package org.wecancodeit.virtualpetsamok;

class EmphysemaVP extends AbstractDnaVP
{
	public EmphysemaVP(OrganicPet pet_decoration)
	{
		this.oVpDecoration = pet_decoration;
		this.shiftMaxStimulationBy(-15);
		this.setDescription(" slow paced and always wheezing");
	}
}
