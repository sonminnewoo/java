package object;
class Book{
	int bookNumber;
	String bookTitle;
	public Book(int bookNumber,String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	@Override
	public int hashCode() {
		return bookNumber;
	}
	
	@Override
	public String toString() {
		return bookNumber+","+bookTitle;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber && this.bookTitle.equals(book.bookTitle)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200,"개미");
		Book book2 = new Book(200,"개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		System.out.println(book2);
		System.out.println(book2.toString());
		
		if(book1 == book2) {
			System.out.println("두 책은 같습니다.");
		} else {
			System.out.println("두 책은 다릅니다.");
		}
		
		if(book1.equals(book2)) {
			System.out.println("두 책은 같습니다.");
		} else {
			System.out.println("두 책은 다릅니다.");
		}
		
		// Hash : 정보를 저장하거나 검색할 때 사용하는 자료구조 입니다.
		// 객체의 특정 키값으로 그 객체가 저장 되어있는 위치나 해쉬 주소를 반환 해줍니다. 
		// index = Hash(key)
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		String str1 = new String("String 입니다.");
		String str2 = new String("String 입니다.");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}







