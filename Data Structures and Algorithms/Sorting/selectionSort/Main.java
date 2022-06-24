import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        // time complexity: O(n^2) uses 2 loops, unstable algorithm
        for (int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArr[i] > intArr[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(intArr, largestIndex, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArr));

    }

    public static void swap(int[] arr, int i, int j) {

        if (i == j) {
            return;
        } else {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}