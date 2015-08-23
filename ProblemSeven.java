import java.util.ArrayList;


public class ProblemSeven
{

	public static void main(String[] args)
	{
		ArrayList primeArrayList = new ArrayList();
		int testPrime = 2;
		
		do
		{
			if (isPrime(testPrime))
			{
				primeArrayList.add(testPrime);
			}
			
			testPrime++;
			
		}while (primeArrayList.size() < 10001);
		
		System.out.println("The 10,001st prime number is " + primeArrayList.get(10000));

	}
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
