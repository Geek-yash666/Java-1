/* 
    Author : Shaik Faizan Roshan Ali
    Email : alsahercoder@gmail.com
    date : 14-oct-2020
    
    Transpose Array wihtout another Array (i.e. In Place);
*/

import java.util.*;

class TransposeArray {
    
    public static void main(String args[]) {
    
        int[][] testOne = { {1, 2}, {3, 4} }; // 2 X 2 matrix
    
        int[][] transposedArray = transposeArray(testOne);
        printArray(transposedArray);
        
        int[][] testTwo = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, { 13, 14, 15, 16} }; // 4 X 4 matrix
        int[][] transposedArray2 = transposeArray(testTwo);
        printArray(transposedArray2);
        
        int[][] testThree = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} }; // Rectangular array
        int[][] transposedArray3 = transposeArray(testThree);
        printArray(transposedArray3);
        
        int[][] testFour = { }; // Empty case
        int[][] transposedArray4 = transposeArray(testFour);
        printArray(transposedArray4);
    }   

    public static int[][] transposeArray(int[][] inputArray) {
        
        int[][] errorArray = { {0, 0}, {0, 0} };
        
        if ( inputArray.length != inputArray[0].length ) 
            return errorArray;
    
        for ( int row = 0; row < inputArray.length && inputArray.length == inputArray[0].length; row++ ) { 
    
            for ( int col = 0; col < inputArray[0].length; col++ ) { 
    
                if ( row != col && row < col) {

                    int temp = inputArray[col][row];
                    inputArray[col][row] = inputArray[row][col];
                    inputArray[row][col] = temp;
                }    
            }
        }
        
        return inputArray;
    }   

    public static void printArray ( int[][] array ) { 

        for ( int row = 0; row < array.length; row++ ) { 

            for ( int col = 0; col < array[0].length; col++ ) { 
    
                System.out.print(array[row][col] + " ");
            }
    
            System.out.println();
        }    
    }   
}
