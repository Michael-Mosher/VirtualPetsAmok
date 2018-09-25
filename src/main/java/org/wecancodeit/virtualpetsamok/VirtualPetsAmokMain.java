package org.wecancodeit.virtualpetsamok;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

class VirtualPetsAmokMain {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, SecurityException
	{
		System.out.println("Welcome to the Freak Show Shelter!");
		Scanner oUserInput = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.admitPet(new Cat("Cherie", "Smells like cherry bomb"));
		shelter.admitPet(new RobotDog("Joan", "Wants to be your dog"));
		String sCurrentInput = "";
		String sTempName = "";
		String sTempDescription = "";
		while(true) {
			shelter.tickAll();
			shelter.resetIndex();
			for (;shelter.isValidIndex(); shelter.next()) {
				if(shelter.getCurrentHydration()<2) VirtualPetsAmokMain.processNeglectedCurrent(shelter);
				else if( shelter.getCurrentFullness()<2) VirtualPetsAmokMain.processNeglectedCurrent(shelter);
				else if(shelter.getCurrentStimulation()<2 ) VirtualPetsAmokMain.processNeglectedCurrent(shelter);
				else if(shelter.getCurrentHealth()<2 ) VirtualPetsAmokMain.processNeglectedCurrent(shelter);
				else if(shelter.getCurrentHappiness()<2) VirtualPetsAmokMain.processNeglectedCurrent(shelter);
			}
			VirtualPetsAmokMain.outputOptions(shelter);
			if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
			switch(sCurrentInput.trim()) {
			case "1": // feed the pets
				shelter.feedAll();
				break;
			case "2":
				shelter.waterAll();
				break;
			case "3":
				VirtualPetsAmokMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.playWith(Integer.parseInt(sCurrentInput) -1);
				break;
			/*
			 * "04. Walk dogs\n" +
				"05. Herd cats\n" +
				"06. Clean cages\n" +
				"07. Clean litter boxes\n" +
				"08. Oil, cool, and recharge synthetics\n" +
				"09. Give dogs a bacon treat\n" +
				"10. Give cats a chicken liver treat\n" +
				"11. Give synthetics a solid state memory treat\n" +
				"12. Adopt a pet\r\n" + 
				"13. Admit a pet\r\n" + 
				"14. Quit";
			 */
			case "4":
				shelter.walkAll();
				break;
			case "5":
				shelter.herdAll();
				System.out.println("An exercise in futility.");
				break;
			case "6":
				shelter.cleanAllCages();
				break;
			case "7":
				shelter.cleanLitter();
				break;
			case "8":
				shelter.oilAll();
				break;
			case "9":
				shelter.treatDogs();
				break;
			case "10":
				shelter.treatCats();
				break;
			case "11":
				shelter.treatRobotics();
				break;
			case "12":
				VirtualPetsAmokMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.adoptOne(Integer.parseInt(sCurrentInput) -1);
				break;
			case "13":
				String sKingdomChoice = new String();
				String sGenusChoice = new String();
				String sPrimaryClassName = new String();
				System.out.println("Please provide '1' for organic, '2' for synthetic:");
				if((sTempDescription = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				if(sTempDescription.equalsIgnoreCase("2")) sKingdomChoice = "Robotic";
				else sKingdomChoice = "";
				System.out.println("Please provide '1' for cat, '2' for dog:");
				if((sTempDescription = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				if(sTempDescription.equalsIgnoreCase("2")) sGenusChoice = "Dog";
				else sGenusChoice = "Cat";
				sPrimaryClassName = /*"org.wecancodeit.virtualpetsamok." +*/ sKingdomChoice + sGenusChoice ;
				VirtualPet oAPet = new Dog("", "");
				
				System.out.println("Please provide the animal's name:");
				if((sTempName = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				System.out.println("Please provide the animal's description:");
				if((sTempDescription = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				
				if(sPrimaryClassName.equals("Cat")) {
					oAPet = new Cat(sTempName, sTempDescription);
				} else if(sPrimaryClassName.equals("Dog")){
					oAPet = new Dog(sTempName, sTempDescription);
				} else if(sPrimaryClassName.equals("RoboticCat")) {
					oAPet = new RobotCat(sTempName, sTempDescription);
				} else if(sPrimaryClassName.equals("RoboticDog")) {
					oAPet = new RobotDog(sTempName, sTempDescription);
				}

				if(oAPet instanceof OrganicPet) {
					if (shelter.getShelterOccupancy()==2) {
						shelter.admitPet(new EmphysemaVP((OrganicPet) oAPet));
					} else if(shelter.getShelterOccupancy()==3) {
						shelter.admitPet(new BigChestVP((OrganicPet) oAPet));
					} else {
						shelter.admitPet(new DiabetesVP((OrganicPet) oAPet));
					}
				} else {
					shelter.admitPet(oAPet);
				}
				break;
			case "14":
				System.out.println("Sarah MacLaughlin will take it from here...");
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static void processNeglectedCurrent(VirtualPetShelter s)
	{
		s.adoptOne(s.getCurrentIndex());
	}

	private static void outputOptions(VirtualPetShelter shelter) {
		String payload = "*---------- Shelter Occupants ----------*\n";
		String sCurrentName = "";
		String[] aCurrentPet;
		String[] aPetSets = new String[shelter.getShelterOccupancy()];// {};
		int iLongestName = 0;
		int iNumericalIndex = 1;
		int iMaxClmnWidth = 16;
//		int iMinNameWidth = (" " + aPetSets[0][0] + " ").length();
		int iCurrentTabQty = 0;
		int iMaxStatWidth = 3;
//		int iMaxSecondClmnWidth = (" " + aPetSets[0][1] + " ").length();
//		int iMaxThirdClmnWidth = (" " + aPetSets[0][2] + " ").length();
//		int iMaxFourthClmnWidth = (" " + aPetSets[0][3] + " ").length();
//		int iMaxFifthClmnWidth = (" " + aPetSets[0][4] + " ").length();
		int iOuterIndex = 0;
		int iInnerIndex = 0;
		int iTabStop = 8;
		
		shelter.resetIndex();
		if(shelter.isValidIndex()) {
			for( ; shelter.isValidIndex(); shelter.next()) {
				aPetSets[iOuterIndex++] = shelter.getCurrentDescription() + "\n" + shelter.getCurrentPetToString();
			}

			for(iOuterIndex = 0, shelter.resetIndex(); iOuterIndex < shelter.getShelterOccupancy(); iOuterIndex++) {
				payload += aPetSets[iOuterIndex];
				payload += "\n";
			}
		}
		payload += "\nWhat would you like to do next?\n\n";
		payload += "01. Feed the pets\r\n" + 
				"02. Water the pets\r\n" + 
				"03. Play with a pet\r\n" +
				"04. Walk dogs\n" +
				"05. Herd cats\n" +
				"06. Clean cages\n" +
				"07. Clean litter boxes\n" +
				"08. Oil, cool, and recharge synthetics\n" +
				"09. Give dogs a bacon treat\n" +
				"10. Give cats a chicken liver treat\n" +
				"11. Give synthetics a solid state memory treat\n" +
				"12. Adopt a pet\r\n" + 
				"13. Admit a pet\r\n" + 
				"14. Quit";
		System.out.println(payload);
	}
	
	private static void outputIndividualPetList(VirtualPetShelter shelter)
	{
		int iIndex = 1;
		String payload = "";
		AbstractCageDnaVP aCurrentPet;
		shelter.resetIndex();
		for( ; shelter.isValidIndex(); shelter.next()) {
			payload += " " + iIndex++ + ". " + shelter.getCurrentName() + " " + shelter.getCurrentDescription() + "\n";
		}
		System.out.println(payload);
	}

}
