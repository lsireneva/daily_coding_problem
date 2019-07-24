import java.util.Arrays;

public class ProductArray {

    /*
    Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers
    in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?
     */

    public static void main (String[] args) {

        int[] inputArray = {3, 2, 1};
        System.out.println("Input array is " + Arrays.toString(inputArray));
        productArray(inputArray);
    }


    static void productArray (int[] inputArray) {

        int n = inputArray.length;
        int[] result = new int[n];
        int temp=1;

        // initialize result array
        for (int i = 1; i < n; i++)
            result[i] = 1;

        for (int j=0; j<n; j++) {
            result[j] = temp;
            temp *= inputArray[j];
        }

        temp=1;

        for (int j=n-1; j>=0; j--) {
            result[j] *= temp;
            temp *= inputArray[j];
        }


        System.out.println(Arrays.toString(result));
    }

}
