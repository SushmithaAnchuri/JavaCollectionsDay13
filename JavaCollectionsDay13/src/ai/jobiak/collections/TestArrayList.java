package ai.jobiak.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		System.out.println(list.size());
		
		list.add("Thinking in Java");
		list.add("Java Unleashed");
		list.add("Java For Dummies");
		list.add("HeadFirstJava");
		list.add("Java in Action");
		
		System.out.println(list.size());
		System.out.println(list);
		
		ArrayList bookList=new ArrayList();
		
		bookList.add("Thinking in Java");
		bookList.add("Java Unleashed");
		bookList.add("Java For Dummies");
		bookList.add("HeadFirstJava");
		bookList.add("Java in Action");
		
		System.out.println(bookList.size());
		System.out.println(bookList);
		
		bookList.add("Head First Design Patterns");
		bookList.add("The Java EE server Programming");
		
		System.out.println(bookList.size());
		System.out.println(bookList);
		System.out.println(bookList.get(5));
		System.out.println(bookList.contains("thinking in java"));
		//List list=bookList;
		System.out.println(list);
		System.out.println(list);
		
		
		Collection collection=list;
		System.out.println(collection);
		
		Iterator iter=collection.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(collection);
		
		for(Object book:bookList) {
			System.out.println(book);
		}
		for(int i=0;i<bookList.size();i++)
		{
			System.out.println(bookList.get(i));
		}
		
		Collections.sort(bookList);
		System.out.println(bookList);
		int foundat=Collections .binarySearch(bookList,"The Java EE server Programming");
		System.out.println(foundat);
		
		Object books[]=collection.toArray();
		System.out.println(books.length);
		List listOfBooks=Arrays.asList(books);
		System.out.println(listOfBooks);
		
		
	}

}
