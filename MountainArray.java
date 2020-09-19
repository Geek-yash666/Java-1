/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 19-sep-2020
    Source: https://leetcode.com/problems/valid-mountain-array/
	To check if the array is strictly increasing and then strictly decreasing. Any other sequence is neglected.
*/ 

import java.util.*;

public class MountainArray {
    
    public static void main (String[] args) {
        
        int[] inputArray = {2, 4, 6, 10, 12, 9, 7, 1};
        mountainArray(inputArray);
        
    }
    
    public static void mountainArray(int checkArray[]) {
        
        int flag = 0;
        int checkIndex = 1;
        boolean arrayCondition = true;
        
        for ( checkIndex = 1; checkIndex < checkArray.length; checkIndex++ ) {
            
            if ( checkArray[checkIndex] > checkArray[checkIndex - 1] && flag == 0) {
                
                flag = 0;
                continue;
                // Increasing case
            } 
            
            else if ( checkArray[checkIndex] < checkArray[checkIndex - 1] ) {
                
                flag = 1;
                continue;
                // Decreasing case
            }
            
            arrayCondition = false;
            break;
            
        } 
        
        System.out.println(arrayCondition);
    }
}
