import java.util.*;


public class ProblemThree
{
	public static void main(String[] args){
		
		long fuckProblemThreeLong = 600851475143L;
		
		
		for (long i = 2L; i < fuckProblemThreeLong; i++){
			
			if (fuckProblemThreeLong % i == 0)
			{
				
				fuckProblemThreeLong = fuckProblemThreeLong / i;
				System.out.println("This is one of them: " + fuckProblemThreeLong);	
			}
			
			
			
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
}

