
public class ATindallWk1 {

	public static void main(String[] args) {
        long f;
        long g;
        int n;
        
        System.out.printf("%1s %7s %7s %n", "n", "f(n)", "g(n)");
        System.out.println();
        
        for(n = 10; n < 10000;){
        
        	//f and power of 3
        long n3= (long)Math.pow (n,3);
            f = (450 * n3) + (4 * n) + (n + 100) - (n - 3256);
            
         //g and power of 4   
        long n4 = (long)Math.pow (n,4);    
        	g =(2 * n4) - (n4 - 4233);
        		System.out.println(n + "  " + f + "  " + g);
        		
            //comparative
            if(g > f){
                System.out.print("Once n reaches " + n + " g overtakes f." );
            		break;
            }
            n += 10;
        }
   }
}
