package se.lexicon.omar;

import java.util.Arrays;

public class ExerciseArray09 {

    public static String[] getExtendedArray(String[] extendedArray, String addValue){
        extendedArray = Arrays.copyOf(extendedArray, extendedArray.length+1);
        extendedArray[extendedArray.length-1] = addValue;
        return extendedArray;
    }
}
