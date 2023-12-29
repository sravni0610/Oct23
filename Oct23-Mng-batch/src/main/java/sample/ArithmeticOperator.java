package sample;

public class ArithmeticOperator {

    public static void main(String argss[]){

        int a = 10;
        int b = 50;

        boolean c = !((a<b) || (a==20));


        int d =(a>b)?a : b;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);


        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(c);
        System.out.println(d);


    }
}
