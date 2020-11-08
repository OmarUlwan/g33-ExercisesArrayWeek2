package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray04 {

    // Create int array.
    static int[] firstArray = new int[]{1, 15, 20};

    // Method Print copyOf array.
    public static void printArrayAndCopyArray(int[] copyArray) {

        // copyOf first array to second array.
        int[] secondArray = Arrays.copyOf(copyArray, copyArray.length);

        // print first array.
        System.out.print("Exercise04_Expected output: Elements from first array: ");
        for (int i : copyArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Print second array.
        System.out.print("                            Elements from second array: ");
        for (int j : secondArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


}
