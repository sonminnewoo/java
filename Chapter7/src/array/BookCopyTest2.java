package array;

import java.util.Arrays;

public class BookCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books1 = new Book[3];
		books1[0] = new Book("태백산맥","조정래");
		books1[1] = new Book("데미안","헤르만 헤세");
		books1[2] = new Book("어떻게 살 것인가","유시민");
		
		//깊은 복사 : 물리적으로 인스턴스를 새롭게 만들어서 값을 입력 
		Book[] books2 = new Book[3];
		for(int i=0; i<books1.length; i++) {
			books2[i] = new Book(books1[i].getBookName(), books1[i].getAuthor());
		}
		
		System.out.println("===============변경 전===============");
		for(int i=0; i<books2.length; i++) {
			books1[i].showInfo();
			books2[i].showInfo();
		}
		
		System.out.println(Arrays.toString(books1));//객체의 경우 메모리 주소 반환
		System.out.println(Arrays.toString(books2));//객체의 멤버변수는 확인 불가
		System.out.println("===============변경 후===============");
		books2[0].setBookName("토지");
		books2[0].setAuthor("박경리");
		for(int i=0; i<books2.length; i++) {
			books1[i].showInfo();
			books2[i].showInfo();
		}
	}

}







