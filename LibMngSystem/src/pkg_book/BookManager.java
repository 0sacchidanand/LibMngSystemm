package pkg_book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookManager {
	ObjectOutputStream oos_book = null;
	ObjectInputStream ois_book = null;
	
	File book_file = new File ("Books.dat");
	
	ArrayList<Book> book_list = null;
	
	@SuppressWarnings("unchecked")
	public BookManager () {
		book_list = new ArrayList<Book>();
		
		if (book_file.exists()) {
			try {
				ois_book = new ObjectInputStream (new FileInputStream(book_file));
				book_list = (ArrayList<Book>) ois_book.readObject();
			}  catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	public void listBookBySubject(String subject) {
		for (Book book:book_list) {
			if(book.getSubject().equals(subject))
				System.out.println(book);
		}
	}
	
	public void addABook (Book book) {
		book_list.add(book);
	}
	
	public void viewAllBooks() {
		for (Book book:book_list)
			System.out.println(book);
	}
	
	public Book searchBookByIsbn(int search_isbn) {
		for (Book book:book_list) {
			if(book.getIsbn()==search_isbn)
				return book;
		}
		return null;
		
	}
	
	public boolean deleteBook (int delete_isbn) {
		ListIterator<Book> book_iterator = (ListIterator<Book>) book_list.iterator();
		while (book_iterator.hasNext()) {
			Book book = book_iterator.next();
			if (book.getIsbn()== delete_isbn)
			{
				
				book_list.remove(book);
				return true;
			}
		}
		return false;
	}
}
