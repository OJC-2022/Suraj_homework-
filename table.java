import java.util.*;
public class table {
    public static void table_(long n){
        for(long i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        table_(n);
    }
}
