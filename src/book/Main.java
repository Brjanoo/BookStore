package book;

import java.util.ArrayList;
import java.util.List;



public class Main {

public static void main (String [] args){
   
    List<Book> books = new ArrayList<Book>();
    books.add(new Book ("Bill Grylls     ","Mud, Sweat and Tears           ",BookType.Autobiography));
    books.add(new Book("Terry Pratchett ","Colour of Magic           ",BookType.Fantasy));
    books.add(new Book("Bruce Eckel    ","Thinking in Java               ",BookType.IT));
   
    Customer c=new Customer("John","Rambo",books, books);
    c.printBooks();
   
}
}