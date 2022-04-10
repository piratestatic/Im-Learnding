
public class JMcCarthyWk1 {

		public static long functionFn(int n)
		{
			long value = n * n + 100 * n;
			return value;
		}

		public static long functionGn(int n)
		{
			long value = 2 * n * n * n;
			return value;
		}

		public static void main(String[] args)
		{
			int startSeq = 10;

			while(functionFn(startSeq) > functionGn(startSeq))
			{
				System.out.println(startSeq + " " + functionFn(startSeq) + " " + functionGn(startSeq));
				startSeq = startSeq + 10;
			}

			System.out.println("Function G becomes higher than Function F when the value of n is " + startSeq);
		}
	}