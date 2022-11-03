import java.util.*;

public class Intersection {

    // Method that finds the intersection between two arrays
    public static int[] findInter(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            throw new IllegalArgumentException();
        }

        int[] arr = new int[a1.length + a2.length];
        Sort.mergeSort(a1);
        Sort.mergeSort(a2);

        int a1Index = 0;
        int a2Index = 0;
        int arrIndex = 0;

        while (a1Index < a1.length && a2Index < a2.length) {
            if (a1[a1Index] < a2[a2Index]) {
                a1Index++;
            }

            else if (a1[a1Index] > a2[a2Index]) {
                a2Index++;
            }

            else {
                arr[arrIndex] = a1[a1Index];
                a1Index++;
                a2Index++;
                arrIndex++;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] a1 = {10, 5, 7, 5, 9, 4};
        int[] a2 = {7, 5, 15, 7, 7, 9, 10};
        int[] result1 = findInter(a1, a2);
        System.out.println("result1: " + Arrays.toString(result1)); // output:[5, 7, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
