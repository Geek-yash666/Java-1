/* 
    Author : Shaik Faizan Roshan Ali
    Email : alsahercoder@gmail.com
    date : 15-sep-2018
    
    This program finds the first duplicate value with least index number.
*/
    
import java.util.*;

public class FirstDuplicateValue {
    public static void main(String args[]) {
    
        int[] inputArray = {1, 2, 3, 6, 7, 3, 0, 0};
    
        duplicateValue(inputArray);
    }
    
    public static void duplicateValue(int checkArray[]) {
    
        for ( int trueIndex = 0; trueIndex < checkArray.length; trueIndex++ ) {
        
            int trueValue = checkArray[trueIndex];
         
            for ( int checkIndex = trueIndex + 1; checkIndex < checkArray.length; checkIndex++ ) {
            
                if ( trueValue == checkArray[checkIndex] ) {
         
                    System.out.println("The duplicate number: " + trueValue + " with least Index " + trueIndex );
                    System.exit(0);
                }
            }
        }
    }
}
