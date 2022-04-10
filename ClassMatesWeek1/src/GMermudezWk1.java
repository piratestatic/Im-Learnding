public class GMermudezWk1 {

    public static void main(String[] args){

        System.out.println("n      f(n)      g(n)");
        double f,g;
        double n = 10;
        while (true){
            f = (500 * Math.pow(n, 2) + (15 + n) + 1000);
            g = (2 * Math.pow(n, 3));
            System.out.println(n + " " + f + "  " + g);
            if (g > f){
                break;
            }

            n = n+10;

        }
    }
}