package sample;

public class Students {
    String name; // data member
    int age;
    int id;

    int length;
    int breadth;

    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }
    void insert(String n, int a,int i){

        name = n;
        age = a;
        id = i;

    }

    int agevalue(){
        return 10;
    }

    void area(int l, int b){
        length =l;
        breadth =b;
        System.out.println("area of rectangle is "+(length*breadth));

    }

    Students(){

    }

    Students(int a, int i, String n){
        age = a;
        id = i;
        name = n;
    }


    Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String args[]){

        Students s1 = new Students();
        Students s2 = new Students();
        s1.insert("aditya",28,101);
        s1.display();
        s2.insert("mnm",27,102);
        s2.display();
        Students s3 = new Students(30,"Hasan");
        s3.display();







    }


}
