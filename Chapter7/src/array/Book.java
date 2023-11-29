package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {
		bookName = "이름없음";
		author = "저자없음";
	}
	
	public Book(String bookName, String author) {
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
}
