
public class ProblemFour
{

	
	
	public static void main(String[] args)
	{
		
		int current = 0;
		int greatestCurrent = 0;
		for(int x = 100; x < 1000; x++)
		{
			for (int y = 100; y < 1000; y++)
			{
				int product = x * y;
				if (isPalindrome(Integer.toString(product)))
				{
					System.out.println(product);
					current = product;
					if (current > greatestCurrent)
					{
						greatestCurrent = current;
					}
					
				}
				
			}
			
		}
		System.out.println("Greatest palindrome is: " + greatestCurrent);
			
			
	}

	public static boolean isPalindrome (String productString)
	{
			String checkString = "";
			
			for (int i = productString.length(); i > 0; i--)
			{
				checkString += productString.charAt(i - 1);
			}
		
			if (checkString.equals(productString))
			{
				return true;
			}
		
			else
			{
				return false;
			}
		
		
		
		
		
	}
	
	
	
}

	
	
	


