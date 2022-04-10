import java.util.*;

public class question5 {
    public static void fibbo(long n) {
        if (n > 0) {
            long f1 = 1, f2 = 1;
            System.out.print(f1 + " " + f2);
            for (long i = 2; i < n; i++) {
                long temp = f1 + f2;
                System.out.print(" " + temp);
                f1 = f2;
                f2 = temp;
            }
        } else {
            System.out.println("enter a positive value other than zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        fibbo(n);
    }
}
