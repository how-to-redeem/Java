package practice;

public class practice111 {
    public static void main(String[] args) {


        int n = 10;
        System.out.println(func(n));
    }

    private static int func(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return func(n - 1) + func(n - 2);
        }

    }
}