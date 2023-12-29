package sample;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex {

    public static void main(String args[]){

        HashMap<Integer,String> mp = new HashMap<Integer, String>();

        mp.put(1,"Mango");
        mp.put(2,"Apple");
        mp.put(3,"Mango");
        mp.put(4,"Mango");

        for(Map.Entry m:mp.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());


        }

    }
}
