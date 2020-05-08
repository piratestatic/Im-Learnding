public class CrimeFileGetSet {//USCrimeClass NicoleSimpson
  // Crime data fields for each data to retrieve
  static final int YEAR;
  static final int GROWTH;
  static final int MAXMURDERYEAR;
  static final int MINMURDERYEAR;
  static final int MAXROBBERYYEAR;
  static final int MINROBBERYYEAR;
  //Crime data constructor to set variables
/*  public CrimeFileGetSet(int year, int growth, int maxMurderYear, int minMurderYear, int maxRobberyYear, int minRobberyYear) {
    this.YEAR = year;//TODO: where does this code use this?
    this.GROWTH = growth;
    this.MAXMURDERYEAR = maxMurderYear;
    this.MINMURDERYEAR = minMurderYear;
    this.MAXROBBERYYEAR = maxRobberyYear;
    this.MINROBBERYYEAR = minRobberyYear;
  }
*/ //Do I even need this code?
  //Getter methods for each field
  public int getYear() {
    return year;
    }
  public double getGrowth() {
    return growth;
  }
  public int getMaxMurderYear() {
    return maxMurderYear;
  }
  public int getMinMurderYear() {
    return minMurderYear;
  }
  public int getMaxRobberyYear() {
    return maxRobberyYear;
  }
  public int getMinRobberyYear() {
    return minRobberyYear;
  }
  // Setter method for each field
  }
  public void setYear(int yr) {
    this.year = yr;
  }
  public void setGrowth(double grow) {
    this.growth = grow;
  }
  public void setMaxMurderYear(int maxMurk) {
    this.maxMurderYear = maxMurk;
  }
  public void setMinMurderYear(int minMurk) {
    this.minMurderYear = minMurk;
  }
  public void setMaxRobberyYear(int maxRob) {
    this.maxRobberyYear = maxRob;
  }
  public void setMinRobberyYear(int minRob) {
    this.minRobberyYear = minRob;
  }
}
