import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        Arrays.sort(intArray);  // binary search requires the data to be sorted
        System.out.println(binarySearch(intArray, 1));
        System.out.println(binarySearch(intArray, 35));
        System.out.println(binarySearch(intArray, 8));
    }

    public static int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;  // set the mid point
            if (arr[mid]  == val) {
                return mid;
            } else if (arr[mid] < val) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;  // element not found
    }
}
