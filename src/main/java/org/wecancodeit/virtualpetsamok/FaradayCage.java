package org.wecancodeit.virtualpetsamok;

public class FaradayCage extends AbstractCageDnaVP {

	public FaradayCage(AbstractVirtualPet new_pet) {
		this.oVpDecoration = new_pet;
		this.sDescription  = " in a Faraday cage";
	}

	@Override
	public void cleanCage() {
		// do nothing
	}
	
	

}
