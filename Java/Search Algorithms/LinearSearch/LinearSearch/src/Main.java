public class Main {
    public static void main(String[] args) {
        int[] intArr = {55, 22, 11, 44, 77, 99, 88, 66};
        System.out.println(linSearch(intArr, 88));
        System.out.println(linSearch(intArr, 52));
    }

    public static boolean linSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }
}