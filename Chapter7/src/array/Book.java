package array;

public class Book {
	
	// 멤버변수  선언 
		private String bookName;
		private String author;
		
		// 이 자체가 2차원 배열을 만들어 주는것과 같다.
		
		public Book() {
			bookName = "이름 없음";
			author = "저자없음";
		} // 기본 생성자 만들기
		
		public Book(String bookName, String author ) {
//			멤버변수의 주소를 반환 ! 
			this.bookName = bookName;
			this.author = author;
		}

		
		//출력 형식 정함
		public void showInfo() {
			System.out.println(bookName + ","+ author);
		}
		
		
		
		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		
	

	
}
