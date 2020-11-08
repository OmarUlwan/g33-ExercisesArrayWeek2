package se.lexicon.omar;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseArray11 {
    static int[] userArray = new int[0];

    // Add an element to userArray and print the array.
    public static void additionToUserArray(int[] temArray, int newNumber) {
        userArray = Arrays.copyOf(temArray, temArray.length + 1);
        userArray[userArray.length - 1] = newNumber;
        System.out.println("User array: " + Arrays.toString(userArray));
    }

    // Reverse user array.
    public static void reverseUserArray(int[] temArray) {
        int[] myNewArray = new int[temArray.length];
        for (int i = 0, j = temArray.length - 1; i < temArray.length; i++, j--) {
            myNewArray[j] = temArray[i];
        }
        userArray = myNewArray;
        System.out.print("The reverse to userArray: ");
        System.out.println(Arrays.toString(userArray));
    }

}

class UserInput {
    static Scanner scan = new Scanner(System.in);

    public static int getNumber() {
        // Execute while loop until the user enters a correct value.
        while (true) {
            try {
                // Assigning an user's entry to the variable "input".
                String input = getUserInput();

                // Return Integer value, If the user's entry was number!, or throw exception if the input has wrong form.
                return Integer.parseInt(input);

                // Error override.
            } catch (Exception e) {
                System.out.println("Error. Enter number:");
            }
        }
    }

    public static String getUserInput() {
        String line = scan.nextLine();

        // Exit, if user asked to end the program.
       if (line.equalsIgnoreCase("exit")) {
            // Print the reverse to userArray.
            ExerciseArray11.reverseUserArray(ExerciseArray11.userArray);
            System.out.println("\n" + "<<<<<<< " + "The End of Exercises array week 2." + " >>>>>>>");
            scan.close();
            System.exit(0);
        }
        return line;
    }

}