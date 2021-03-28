/*
 * File: Car.java
 * Author: Corey Hodges
 * Date: 3/26/21
 * CMIS 242 7385 Intermediate Programming
 */

import java.util.Scanner;
public class CarGarage {

  // start main
  public static void main(String[] args) {

    Scanner scanCar = new Scanner(System.in);
    Car defaultCar = new Car();
    System.out.println(defaultCar.toString());

    System.out.println("Lets upgrade your ride!");

    System.out.println("Who makes the best vehicles?: ");
    String newMake = scanCar.nextLine();
    
    System.out.println("What is your dream vehicle model?: ");
    String newModel = scanCar.nextLine();

    System.out.println("What color do you want your vehicle to be?: ");
    String newColor = scanCar.nextLine();

    System.out.println("\nYour Dream ride is!!!!");

    Car newCar = new Car(newModel, newMake, newColor);
    System.out.print(newCar.toString() + "\n");

  }

}