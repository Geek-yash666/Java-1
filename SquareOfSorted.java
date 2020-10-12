/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 12-oct-2020
	Source : https://leetcode.com/problems/squares-of-a-sorted-array/
	Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
*/


import java.lang.Math;
import java.util.Arrays;

class SquareOfSorted {
	
	   public static void main(String args[]) {
	       
	       int[] arr = { -7, -3, 2, 3, 11 };
	       
	       int[] outputArr = SquareOfSorted(arr);
	       System.out.println(Arrays.toString(outputArr));
	   }
	   
	   public static int[] SquareOfSorted( int[] inputArray )  {
	       
	       int[] squareArray = new int[inputArray.length];
	       int leftPtr = 0;
	       int rightPtr = inputArray.length - 1;
	       int squareArrayIndex =  inputArray.length - 1;
	       
	       for ( int index = 0; index < inputArray.length; index++ ) {
	           
	            if( leftPtr > rightPtr ) 
                    break;
                    
	            if ( Math.abs(inputArray[leftPtr]) >= Math.abs(inputArray[rightPtr]) ) {
	                
	                squareArray[squareArrayIndex] = inputArray[leftPtr] * inputArray[leftPtr];
	                leftPtr++;
	                squareArrayIndex--;
	            }	            
	            else {
	                
	                squareArray[squareArrayIndex] = inputArray[rightPtr] * inputArray[rightPtr];
	                rightPtr--;
	                squareArrayIndex--;
	            }           
	       }
	       
	       return squareArray;
	   }
}
