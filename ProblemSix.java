
public class ProblemSix
{

	public static void main(String[] args)
	{
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sumOfSquares += (i * i);
			squareOfSums += i;
		}

		squareOfSums = squareOfSums * squareOfSums;
		
		System.out.println("The difference between the sum of the squares of the first ten natural numbers and the square of the sum is " + squareOfSums + " - " + sumOfSquares + " = " + (squareOfSums - sumOfSquares));
	}

}
