import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        // time complexity O(n^2)
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArr.length; firstUnsortedIndex++) {
            int newElement = intArr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArr[i-1] > newElement; i--) {
                intArr[i] = intArr[i-1];
            }

            intArr[i] = newElement;
        }

        System.out.println(Arrays.toString(intArr));
    }
}