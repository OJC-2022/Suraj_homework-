import java.util.*;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n > 0) {
            if (n % 2 != 0) {
                n = n - 1;
            }
            for(long i=n;i>=2;i-=2){
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("input a number greater than 2");
        }
    }
}
