package se.lexicon.omar;

public class ExerciseArray05 {

    // Create String[][] array.
    static String[][] defaultCountryCity = {{"France","Paris"},{"Sweden", "Stockholm"}};

    // Method to print string 2d array.
    public static void printAssignCountryCity(String[][] assignCountryCity) {
        System.out.println("Exercise05_Expected output:");
        for (String[] strings : assignCountryCity) {
            for (String string : strings) {
                System.out.print(" " + string);
            }
            System.out.println();
        }
    }
}