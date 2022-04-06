public class Test {
    int no_of_question = 10;
    char options[] = { 'a', 'b', 'c', 'd' };

    public void print_1_to_10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void print_options() {
        for (int j = 0; j < 4; j++) {
            System.out.println(options[j]);
        }
    }

    public static void main(String[] args) {
        /*
         * for(int i=1;i<=10;i++){ System.out.println(i); } for(int j=0;j<4;j++){
         * System.out.println(options[j]); }
         */
        Test t = new Test();
        t.print_1_to_10();
        t.print_options();
    }
}
