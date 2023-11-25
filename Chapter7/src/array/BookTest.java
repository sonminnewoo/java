package array;
public class BookTest {

	private String bookName;
	private String author;
	
	public BookTest() {
		bookName = "이름없음";
		author = "저자없음";
	}
	
	public BookTest(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public void showInfo() {
		System.out.println(bookName + "," + author);
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
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.showInfo();
		
		//객체 배열 선언 : 실제로 생성자를 불러서 인스턴스를 만들지 않음
		Book[] books = new Book[5];
		//반드시 직접적으로 new 생성자()를 실행시켜야 객체 사용 가능
		books[0] = new Book("태백산맥","조정래");
		books[1] = new Book("데미안","헤르만 헤세");
		books[2] = new Book("어떻게 살 것인가","유시민");
		books[3] = new Book("토지","박경리");
		books[4] = new Book("어린왕자","생텍쥐페리");
		
		for(int i=0; i<books.length; i++) {
			books[i].showInfo();
		}
	}

}







