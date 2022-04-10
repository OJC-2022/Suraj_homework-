public class obj2 {
    int a=10;
    static int b=45;
    public static void main(String[] args){
        obj2 h1=new obj2();
        obj2 h2=new obj2();
        obj2 h3=new obj2();
        obj2 h4=new obj2();
        System.out.println("h1.a ="+h1.a);
        System.out.println("h2.a ="+h2.a);
        System.out.println("h3.a ="+h3.a);
        System.out.println("h4.a ="+h4.a);
        System.out.println("h1.b ="+h1.b);
        h1.a=45;
        System.out.println("h1.a ="+h1.a);
        System.out.println("h2.a ="+h2.a);
        System.out.println("h3.a ="+h3.a);
        System.out.println("h4.a ="+h4.a);
        System.out.println("h2.b ="+h2.b);

    }
}
