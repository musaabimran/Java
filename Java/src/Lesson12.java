import  java.util.LinkedList;
import java.util.Arrays;

public class Lesson12 {
    // make string link list
        public static void main(String[] args){

            // Creates a LinkedList object
            LinkedList linkedListOne = new LinkedList();

            LinkedList<String> names = new LinkedList<String>();

            names.add("Ahmed Bennani");
            names.add("Ali Syed");

            names.addLast("Nathan Martin");

            names.addFirst("Joshua Smith");

            names.add(0, "Noah Peeters");

            names.set(2, "Paul Newman");

            names.remove(4);
            names.remove("Joshua Smith");

            for(String name : names)
            {
                System.out.println(name);
            }

            System.out.println("\nFirst Index: " + names.get(0));
    }
}
