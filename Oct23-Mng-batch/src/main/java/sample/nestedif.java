package sample;

public class nestedif {

    public static void main(String args[]){

        int age = 10;
        int weight = 50;

        if(age >= 18){
            if (weight>55){
                System.out.println("Person is eligible to donate blood");
            }else {
                System.out.println("person weight is not matching for donation");
            }
        }
        else {
            System.out.println("Person age is not matching for donation");
        }


    }
}
