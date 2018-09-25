package org.wecancodeit.virtualpetsamok;

abstract class AbstractDnaVP extends AbstractVirtualPet
{
	protected AbstractVirtualPet oVpDecoration;
	protected String sDescription;
	
	public void tick()
	{
		this.oVpDecoration.tick();
	}
	
	public void decrementHydrationBy(int iDecrementAmount)
	{
		this.oVpDecoration.decrementHydrationBy(iDecrementAmount);
	}
	
	public void decrementHealthBy(int iDecrementAmount)
	{
		this.oVpDecoration.decrementHealthBy(iDecrementAmount);
	}
	
	public void decrementFullnessBy(int iDecrementAmount)
	{
		this.oVpDecoration.decrementFullnessBy(iDecrementAmount);
	}
	
	public void decrementStimulationBy(int iDecrementAmount)
	{
		this.oVpDecoration.decrementStimulationBy(iDecrementAmount);
	}

	public int getHydration() {
		return this.oVpDecoration.getHydration();
	}
	
	public int getFullness()
	{
		return this.oVpDecoration.getFullness();
	}
	
	public int getStimulation()
	{
		return this.oVpDecoration.getStimulation();
	}
	
	public int getHealth()
	{
		return this.oVpDecoration.getHealth();
	}
	
	public String getName()
	{
		return this.oVpDecoration.getName();
	}
	
	public String getDescription()
	{
		return this.oVpDecoration.getDescription() + this.sDescription;
	}

	@Override
	public void incrementFullHydration() {
		this.oVpDecoration.incrementFullHydration();
	}

	@Override
	public void incrementSignificantHydration()
	{
		this.oVpDecoration.incrementSignificantHydration();
	}

	@Override
	public void incrementModestHydration()
	{
		this.oVpDecoration.incrementModestHydration();
	}

	@Override
	public void incrementPoorHydration()
	{
		this.oVpDecoration.incrementPoorHydration();
	}

	@Override
	public void incrementFullFullness()
	{
		this.oVpDecoration.incrementFullFullness();
	}

	@Override
	public void incrementSignificantFullness()
	{
		this.oVpDecoration.incrementSignificantFullness();
	}

	@Override
	public void incrementModestFullness()
	{
		this.oVpDecoration.incrementModestFullness();
	}

	@Override
	public void incrementPoorFullness()
	{
		this.oVpDecoration.incrementPoorFullness();
	}

	@Override
	public void incrementFullStimulation()
	{
		this.oVpDecoration.incrementFullStimulation();
	}

	@Override
	public void incrementSignificantStimulation()
	{
		this.oVpDecoration.incrementSignificantFullness();
	}

	@Override
	public void incrementModestStimulation()
	{
		this.oVpDecoration.incrementModestStimulation();
	}

	@Override
	public void incrementPoorStimulation()
	{
		this.oVpDecoration.incrementPoorStimulation();
	}

	@Override
	public void incrementFullHealth()
	{
		this.oVpDecoration.incrementFullHealth();
	}

	@Override
	public void incrementSignificantHealth()
	{
		this.oVpDecoration.incrementSignificantHealth();
	}

	@Override
	public void incrementModestHealth()
	{
		this.oVpDecoration.incrementModestHealth();
	}

	@Override
	public void incrementPoorHealth()
	{
		this.oVpDecoration.incrementPoorHealth();
	}

	@Override
	protected void shiftMaxHydrationBy(int shift)
	{
		this.oVpDecoration.shiftMaxHydrationBy(shift);
	}

	@Override
	protected void shiftMinHydrationBy(int shift)
	{
		this.oVpDecoration.shiftMinHydrationBy(shift);
	}

	@Override
	protected void shiftMaxFullnessBy(int shift)
	{
		this.oVpDecoration.shiftMaxFullnessBy(shift);
	}

	@Override
	protected void shiftMinFullnessBy(int shift)
	{
		this.oVpDecoration.shiftMinFullnessBy(shift);
	}

	@Override
	protected void shiftMaxStimulationBy(int shift)
	{
		this.oVpDecoration.shiftMaxStimulationBy(shift);
	}

	@Override
	protected void shiftMinStimulationBy(int shift)
	{
		this.oVpDecoration.shiftMinStimulationBy(shift);
	}

	@Override
	protected void shiftMaxHealthBy(int shift)
	{
		this.oVpDecoration.shiftMaxHealthBy(shift);
	}

	@Override
	protected void shiftMinHealthBy(int shift)
	{
		this.oVpDecoration.shiftMinHealthBy(shift);
	}
	

	protected void setHydrationMultiplier(double dNewMultiplier)
	{
		this.oVpDecoration.setHydrationMultiplier(dNewMultiplier);
	}
	
	protected void setFullnessMultiplier(double dNewMultiplier)
	{
		this.oVpDecoration.setFullnessMultiplier(dNewMultiplier);
	}
	
	protected void setStimulationMultiplier(double dNewMultiplier)
	{
		this.oVpDecoration.setStimulationMultiplier(dNewMultiplier);
	}
	
	protected void setHealthMultiplier(double dNewMultiplier)
	{
		this.oVpDecoration.setHealthMultiplier(dNewMultiplier);
	}
	
	@Override
	public AbstractVirtualPet getPet()
	{
		return this.oVpDecoration.getPet();
	}

	public void setDescription(String description) {
		this.sDescription = description;
	}
}
