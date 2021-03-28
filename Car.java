/*
 * File: Car.java
 * Author: Corey Hodges
 * Date: 3/26/21
 * CMIS 242 7385 Intermediate Programming

1. Use the Java class you posted last week (corrected based on any feedback you
may have received) and
2. add encapsulation to it to include making all attributes private,
adding constructor, and adding get and set methods.
The main method should create an instance of the class and demonstrate correct
functionality of all the methods.

Submit your program as an attached  .java file and post a screen shot to
show that you have been able to successfully run that program. Make sure
you submission adheres to the Submission Requirements document.




 */
//start class
public class Car {
    // attributes (instance variables)
    private String make; // lets try to limit this to one make (i.e. Subaru)
    private String model; // maybe allow specific models (i.e. WRX, Forester, Crosstrek)
    private String color; //

    // Constructor
    public Car(String carModel, String carMake, String carColor) {

      // validate that name is not invalid
      if (isInvalidStr(make) || isInvalidStr(model)) {
          System.out.println("Invalid make or model value");
          return;
      }

        //set values
        this.model = model;
        this.make = make;
        this.color = color;
    }
    /* making this.values
    //Default Ride
    public Car() {
        make = "Ford";
        model = "F150";
        color = "Red";
    }
    */
    // Get Methods
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    /* reconstructing this method
    // Set Methods
    public void setMake(String carMake) {
        model = carMake;
    }
    public void setModle(String carModle) {
        make = carModle;
    }
    public void setColor(String carColor) {
        color = carColor;
    }
  */


    public String toString() {
    	return "Your car current vehicle  [" + make + "," + model + "," + color +"]";
    }
}
