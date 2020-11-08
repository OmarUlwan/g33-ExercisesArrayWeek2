package se.lexicon.omar;

public class ExerciseArray07 {

    // Create int array.
    static int[] numbers = new int[]{1, 2, 4, 7, 9, 12};

    public static void printUnevenNumbers(int[] arrayNumbers) {
        System.out.println("Exercise07_Expected output:");
        System.out.print("Array:");
        // Print Array.
        for (int integer : numbers) {
            System.out.print(" " + integer);
        }

        System.out.println();

        // Print odd array.
        System.out.print("Odd Array:");
        for (int integer : arrayNumbers) {
            if (integer % 2 != 0) {
                System.out.print(" " + integer);
            }
        }
        System.out.println();
    }
}
