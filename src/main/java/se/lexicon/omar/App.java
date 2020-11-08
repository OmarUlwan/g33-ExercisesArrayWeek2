package se.lexicon.omar;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // Exercise_01: Write a program which will store elements in an array of type ‘int’ and print it out.
        ExerciseArray01.printExercise01();

        System.out.println("===================================");

        // Exercise_02: Find and return the index of an element.
        int CheckIndexOfElement = 5;
        System.out.println("Exercise02_Expected output: Index position of number "
                + CheckIndexOfElement + " is: " + ExerciseArray02.indexOf(CheckIndexOfElement) + ".");

        System.out.println("===================================");

        // Exercise_03: Print string array and sort string array.
        ExerciseArray03.printUnAndSortArray(ExerciseArray03.citiesArray);

        System.out.println("===================================");

        // Exercise_04: Print copyOf array.
        ExerciseArray04.printArrayAndCopyArray(ExerciseArray04.firstArray);

        System.out.println("===================================");

        // Exercise_05:Assign values to the 2d array and print them.
        ExerciseArray05.printAssignCountryCity(ExerciseArray05.defaultCountryCity);

        System.out.println("===================================");

        // Exercise_06: Print the average of the array.
        ExerciseArray06.printAverageOfArray(ExerciseArray06.numbersArray);

        System.out.println("===================================");

        // Exercise_07: Print odd array.
        ExerciseArray07.printUnevenNumbers(ExerciseArray07.numbers);

        System.out.println("===================================");

        // Exercise_08: Print array without duplicate values.
        ExerciseArray08.printArrayWithoutDuplicateNumber(ExerciseArray08.arrayNumbers);

        System.out.println("===================================");

        // Exercise_09:
        String newElement = "now";
        String[] arrayBeforeExtended = new String[]{"The", "method", "work"};
        System.out.println("Exercise09_Expected output:");
        System.out.println("Array before add the element: " + Arrays.toString(arrayBeforeExtended));
        System.out.println("Array after add the element: " + Arrays.toString(ExerciseArray09.getExtendedArray(arrayBeforeExtended, newElement)));

        System.out.println("===================================");

        // Exercise_10: Print multiplication table
        ExerciseArray10.printMultiplication(ExerciseArray10.arrayMultiplication);

        System.out.println("===================================");

        // Exercise_12:
        ExerciseArray12.printTheDiagonalElements(ExerciseArray12.twoDimensionalArray);

        System.out.println("===================================");

        // Exercise_13: Create and print sort array from random array.
        ExerciseArray13.copyNumberToSortArray(ExerciseArray13.arrayWithRandomNumbers);

        System.out.println("===================================");

        // Exercise_11:
        // Get the value for the variable "number1" from the user.
        System.out.println("Exercise011_Expected output:");
        for (int index = 0; true; index++) {
            System.out.println("Type Exit to end or Enter number for add it to userArray[" + index + "] :");
            int number = UserInput.getNumber();
            ExerciseArray11.additionToUserArray(ExerciseArray11.userArray, number);
        }
    }

}

