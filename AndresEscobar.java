package crimePackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CrimeFileReader {//AndresEscobar
  public static void main(String[] args) {

    try {
        String fileLocation = "\\Users\\corey\\OneDrive\\Desktop\\Crime.csv";//location of file
        File crimeFile = new File(fileLocation);

		Scanner crimeScanner = new Scanner(crimeFile);// Will read from the file.
        String nextLine = crimeScanner.nextLine();//reads a line from the file

        System.out.println("Nextline: " + nextLine);//read a line from the file.
    } catch (FileNotFoundException ex) {
        //bad things have happened if we are here but I don't know what to do.

      }

    }


    CrimeFileGetSet[] stats = new CrimeFileGetSet[20];

    /*
    Scanner inputReader;
    // Variable declaration
    int count;
    //String line;
    // Access Crime.csv and create array
    try{
      inputReader = new Scanner(new File(filename));
      // Read first line
      inputReader.nextLine();
      while (inputReader.hasNext()) {
        line = inputReader.nextLine();
        String[] data = line.split(",");
        stats[count] = new CrimeFileGetSet(Integer.parseInt(data[0]));
        stats[count].setgrowth(Integer.parseInt(data[1]));
        stats[count].setMaxMurderYear(Integer.parseInt(data[4]));
        stats[count].setMinMurderYear(Integer.parseInt(data[4]));
        stats[count].setMaxRobberyYear(Integer.parseInt(data[8]));
        stats[count].setMinRobberyYear(Integer.parseInt(data[8]));
      }
      return stats;
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }
    finally {
      inputReader.close();
    }
  }
  */

//BELOW HERE IS AN ATTEMPT TO GENERATE THE DATA FIELDS AND IT PROBABLY DOESN'T WORK







   /*
   	* if 1 is selected define growthRate
   	* ((262803276 - 260327021)/260327021)*100 = 0.9512%,
   	* for each value in population "math" the values until growth
   	* ((crimeCSV[x][1] - crimeCSV[y][1])/crimeCSV[y][1])*100 = growthRate;
   	* return growth rate to case 1
   	*/

   /*
    * if 2 is selected define maxMurderYear
    * compare murderRates until maxMurderRate is found
    * compare crimeCSV[x][5] to crimeCSV[y][5] //I wish I could hard code this
    * if crimeCSV[x][5] == crimeCSV[y][5]
    * then compare crimeCSV[x][4] to crimeCSV[y][4]
    * return maxMurderYear(year and rate) to case 2
    */

   /*
    * if 3 is selected define minMurderYear
    * compare murderRates until minMurderRate is found
    * compare crimeCSV[x][5] to crimeCSV[y][5]
    * if crimeCSV[x][5] == crimeCSV[y][5]
    * then compare crimeCSV[x][4] to crimeCSV[y][4]
    * return minMurderYear(year and rate) to case 3
    */

   /*
    * if 4 is selected define maxRobberyYear
    * compare murderRates until maxRobberyRate is found
    * compare crimeCSV[x][9] to crimeCSV[y][9]
    * if crimeCSV[x][9] == crimeCSV[y][9]//this condition can't happen with current data set
    * then compare crimeCSV[x][8] to crimeCSV[y][8]
    * return maxRobberyYear(year and rate) to case 4
    */

    /*
     * if 5 is selected define minRobberyYear
     * compare murderRates until minRobberyRate is found
     * compare crimeCSV[x][9] to crimeCSV[y][9] until all values are
     * if crimeCSV[x][9] == crimeCSV[y][9]
     * then compare crimeCSV[x][8] to crimeCSV[y][8]
     * return minRobberyYear(year and rate) to case 5
     */

    /*
     * if Q is selected define quit
     * return to case Q
     */

    /*
     * if !1-5 || Q is selected define exceptions
     * System.out.println("Do you have sausage fingers or can you just not read?");
     * return to "main options"
     */





    /*
    // Access array
    try {
      for (int i = 0; i < iSize; i++) {
        // Get murder rate
        mMurderRate = data[i].getMaxMurderYear();
        if (mMurderRate < currentMurderRate) {
          murderHighYear = data[i].getYear();
        }
        currentMurderRate = mMurderRate;
      }
      stReturnValue = "The murder rate was highest in " + murderHighYear + ".";
      return stReturnValue;
    }
    catch(Exception e){
      System.out.println("Exception" + e.getMessage());
      return null;
    }
  }

  // Method to find lowest murder year
  public String minMurderYear(CrimeFileGetSet[] data) {
    int iSize = data.length;
    double currentMurderRate = 0.00;
    double mMurderRate;
    int murderLowYear;
    String stReturnValue;
    try {
      // Access array
      for (int i = 0; i < iSize; i++) {
        // Get the murder rate
        mMurderRate = data[i].getMinMurderYear();
        if (mMurderRate > currentMurderRate) {
          murderLowYear = data[i].getYear();
        }
        currentMurderRate = mMurderRate;
      }
      stReturnValue = "The murder rate was lowest in " + murderLowYear + ".";
      return stReturnValue;
    }
    catch (Exception e) {
      System.out.println("Exception" + e.getMessage());
      return null;
    }
  }
  // Get the year with highest robberies
  public String maxRobberyYear(CrimeFileGetSet[] data) {
    int iSize = data.length;
    double currentRobberyRate;
    double dRobberyRate;
    int robberyHighYear;
    String stReturnValue;
    // Access array
    try {
      for (int i = 0; i < iSize; i++) {
        // Get the robbery rate
        dRobberyRate = data[i].getMaxRobberyYear();
        if (dRobberyRate < currentRobberyRate) {
          robberyHighYear = data[i].getYear();
        }
        currentRobberyRate = dRobberyRate;
      }
      stReturnValue = "The robbery rate was highest in " + robberyHighYear + ".";
      return stReturnValue;
    }
    catch (Exception e) {
      System.out.println("Exception" + e.getMessage());
      return null;
    }
  }
  //Method to find lowest robbery year
  public String minRobberyYear(CrimeFileGetSet[] data) {
    int iSize = data.length;
    double currentRobberyRate;
    double dRobberyRate;
    int robberyLowYear;
    String stReturnValue;
    // Access array
    try {
      for (int i = 0; i < iSize; i++) {
        // Get robbery rate
        dRobberyRate = data[i].getMinRobberyYear();
        if (dRobberyRate > currentRobberyRate) {
          robberyLowYear = data[i].getYear();
        }
        currentRobberyRate = dRobberyRate;
      }
      stReturnValue = "The robbery rate was lowest in " + robberyLowYear + ".";
      return stReturnValue;
    }
    catch (Exception e) {
      System.out.println("Exception" + e.getMessage());
      return null;
    }
  }
}
*/
