package sample;

public class Ifelseifladder {

    public static void main(String args[]){
        int marks = 5;

        if(marks < 40){
            System.out.println("fail");
        }
        else if (marks >=40 && marks <60) {

            System.out.println("2nd class");
        }

        else if(marks>=60 && marks<70){

            System.out.println("first class");
        }

        else if(marks>= 70 && marks<=100 ){

            System.out.println("distinction");
        }

        else {
            System.out.println("invalid number in the marks");
        }


    }
}
