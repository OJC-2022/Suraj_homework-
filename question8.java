import java.util.*;

public class question8 {
    public static void n_odd_numbers(long n) {
        if (n > 0) {
            System.out.print(1 + " ");
            for (int i = 3; i < 2 * n; i += 2) {
                System.out.print(i + " ");
            }
        } else if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println("enter a positive number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n_odd_numbers(n);
    }
}
