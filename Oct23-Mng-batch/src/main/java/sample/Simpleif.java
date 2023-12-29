package sample;

public class Simpleif {

    public static void main(String args[]){

        //if(condition){
        //code to get executed
        //}

        int age = 17;
        if(age >18){
            System.out.println("Eligible to vote");
        }
        else {

            System.out.println("Not eligible to vote");
        }

        if(age%2 == 0){
            System.out.println("Age is even");
        }
        else {
            System.out.println("Age is odd");
        }

    }
}
