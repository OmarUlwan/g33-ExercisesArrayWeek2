package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray03 {

    // Create String array [4].
    static String[] citiesArray = new String[]{"Paris", "London", "New York", "Stockholm"};

    // Method to print string array and sort string array.
    public static void printUnAndSortArray (String[] sortingAnyArray){
        System.out.println("Exercise03_Expected output:");
        System.out.println("\t" + "String array:" + Arrays.toString(sortingAnyArray));
        Arrays.sort(sortingAnyArray);
        System.out.println("\t" + "Sort string array: "+ Arrays.toString(sortingAnyArray));
    }
}
