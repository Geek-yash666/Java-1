class BinarySearchRecursion {
    
    public static void main(String args[]) {
        
        int[] arr = { 1, 2, 4, 6, 8, 11, 15 };
        int target = 11;
        
        int indexfound = binarySearch( arr, 2, 0, arr.length - 1);
        System.out.println(indexfound);
    }
    
    public static int binarySearch(int[] inputArr, int search, int startIndex, int lastIndex) {
        
        if ( lastIndex >= startIndex ) {
            
            int mid = (startIndex + lastIndex) / 2;
            
            if( inputArr[mid] == search ) {
             
                return mid;   
            }
                
            if ( search < inputArr[mid] ) {
                
                return binarySearch(inputArr, search, startIndex, mid - 1 );
            }
            else if ( search > inputArr[mid] ) {
                
                return binarySearch(inputArr, search, mid + 1, lastIndex );
            }
        }
    
        return -1;
    }
}
