package se.lexicon;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        // https://www.javatpoint.com/java-linkedlist
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Test");
        linkedList.add("Test2");
        linkedList.add("Test3");
        System.out.println(linkedList.size());
        linkedList.addFirst("Mehrdad");
        linkedList.addLast("Ulf");
        System.out.println(linkedList.toString());

    }
}
