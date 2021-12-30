package day3;

public class FunctionConcept {

    public static void main(String[] args) {

        String r = "This are the output for result1,result2 and result3: ";
        System.out.println(r);

        int a = 2;
        int b = 5;
        int result1 = addition(a, b);


        int c = 10;
        int d = 20;
        int result2 = addition(c, d);

        int e = 30;
        int f = 40;
        int result3 = addition(e, f);

    }

    public static int addition(int x, int y) {
        int c = x + y;
        System.out.println(c);
        return c;

    }
}
