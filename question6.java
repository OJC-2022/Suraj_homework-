import java.util.*;

public class question6 {
    public static void prime_check(long p) {
        int flag = 0;
        if (p > 0) {
            if (p == 1) {
                flag = 1;
            }
            for (int i = 2; i < Math.sqrt(p); i++) {
                if (p % i == 0) {

                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }
        } else {
            System.out.println("input a positive number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextLong();
        prime_check(p);
    }
}
