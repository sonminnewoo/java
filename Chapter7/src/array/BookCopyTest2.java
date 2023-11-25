package array;

import java.util.Arrays;

public class BookCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Book2[] books1 = new Book2[3];
	books1[0] = new Book2("alsdn", "ths");
	books1[1] = new Book2("alsdn", "ths");
	books1[2] = new Book2("alsdn", "ths");
	
	//깊은 복사 : 깊은 복사의 경우 저장주소를 독립적으로 만들고 내용을 복붙 하는 방식 
	Book2[] books2 = new Book2[3];
	
	
		for(int i = 0; i<books1.length; i++) {
			books2[i] = new Book2(books1[i].getBookName(),books1[i].getAuthor());
		}
		// 깊은 복사
		
	for(int i=0; i<books2.length; i++) {
		books2[i].showInfo();
		}
	
	
	// 메모리 주소만 복사하는 경우 얕은 복사라고 한다
	// 각 인덱스에 주소만 복사 했기 때문에 이다
	// 깉은 복사의 경우 저장주소를 독립적으로 만들고 내용을 복붙 하는 방식 
		
		System.out.println(Arrays.toString(books1)); // 캑체의 경우 메모리 주소 반환 
		System.out.println(Arrays.toString(books2)); // 객체의 멤버변수는 확인 불가 하다 
	
		System.out.println("======================변경후=======================");
		
		// 위와 아래는 메모리 주소를 출력한다
		System.out.println(books2[0]);
		System.out.println(books2[1]);
		System.out.println(books2[2]);
		
		books2[1].setBookName("토지");
		books2[1].setAuthor("손민우");
		for(int i=0; i<books2.length; i++) {
			books1[i].showInfo();
			books2[i].showInfo();

		}

	}

}
