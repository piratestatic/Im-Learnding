
public class A3CoreyHDistanceConverter extends A3CoreyHConverter {

    // Constructors which call parent constructors
    public A3CoreyHDistanceConverter() {
        super();
    }

    public A3CoreyHDistanceConverter(double input) {
        super(input);
    }

    //Overridden convert() method to convert input (distance in miles) to distance 
    //in kilometers and returns the value. If the instance has no input value, it 
    //should return Double.NaN
    @Override
    public double convert() { 
        if (this.getInput() == Double.NaN) {
            return Double.NaN;
        }
        // Use the following formula for conversion:  KM= M * 1.609
        return this.getInput() * 1.609;
    }

}
