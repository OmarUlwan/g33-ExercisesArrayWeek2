package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray08 {

    // Create int[] array.
    static int[] arrayNumbers = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};

    public static void printArrayWithoutDuplicateNumber(int[] removeDuplicateNumber) {

        System.out.println("Exercise08_Expected output:");
        System.out.println("Array: " + Arrays.toString(removeDuplicateNumber));
        // count to temArray index and new array length.
        int count = 0;

        // Tem array.
        int[] tmpArray = new int[removeDuplicateNumber.length];

        // To check exist duplicate.
        boolean isFalse;

        // For loop to check and  remove the duplicate elements of an array.
        for(int i = 0, j; i < removeDuplicateNumber.length; i++){
            isFalse = false;
            for(j = 0; j < tmpArray.length; j++){
                if (tmpArray[j] == removeDuplicateNumber[i]){
                    isFalse = true;
                    break;
                }
            }
            if(!isFalse){
                tmpArray[count] = removeDuplicateNumber[i];
                count++;
            }
        }

        // Assign tmpArray values to removeDuplicateNumber.
        removeDuplicateNumber = Arrays.copyOf(tmpArray, count);
        System.out.println("Array without duplicate values: " + Arrays.toString(removeDuplicateNumber));
    }
}
