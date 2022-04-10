public class JWillsonWk1 {

	public static void main(String[] args) {
		
		
		System.out.println("When does y over shoot x?");
		int n = 0;
		int x = 160 *(int)Math.pow(n, 3) + 400 * ((int)Math.pow(n, 2)) + 250 * n + 1;
		int y = (int)Math.pow(n,4);
		
		while (y < x ) {
			n++;
			x = 160 * (int)Math.pow(n, 3) + 400 * ((int)Math.pow(n, 2)) + 250*n + 1;
			y = (int)Math.pow(n,4) ;
			
			if(n % 20 == 0) {	
				
			System.out.println(n + " " + x + " " + y);
			}
			
			}

			System.out.println("Once n reaches " + n + " the function y overtakes the function x");
 
	}

}
