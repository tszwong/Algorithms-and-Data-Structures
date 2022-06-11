import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20, 30, 35, -15, 7, 55, 1, -22};

        // pushing the largest numbers to the end of the array, time complexity O(n^2)
        for (int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // sorting in ascending order
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArr[i] > intArr[i+1]) {
                    swap(intArr, i,i+1);
                }
            }
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
