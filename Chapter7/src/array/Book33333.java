package array;
// 평소에는 이렇게 만들면 안된다 !! 
// 반드시 클래스를 만들어서 해야지 
// 퍼블릭 플래스 안에 클래스로 만들면 안된다
class Book2{
	private String bookName;
	private String author;
	
	// 이 자체가 2차원 배열을 만들어 주는것과 같다.
	
	public Book2() {
		bookName = "이름 없음";
		author = "저자없음";
	} // 기본 생성자 만들기
	
	public Book2(String bookName, String author ) {
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

public class Book33333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 배열 생성 : 실제로 생성자를 불러서 배열 객ㅊ에만 만들고 인스턴스느 만들지 않는다 
		
		Book2 book1 = new Book2();  // new 하고 Book() 하면 new 로 Book 생성자를 생성함
		book1.showInfo(); // 그리고 book1 이라고 해서 지정하고 showInfo() 로 받아오는 매개 변수없이 새로운 Book 생성자 형식을 보여주는거임
		
		
		//객체 배열 선언 : 실제로 생성자를 불러서 인스턴스가 만들어 지지 않음 
		//그래서 반드시 new Book 처럼 생성자를 새로 만들어 주어야 한다 
		
		Book2[] books = new Book2[5];
		// 반드시 직접적으로 new 생성자 ()룰 실행시켜야 객체 사용 가능 / 만들었던 배열 객체에 인스턴스를 만든것임 
		// 아래 매개변수 를 넣어주면 객체에 인스턴스에 매개 변수를 넣는것임 
		books[0] = new Book2("태백산","손민우");
		books[1] = new Book2("태백산","손민우");
		books[2] = new Book2("태백산","손민우");
		books[3] = new Book2("태백산","손민우");
		books[4] = new Book2("태백산","손민우");
		
		
		for(int i = 0; i<books.length; i++) {
						books[i].showInfo();
		}
	}
}

