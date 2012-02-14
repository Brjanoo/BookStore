package book;

import book.BookType;
import book.Wyjatek;

public class Book {

	private double prize;

	public double getPrize() {
	return prize;
	}
	
	
	public void setPrize(double prize) throws Wyjatek
	{
	if(prize < 0)
	throw new Wyjatek("prize can not be less than zero");
	else
	this.prize=prize;
	}
	public String author;
    public String title;
    public BookType type;
	private String book_number;
	
   
    public Book (String author, String title,BookType type)
    {
        this.author=author;
        this.title=title;
        this.type=type;
    }

    public void printBook()
    {
        System.out.println("Author:"+author+ "\t Title:"+title+"\t Type:"+type);
    }

    public BookType getType()
    {
    return this.type;
    }

   
    public Book(BookType type, String book_number)
    {
    this.type=type;
    this.book_number=book_number;
    }
    
    

    public void setType(BookType type)
    {
    this.type=type;
    }

    public String getbook_number()
    {
    return this.book_number;
    }
    public void set(String book_number)
    {
    this.book_number=book_number;
    }


}
