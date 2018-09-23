package org.wecancodeit.virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PetTest
{
	RobotPet oRobotDog = new RobotDog("CNDR", "DOS attacker sitting at your feet with NYTimes.com");
	Cat oCatTest = new Cat("Argus", "Bruiser");
	Dog oDogTest = new Dog("Goliath", "Massive");
	RobotPet oRobotCat = new RobotCat("SABR", "Ferocity, automated");
	
	@Test
	public void assertCatFullness100AfterOneTickOneFeed()
	{
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
	
	@Test
	public void assertRobotDogStimulation100Health80AfterThreeTicksOneWalk()
	{
		// Assemble
		int iExpectedStimulation = 100;
		int iExpectedHealth = 80;
		// Action
		oRobotDog.tick();
		oRobotDog.tick();
		oRobotDog.tick();
		((RobotDog) oRobotDog).walk();
		int iActualStimulation = oRobotDog.getStimulation();
		int iActualHealth = oRobotDog.getHealth();
		// Assert
		assertThat(iActualHealth, is(iExpectedHealth));
		assertThat(iActualStimulation, is(iExpectedStimulation));
	}
	
	@Test
	public void assertCatFullness80Happiness100ThreeTicksOneGiveTuna()
	{
		// assemble
		int iExpectedFullness = 80;
		int iExpectedHappiness = 100;
		// action
		oCatTest.tick();
		oCatTest.tick();
		oCatTest.tick();
		oCatTest.giveTuna();
		int iActualFullness = oCatTest.getFullness();
		int iActualHappiness = oCatTest.getHappiness();
		// assert
		assertThat(iActualFullness, is(iExpectedFullness));
		assertThat(iActualHappiness, is(iExpectedHappiness));
	}
	
	@Test
	public void assertDogFullness80Happiness100ThreeTicksOneGiveBacon()
	{
		// Assemble
		int iExpectedFullness = 80;
		int iExpectedHappiness = 100;
		// Action
		oDogTest.tick();
		oDogTest.tick();
		oDogTest.tick();
		oDogTest.giveBacon();
		int iActualFullness = oDogTest.getFullness();
		int iActualHappiness = oDogTest.getHappiness();
		// Assert
		assertThat(iActualFullness, is(iExpectedFullness));
		assertThat(iActualHappiness, is(iExpectedHappiness));
	}
	
	@Test // Robots don't have happiness
	public void assertRobotPetStimulationFullnessEach100ThreeTicksOneGiveSolidState()
	{
		// Assemble
		int iExpectedFullness = 100;
		int iExpectedStimulation = 100;
		int iExpectedHealth = 80;
		// Action
		oRobotDog.tick();
		oRobotDog.tick();
		oRobotDog.tick();
		oRobotDog.giveSolidStateMemory();
		int iActualFullness = oRobotDog.getFullness();
		int iActualStimulation = oRobotDog.getStimulation();
		int iActualHealth = oRobotDog.getHealth();
		// Assert
		assertThat(iActualFullness, is(iExpectedFullness));
		assertThat(iActualStimulation, is(iExpectedStimulation));
		assertThat(iActualHealth, is(iExpectedHealth));
	}
	
	@Test
	public void assertCatAndRoboticCatStimulation80ThreeTicksOneHerd()
	{
		// Assemble
		int iExpectedOrgStimulation = 80;
		int iExpectedRoboStimulation = 80;
		// Action
		oCatTest.tick();
		oCatTest.tick();
		oCatTest.tick();
		oRobotCat.tick();
		oRobotCat.tick();
		oRobotCat.tick();
		((iCat) oCatTest).herd();
		((iCat) oRobotCat).herd();
		int iActualOrgStimulation = oCatTest.getStimulation();
		int iActualRoboStimulation = oRobotCat.getStimulation();
		// Assert
		assertThat(iActualOrgStimulation, is(iExpectedOrgStimulation));
		assertThat(iActualRoboStimulation, is(iExpectedRoboStimulation));
	}
}