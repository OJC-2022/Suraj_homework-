import java.util.*;

public class question4 {
    public static void cube_d(double d) {

        System.out.println("cube =" + d * d * d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        cube_d(d);
    }
}
