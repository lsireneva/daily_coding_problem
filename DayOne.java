import java.util.HashMap;
import java.util.HashSet;

public class DayOne {

    /*
     Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

     For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

     Bonus: Can you do this in one pass?

     */
    public static void main (String[] args) {
        int[] array = {10, 15, 3, 7};
        int k = 17;

        System.out.println(twoSum(array, k));

    }

    static boolean twoSum (int[] array, int sum) {
        boolean result = false;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(sum - array[i])) result = true;
            set.add(array[i]);
        }

        return result;
    }
}
