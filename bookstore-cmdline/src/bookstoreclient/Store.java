package bookstoreclient;

import java.util.ArrayList;
import java.util.List;

public class Store {

	public static void main(String[] args) {
		
		
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");
		
		Book book = new Book("9876123456", "Hibernate book", publisher);
		
		Chapter chapter1 = new Chapter("Introduction", 1);
		Chapter chapter2 = new Chapter("Domain Models", 2);
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		
		book.setChapters(chapters);
		
		BookStoreService bookStoreService = new BookStoreService();
		//bookStoreService.persistObjectGraph(book);
		
		System.out.println(book);
		System.out.println(bookStoreService.retrieveObjectGraph("9876123456"));
	}
	
}