/* 
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 9-Oct-2020
  	This program searches last index of a character in a String value.
*/


import java.util.*;

class LastIndexOf{
    
    public static void main(String args[]) {
        
        String str = "coding in java is cool";
        char[] inputArray = str.toCharArray();
        char search = 'o';
        
        indexOf(inputArray, search);
    }
    
    public static void indexOf(char[] strArray, char searchChar ) {
        
        for ( int index = strArray.length - 1; index < strArray.length && strArray.length != 0; index-- ) {
            
            if( searchChar == strArray[index] ) {
               
                System.out.println("last index " + index);
                return;  
            }
        }
        
        System.out.println("Index doesn't exist");
    }
}

	
