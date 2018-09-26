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
		String sOutput = "";
		while(true) {
			shelter.tickAll();
			shelter.resetIndex();
			for (;shelter.isValidIndex(); shelter.next()) {
				if(shelter.getCurrentHydration()<2) {
					VirtualPetsAmokMain.processNeglectedCurrent(shelter);
					sOutput = "Sarah's face is twisted with grief. \"I'll have to take care of " + shelter.getCurrentName() + " myself.\"";
					processDelayedOutput(sOutput);
				} else if( shelter.getCurrentFullness()<2) {
					VirtualPetsAmokMain.processNeglectedCurrent(shelter);
					sOutput = "Sarah's face is twisted with grief. \"I'll have to take care of " + shelter.getCurrentName() + " myself.\"";
					processDelayedOutput(sOutput);
				} else if(shelter.getCurrentStimulation()<2 ) {
					VirtualPetsAmokMain.processNeglectedCurrent(shelter);
					sOutput = "Sarah's face is twisted with grief. \"I'll have to take care of " + shelter.getCurrentName() + " myself.\"";
					processDelayedOutput(sOutput);
				} else if(shelter.getCurrentHealth()<2 ) {
					VirtualPetsAmokMain.processNeglectedCurrent(shelter);
					sOutput = "Sarah's face is twisted with grief. \"I'll have to take care of " + shelter.getCurrentName() + " myself.\"";
					processDelayedOutput(sOutput);
				} else if(shelter.getCurrentHappiness()<2) {
					VirtualPetsAmokMain.processNeglectedCurrent(shelter);
					sOutput = "Sarah's face is twisted with grief. \"I'll have to take care of " + shelter.getCurrentName() + " myself.\"";
					processDelayedOutput(sOutput);
				}
			}
			VirtualPetsAmokMain.outputOptions(shelter);
			if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
			switch(sCurrentInput.trim()) {
			case "1": // feed the pets
				shelter.feedAll();
				sOutput = "A din of sloshing, purring, and whirring makes the air alive with joy.";
				processDelayedOutput(sOutput);
				break;
			case "2":
				shelter.waterAll();
				sOutput = "Stopping cruelty begins with a clean bowl of pure water.";
				processDelayedOutput(sOutput);
				break;
			case "3":
				VirtualPetsAmokMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.playWith(Integer.parseInt(sCurrentInput) -1);
				int iFindIndex = 0;
				for(shelter.resetIndex();shelter.isValidIndex(); shelter.next()) {
					if((Integer.parseInt(sCurrentInput) -1)==iFindIndex) sCurrentInput = shelter.getCurrentName();
					iFindIndex++;
				}
				sOutput = "Sarah says, \"You and " + sCurrentInput + " look very happy together. The joy can last a lifetime. Let me show you how simple the adoption process is.\"";
				processDelayedOutput(sOutput);
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
				sOutput = "You walked the dogs ... and the dogs walked you.";
				processDelayedOutput(sOutput);
				break;
			case "5":
				shelter.herdAll();
				sOutput = "An exercise in futility.";
				processDelayedOutput(sOutput);
				break;
			case "6":
				shelter.cleanAllCages();
				sOutput = "Sarah smiling, \"It smells better already, and I can see our little friends appreciate it."
						+ " Feel free to take that with you. It make an amazing fertilizer. You're welcome.\"";
				processDelayedOutput(sOutput);
				break;
			case "7":
				shelter.cleanLitter();
				sOutput = "The cats assemble to inspect your work.";
				processDelayedOutput(sOutput);
				break;
			case "8":
				shelter.oilAll();
				sOutput = "Processing lights flash so quickly as to appear steady as the waste heat dissipates. Mechanical joints move silently.";
				processDelayedOutput(sOutput);
				break;
			case "9":
				shelter.treatDogs();
				sOutput = "Bacon. The key ingredient to predator taming and domestication";
				processDelayedOutput(sOutput);
				break;
			case "10":
				shelter.treatCats();
				sOutput = "The most willful, aloof, and independent are humbled by gastral pleasure.";
				processDelayedOutput(sOutput);
				break;
			case "11":
				shelter.treatRobotics();
				sOutput = "Another round of Deep Learning image analysis begins in 3 ... 2 ... 1";
				processDelayedOutput(sOutput);
				break;
			case "12":
				VirtualPetsAmokMain.outputIndividualPetList(shelter);
				if((sCurrentInput = oUserInput.nextLine()).trim().equalsIgnoreCase("quit")) break;
				shelter.adoptOne(Integer.parseInt(sCurrentInput) -1);
				sOutput = "Sarah is silent with tears of joy.";
				processDelayedOutput(sOutput);
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
				sOutput = "Sarah exclaims, \"Awwww ... what a cute addition!!\" " + sTempName + " will have a happy, temporary home.";
				processDelayedOutput(sOutput);
				break;
			case "14":
			    sOutput = "Sarah MacLaughlin will take it from here...";
			    processDelayedOutput(sOutput);
			    System.exit(0);
			default:
				break;
			}
		}
	}

	private static void processDelayedOutput(String sOutput) {
		try {
			for(String piece : sOutput.split("[ ]+")) {
				long lMilliSecondsBase = 100L;
				long lMilliSecondsFinal = lMilliSecondsBase * piece.length();
				Thread.sleep(lMilliSecondsFinal);
				System.out.print(" " + piece);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void processNeglectedCurrent(VirtualPetShelter s)
	{
		s.adoptOne(s.getCurrentIndex());
	}

	private static void outputOptions(VirtualPetShelter shelter) {
		String sOutput =  "\n\n*---------- Shelter Occupants ----------*\n";
		String payload = "";
		String[] aPetSets = new String[shelter.getShelterOccupancy()];// {};
		int iOuterIndex = 0;
		processDelayedOutput(sOutput);
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
