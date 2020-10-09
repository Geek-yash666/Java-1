
/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 10-Oct-2020
	This program is transposes an array.
*/

import java.util.*;

class TransposeArray {
	public static void main (String[] args) {
        
        int[][] arr = { {1, 2 , 3}, {4, 5, 6} };
        
        transposeArray(arr);
    }
    
    public static void transposeArray( int[][] inputArray ) {
        
        int[][] transposedArray = new int[inputArray[0].length][inputArray.length];
        
        for( int rowArrayVal = 0; rowArrayVal < inputArray.length; rowArrayVal++  ) {
            
            for( int columnArrayVal = 0; columnArrayVal < inputArray[0].length; columnArrayVal++ ) {
                
                System.out.println ( rowArrayVal + " " + columnArrayVal);
                transposedArray[columnArrayVal][rowArrayVal] = inputArray[rowArrayVal][columnArrayVal];
                
            }
        }
        
        System.out.print(Arrays.deepToString(transposedArray));
        
    }
        
}
