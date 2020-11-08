package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray10 {

    // Create int[][] array.
    static int[][] arrayMultiplication = new int[10][10];

    // Method to print multiplication table of int 2d array.
    public static void printMultiplication(int[][] arrayNumbers) {
        System.out.println("Exercise10_Expected output: Print multiplication table");
        for(int row = 0, column; row < arrayNumbers.length; row++){
            for (column = 0; column < arrayNumbers[row].length; column++){
                arrayNumbers[row][column] = (row+1) * (column + 1);
                System.out.print("\t" + arrayNumbers[row][column]);
            }
            System.out.println();
        }
    }
}

