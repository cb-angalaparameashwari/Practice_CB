import java.util.Scanner;
class Matrix{
	public static void main(String args[]){
		//Get input Matrix size
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix Size");
		int matrixRowSize = scanner.nextInt();
		int matrixColSize = scanner.nextInt();
		System.out.println("Enter Left or Right");
		//Get rotate type
		String rotateType = scanner.Next();
		getMatrix(matrixRowSize,matrixColSize);
		rotateMatrix(inputMatrix,matrixRowSize);
		printMarix(inputMatrix,matrixRowSize);
	}

	static void getmatrix(int matrixRowSize,int matrixColSize){
		Scanner scanner = new Scanner(System.in);
		//create a input matrix
		int[][] inputMatrix = new int [matrixRowSize][matrixColSize];
		//Get value for input matrix
		for(rowIterator = 0 ; rowIterator < matrixRowSize ; rowIterator++)
			for(colIterator = 0 ; colIterator < matrixColSize ; colIterator++){
			inputMatrix[rowIterator][colIterator] = scanner.nextInt();
		}
	
	}

	static void rotateMatrix(int inputMatrix[][], int matrixRowSize)
	{
		for (int x = 0; x < matrixRowSize / 2; x++)
        {
            for (int y = x; y < matrixRowSize-x-1; y++)
            {
                // store current cell in temp variable
                int temp = inputMatrix[x][y];
      
                // move values from right to top
                inputMatrix[x][y] = inputMatrix[y][matrixRowSize-1-x];
      
                // move values from bottom to right
                inputMatrix[y][matrixRowSize-1-x] = inputMatrix[matrixRowSize-1-x][matrixRowSize-1-y];
      
                // move values from left to bottom
                inputMatrix[matrixRowSize-1-x][matrixRowSize-1-y] = inputMatrix[matrixRowSize-1-y][x];
      
                // assign temp to left
                inputMatrix[matrixRowSize-1-y][x] = temp;
            }
        }
	}
	static void print(int inputMatrix[][],int matrixRowSize){
		for (int i = 0; i < matrixRowSize; i++)
        {
            for (int j = 0; j < matrixRowSize; j++)
                System.out.print(" " + inputMatrix[i][j]);
      
            System.out.print("\n");
        }
        System.out.print("\n");
	}
}