/*
  Author: Shaik Faizan Roshan Ali
  Email: alsahercoder@gmail.com
  Date: 26-Sep-2020
  This program is for searching the subString;
*/

import java.util.*;

class searchSubString {
    
    public static void main(String args[]) {
        
        String str1 = "Hello shanghai, I am Roshan";
        String str2 = "osha";
        
        int occurence = subString(str1, str2);
        System.out.println(occurence);
    }
    
    public static int subString(String mainString, String subString) {
        
        char[] mainStringArray = mainString.toCharArray();
        char[] subStringArray = subString.toCharArray();
        int index = 0;
        
        for( index = 0; index < mainStringArray.length - subStringArray.length && subStringArray.length < mainStringArray.length; index++ ) {
           
            int checkIndex = 0;
            for ( int subIndex = index; subIndex < subStringArray.length; subIndex ++ ) {
          
            	if( subStringArray[checkIndex] == mainStringArray[subIndex] )
            		checkIndex++; 
               
            	else 
            	    break;
            }
            
        }
        
        index--;
	return index;
    }
}
