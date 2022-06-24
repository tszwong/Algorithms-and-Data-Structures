import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        // set initial gap to half of array length rather than Knuth's Sequence (3n+1)
        // the gap will be cut to half the previous interation each time
        // worst case time complexity is O(n^2), but usually faster than insertion sort
        // when dealing with large data sets

        for (int gap = intArr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArr.length; i++) {  // moves down the array but keeps a constant gap
                int newElement = intArr[i];
                int j = i;

                // checks if the current value and the value at the end of the gap is greater
                // will continue to check all values after the gaps if they exist
                while (j >= gap && intArr[j-gap] > newElement) {
                    intArr[j] = intArr[j-gap];  // if greater that it will swap
                    j -= gap;
                }

                // the other value will be the value of the temp variable
                intArr[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(intArr));
    }
}
