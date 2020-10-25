import java.util.*;

class TrimMethod {

    public static void main(String args[]) {

        String testStr1 = "  Hello world    "; // leading and trailing spaces
        String testStr2 = "     Hello World";  // tabspace 
        String testStr3 = "Hello World";    //No leading or trailing spaces

        String trimTest1 = trim(testStr1);
        String trimTest2 = trim(testStr2);
        String trimTest3 = trim(testStr3);

        System.out.println("Test String 1: " + trimTest1);
        System.out.println("Test String 2: " + trimTest2);
        System.out.println("Test String 3: " + trimTest3);
    }

    static String trim(String str) {

        char[] charArray = str.toCharArray();
        int leadingIndex = 0;
        int trailingIndex = str.length();

        for( int index = 0; index < charArray.length; index++ ) {

            if( !(Character.isWhitespace(charArray[index])) ) {

                leadingIndex = index;
                break;
            }
        }

        // 
        for( int index = charArray.length - 1; index >= 0; index-- ) {

            if( !(Character.isWhitespace(charArray[index])) ) {

                trailingIndex = index;
                break;
            }
        }

        char[] outputArray  = new char [charArray.length];
        int inputIndex = 0;
        for ( int index = leadingIndex; index <= trailingIndex; index++ ) {

            outputArray[inputIndex] = charArray[index];
            inputIndex++;
        }
        String outputString = new String(outputArray);
        return outputString;
    }

}



