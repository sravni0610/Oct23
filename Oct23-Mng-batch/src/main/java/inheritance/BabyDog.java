package inheritance;

public class BabyDog extends Dog{

    void weep(){
        System.out.println("Baby dogs weep");
    }


    public static void main(String args[]){

        BabyDog b1 = new BabyDog();
        b1.weep();
        b1.eat();
        b1.bark();


    }
}
