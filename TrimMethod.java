/*
	Author : Shaik Faizan Roshan Ali
	Email : alsahercoder@gmail.com
	Date : 17-oct-2020
	An self implementation of trim method of Java.	
*/

import java.util.*;

class TrimMethod {

    public static void main(String args[]) {

        String testStr1 = "  Hello world    ";  // Leading and trailing spaces
        String testStr2 = "     Hello World";  // Tabspace 
        String testStr3 = "Hello World";      // No leading or trailing spaces

        String trimTest1 = trim(testStr1);
        String trimTest2 = trim(testStr2);
        String trimTest3 = trim(testStr3);

        System.out.println("Test String 1: " + trimTest1);
        System.out.println("Test String 2: " + trimTest2);
        System.out.println("Test String 3: " + trimTest3);
    }

    static String trim(String str) {

        char[] charArray = str.toCharArray();
        boolean flag = false;
        String trimmedString = "";
        for( int index = 0; index < charArray.length; index++ ) {

            if( !(Character.isWhitespace(charArray[index])) || flag == true ) {

                trimmedString = trimmedString.concat(String.valueOf(charArray[index]));
                flag = true;
            }

        }

        flag = false;
        char[] charArray1 = trimmedString.toCharArray();
        int stringLength = trimmedString.length();
        trimmedString = "";

        // This next Loop prints the mirror output after removing leading and trailing spaces.
        for( int index = stringLength - 1; index >= 0; index-- ) {

            if( !(Character.isWhitespace(charArray1[index])) || flag == true ) {

                trimmedString = trimmedString.concat(String.valueOf(charArray1[index]));
                flag = true;
            }

        }

        stringLength = trimmedString.length();
        String outputString = "";

        for ( int index = stringLength - 1; index >=0; index-- ) {

            outputString = outputString.concat(String.valueOf(trimmedString.charAt(index)));
        }
        
        return outputString;
    }
}
