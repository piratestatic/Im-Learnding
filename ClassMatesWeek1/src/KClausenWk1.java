
public class KClausenWk1 {
	
	public static void main(String[] args){
	        long f,g;
	        long n = 10;
	        System.out.printf("%2s %5s %5s %n", "n", "f(n)", "g(n)");

	        while (true){
	            f = (long) (275 * Math.pow(n, 2) + (8 + n) + 1250);
	            g = (long) (4 * (Math.pow(n, 3)));
	            System.out.println(n + " " + f + "  " + g);
	            if (g > f){
	                System.out.println("When (n) increments to " + n + ", " + "g(n) has overtaken f(n)");
	                break;
	            }

	            n = n+10;

	        }
	    }
}
