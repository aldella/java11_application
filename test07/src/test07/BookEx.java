package test07;

import java.util.ArrayList;
import java.util.List;

public class BookEx 
{

	public static void main(String[] args) {
		Book[] book = new Book[100];
		for (int i=0; i<100; i++)
		{
			book[i] = new Book((1+i)+"번째 책", (i+1)+"번째 저자");
		}
		book[0] = new Book("111","111");
		book[1] = new Book("222","222");
		for(int i = 0; i<5; i++)
		{
			System.out.println(book[i].toString());
		}
		
		List<Book> bookList = new ArrayList<Book>();
		for(int i=1; i<=5; i++)
		{
			Book book2 = new Book(i+""+i+""+i,i+""+i+""+i);
			bookList.add(book2);
		}
		for(Book b : bookList)
		{
			System.out.println(b.toString());
		}
		
	}

}
