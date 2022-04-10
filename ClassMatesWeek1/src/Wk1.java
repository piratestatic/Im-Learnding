//package BigODisc;

public class Wk1 {

    public static void main(String[] args) {
        System.out.println("n\tf(n)\tg(n)");
        double f, g;
        double i = 0;
        while (true) {
            f = (190 * Math.pow(i, 3)) + (67 * i) + 100000;
            g = Math.pow(i,4);
            System.out.println(Double.toString(i) + "\t" + Double.toString(f) + "\t" + Double.toString(g));

            if (g > f){
                System.out.println("g(n) overtook f(n) at n = " + i );
                break;
            }
            i += 10;
        }
    }
}
