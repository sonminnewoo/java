package array;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"Java","Android","C","Python","HTML",};
//		for(배열의 자료형 변수이름 : 배열이름) {
//			실행문;
//		}
		// : 로 스링 배열을 스트링형식 의 str 에 저장
		
		for(String str : strArr) { // 향상된 for 문 이네스티 포문 / 이나리스트 
			System.out.println(str);
			
		}
		Book2[] books = new Book2[3];
		books[0] = new Book2("책이름 1 ", "저자1");
		books[1] = new Book2("책이름 1 ", "저자1");
		for(Book2 book : books) {
			book.showInfo();
		}
	}
}
