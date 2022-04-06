import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        long t1=n1;
        long t2=n2;
        long gcd=1;long lcm=1;
        if(n1>n2){
            long temp=n2;
            n2=n1;
            n1=temp;
        }
        while(n1!=0){
            long r=n2%n1;
            n2=n1;
            n1=r;
        }
        gcd=n2;
        lcm=(t1*t2)/gcd;
        System.out.println("GCD :"+gcd);
        System.out.println("LCM :"+lcm);
    }
}
