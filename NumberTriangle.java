import java.util.Scanner;
class NumberTriangle{
	public static void main(String args[])
	{
		System.out.println("Enter the number of Lines");
		Scanner scanner = new Scanner(System.in);
		int noOfLines = scanner.nextInt(); // Get No of Lines
		printTriangle(noOfLines);
	}

	/*
	Method name : printTriangle
	inputs      : Integer for Number of rows in the triangle
	Output      : Void 
	Description  : Prints the Number Triangle as specified.
	*/	
	static void printTriangle(int noOfLines)
	{
		for(int rowIterator = 1 ; rowIterator <= noOfLines ; rowIterator++)
		{
			for (int space = noOfLines+noOfLines-1-rowIterator ; space >0 ; space--) // leave space
			{
				System.out.print(" ");
			}
				for (int printValueLeft = 1 ; printValueLeft <= rowIterator ; printValueLeft++) // print left Triangle
				{
					System.out.print( printValueLeft + " " );
				}
				for (int printValueRight = rowIterator-1 ; printValueRight >=1 ;printValueRight-- ) // print right side Triangle
				{
					System.out.print(printValueRight + " ");
				}
				System.out.println(); // Creating Next row
		}
	}
}