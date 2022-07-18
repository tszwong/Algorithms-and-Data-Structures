import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        Arrays.sort(intArray);  // binary search requires the data to be sorted
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8));
    }

    public static int recursiveBinarySearch(int[] arr, int val) {
        return recursiveBinarySearch(arr, 0, arr.length, val);
    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
        if (start >= end) {
            return -1;
        } else {
            int mid = (start + end) / 2;  // set mid point
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {  // right half of the array
                return recursiveBinarySearch(arr, mid+1, end, value);
            } else {  // left side of the array
                return recursiveBinarySearch(arr, start, mid, value);
            }
        }
    }
}