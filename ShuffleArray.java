/* 
    Author : Shaik Faizan Roshan Ali
    Email : alsahercoder@gmail.com
    Date : 15-sep-2018
    Source : https://leetcode.com/problems/shuffle-the-array/
    
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
    
import java.util.Arrays;

class ShuffleArray {
	public static void main (String[] args) {
		
		int[] testCase1 = { 2, 5, 1, 3, 4, 7 };  // { 2, 3, 5, 4, 1, 7 }
		
		int[] outputArr1 = shuffleArray(testCase1);
		System.out.println(Arrays.toString(outputArr1));
		
        int[] testCase2 = { 1, 2, 3, 4, 4, 3, 2, 1 };  // { 1, 4, 2, 3, 3, 2, 4, 1 }
        
		int[] outputArr2 = shuffleArray(testCase2);
		System.out.println(Arrays.toString(outputArr2));
	}
	
	public static int[] shuffleArray(int[] inputArray) {
	    
	    int[] outputArray = new int[inputArray.length];
	    int pointerOne = 0;
	    int pointerTwo = inputArray.length / 2;
	    
	    for ( int index = 0; index < inputArray.length && pointerTwo < inputArray.length; index++ ) {
	        
	        if ( index % 2 == 0 ) {
	            
	            outputArray[index] = inputArray[pointerOne];
	            pointerOne++;
	        }	        
	        else  {
	            
	            outputArray[index] = inputArray[pointerTwo];
	            pointerTwo++;
	        }         
	    }
	    return outputArray;
	}
}
