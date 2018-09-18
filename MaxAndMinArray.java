import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class MaxAndMinArray{
	public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
		// Get Array Size
		System.out.println("Enter the array Size");
		int arraySize = sc.nextInt();
        //Get Array Elements
        System.out.println("Enter Array Elements");
        Integer[] inputArray = new Integer[arraySize];
        for(int iterator= 0 ; iterator <arraySize ; iterator++)
        {
        	inputArray[iterator] = sc.nextInt();
        }
        findLargest(inputArray);
        findSmallest(inputArray);
    }
    /*
	Method name : findLargest
	inputs      : Input array
	Output      : void
	Description : Finds the largets element in the array
	*/
	static void findLargest(Integer[] arr) 
    {
    	//sorting array
        Arrays.sort(arr); 
     //Display the largest element
    System.out.println("Largest value is " + arr[arr.length-1]);
    } 
    /*
	Method name : findSmallest
	inputs      : Input array
	Output      : void
	Description : Finds the smallest element in the array
	*/
    static void findSmallest(Integer[] arr) 
    {
    	//Sorting the array
        Arrays.sort(arr); 
     //Display the smallest element
    System.out.println("Smallest value is " + arr[0]);
    } 
}
