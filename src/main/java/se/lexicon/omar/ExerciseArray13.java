package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray13 {

    // Create array with random numbers.
    static int[] arrayWithRandomNumbers = new int[]{2, 1, 7, 4, 9, 14, 56, 7, 43, 5, 99, 53, 44, 56};
    // Create array[0] to add sort numbers to it.
    static int[] arrayWithSortNumbers = new int[0];


    public static void copyNumberToSortArray(int[] getRandomArray) {

        // Create two array[0] to take odd and locate numbers, from the array.
        int[] arrayWithLocatedNumber = new int[0];
        int[] arrayWithOddNumber = new int[0];

        // Take odd and locate numbers from the array.
        for (int i : getRandomArray) {
            if (i % 2 == 0) {
                arrayWithLocatedNumber = Arrays.copyOf(arrayWithLocatedNumber, arrayWithLocatedNumber.length + 1);
                arrayWithLocatedNumber[arrayWithLocatedNumber.length - 1] = i;
            } else {
                arrayWithOddNumber = Arrays.copyOf(arrayWithOddNumber, arrayWithOddNumber.length + 1);
                arrayWithOddNumber[arrayWithOddNumber.length-1] = i;
            }
        }

        Arrays.sort(arrayWithLocatedNumber);
        Arrays.sort(arrayWithOddNumber);

        // Get length to array arrayWithSortNumbers from arrays arrayWithSortNumbers & arrayWithOddNumber.
        arrayWithSortNumbers = Arrays.copyOf(arrayWithSortNumbers, arrayWithLocatedNumber.length + arrayWithOddNumber.length);

        // add values to array arrayWithSortNumbers.
        for(int i = 0, j; i < arrayWithLocatedNumber.length; i++){
            arrayWithSortNumbers[i] = arrayWithLocatedNumber[i];
            if (i == arrayWithLocatedNumber.length -1){
                for(j = 0; j < arrayWithOddNumber.length; j++){
                    arrayWithSortNumbers[arrayWithLocatedNumber.length + j] = arrayWithOddNumber[j];
                }
            }
        }

        // Print arrays.
        System.out.println("Exercise13_Expected output: ");
        System.out.println("Array with random numbers: " + Arrays.toString(arrayWithRandomNumbers));
        System.out.println("Array with sort numbers: " + Arrays.toString(arrayWithSortNumbers));

    }
}
