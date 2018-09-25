package org.wecancodeit.virtualpetsamok;

abstract class OrganicPet extends VirtualPet {

	private int iMaxHappiness = 100;
	private int iMinHappiness = 1;
	private int happiness = iMaxHappiness;
	private int iFullHappiness = iMaxHappiness;
	private int iSignificantHappiness = 30;
	private int iModestHappiness = 10;
	private int iPoorHappiness = 0;
	private double dHappinessMultiplier = 1;
	
	public OrganicPet(String name, String description) {
		super(name, description);
	}

	private void setHappiness(int iNewHappiness)
	{
		if(this.iMinHappiness < iNewHappiness && iNewHappiness < this.iMaxHappiness) {
			this.happiness = iNewHappiness;
		} else if(this.iMinHappiness < iNewHappiness) {
			this.happiness = this.iMaxHappiness;
		} else {
			this.happiness = this.iMinHappiness;
		}
		
	}

	public void feed()
	{
		this.incrementSignificantFullness();
	}
	

	public void incrementSignificantHappiness()
	{
		this.setHappiness(this.getHappiness() + this.iSignificantHappiness);
	}
	
	public void incrementFullHappiness()
	{
		this.setHappiness(this.getHappiness() + this.iFullHappiness);
	}
	
	public void incrementModestHappiness()
	{
		this.setHappiness(this.getHappiness() + this.iModestHappiness);
	}
	
	public void incrementPoorHappiness()
	{
		this.setHappiness(this.getHappiness() + this.iPoorHappiness);
	}
	
	public int getHappiness()
	{
		return this.happiness;
	}
	
	protected void setMaxHappiness(int iNewMax)
	{
		this.iMaxHappiness = iNewMax;
	}
	
	protected void setMinHappiness(int iNewMin)
	{
		this.iMinHappiness = iNewMin;
	}
	
	protected void setHappinessMultiplier(double iNewMulti)
	{
		this.dHappinessMultiplier  = iNewMulti;
	}
	
	public void decrementHappinessBy(int iDecrement)
	{
		this.setHappiness((int)(this.getHappiness() - this.dHappinessMultiplier * iDecrement));
	}
	
	@Override
	public void tick() {
		System.out.println("OrganicPet.tick just before decrementHappinessBy");
		this.decrementHappinessBy(10);
		super.tick();
	}

	protected void giveTreat()
	{
		this.incrementModestFullness();
		this.incrementSignificantHappiness();
	}

	public void water() {
		this.incrementSignificantHydration();
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Happiness: " + this.getHappiness()
				+ " out of: " + this.iMaxHappiness;
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " an organic";
	}
}
