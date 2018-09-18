class Summation{
public static void main(String args[]){
	int x=4;  //Initialisation of x x
	int y = 5;  // Initialisation y
	int z = addNumbers(x,y);  
	System.out.println(z); // Display the result 
}
/*
	Method name : addNumbers
	inputs      : Inputs x and y
	Output      : sum of x and y
	Description : returns the sum of x and y
	*/
static int addNumbers(int x , int y){
	int z = x + y ; // Summing x and y
	return z;	
}
}