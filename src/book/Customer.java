package book;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Customer {

public String name;
public String alias;


public Customer(String name, String alias)
{
    this.name=name;
    this.alias=alias;
}
public Customer(String name, String alias, List<Book> book, List<Book> books)
{
    this.name=name;
    this.alias=alias;
    this.books=books;
}
public List<Book> books= new ArrayList<Book>();
private static Logger logger = Logger(Customer.class);

public void boughtBook(Book m){
books.add(m);
logger.info("book was bougth "+ m);
}

private static Logger Logger(Class<Customer> class1) {
	// TODO Auto-generated method stub
	return null;
}
public void soldBook (Book m){
books.remove(m);
logger.info("book was sold");
}

public Book beBook(Book m) throws Wyjatek {
if (books.indexOf(m) != -1)
{
return m;
}
else
System.out.println("no book");
throw new Wyjatek ("no book in database");

}

public void findBook(BookType type) {
	int position = 0;
	for (Book game : books) {
	if (game.getType().equals(type)) {
	System.out.println("Something"+position);
	}
	position++;
	}
	}



public void changeBook(Book m, String newTitle, BookType newType){
m.title= newTitle;
m.type = newType;
logger.info("Book has been changed");
}


public void printBooks()
{
    for(Book o : this.books)
    
        o.printBook();
    
}


}
