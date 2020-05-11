package crimepackage;
import java.util.Arrays;
public class CrimeFileCompare {
			// Crime data fields for each data to retrieve
			private int year;


			//Crime data constructor to set variables
   			public BluePrint(int year, double growth, int maxMurderYear, int minMurderYear, int maxRobberyYear, int minRobberyYear) {


			BluePrint += Integer.format("%tY %011d %07d %08d",crimefile[0], crimefile[1], crimefile[4], crimefile[8]);




			static final int ARRAYSIZE = 22;

			// Method from Notes for Selection Sort
			 public static void crimeFileSort(int[] array) {
			       // Iterate for each position in the array. Note
			       // that because <  (not <= ) is used,
			       // i < (array.length - 1) iterates
			       // i from 0 to (array.length - 2).
			       for (int i = 1; i < (crimeFile[4].length - 1); i++) {
			          int min = i;

			          for (int j = i; j < (crimeFile[4].length); j++) {
			            if (crimeFile[j] < crimeFile[min])
			               min = j;
			          } // end for

			          // Swap the next selected array position
			          // with the smallest value found on this pass.
			          int temp = crimeFile[min]; 
			          crimeFile[min] = crimeFile[i];
			          criemFile[i] = temp;
			      } // end for
			   } // end method

			     // Main method
			    public static void main(String args[]){
			      System.out.println("Text");

			     // Create array of ints
			      int[] years = new int[ARRAYSIZE];
				// Assign random values
			       for (int i=0; i<years.length; i++) {
				 years[i] = (int) (Math.random() * 100);
			       }
				System.out.println("Unsorted int array");
				// Print the unsorted array
				for (int i=0; i<years.length; i++) {
				 System.out.println(years[i]) ;
			       }
				System.out.println("*****************************");

			      // Call the Selection Sort method
				selectionSort(years);

				System.out.println("******Sorted int array*******");
				// Print the sorted array
				for (int i=0; i<years.length; i++) {
				 System.out.println(years[i]);
			       }
				System.out.println("*****************************");

				// Generate an array of doubles
				double[] doubleValues = new double[ARRAYSIZE];
				// Assign random values
			       for (int i=0; i<doubleValues.length; i++) {
				 doubleValues[i] = (Math.random() * 100);
			       }

				System.out.println("******Unsorted double array*******");
				// Print the unsorted array
				for (int i=0; i<doubleValues.length; i++) {
				 System.out.println(doubleValues[i]) ;
			       }
				System.out.println("*****************************");
				// Sort the double value
			         Arrays.sort(doubleValues);

				System.out.println("******Sorted double array*******");
				// Print the sorted array
				for (int i=0; i<doubleValues.length; i++) {
				 System.out.println(doubleValues[i]) ;
			       }
				System.out.println("*****************************");


			    }



			}
