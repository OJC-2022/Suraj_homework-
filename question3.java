import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        if(l>0 && b>0){
            System.out.println("area ="+l*b);
        }
        else{
            System.out.println("length or breadth cannot be negative");
        }
    }
}
