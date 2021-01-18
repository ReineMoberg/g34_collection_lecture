package se.lexicon;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> sms= new Vector<>();

        sms.add("Text1");
        sms.add("Text2");

        // addElement method can use for multi thread programming
        sms.addElement("Test3");

        System.out.println(sms.size());

        System.out.println("Elements are : " + sms.toString());


    }


}
