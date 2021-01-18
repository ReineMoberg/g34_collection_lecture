package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // it is uses when we want to map the key to value or having the key pair value
        HashMap<Integer,String> hashMap= new HashMap<>();
        hashMap.put(1, "Mehrdad");
        hashMap.put(2,"Simon");

        System.out.println("Size: " + hashMap.size());

        for (Map.Entry m : hashMap.entrySet()){
            System.out.println("Key: " + m.getKey() + " \t " + "Value: " + m.getValue());
        }
        // get specific value by key
        System.out.println(hashMap.get(1));
        System.out.println("---------------------------");
        System.out.println(hashMap.keySet());


    }
}
