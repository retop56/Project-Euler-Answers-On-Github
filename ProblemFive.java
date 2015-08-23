
public class ProblemFive
{
	public static void main(String[] args)
	{
		int current = 0;
		for (int i = 1; i < 1000000000; i++)
		{
			if (isDivisible(i))
			{
				current = i;
				break;
			}	
		}
		System.out.println("Smallest is " + current);
	}
	public static boolean isDivisible (int y)
	{
		for (int x = 1; x <= 20; x++)
		{
			if (y % x != 0)
			{
				return false;
			}
		}
		return true;	
	}
	
	
	
}
