
public class ProblemTen
{

	public static void main(String[] args)
	{
		long sumOfPrimesLong = 0;
		for (int i = 2; i < 2000000; i++){
			if (isPrime(i)){
				sumOfPrimesLong += i;
			}
		}
		System.out.println("The sum of all primes below 2,000,000 is " + sumOfPrimesLong);
	}

	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

}
