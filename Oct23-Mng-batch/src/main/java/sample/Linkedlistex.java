package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistex {

    public static void main(String args[]){


        LinkedList<String> ll = new LinkedList<String>();

        ll.add("ram");
        ll.add("raj");
        ll.add("robert");
        ll.add("ram");

        Iterator<String> itr = ll.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        HashSet<String> hs = new HashSet<String>();

        hs.add("hh");
        hs.add("ad");
        hs.add("hh");
        hs.add("abc");

        Iterator<String> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
