package org.wecancodeit.virtualpetsamok;

interface IVirtualPet {
//	public VirtualPet(String name, String description);
//	public VirtualPet(String name, String description, int Hydration, int Fullness, int Stimulation, int Health); 

	public void tick();

	public int getHydration();
	
	public int getFullness();
	
	public int getStimulation();
	
	public int getHealth();

	public String getName();
	
	public String getDescription();
	
	public void incrementFullHydration();
	
	public void incrementSignificantHydration();
	
	public void incrementModestHydration();
	
	public void incrementPoorHydration();
	
	public void incrementFullFullness();
	
	public void incrementSignificantFullness();
	
	public void incrementModestFullness();
	
	public void incrementPoorFullness();
	
	public void incrementFullStimulation();
	
	public void incrementSignificantStimulation();
	
	public void incrementModestStimulation();
	
	public void incrementPoorStimulation();
	
	public void incrementFullHealth();
	
	public void incrementSignificantHealth();
	
	public void incrementModestHealth();
	
	public void incrementPoorHealth();
	
	public void decrementHydrationBy(int iDecrementAmount);
	
	public void decrementHealthBy(int iDecrementAmount);
	
	public void decrementFullnessBy(int iDecrementAmount);
	
	public void decrementStimulationBy(int iDecrementAmount);

}
