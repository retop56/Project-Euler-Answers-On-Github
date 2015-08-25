package testingstuff;

public class SieveOfEretosthenesTest
{

	public static void main(String[] args)
	{
		long n = 2971215072L;
		boolean isPrime = true;
		
		for(long i = 2; i < ((long)Math.sqrt(n)); i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}
		
		if (isPrime == true){
			System.out.println("The number " + n + " is prime!");
		}
		else{
			System.out.println("The number " + n + " is composite!");
		}

	}

}
