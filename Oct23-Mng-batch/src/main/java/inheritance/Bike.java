package inheritance;

public class Bike extends Tyres{

    void tyres(){
        System.out.println("Bikes have 2 tyres");
    }

    public static void main(String args[]){
        Bike b1 = new Bike();
        b1.tyres();
    }
}
