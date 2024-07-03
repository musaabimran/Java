import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Lesson11 {

    public static void main(String[] args) {
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        // This is how you add elements to an ArrayList
        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        // You can also add an element in a specific position
        names.add(2, "Jack Ryan");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(0, "John Adams");

        // You can remove an item with remove
        names.remove(3);

        System.out.println(names);

        for (String i : names) {
            System.out.println(i);
        }
        System.out.println(); // Creates a newline
    }
}