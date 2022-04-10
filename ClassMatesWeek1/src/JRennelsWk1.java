public class JRennelsWk1 {
   public static void main(String[] args) {
      int n = 1;
      int f = 0;
      int g = 0;

      System.out.println("n\tf\tg");
      while (!(f < g)) {
         f = (int) (100 * Math.pow(n,2) + 43 * n + 27);
         g = (int) (3 * Math.pow(n,3));
         System.out.println(n + "\t" + f + "\t" + g);
         n++;
      }
   }
}
