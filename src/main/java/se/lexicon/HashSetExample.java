package se.lexicon;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        // hash set cannot contain duplicate elements
        HashSet<String> names = new HashSet<>();
        names.add("Mehrdad");
        names.add("Ulf");
        names.add("Simon");
        names.add("Mehrdad");

        System.out.println(names.size());

        Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

    }
}
