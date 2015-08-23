import java.math.BigInteger;


public class ProblemEight
{

	public static void main(String[] args)
	{
		String longNumberString = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

		
		int count = 0;
		int firstInteger = 0, secondInteger = 1, thirdInteger = 2, fourthInteger = 3, fifthInteger = 4, sixthInteger = 5, seventhInteger = 6, eighthInteger = 7, ninthInteger = 8, tenthInteger = 9, eleventhInteger = 10, twelfthInteger = 11, thirteenthInteger = 12;
		int mathOneInteger = 0, mathTwoInteger = 0, mathThreeInteger = 0, mathFourInteger = 0, mathFifthInteger = 0,  mathSixthInteger = 0, mathSeventhInteger = 0,  mathEighthInteger = 0,  mathNinthInteger = 0, mathTenthInteger = 0,  mathEleventhInteger = 0,  mathTwelfthInteger = 0,  mathThirteenthInteger = 0;
		int compareInteger = 0;
		int productInteger = 0;
		
		while (thirteenthInteger < 1000)
		{
			char first = longNumberString.charAt(firstInteger);
			char second = longNumberString.charAt(secondInteger);
			char third = longNumberString.charAt(thirdInteger);
			char fourth = longNumberString.charAt(fourthInteger);
			char fifth = longNumberString.charAt(fifthInteger);
			char sixth = longNumberString.charAt(sixthInteger);
			char seventh = longNumberString.charAt(seventhInteger);
			char eighth = longNumberString.charAt(eighthInteger);
			char ninth = longNumberString.charAt(ninthInteger);
			char tenth = longNumberString.charAt(tenthInteger);
			char eleventh = longNumberString.charAt(eleventhInteger);
			char twelfth = longNumberString.charAt(twelfthInteger);
			char thirteenth = longNumberString.charAt(thirteenthInteger);
			
			mathOneInteger = Character.getNumericValue(first);
			mathTwoInteger = Character.getNumericValue(second);
			mathThreeInteger = Character.getNumericValue(third);
			mathFourInteger = Character.getNumericValue(fourth);
			mathFifthInteger = Character.getNumericValue(fifth);
			mathSixthInteger = Character.getNumericValue(sixth);
			mathSeventhInteger = Character.getNumericValue(seventh);
			mathEighthInteger = Character.getNumericValue(eighth);
			mathNinthInteger = Character.getNumericValue(ninth);
			mathTenthInteger = Character.getNumericValue(tenth);
			mathEleventhInteger = Character.getNumericValue(eleventh);
			mathTwelfthInteger = Character.getNumericValue(twelfth);
			mathThirteenthInteger = Character.getNumericValue(thirteenth);
			
			productInteger = mathOneInteger * mathTwoInteger * mathThreeInteger * mathFourInteger * mathFifthInteger * mathSixthInteger * mathSeventhInteger * mathEighthInteger * mathNinthInteger * mathTenthInteger * mathEleventhInteger * mathTwelfthInteger * mathThirteenthInteger;
			
			if (productInteger > compareInteger)
			{
				compareInteger = productInteger;
			}
			firstInteger++;
			secondInteger++;
			thirdInteger++;
			fourthInteger++;
			fifthInteger++;
			sixthInteger++;
			seventhInteger++;
			eighthInteger++;
			ninthInteger++;
			tenthInteger++;
			eleventhInteger++;
			twelfthInteger++;
			thirteenthInteger++;
			
		}
		System.out.println("The greatest product from thirteen adjacent digits is " + compareInteger);
		
		
		
		
		
		
		
		

	}

}
