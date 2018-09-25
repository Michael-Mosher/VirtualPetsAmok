package org.wecancodeit.virtualpetsamok;

abstract class AbstractVirtualPet implements IVirtualPet {
	protected String description;
	
	abstract protected void shiftMaxHydrationBy(int shift);
	
	abstract protected void shiftMinHydrationBy(int shift);
	
	abstract protected void shiftMaxFullnessBy(int shift);
	
	abstract protected void shiftMinFullnessBy(int shift);
	
	abstract protected void shiftMaxStimulationBy(int shift);
	
	abstract protected void shiftMinStimulationBy(int shift);
	
	abstract protected void shiftMaxHealthBy(int shift);
	
	abstract protected void shiftMinHealthBy(int shift);
	
	abstract protected void setHydrationMultiplier(double dNewMultiplier);
	
	abstract protected void setFullnessMultiplier(double dNewMultiplier);
	
	abstract protected void setStimulationMultiplier(double dNewMultiplier);
	
	abstract protected void setHealthMultiplier(double dNewMultiplier);
	
	public AbstractVirtualPet getPet()
	{
		return this;
	}
	
	public String toString()
	{
		return this.getPet() + "";
	}
	
}
