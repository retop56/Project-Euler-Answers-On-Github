
public class ProblemNine
{

	public static void main(String[] args)
	{
		
		for (int n = 1; n < Integer.MAX_VALUE; n++){
			for (int m = 2; m < n ; m++){
				int a = (n * n) - (m * m);
				int b = 2 * (m * n);
				int c = (n * n) + (m * m);
				if (a + b + c == 1000){
					int answer = a * b * c;
					System.out.println("The answer is " + answer);
					System.exit(1);
				}
			}
			
		}
		
		

	}

}
