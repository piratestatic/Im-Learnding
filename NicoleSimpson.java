public class NicoleSimpson {
  // Crime data fields for each data to retrieve
  private int year;
  private double populationGrowth;
  private int maxMurderYear;
  private int minMurderYear;
  private int maxRobberyYear;
  private int minRobberyYear;
  //Crime data constructor to set variables
  public NicoleSimpson(int year, int populationGrowth, int maxMurderYear, int minMurderYear, int maxRobberyYear, int minRobberyYear){
    this.year = year;
    this.populationGrowth = populationGrowth;
    this.maxMurderYear = maxMurderYear;
    this.minMurderYear = minMurderYear;
    this.maxRobberyYear = maxRobberyYear;
    this.minRobberyYear = minRobberyYear;
  }
  // Constructor defaults
  public NicoleSimpson(int i){
    this.year = 0;
    this.populationGrowth = 0.0;
    this.maxMurderYear = 0;
    this.minMurderYear = 0;
    this.maxRobberyYear = 0;
    this.minRobberyYear = 0;
  }
  //Getter methods for each field
  public int getYear() {return this.year; }
  public double getPopulationGrowth() {return this.populationGrowth; }
  public int getMaxMurderYear() {return this.maxMurderYear; }
  public int getMinMurderYear() {return this.minMurderYear; }
  public int getMaxRobberyYear() {return this.maxRobberyYear; }
  public int getMinRobberyYear() {return this.minRobberyYear; }
  // Setter method for each field
  public void setYear(int year) {this.year = year;}
  public void setPopulationGrowth(double populationGrowth) {this.populationGrowth = populationGrowth;}
  public void setMaxMurderYear(int maxMurders) {this.maxMurderYear = maxMurders;}
  public void setMinMurderYear(int minMurders) {this.minMurderYear = minMurders;}
  public void setMaxRobberyYear(int maxRobbery) {this.maxRobberyYear = maxRobbery;}
  public void setMinRobberyYear(int minRobbery) {this.minRobberyYear = minRobbery;}
}
