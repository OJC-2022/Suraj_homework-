public class Hello {
    public static void method1(int x){
        System.out.println(x);
    }
    public static void method2(String name){
        System.out.println(name);
        method1(name.length());
    }
    public static void main(String[] args) {
        method1(45);
        method2("suraj");
    }
}
