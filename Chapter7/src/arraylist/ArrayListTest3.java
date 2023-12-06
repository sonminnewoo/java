package arraylist;

import array.Book;
// 프로젝 트까진 아니고 
// array.Book 
import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODOArrayList<E>erated method stub
		ArrayList<Book> bookList = new ArrayList<Book>();
//		<제네릭>
		
		bookList.add(new Book("태백산1","손민우"));
		bookList.add(new Book("태백산2","손민우"));
		bookList.add(new Book("태백산3","손민우"));
		bookList.add(new Book("태백산4","손민우"));
		
		for(int i = 0 ; i<bookList.size(); i++) {
			bookList.get(i).showInfo();
			System.out.println(".");
//			
			Book book = bookList.get(i);
			book.showInfo();
		}
		System.out.println("===========향상된 포문 , foreach");
		for(Book book2 : bookList) {
			book2.showInfo();
		}
	}

}
