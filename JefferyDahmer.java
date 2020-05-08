import java.util.*;
import java.io.*;
public class USCrime {//TestUSCrime JefferyDahmer
  public static void main(String[] args) {
    //Reference CrimeFileReader
    String crime = "Crime.csv";
    String userInput;//although this could be done with an array but 'Q'?
    File extFile = new File(crime);//saw this on YouTube
    Scanner scannerIn = new Scanner(System.in);
    CrimeFileReader crimeFile = new CrimeFileReader();
    CrimeFileGetSet[] data = CrimeFileReader.read("Crime.csv");
    //Declare variables
    long startTime = System.currentTimeMillis();
    long endTime;//TODO: come up with a better way to get total time on here
    String userSelect;
    while (true) {
      System.out.println("***US Crime Statistical App (1994-2013)***\n");
      System.out.println("\n I can't answer everything but if you enter 1-5, I can answer those\nor press 'Q' if you're a quitter:\n");
      System.out.println("1. Population growth for each consecutive year from 1994-2013");
      System.out.println("2. What year were you most likely to be murdered?");
      System.out.println("3. You probably survived this year because murder was at its lowest?");
      System.out.println("4. Find out if you were robbed when the rate was the highest!");
      System.out.println("5. Prior to 2014 when where you least likely to be robbed?");
      System.out.println("Q. And you said your not a quitter!");
      System.out.println("\nHurry up %s people are dying, so make a selection: ");
      userInput = scannerIn.nextLine().trim();//removes any leading or trailing spaces
      switch (userSelect){//is there a better way to do this?
        case "1":
        crimeFile.growth(data);
        break;
        case "2":
        System.out.println("Nicole Simpson, Andres Escobar and Jeffery Dahmer murdered when the rate was highest in " + crimeFile.maxMurderYear(data));
        break;
        case "3":
        System.out.println("The now US ally and GOP folk hero Egyptian military dictator Abdel Fattah el-Sisi\nmurdered over 817 people, a number of them women and children during the year murder was at its lowest: " + crimeFile.minMurderYear(data));
        break;
        case "4":
        System.out.println("If you got mugged that year, just know you weren't alone. Robbery rate was highest in: " + crimeFile.maxRobberyYear(data));
        break;
        case "5":
        System.out.println("If you know anyone who was robbed this year, they are your unlucky friend.  The robbery rate was lowest in: " + crimeFile.minRobberyYear(data));
        break;
        case "Q":
        System.out.println("\nFINE JUST GO AHEAD AND LEAVE THE US Crime Statistics Program!!!\n");
        userInput = scannerIn.nextLine().trim();//.trim() removes any leading or trailing spaces
        if (userInput.equalsIgnoreCase("q")) {//this will ignore how it is typed
          break;
        }
        System.out.println("\nElapsed time in seconds was: " + (endTime - startTime) / 1000 + "seconds.");//the math on this?
        System.exit(0);
      }
    }
  }
}
