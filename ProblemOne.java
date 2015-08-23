
public class ProblemOne
{

	public static void main(String[] args)
	{
		int countInteger = 0;
		int totalInteger = 0;
		
		for (int numInteger = 0; numInteger < 1000; numInteger++)
		{
			if (countInteger % 3 == 0)
			{
				totalInteger += countInteger;
				countInteger++;
			}
			
			else if (countInteger % 5 == 0)
			{
				totalInteger += countInteger;
				countInteger++;
			}
			
			else
			{
				countInteger++;
			}
		}

		System.out.println("The sum is " + totalInteger);
		
	}

}
