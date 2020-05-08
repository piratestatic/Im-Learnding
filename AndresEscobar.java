import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AndresEscobar {
  public static NicoleSimpson[] read(String filename){
    // Array declaration
    NicoleSimpson[] stats = new NicoleSimpson[20];
    Scanner inputReader = null;
    // Variable declaration
    int count = 0;
    String line;
    // Access Crime.csv and create array
    try{
      inputReader = new Scanner(new File(filename));
      // Read first line
      inputReader.nextLine();
      while (inputReader.hasNext()) {
        line = inputReader.nextLine();
        String[] data = line.split(",");
        stats[count] = new NicoleSimpson(Integer.parseInt(data[0]));
        stats[count].setPopulationGrowth(Integer.parseInt(data[1]));
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
// Method calculation for population growth rate
  public void populationGrowth(NicoleSimpson[] data){
    double growthRate;
    System.out.println("Population growth rate: ");
    for (int i = 0; i < data.length - 1; i++){
      growthRate = 100 * (float) (data[i+1].getPopulationGrowth() - data[i].getPopulationGrowth()) / data[i].getPopulationGrowth();
      System.out.println("From " + data[i].getYear() + " to " + data[i + 1].getYear() + " the population growth was "+ String.format("%.4f", growthRate) + "%");
    }
  }
  // Method to find year with highest murder rate
  public String maxMurderYear(NicoleSimpson[] data) {
    int iSize = data.length;
    double currentMurderRate = 0.00;
    double mMurderRate;
    int murderHighYear = 0;
    String stReturnValue;
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
  public String minMurderYear(NicoleSimpson[] data) {
    int iSize = data.length;
    double currentMurderRate = 0.00;
    double mMurderRate;
    int murderLowYear = 0;
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
  public String maxRobberyYear(NicoleSimpson[] data) {
    int iSize = data.length;
    double currentRobberyRate = 0.00;
    double dRobberyRate;
    int robberyHighYear = 0;
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
  public String minRobberyYear(NicoleSimpson[] data) {
    int iSize = data.length;
    double currentRobberyRate = 0.00;
    double dRobberyRate;
    int robberyLowYear = 0;
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
