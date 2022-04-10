import java.util.*;

public class question1 {
    public static void even_odd(int n){
        if(n>0){
            if(n%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        else{
            System.out.println("cannot be negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        even_odd(n);
        
    }
}