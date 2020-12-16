package David.BinarySearch;

/*                  MESSAGE FOR PROFESSOR.
    This was done in a single class because my intent is
    to save this class for future implementation in other projects
 */

import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // declares size of array
        System.out.print("Please enter the size of the array: ");
        int size = s.nextInt();

        // declares the array
        int[] array = new int[size];

        // adds elements to array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for the array");
            array[i] = s.nextInt();
        }

        // print array
        System.out.println("Contents of the array: ");
        for (int y = 0; y < array.length; y++) {
            System.out.println("array[" + y + "] = " + array[y]);
        }

        // asks and declares the target number
        System.out.print("Please enter the target number: ");
        int target = s.nextInt();

        // variables for the functionality of the binary search
        int min = 0;
        int middle;
        int max = size - 1;

        // loop in charge of the search
        while (min <= max) {

            middle = (max + min) / 2;

            if (array[middle] == target) {
                System.out.println("The target number is in the " + middle + " position");
                break;

            } else if (target < array[middle]) {

                max = middle - 1;

            } else {

                min = middle + 1;

            }
        }
    }
}
