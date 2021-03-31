import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CrimeFileReader {

  public static void main(String[] args) {
      try {
          String fileLocation = "\\Users\\corey\\OneDrive\\Desktop\\Crime.csv";
          File crimeFile = new File(fileLocation);

          Scanner crimeScanner = new Scanner(crimeFile);// Will read from the file.
          String nextLine = crimeScanner.nextLine();//reads a line from the file
          Double[] crimeValues =  nextLine.split(",");
          System.out.println("Nextline: " + nextLine);//read a line from the file.

      } catch (FileNotFoundException ex) {
          //bad things have happened if we are here
          Logger.getLogger(CrimeFileReader.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
