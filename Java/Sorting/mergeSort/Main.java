import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(intArr));

        mergeSort(intArr, 0, intArr.length);
        System.out.println(Arrays.toString(intArr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start < 2) {  // check if array is one element
            return;
        } else {
            int mid = (start + end) / 2;  // finding the middle point

            mergeSort(arr, start, mid);  // left array
            mergeSort(arr, mid, end);  // right array

            merge(arr, start, mid, end);  // merge the left and right arrays
        }
    }

    public static void merge (int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid]) {
            return;
        } else {
            int i = start;
            int j = mid;
            int tempIndex = 0;

            int[] temp = new int[end-start];  // output array

            // condition prevents the first point from going past mid and the other from past the end of array
            while (i < mid && j < end) {
                if (arr[i] <= arr[j]) {
                    temp[tempIndex++] = arr[i++];  // moving left array pointer
                } else {
                    temp[tempIndex++] = arr[j++];  // moving right array pointer
                }
            }

            System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
            System.arraycopy(temp, 0, arr, start, tempIndex);

        }
    }

}