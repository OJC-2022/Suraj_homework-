import java.util.*;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n >= 0) {
            long sum = (n * (n + 1)) / 2;
            System.out.println(sum);
        } else {
            System.out.println("enter a positive number");
        }
    }
}
