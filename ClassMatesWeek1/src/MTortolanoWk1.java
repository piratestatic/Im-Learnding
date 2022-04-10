
public class MTortolanoWk1 {
	
	public static void main(String[] args) {
		int n = 0;
		int x = 12*(int)Math.pow(n, 3)+4*(int)Math.pow(n,  2)+17;
		int y = (int)Math.pow(n, 3);
		
		while (y<x) {
			n++;
			x= 12*(int)Math.pow(n, 3)+4*(int)Math.pow(n,  2)+17;
			y= (int)Math.pow(n, 3);
			if (n%10==0) {
				System.out.println("For n = "+ n + ", x=" + x + " and y=" + y);
			} else{
				continue;
				}
		}
		System.out.println("It takes " + n + " iterations for function y to overtake function x.");
	}

}


