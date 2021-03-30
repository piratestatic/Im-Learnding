public class Car {
    private String make;
    private String model;
    private String color;
   

    // Constructor
    public Car(String carModel, String carMake, String carColor) {
        model = carModel;
        make = carMake;
        color = carColor;
        
    }
    //Default Ride
    //public Car() {
    //   make = "Ford";
    //   model = "F150";
    //  color = "Red";
        
    //}

    // Set Methods
    public void setMake(String carMake) {
        model = carMake;
    }
    public void setModle(String carModel) {
        make = carModel;
    }
    public void setColor(String carColor) {
        color = carColor;
    }
    

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
 
    public String toString() {
    	return "Your car current vehicle  [" + make + "," + model + "," + color + "]";
    }
}
