public class Main {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            int rest_call = factorial(num-1);
            return num * rest_call;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
