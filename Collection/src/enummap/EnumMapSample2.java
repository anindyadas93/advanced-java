package enummap;

import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class EnumMapSample2 {
    // Creating enum  
    public enum Key {
        First, 
        Second, 
        Third  
    };
    public static void main(String[] args) {
        EnumMap < Key, Book > map = new EnumMap < Key, Book > (Key.class);
        // Creating Books    
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        Book b4 = new Book(104, "ABC", "...", "...", 10);
        // Adding Books to Map   
        map.put(Key.First, b1);
        map.put(Key.Second, b2);
        
//        map.put(Key.Third, b3);
//        map.put(Key.Second, b4);
        // Traversing EnumMap  
        for (Map.Entry < Key, Book > entry: map.entrySet()) {
            Book b = entry.getValue();
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}