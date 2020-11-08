package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray12 {

    // Create int[][] array.
    static int[][] twoDimensionalArray = new int[3][3];

    // Print the diagonal elements of two dimensional array.
    public static void printTheDiagonalElements (int[][] tempTwoDimensionalArray){
        int[] diagonalArray = new int[tempTwoDimensionalArray.length];

        // Calculate the values of the two dimensional array.
        // Print the array.
        System.out.println("Exercise12_Expected output:");
        for(int i = 0, j; i < tempTwoDimensionalArray.length; i++){
            for (j = 0; j < tempTwoDimensionalArray[i].length; j++){
                tempTwoDimensionalArray[i][j] = (i+1) * (j+1);
                System.out.print("\t" + tempTwoDimensionalArray[i][j]);
            }
            System.out.println();
        }

        // Get on diagonal elements of two dimensional array.
        for(int i = 0; i < tempTwoDimensionalArray.length; i++){
            diagonalArray[i] = tempTwoDimensionalArray[i][i];
        }

        // Print the diagonal elements.
        System.out.println("The diagonal elements are: " + Arrays.toString(diagonalArray));
    }
}
