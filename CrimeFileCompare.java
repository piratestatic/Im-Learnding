
import java.util.*;
import java.io.*;
import java.lang.*;

class CrimeYear {
	int year;
	int population;
	int murderCount;
	int robberyCount;
	double growth;

	public CrimeYear(int year, int population, int murderCount, int robberyCount) {
		this.year = year;
		this.population = population;
		this.murderCount = murderCount;
		this.robberyCount = robberyCount;
	}
}

public class CrimeFileCompare {
	public static String printMenu() {
		Scanner scannerIn = new Scanner(System.in);
		System.out.println("\n\n\n***US Crime Statistical App (1994-2013)***\n");
		System.out.println("I can't answer everything but if you enter 1-5, I can answer those\nor press 'Q' if you're a quitter:\n");
		System.out.println("1. Population growth for each consecutive year from 1994-2013");
		System.out.println("2. What year were you most likely to be murdered?");
		System.out.println("3. You probably survived this year because murder was at its lowest?");
		System.out.println("4. Find out if you were robbed when the rate was the highest!");
		System.out.println("5. Prior to 2014 when where you least likely to be robbed?");
		System.out.println("Q. And you said your not a quitter!");
		System.out.println("\nHurry up you are being timed! Make a selection already: ");
		return scannerIn.nextLine().trim();
	}

	public static void main(String args[]) {

		long start = System.currentTimeMillis();

		try {
		File crimeFile = new File(args[0]);//crime.csv
		Scanner crimeScanner = new Scanner(crimeFile);
		crimeScanner.nextLine();//tosses the header line out of the .csv file

		CrimeYear[] array = new CrimeYear[20];
		for(int i=0; i<20; i++) {
			String[] crimeValues = crimeScanner.nextLine().split(",");
			CrimeYear crimeFileX = new CrimeYear(Integer.parseInt(crimeValues[0]),
																					Integer.parseInt(crimeValues[1]),
																					Integer.parseInt(crimeValues[4]),
																					Integer.parseInt(crimeValues[8]));
			array[i] = crimeFileX;
		}

			// array = [CrimeYear(1994,...), CrimeYear(1995,...)...]

			int maxMurderYear = -1;
			int maxRobberyYear = -1;
			int maxMurderCount = -1;
			int maxRobberyCount = -1;

			int minMurderYear = -1;
			int minRobberyYear = -1;
			int minMurderCount = 10000000;
			int minRobberyCount = 1000000;

			int lastPopulation = 1;

			// do all the math
			for(CrimeYear currentYear : array) {
				if(currentYear.murderCount > maxMurderCount) {
        	maxMurderCount = currentYear.murderCount;
					maxMurderYear = currentYear.year;
        }
				if(currentYear.murderCount < minMurderCount) {
					minMurderCount = currentYear.murderCount;
					minMurderYear = currentYear.year;
				}
				if(currentYear.robberyCount > maxRobberyCount) {
					maxRobberyCount = currentYear.robberyCount;
					maxRobberyYear = currentYear.year;
				}
				if(currentYear.robberyCount < minRobberyCount) {
					minRobberyCount = currentYear.robberyCount;
					minRobberyYear = currentYear.year;
				}

				currentYear.growth = (Double.valueOf(currentYear.population - lastPopulation)/lastPopulation)*100;
				lastPopulation = currentYear.population;

			}

		while(true) {
			switch(printMenu()){
 			 case "1":
			 System.out.println("\n********************");
			 for(CrimeYear currentYear : array) {
				 				 System.out.printf("%d growth: %.2f\n", currentYear.year, currentYear.growth);
			 }
			 System.out.println("\n********************");
 			 break;
 			 case "2":
			 System.out.println("\n**************************************************************************************************");
 			 System.out.println("\nIn " + maxMurderYear + " Nicole Simpson, Andres Escobar and Jeffery Dahmer were murdered when the rate was highest.\n");
			 System.out.println("**************************************************************************************************\n");
			 break;
 			 case "3":
			 System.out.println("\n********************************************************************************");
 			 System.out.println("\nIn " + minMurderYear + " the now US ally Egyptian military dictator Abdel Fattah el-Sisi murdered \nover 817 people, most of them women and children when murder was at its lowest.\n" );
			 System.out.println("*********************************************************************************\n");
			 break;
 			 case "4":
			 System.out.println("\n**************************************************************************************");
 			 System.out.println("\nIf you got mugged in " + maxRobberyYear + " just know you weren't alone. Robbery rate was highest then.\n");
			 System.out.println("**************************************************************************************\n");
			 break;
 			 case "5":
			 System.out.println("\n***********************************************************************************************************");
			 System.out.println("\nIf you know anyone who was robbed in "+ minRobberyYear + ", they are your unlucky friend.  The robbery rate was lowest then.\n");
			 System.out.println("***********************************************************************************************************\n");
			 break;
 			 case "Q":
			 case "q":
			 System.out.println("\n***************************************************************");
			 System.out.println("***************************************************************");
			 System.out.println("\nFINE JUST GO AHEAD AND LEAVE THE US Crime Statistics Program!!!\n");
			 System.out.println("***************************************************************\n");
			 long end = System.currentTimeMillis();
	 		 long elapsedTime = end - start;
			 System.out.println("\n\n******************************");
			 System.out.println("\nElapsed time was: " + elapsedTime / 1000 + " seconds.");
 			 System.exit(0);
 		 	}
 	 	}

		} catch(FileNotFoundException e) {
				System.out.println("Cannot find File: " + args[1]);
				System.exit(0);
		}
	}
}
