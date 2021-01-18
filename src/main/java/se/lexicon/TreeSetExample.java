package se.lexicon;

import se.lexicon.model.Person;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // it is used for having sorted list
        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(200);
        numbers.add(100);
        numbers.add(10);
        numbers.add(50);

        System.out.println("size: " + numbers.size());

        for (Integer num: numbers){
            System.out.println("Element: " + num);
        }

        TreeSet<String> test = new TreeSet<>();
        test.add("B");
        test.add("D");
        test.add("A");

        System.out.println("Elements are: " + test.toString());

        System.out.println("---------------------------------");
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1,"Mehrdad","mehrdad.javan@lexicon.se",32));
        personSet.add(new Person(3,"Test","mehrdad@lexicon.se",30));
        personSet.add(new Person(2,"Test123","javan@lexicon.se",40));

        for (Person person: personSet){
            System.out.println(person.toString());
        }

    }
}
