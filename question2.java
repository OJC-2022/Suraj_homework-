import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n % 7 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("number entered should not be negative or zero");
        }
    }
}
