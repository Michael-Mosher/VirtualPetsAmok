package org.wecancodeit.virtualpetsamok;

import java.util.ArrayList;
import java.util.List;

class VirtualPetShelter {

	private List<AbstractCageDnaVP> pets;
	private int iIndex = 0;
	
	public VirtualPetShelter()
	{
		this.pets = new ArrayList<AbstractCageDnaVP>();
	}
	
	public void admitPet(AbstractVirtualPet new_pet)
	{
		AbstractCageDnaVP oPetInsert;
		if(!(new_pet instanceof AbstractCageDnaVP)){
			if(new_pet.getPet() instanceof OrganicPet) oPetInsert = new DirtyCage(new_pet);
			else if(new_pet.getPet() instanceof RoboticPet) oPetInsert = new FaradayCage(new_pet);
			else oPetInsert = new DirtyCage(new VirtualPet("EMPTYCAGE", "space collecting dust, but with so much promise to provide sanctuary"));
		} else oPetInsert = (AbstractCageDnaVP) new_pet;
		this.pets.add(oPetInsert);
	}
	
	public int getShelterOccupancy()
	{
		return this.pets.size();
	}

	@Deprecated
	public String[] getPetStatistics() {
		String[] answer = new String[5];
		if(!this.pets.isEmpty() && this.iIndex < this.getShelterOccupancy()){
			answer[0] = this.pets.get(this.iIndex).getName();
			answer[1] = "" + this.pets.get(this.iIndex).getHydration();
			answer[2] = "" + this.pets.get(this.iIndex).getFullness();
			answer[3] = "" + this.pets.get(this.iIndex).getStimulation();
			answer[4] = "" + this.pets.get(this.iIndex).getHealth();
		}
		return answer;
	}
	
	public String getCurrentPetToString()
	{
		return this.pets.get(this.iIndex).getPet().toString(); 
	}

	public void next()
	{
		this.iIndex++;
	}
	
	public boolean isValidIndex()
	{
		return this.iIndex < this.pets.size();
	}
	
	public void resetIndex()
	{
		this.iIndex = 0;
	}

	public void tickAll() {
		for(AbstractCageDnaVP pet : this.pets) {
			pet.tick();
		}
	}

	public void feedAll() {
		for(AbstractCageDnaVP pet : this.pets) {
			if(pet.getPet() instanceof OrganicPet) ((OrganicPet) pet.getPet()).feed();
		}
	}
	
	public void waterAll()
	{
		for(AbstractCageDnaVP pet : this.pets) {
			if(pet.getPet() instanceof OrganicPet) ((OrganicPet) pet.getPet()).water();
		}
	}

	public void playWith(int i)
	{
		((VirtualPet) this.pets.get(i).getPet()).play();
	}
	
	public void cleanAllCages()
	{
		for(AbstractCageDnaVP pet : this.pets) {
			pet.cleanCage();
		}
	}

	public AbstractVirtualPet adoptOne(int i)
	{
		AbstractVirtualPet answer = this.pets.remove(i).getPet();
		return answer;
	}
	
	public String getCurrentName()
	{
		return this.pets.get(this.iIndex).getName();
	}
	
//	@Deprecated
	public String getCurrentDescription()
	{
		return this.pets.get(this.iIndex).getDescription();
	}
	
	public int getCurrentHydration()
	{
		return this.pets.get(this.iIndex).getHydration();
	}
	
	public int getCurrentFullness()
	{
		return this.pets.get(this.iIndex).getFullness();
	}
	
	public int getCurrentStimulation()
	{
		return this.pets.get(this.iIndex).getStimulation();
	}
	
	public int getCurrentHealth()
	{
		return this.pets.get(this.iIndex).getHealth();
	}
	
	/**
	 * Returns the current VirtualPet's Happiness score, if it has one, if not then it returns 100.
	 * @return int
	 */
	public int getCurrentHappiness()
	{
		int answer;
		if(this.pets.get(this.iIndex).getPet() instanceof OrganicPet) answer = ((OrganicPet)this.pets.get(this.iIndex).getPet()).getHappiness();
		else answer = 100;
		return answer;
	}
	
	public int getCurrentIndex()
	{
		return this.iIndex;
	}

	public void cleanLitter()
	{
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof Cat) {
				((Cat)pet.getPet()).cleanLitter();
			}
		}
	}

	public void oilAll() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof RoboticPet) {
				((RoboticPet)pet.getPet()).oil();
			}
		}
	}

	public void treatDogs() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof Dog) {
				((Dog)pet.getPet()).giveBacon();
			}
		}
	}

	public void treatCats() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof Cat) {
				((Cat)pet.getPet()).giveTuna();
			}
		}
	}

	public void treatRobotics() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof RoboticPet) {
				((RoboticPet)pet.getPet()).giveSolidStateMemory();
			}
		}
	}

	public void walkAll() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof iDog) {
				((iDog)pet.getPet()).walk();
			}
		}
	}
	
	public void herdAll() {
		for (AbstractCageDnaVP pet : pets) {
			if(pet.getPet() instanceof iCat) {
				((iCat)pet.getPet()).herd();
			}
		}
	}
}
