package arraylist;

import java.util.*;

public class ArrayListSample {
    public static void main(String args[]) {
        ArrayList < String > list = new ArrayList < String > ();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("abc");
        System.out.println(list);

        Iterator < String > itr = list.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        }
    }
}