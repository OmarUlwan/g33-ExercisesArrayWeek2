package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray02 {

    // Create int array.
    static int[] exerciseArray02 = new int[]{11, 23, 5, 9, 31};

    // Find and return the index of an element in the array.
    // If the element does not exist, method should return -1 as value.
    public static int indexOf(int CheckIndexOfElement){
        int indexSearch = Arrays.binarySearch(exerciseArray02, CheckIndexOfElement);
        if(indexSearch >= 0){
            return indexSearch;
        }
        return -1;
    }

}
