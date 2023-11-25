package array;

import java.util.Arrays;

public class BookCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Book2[] books1 = new Book2[3];
		books1[0] = new Book2("1", "1:1");
		books1[1] = new Book2("2", "1:2");
		books1[2] = new Book2("3", "1:3");
		
		Book2[] books2 = new Book2[3];
		System.arraycopy(books1, 0, books2, 0, 3); 
		//얕은 카피
		
		for(int i=0; i<books2.length; i++) {
			books2[i].showInfo();
			}
		
		//books1 의 내용을 i 의 값대로 인덱스해서 보여준다 
		
		// 메모리 주소만 복사하는 경우 얕은 복사라고 한다
		// 각 인덱스에 주소만 복사 했기 때문에 이다
		// 깊은 복사의 경우 저장주소를 독립적으로 만들고 내용을 복붙 하는 방식 
		
		System.out.println(Arrays.toString(books1)); // 캑체의 경우 메모리 주소 반환 
		System.out.println(Arrays.toString(books2)); // 객체의 멤버변수는 확인 불가 하다 

		System.out.println("======================변경후=======================");

		// 위와 아래는 메모리 주소를 출력한다
		System.out.println(books2[0]);
		System.out.println(books2[1]);
		System.out.println(books2[2]);
		
		books2[0].setBookName("토지");
		books2[0].setAuthor("손민우");
		
		for(int i=0; i<books2.length; i++) {
			books1[i].showInfo();
			books2[i].showInfo();
	
		}
	}
}
