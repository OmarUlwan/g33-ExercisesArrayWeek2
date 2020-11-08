package se.lexicon.omar;

class ExerciseArray01 {

    // Create int array [3].
    static int[] exerciseArray01 = new int[]{11, 23, 39};
    
    // Method to print exerciseArray01.
    public static void printExercise01() {
        System.out.print("Exercise01_Expected output:");
        for (int i : exerciseArray01) {
            System.out.print(i + " ");
        }
        System.out.println("etc.");
    }
}
