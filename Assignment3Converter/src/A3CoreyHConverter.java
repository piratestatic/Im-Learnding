
public class A3CoreyHConverter {
	
	//Private attribute for input of data type double
    private double input; 
    
    //Default constructor with no parameter which sets input to Double.NaN
    public A3CoreyHConverter() { 
        input = Double.NaN;
    }
    
    //Overloaded constructor with input for parameter
    public A3CoreyHConverter(double input) {
        this.input = input;
    }

    // Get and set methods for input attribute
    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

   //Method convert() which returns input value
    public double convert() {
        return input;
    }

}
