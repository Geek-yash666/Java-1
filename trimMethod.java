import java.util.*;

class Trim {
    
    public static void main(String args[]) {
        
        String testStr1 = "  Hello World";
        String testStr2 = "Hello World"
        trim(testString);
    }
    
    static void trim(String str) {
        
        char[] charArray = str.toCharArray();
        boolean flag = false;

        for( int index = 0; index < charArray.length; index++ ) {
            
            if( charArray[index] != ' ' || flag == true ) {
                
                 System.out.print(charArray[index]);
                 flag = true;
            }
               
        }
    }
    
}
