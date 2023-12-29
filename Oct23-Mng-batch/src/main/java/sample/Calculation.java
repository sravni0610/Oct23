package sample;

public class Calculation {

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }

    void sum(double a,double b){
        System.out.println(a+b);
    }



    public static void main(String args[]){

        Calculation c1 = new Calculation();
        c1.sum(10,30.3);

    }
}
