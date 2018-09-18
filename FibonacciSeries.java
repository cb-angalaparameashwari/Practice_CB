import java.util.Scanner;
class FibonacciSeries{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		// Get the length of the series
		System.out.println("Enter the length of the FibonacciSeries");
		int lengthOfSeries = scanner.nextInt();
		//Iterate for length of the series
		for(int iterator = 0 ; iterator < lengthOfSeries ; iterator++)
			//Print Fibonacci numbers
		System.out.println(getFibSeries(iterator));
	}
	/*
	Method name : getFibSeries
	inputs      : length of the series
	Output      : returns fibonacci number
	Description : Calculates fibonacci series.
	*/
	static int getFibSeries(int lengthOfSeries)
	{
		// return 0 if length is 0
		if(lengthOfSeries == 0)
			return 0;
		// Return 1 if length is 1 or 2
		if(lengthOfSeries == 1 || lengthOfSeries == 2 ){
            return 1;
        }
        // calculate and call recursively 
        return getFibSeries(lengthOfSeries-1) + getFibSeries(lengthOfSeries -2); 
	}
}