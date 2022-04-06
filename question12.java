import java.util.*;
public class question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        if(n<m){
            for(long i=n;i<m;i++){
               if(i%2!=0){
                   System.out.println(i);
               } 
            }
        }
        else{
            System.out.println("enter first smaller then greater");
        }
    }
}
