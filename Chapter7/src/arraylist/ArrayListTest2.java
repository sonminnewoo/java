package arraylist;



import java.util.ArrayList;

import array.Book;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("태백산맥", "조정래"));
		bookList.add(new Book("데미안","헤르만 헤세"));
		bookList.add(new Book("어떻게 살 것인가","유시민"));
		bookList.add(new Book("토지","박경리"));
		bookList.add(new Book("어린왕자","생텍쥐페리"));
		
		for(int i=0; i<bookList.size(); i++) {
			bookList.get(i).showInfo();
			Book book = bookList.get(i);
			book.showInfo();
		}
		System.out.println("=======향상된 for문, foreach");
		for(Book book : bookList) {
			book.showInfo();
		}
	}

}








