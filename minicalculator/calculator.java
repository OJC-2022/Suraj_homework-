import java.util.*;

public class calculator {
    static Scanner sc = new Scanner(System.in);

    public static void sum() {
        System.out.println("Enter the numbers");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a + b);
    }

    public static void substract() {
        System.out.println("Enter the numbers");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a - b);
    }

    public static void multiply() {
        System.out.println("Enter the numbers");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a * b);
    }

    public static void divison() {
        System.out.println("Enter the numbers");
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (b == 0) {
            System.out.println("second number cannot be zero");
        } else {
            System.out.println(a / b);
        }
    }

    public static void remainder() {
        System.out.println("Enter the numbers");
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (b == 0) {
            System.out.println("second number cannot be zero");
        } else {
            System.out.println(a % b);
        }
    }

    static {
        System.out.println("_________________________________________________________");
        System.out.println("____________WELCOME TO MINI CALCULATOR _________________");
        System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Divison\n5. Remainder\n6. exit");
        System.out.println("Enter option : 1 2 3 4 5 6 :");
        int choice = sc.nextInt();
       
            switchmethod(choice);
        

    }

    public static void switchmethod(int choice) {
        switch (choice) {
            case 1:
                sum();
                break;
            case 2:
                substract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divison();
                break;
            case 5:
                remainder();
                break;
            case 6:
                System.out.println("terminated");
                System.exit(0);
            default:
                System.out.println("enter valid choice(between 1 to 5)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("_________________________________________________________");
            System.out.println("____________ MINI CALCULATOR _________________");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Divison\n5. Remainder\n6. exit");
            System.out.println("Enter option : 1 2 3 4 5 6 :");
            choice = sc.nextInt();
            switchmethod(choice);

        } while (choice != 6);

    }
}
