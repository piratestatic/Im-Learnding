/*
File: ParkRanger.java (HW4)
* Author: Corey Hodges
* Date: May 2, 2020
* Using a 2D array to print values to the screen
*/
import java.util.*;
import java.lang.*;



      //2D array of all crime by year, but can not be included in final file

      //Can not modify the Crime.csv file

      //You can and should create a USCrimeClass to store the fields.
      //You can also have an Array of US Crime Objects

      //create separate methods for each of the required functionality.
      //(e.g. getMaxMurderYear())

      //A user-friendly and well-organized menu should be used for users to
      //select which data to return. A sample menu is shown in run example.
      //You are free to enhance your design and you should add additional menu
      //items and functionality.

      //The menu system should be displayed at the command prompt, and continue
      //to redisplay after results are returned or until Q is selected. If a
      //user enters an invalid menu item, the system should redisplay the menu
      //with a prompt asking them to enter a valid menu selection

      //The application should keep track of the elapsed time (in seconds)
      //between once the application starts and when the user quits the
      //program. After the program is exited, the application should provide a
      //prompt thanking the user for trying the US Crime Statistics program and
      //providing the total time elapsed.

      //When reading the Crimes file, read one line at a time
      //(See ReadEmail.java) and then within the loop parse each line into the
      //USCrimeClass fields and then store that USCrimeClass Object into an
      //array. Note you can use String.split(“,”) to split the CSV line into a
      //the fields for setting the USCrimeClass Object.

      Here is sample run:
/*java TestUSCrime Crime.csv
2
********** Welcome to the US Crime Statistical Application **************************
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: 2
The Murder rate was highest in 1994
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: 5
The Robbery rate was lowest in 2013
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: Q
Thank you for trying the US Crimes Statistics Program.
Elapsed time in seconds was: 32
*/
      /*
      *Year=Yr
      *Population=Pop
      *Violent crime=VC
      *Violent crime rate=VCR
      *Murder and nonnegligent manslaughter=M&MS
      *Murder and nonnegligent manslaughter rate=M&MSR
      *Rape=Ra
      *Rape rate=RaR
      *Robbery=Ro
      *Robbery rate=RoR
      *Aggravated assault=AA
      *Aggravated assault rate=AAR
      *Property crime=PC
      *Property crime rate=PCR
      *Burglary=B
      *Burglary rate=BR
      *Larceny-theft=LT
      *Larceny-theft rate=LTR
      *Motor vehicle theft=MVT
      *Motor vehicle theft rate=MFTR
      */
import java.util.*;
import java.io.*;
public class Crime {
class Guitar {
    //private values that can't be accessed outside of Guitar
    private int numStrings = 6;
    private double guitarLength = 28.2;
    private String guitarManufacturer = "Gibson";
    private String guitarColor = "Red";

    public Guitar() {}
    public Guitar(int numStrings, double guitarLength, String guitarManufacturer, String color) {
     this.numStrings = numStrings;//this."x" = Guitar vaules
     this.guitarLength = guitarLength;//this."x" = Guitar vaules
     this.guitarManufacturer = guitarManufacturer;//this."x" = Guitar vaules
     this.guitarColor = color;//this."x" = Guitar vaules

    }
    public static void main(String[] args) {
      String crime = "Crime.csv";
      File extFile = new File(crime);
      try{
        Scanner extInput = new Scanner(extFile);
        while (extInput.hasNext()){
          String data = extInput.next();
          system.out.println(data);
        }
        extInput.close();
      } catch (FileNotFoundException a) {

      }
    }
    static Double[][] crimeRateByYear = {
      //Yr  |   Pop    |  VC   | VCR   | MMS |MMSR|  Ra  | RaR |  Ro  |  RoR  |   AR	 | AAR  |	  PC	  |  PCR |    B    |  BR	|   LT	  | LTR  |   MVT  |MFTR
      {1994, 260327021, 1857670, 713.6, 23326, 9, 102216, 39.3, 618949, 237.8, 1113179, 427.6, 12131873, 4660.2, 2712774, 1042.1, 7879812, 3026.9, 1539287, 591.3},
      {1995, 262803276, 1798792, 684.5, 21606, 8.2, 97470, 37.1, 580509, 220.9, 1099207, 418.3, 12063935, 4590.5, 2593784, 987, 7997710, 3043.2, 1472441, 560.3}
      {1996, 265228572, 1688540, 636.6, 19645, 7.4, 96252, 36.3, 535594, 201.9, 1037049, 391, 11805323, 4451, 2506400, 945, 7904685, 2980.3, 1394238, 525.7},
      {1997, 267783607, 1636096, 611, 18208, 6.8, 96153, 35.9, 498534, 186.2, 1023201, 382.1, 11558475, 4316.3, 2460526, 918.8, 7743760, 2891.8, 1354189, 505.7},
      {1998, 270248003, 1533887, 567.6, 16974, 6.3, 93144, 34.5, 447186, 165.5, 976583, 361.4, 10951827, 4052.5, 2332735, 863.2, 7376311, 2729.5, 1242781, 459.9},
      {1999, 272690813, 1426044, 523, 15522, 5.7, 89411, 32.8, 409371, 150.1, 911740, 334.3, 10208334, 3743.6, 2100739, 770.4, 6955520, 2550.7, 1152075, 422.5},
      {2000, 281421906, 1425486, 506.5, 15586, 5.5, 90178, 32, 408016, 145, 911706, 324, 10182584, 3618.3, 2050992, 728.8, 6971590, 2477.3, 1160002, 412.2},
      {2001, 285317559, 1439480, 504.5, 16037, 5.6, 90863, 31.8, 423557, 148.5, 909023, 318.6, 10437189, 3658.1, 2116531, 741.8, 7092267, 2485.7, 1228391, 430.5},
      {2002, 287973924, 1423677, 494.4, 16229, 5.6, 95235, 33.1, 420806, 146.1, 891407, 309.5, 10455277, 3630.6, 2151252, 747, 7057379, 2450.7, 1246646, 432.9},
      {2003, 290788976, 1383676, 475.8, 16528, 5.7, 93883, 32.3, 414235, 142.5, 859030, 295.4, 10442862, 3591.2, 2154834, 741, 7026802, 2416.5, 1261226, 433.7},
      {2004, 293656842, 1360088, 463.2, 16148, 5.5, 95089, 32.4, 401470, 136.7, 847381, 288.6, 10319386, 3514.1, 2144446, 730.3, 6937089, 2362.3, 1237851, 421.5},
      {2005, 296507061, 1390745, 469, 16740, 5.6, 94347, 31.8, 417438, 140.8, 862220, 290.8, 10174754, 3431.5, 2155448, 726.9, 6783447, 2287.8, 1235859, 416.8},
      {2006, 299398484, 1435123, 479.3, 17309, 5.8, 94472, 31.6, 449246, 150, 874096, 292, 10019601, 3346.6, 2194993, 733.1, 6626363, 2213.2, 1198245, 400.2},
      {2007, 301621157, 1422970, 471.8, 17128, 5.7, 92160, 30.6, 447324, 148.3, 866358, 287.2, 9882212, 3276.4, 2190198, 726.1, 6591542, 2185.4, 1100472, 364.9},
      {2008, 304059724, 1394461, 458.6, 16465, 5.4, 90750, 29.8, 443563, 145.9, 843683, 277.5, 9774152, 3214.6, 2228887, 733, 6586206, 2166.1, 959059, 315.4},
      {2009, 307006550, 1325896, 431.9, 15399, 5, 89241, 29.1, 408742, 133.1, 812514, 264.7, 9337060, 3041.3, 2203313, 717.7, 6338095, 2064.5, 795652, 259.2},
      {2010, 309330219, 1251248, 404.5, 14722, 4.8, 85593, 27.7, 369089, 119.3, 781844, 252.8, 9112625, 2945.9, 2168459, 701, 6204601, 2005.8, 739565, 239.1},
      {2011, 311587816, 1206005, 387.1, 14661, 4.7, 84175, 27, 354746, 113.9, 752423, 241.5, 9052743, 2905.4, 2185140, 701.3, 6151095, 1974.1, 716508, 230},
      {2012, 313873685, 1217057, 387.8, 14856, 4.7, 85141, 27.1, 355051, 113.1, 762009, 242.8, 9001992, 2868, 2109932, 672.2, 6168874, 1965.4, 723186, 230.4},
      {2013, 316128839, 1163146, 367.9, 14196, 4.5, 79770, 25.2, 345031, 109.1, 724149, 229.1, 8632512, 2730.7, 1928465, 610, 6004453, 1899.4, 699594, 221.3},
    };

public static void main(String[] args) {


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
        public Float populationGrowth(){
        ((crime1[1] - crime2[1]))/crime2[1])*100 = populationGrowth;
        System.out.printf("Population Groth from %d to %d is: %.2f\% \n", crime1[0], crime2[0], populationGrowth);
