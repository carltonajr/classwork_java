//Carlton Austin Jr
// Recursion
// 6/17/2026

import java.util.Arrays;

public class Recursion {
    // function to find the smallest value in the array.
    public static int smallest(int[] numbers, int index) {

        // base case
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        // recursive call: get smallest from the rest of the array
        int minFromRest = smallest(numbers, index + 1);

        // compare current value with result from recursion
        return Math.min(numbers[index], minFromRest);
    }
    public static void main(String[] args) {
        // numbers array
        int[] numbers = {42, 7, 91, 18, 56, 33, 84, 2, 69, 25};

        // showing the array and the recursion result
        int result = smallest(numbers, 1);
        System.out.println("numbers array:" + Arrays.toString(numbers));
        System.out.println("the smallest value in the numbers array is " + result);
    }
}
