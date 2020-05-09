package crimePackage;

public class CrimeFileGetSet {
			// Crime data fields for each data to retrieve
			private int year;
			private double growth;
		 	private int maxMurderYear;
		 	private int minMurderYear;
		 	private int maxRobberyYear;
		 	private int minRobberyYear;
 	
			//Crime data constructor to set variables
   			public CrimeFileGetSet(int year, int growth, int maxMurderYear, int minMurderYear, int maxRobberyYear, int minRobberyYear) {
		    this.year = year;//TODO: where does this code use this?
		    this.growth = growth;
		    this.maxMurderYear = maxMurderYear;
		    this.minMurderYear = minMurderYear;
		    this.maxRobberyYear = maxRobberyYear;
		    this.minRobberyYear = minRobberyYear;
		  }
		 
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


