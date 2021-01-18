package se.lexicon;

import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    /*
        1. ArrayList can contains duplicate elements
        2. ArrayList maintains insertion order
        3. ArrayList in non synchronized
        4. AArrayList allows random access because it works at the index base
     */


    public static void main(String[] args) {
        ex5();
    }


    public static void ex1() {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        // add elements to ArrayList
        numbers.add(100);
        numbers.add(400);
        numbers.add(200);
        numbers.add(300);

        // get size of arraylist
        System.out.println("Array size: " + numbers.size());
        System.out.println("ArrayList Information: " + numbers.toString());
        System.out.println("Iterator--------------------------");

        // Traversing list through Iterator
        // when we want to remove elements we should use Iterator
        // iterator is more efficient when we want to try to modify a collection
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println("Number: " + num);
            if (num == 100) {
                iterator.remove();
            }
        }

        System.out.println("For-each--------------------------");
        for (Integer number : numbers) { // 4
            System.out.println("NUmber: " + number);
            /*
            // after removing an element in for statement we will get concurrent modification exception
            if (number == 100){
                numbers.remove(number); // 3
            }
             */
            System.out.println("For--------------------------");
            // (init value ;  condition ; sequencer )
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("NUmber: " + numbers.get(i));
            }

        }


    }


    public static void ex2() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mehrdad");// 0
        names.add("Mehrdad");// 1
        names.add("Simon");  // 2
        names.add("Ulf");    // 3

        // access using index
        System.out.println(names.get(0));
        // remove using index
        names.remove(0);
        System.out.println("Size: " + names.size());
        // remove using object
        names.remove("Ulf");
        System.out.println("Size: " + names.size());

    }


    public static void ex3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);  // 0 - Object
        numbers.add(1);
        numbers.add(0);
        numbers.add(200);

        System.out.println("Size: " + numbers.size());
        System.out.println("Numbers: " + numbers);
        // remove by index
        //numbers.remove(0);
        // remove by object
        Integer n200 = 200;
        numbers.remove(n200);
        System.out.println("Size: " + numbers.size());
        System.out.println("Numbers: " + numbers);

    }


    public static void ex4() {
        List<String> names = new ArrayList<>();
        names.add("Mehrdad");
        names.add("Simon");
        names.add("Ulf");

        // convert ArrayList to array
        Object[] nameArray = names.toArray();
        System.out.println("Array length: " + nameArray.length);
        String name1 = (String) nameArray[0];
        System.out.println("name1 = " + name1);

    }


    public static void ex5(){
        List<Person> personList= new ArrayList<>();
        Person mehrdad = new Person(1,"Mehrdad","mehrdad.javan@lexicon.se",32);
        personList.add(mehrdad);

        Person simon = new Person();
        simon.setId(2);
        simon.setName("Simon");
        simon.setEmail("simon.elbrink@lexicon.se");
        simon.setAge(30);
        personList.add(simon);

        personList.add(new Person(3,"Test","test.test@test.se",35));
        System.out.println("PersonList Size: " + personList.size());

        // find person by age = 32
        for (Person person: personList){
            if (person.getAge() == 32){
                System.out.println(person.toString());
                break;
            }
        }



    }
}

