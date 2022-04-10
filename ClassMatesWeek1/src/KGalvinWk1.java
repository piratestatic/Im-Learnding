
public class KGalvinWk1 {
	  public static void main(String[] args) {
		    double n = 1;
		    double f = 1;
		    double g= 0;

		    System.out.println("n\t F(n)\t G(n) ");
		   
		    while(f>g)
		        {
		            f = (25 * n) + 34;
		            g = n * n;
		            System.out.println(n + "\t " + f + "\t " + g);
		            n = n + 1;
		        }
		        
		        //print resulting variable when g overtakes f
		        System.out.println("function g overtakes function f when n equals "+(n-1));
		}
	}

