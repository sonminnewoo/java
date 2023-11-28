package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book>bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		System.out.println("모든 책의 가격의 합");
//		특정 매개변수를 가져올 경우 필터 사용!
		
//		bookList.stream().map(c-> c.getName()).forEach(c->);
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		System.out.println("책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력");
		bookList.stream().filter(c->c.getPrice()>=20000)
		.map(Book->Book.getName()).sorted(new Comparator<String>() {
//			위 Book 은 c 로 바꿀수 있다.
			public int compare(String o1, String o2) {
				return o1.compareTo(o2)*-1;
			};
		}).forEach(name -> System.out.println(name));
//		객체일 경우 map 이용해서 출력해준다
		System.out.println("내림차순 정렬");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName())
		.sorted((o1,o2)->o1.compareTo(o2)*-1).forEach(name -> System.out.println(name));
	}

}
