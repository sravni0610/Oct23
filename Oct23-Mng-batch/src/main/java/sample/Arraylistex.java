package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistex {

    public static void main(String args[]){


        ArrayList<String> al = new ArrayList<String>();

        al.add("Veerendra");
        al.add("Adithya");
        al.add("hasan");
        al.add("veerendra");


        for (String a: al ) {
            System.out.println(a);
        }


        Iterator<String> itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
