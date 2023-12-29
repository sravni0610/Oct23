package inheritance;

public class Programmer extends Employee{
        double  bonus = 5000;
    public static void main(String args[]){

        Programmer p1 = new Programmer();

        System.out.println(p1.salary);
        System.out.println(p1.bonus);


    }
}
