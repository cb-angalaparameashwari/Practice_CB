class ConditionalStatements{
	public static void main(String args[]){
		whilePrintNumbers(); 
	}
	/*
	Method name : whilePrintNumbers
	inputs      : NA
	Output      : Void 
	Description : Simple method to use while loop
	*/	
	static void whilePrintNumbers()
	{
		int iterator = 0; // Initializing iterator variable
		while(iterator<10) 
		{
			System.out.println(iterator++); // Display and increment iterator value
		}
	}
}