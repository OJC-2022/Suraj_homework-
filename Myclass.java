public class Myclass {
    public int minimum(int x,int y){
        if(x>y){
            return y;
        }
        else{
            return x;
        }
    }
    public static int minimum_static(int x,int y){
        if(x>y){
            return y;
        }
        else{
            return x;
        }
    }

    public static void main(String[] args) {
        Myclass m=new Myclass();
       int x= m.minimum(15, 65);
        int y= minimum_static(78, 98);
        System.out.println(x);
        System.out.println(y);
    }

}
