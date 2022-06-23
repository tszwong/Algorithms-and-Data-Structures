import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArr, 0, intArr.length);

        System.out.println(Arrays.toString(intArr));

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {  // check one element in array
            return;
        }

        int pivot = partition(arr, start, end);  // position of pivot
        quickSort(arr, start, pivot);  // sort left subarray
        quickSort(arr, pivot+1, end);  // sort right subarray
    }

    public static int partition(int[] arr, int start, int end) {
        // using the first element as pivot
        int pivot = arr[start];
        int i = start;  // left side
        int j = end;  // right side

        while (i < j) {  // stop if the start and end points pass each other

            // empty loop body, keeps decrementing value of j until an element
            // smaller than pivot is found or if start and end pointers cross
            // moving from right to left
            while (i < j && arr[--j] >= pivot);

            // move the element at j into position i since we found an element smaller than the pivot
            // so that the element that was at j is to now to the left of the pivot
            if (i < j) {
                arr[i] = arr[j];  // swap the elements
            }

            // another empty loop body, keeps incrementing value of i until an element
            // greater than pivot is found or if start and end pointers cross
            // moving from left to right
            while (i < j && arr[++i] <= pivot);

            if (i < j) {
                arr[j] = arr[i];
            }

        }

        arr[j] = pivot;  // replace the duplicate item with the pivot so no data is lost
        return j;
    }

}
