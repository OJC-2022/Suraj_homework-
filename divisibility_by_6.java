import java.util.*;

public class divisibility_by_6 {
    public static boolean[] check(int arr[]) {
        boolean b[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 6 == 0) {
                b[i] = true;
            } else {
                b[i] = false;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean b[]=check(arr);
        for (boolean c : b) {
            System.out.print(c+" ");
        }
    }
}
