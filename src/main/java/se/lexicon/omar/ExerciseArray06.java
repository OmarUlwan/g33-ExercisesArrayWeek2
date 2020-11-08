package se.lexicon.omar;

public class ExerciseArray06 {

    // Create int array.
    static int[] numbersArray = new int[]{43, 5, 23, 17, 2, 14};

    // Print the average of the array.
    public static void printAverageOfArray(int[] averageNumberArray){
        double result = 0;
        for(int integer : averageNumberArray){
            result += integer;
        }
        result = result/averageNumberArray.length;
        System.out.println("Exercise06_Expected output: Average is: " + result);
    }
}
