/* Program For ArrayList including type-safety.

*Duplicates object are allowed in ArrayList*

GitHub:@Shivamdubey080

*/

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(final String[] args) {
        final ArrayList<String> l = new ArrayList<String>(); // creates an empty ArrayList Object

        l.add("A"); // add elements
        l.add("B");
        l.add("A");
        l.add(null); // insert null value
        
        System.out.println(l);

        l.remove (2); // remove from index 2
        System.out.println(l);

        l.add(2,"M"); // add element M at index 2
        l.add("N");

        System.out.println(l);
    }
}