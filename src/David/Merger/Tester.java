package David.Merger;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String args[]){

        int n = 5;
        Scanner s = new Scanner(System.in);

        int[] a = new int[n];
        Array array = new Array(a);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number for the first array");
            a [i] = s.nextInt();
        }

        int[] b = new int[n];
        Array array1 = new Array(b);

        for (int j = 0; j < n; j++) {
            System.out.println("Enter a number for the second array");
            b [j] = s.nextInt();
        }

        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;

        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the
            // resultant array
            c[a1 + i] = b[i];
        }

        // Loop to print the elements of
        // resultant array after merging
        System.out.print("The merged array is: ");
        Arrays.sort(c);
        for (int i = 0; i < c1; i = i + 1) {

            // print the element
            System.out.print(c[i] + ", ");
        }
        System.out.println();
        System.out.println("Array 1: " + array);
        System.out.println("Array 2: " + array1);
    }
}
