package org.wecancodeit.virtualpetsamok;

public class VirtualPet extends AbstractVirtualPet {

	private int hydration;
	private int fullness;
	private int stimulation;
	private int health;
	private String name;
	private int iTick = 10;
	private int iMaxHydration = 100;
	private int iMinHydration = 1;
	private int iMaxFullness = 100;
	private int iMinFullness = 1;
	private int iMaxStimulation = 100;
	private int iMinStimulation = 1;
	private int iMaxHealth = 100;
	private int iMinHealth = 1;
	private int iFull = 100;
	private int iSignificant = 30;
	private int iModest = 10;
	private int iPoor = 0;
	private double dHydrationMultiplier = 1;
	private double dFullnessMultiplier = 1;
	private double dStimulationMultiplier = 1;
	private double dHealthMultiplier = 1;
	
	
	public VirtualPet(String name, String description) {
		this.setHydration(100);
		this.setFullness(100);
		this.setStimulation(100);
		this.setHealth(100);
		this.name = name;
		this.description = description;
	}

	public void tick()
	{
		this.decrementHydrationBy(this.iTick);
		this.decrementFullnessBy(this.iTick);
		this.decrementStimulationBy(this.iTick);
	}
	
	public void decrementHydrationBy(int iDecrementAmount)
	{
		this.setHydration((int) (this.getHydration() - (iDecrementAmount * this.dHydrationMultiplier )));
	}
	
	public void decrementHealthBy(int iDecrementAmount)
	{
		this.setHealth((int) (this.getHealth() - (iDecrementAmount * this.dHealthMultiplier)));
	}
	
	public void decrementFullnessBy(int iDecrementAmount)
	{
		this.setFullness((int) (this.getFullness() - (iDecrementAmount * this.dFullnessMultiplier)));
	}
	
	public void decrementStimulationBy(int iDecrementAmount)
	{
		this.setStimulation((int) (this.getStimulation() - (iDecrementAmount * this.dStimulationMultiplier)));
	}

	public int getHydration() {
		return this.hydration;
	}
	
	public int getFullness()
	{
		return this.fullness;
	}
	
	public int getStimulation()
	{
		return this.stimulation;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	private void setHydration(int new_hydro)
	{
		if(new_hydro >= this.iMinHydration && new_hydro <= this.iMaxHydration) {
			this.hydration = new_hydro;
		} else if(new_hydro > this.iMaxHydration) this.hydration = this.iMaxHydration;
		else this.hydration = this.iMinHydration;
	}
	
	private void setFullness(int new_full)
	{
		if(new_full >= this.iMinFullness && new_full <= this.iMaxFullness) {
			this.fullness = new_full;
		} else if (new_full > this.iMaxFullness) this.fullness = this.iMaxFullness;
		else this.fullness = this.iMinFullness;
	}
	
	private void setStimulation(int new_stim)
	{
		if(new_stim >= this.iMinStimulation && new_stim <= this.iMaxStimulation) {
			this.stimulation = new_stim;
		} else if(new_stim > this.iMaxStimulation) this.stimulation = this.iMaxStimulation;
		else this.stimulation = this.iMinStimulation;
	}
	
	private void setHealth(int new_health)
	{
		if(new_health >= this.iMinHealth && new_health <= this.iMaxHealth) {
			this.health = new_health;
		} else if(new_health > this.iMaxHealth) this.health = this.iMaxHealth;
		else this.health = this.iMinHealth;
	}

	public String getName() {
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}

	@Override
	public void incrementFullHydration() {
		this.setHydration(this.getHydration() + this.iFull);
	}

	@Override
	public void incrementSignificantHydration() {
		this.setHydration(this.hydration + this.iSignificant);
	}

	@Override
	public void incrementModestHydration() {
		this.setHydration(this.hydration + this.iModest);
	}

	@Override
	public void incrementPoorHydration() {
		this.setHydration(this.getHydration() + this.iPoor);
	}

	@Override
	public void incrementFullFullness() {
		this.setFullness(this.getFullness() + this.iFull);
	}

	@Override
	public void incrementSignificantFullness() {
		this.setFullness(this.getFullness() + this.iSignificant);
	}

	@Override
	public void incrementModestFullness() {
		this.setFullness(this.getFullness() + this.iModest);
	}

	@Override
	public void incrementPoorFullness() {
		this.setFullness(this.getFullness() + this.iPoor);
	}

	@Override
	public void incrementFullStimulation() {
		this.setStimulation(this.getStimulation() + this.iFull);
	}

	@Override
	public void incrementSignificantStimulation() {
		this.setStimulation(this.getStimulation() + this.iSignificant);
	}

	@Override
	public void incrementModestStimulation() {
		this.setStimulation(this.getStimulation() + this.iModest);
	}

	@Override
	public void incrementPoorStimulation() {
		this.setStimulation(this.getStimulation() + this.iPoor);
	}

	@Override
	public void incrementFullHealth() {
		this.setHealth(this.getHealth() + this.iFull);
	}

	@Override
	public void incrementSignificantHealth() {
		this.setHealth(this.getHealth() + this.iSignificant);
	}

	@Override
	public void incrementModestHealth() {
		this.setHealth(this.getHealth() + this.iModest);
	}

	@Override
	public void incrementPoorHealth() {
		this.setHealth(this.getHealth() + this.iPoor);
	}

	@Override
	protected void shiftMaxHydrationBy(int shift) {
		this.iMaxHydration += shift;
		this.setHydration(this.getHydration() + 0);
	}

	@Override
	protected void shiftMinHydrationBy(int shift) {
		this.iMinHydration += shift;
		this.setHydration(this.getHydration() + shift);
	}

	@Override
	protected void shiftMaxFullnessBy(int shift) {
		this.iMaxFullness += shift;
		this.setFullness(this.getFullness() + 0);
	}

	@Override
	protected void shiftMinFullnessBy(int shift) {
		this.iMinFullness += shift;
		this.setFullness(this.getFullness() + 0);
	}

	@Override
	protected void shiftMaxStimulationBy(int shift) {
		this.iMaxStimulation += shift;
		this.setStimulation(this.getStimulation() + 0);
	}

	@Override
	protected void shiftMinStimulationBy(int shift) {
		this.iMinStimulation += shift;
		this.setStimulation(this.getStimulation() + 0);
	}

	@Override
	protected void shiftMaxHealthBy(int shift) {
		this.iMaxHealth += shift;
		this.setHealth(this.getHealth() + 0);
	}

	@Override
	protected void shiftMinHealthBy(int shift) {
		this.iMinHealth += shift;
		this.setHealth(this.getHealth() + 0);
	}
	

	protected void setHydrationMultiplier(double dNewMultiplier)
	{
		this.dHydrationMultiplier = dNewMultiplier;
	}
	
	protected void setFullnessMultiplier(double dNewMultiplier)
	{
		this.dFullnessMultiplier = dNewMultiplier;
	}
	
	protected void setStimulationMultiplier(double dNewMultiplier)
	{
		this.dStimulationMultiplier = dNewMultiplier;
	}
	
	protected void setHealthMultiplier(double dNewMultiplier)
	{
		this.dHealthMultiplier = dNewMultiplier;
	}
	
	protected void setDescription(String new_description)
	{
		this.description = new_description;
	}

}
