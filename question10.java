import java.util.*;

public class question10 {
    public static void n_divisible_by_m_starting_from_m(long n, long m) {
        if (n > 0) {
            for (int i = 1; i < n + 1; i++) {
                System.out.println(i * m);
            }
        } else {
            System.out.println("input a number greater than or equal to 0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

    }
}
