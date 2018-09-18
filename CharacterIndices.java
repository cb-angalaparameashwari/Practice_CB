import java.util.Scanner;
class CharacterIndices{
	public static void main(String args[]){
		//Get input Char Sequence
		System.out.println("Enter a Char Seq");
		Scanner scanner = new Scanner(System.in);
		String charSeq = scanner.next(); 
		//Get Sum of Indices
		int sumChar = addIndices(charSeq);
		//Find whether the sum is add or even
		findOddOrEven(sumChar);
	}
	/*
	Method name : addIndices
	inputs      : String
	Output      : Returnds the sum of the char Indices
	*/
	static int addIndices(String charSeq){
		int sumChar = 0;
		//Convert the string to lower case
		charSeq = charSeq.toLowerCase();
		for(int index = 0 ; index < charSeq.length(); index++){
			//get char from the given string
			int charIndices = (int)charSeq.charAt(index)-96; // Subtract 96 from the character as ASCII of 'a' is 97
			//Add character indices
			sumChar = sumChar + charIndices;
		}
		return sumChar;
	/*
	Method name : findOddOrEven
	inputs      : Sum of Indices
	Output      : Void 
	Description  : Finds whether the given integer is odd or even.
	*/		static void findOddOrEven(int sumChar)
	{
		if(sumChar%2 == 0)
		{
			System.out.println("Sum of indices of the given Character Sequence is Even");
		}
		else
			{
			System.out.println("Sum of indices of the given Character Sequence is Odd");
		}

	}
}