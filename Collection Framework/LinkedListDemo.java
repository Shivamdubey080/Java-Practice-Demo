/*
Program of LinkedList

*Duplicates objects are allowed*

GitHub:@shivamdubey080

*/
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList L =  new LinkedList();

        L.add("Shivam");
        L.add("Dubey");
        L.add(30);
        L.add(null);

        L.set(0,"Shubham");
        L.add(0,"Git");

        L.removeLast();
        L.addFirst("Hub");

        System.out.println(L);
    }
    
}