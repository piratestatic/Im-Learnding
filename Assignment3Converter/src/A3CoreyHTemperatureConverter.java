

public class A3CoreyHTemperatureConverter extends A3CoreyHConverter {

    // Constructors which call parent constructors
    public A3CoreyHTemperatureConverter() {
        super();
    }

    public A3CoreyHTemperatureConverter(double input) {
        super(input);
    }

    //Overridden convert() method to convert input (Fahrenheit temperature) to 
    //Celsius and returns the value. If the instance has no input value, it should 
    //return Double.NaN
    @Override
    public double convert() { 
        if (this.getInput() == Double.NaN) {
            return Double.NaN;
        }
        // Use the following formula for conversion: C = ((F-32)*5)/9
        return ((this.getInput() - 32) * 5) / 9;
    }

}
