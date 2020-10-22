import java.util.*;
class MinorMatrix {

    public static void main(String args[]) {

        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 1, 2},
                        {1, 2, 3, 4}
                      };
        int[][] minorMatrice = getMinorMatrix(0, 0, arr);
        System.out.println(Arrays.deepToString(minorMatrice));
    }

    public static int[][] getMinorMatrix ( int skipRow, int skipCol, int[][] arr ) {

        int[][] minorMatrix = new int[arr.length - 1][arr[0].length - 1];
        int inputRowIndex = -1;
        int inputColIndex = -1;

        for ( int rowIndex = 0; rowIndex < arr.length; rowIndex++ ) {

            if ( rowIndex != skipRow) {

                inputRowIndex++;
                inputColIndex = -1;

                for ( int colIndex = 0; colIndex < arr[0].length; colIndex++ ) {

                    if (colIndex != skipCol) {

                        inputColIndex++;
                        minorMatrix[inputRowIndex][inputColIndex] = arr[rowIndex][colIndex];
                    }
                }
            }
        }
        return minorMatrix;
    }
}
