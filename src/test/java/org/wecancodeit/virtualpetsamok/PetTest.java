package org.wecancodeit.virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PetTest
{
	@Test
	public void assertCatFullness100AfterOneTickOneFeed()
	{
		Cat oCatTest = new Cat("Argus", "Bruiser");
		int iExpectedFullness = 100;
		// Action
		oCatTest.tick();
		oCatTest.feed();
		int iActualFullness = oCatTest.getFullness();
		// Assert
		assertThat(iActualFullness, is(iExpectedFullness));
	}
	
	@Test
	public void assertDogHappinessStimulationEach100AfterOneTickOneWalk()
	{
		// Assemble
		Dog oDogTest = new Dog("Goliath", "Massive");
		int iExpectedHappiness = 100;
		int iExpectedStimulation = 100;
		// Action
		oDogTest.tick();
		oDogTest.walk();
		int iActualHappiness = oDogTest.getHappiness();
		int iActualStimulation = oDogTest.getStimulation();
		// Assert
		assertThat(iActualHappiness, is(iExpectedHappiness));
		assertThat(iActualStimulation, is(iExpectedStimulation));
	}
	
	@Test
	public void assertRobotCatHealth100AfterOneTickAndOneOiling()
	{
		// Assemble
		RobotPet oRobotCat = new RobotCat("SABR", "Ferocity, automated");
		int iExpectedHealth = 100; 
		// Action
		oRobotCat.tick();
		oRobotCat.oil();
		int iActualHealth = oRobotCat.getHealth();
		// Assert
		assertThat(iActualHealth, is(iExpectedHealth));
	}
	
	@Test
	public void assertRobotDogFullnessHydrationEach100AfterOneTick()
	{
		// Assemble
		RobotPet oRobotDog = new RobotDog("CNDR", "DOS attacker sitting at your feet with NYTimes.com");
		int iExpectedFullness = 100;
		int iExpectedHydration = 100;
		// Action
		oRobotDog.tick();
		int iActualFullness = oRobotDog.getFullness();
		int iActualHydration = oRobotDog.getHydration();
		//Assert
		assertThat(iActualHydration, is(iExpectedHydration));
		assertThat(iActualFullness, is(iExpectedFullness));
	}
}