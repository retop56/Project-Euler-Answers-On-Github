
public class ProblemTwo
{

	public static void main(String[] args)
	{
		
		int firstInteger = 1;
		int secondInteger = 2;
		int holdInteger = 0;
		int totalInteger = 0;
		
		while(secondInteger < 4000000)
		{
		
			if (secondInteger % 2 == 0)
			{
				totalInteger += secondInteger;
			}
		
			holdInteger = firstInteger + secondInteger;
			
			firstInteger = secondInteger;
			
			secondInteger = holdInteger;
			
		}
		
		System.out.println("The sum of the odd-valued terms is " + totalInteger);
		
		

	}

}
