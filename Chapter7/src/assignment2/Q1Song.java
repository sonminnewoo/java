package assignment2;

//입력밭기
import java.util.Scanner;

public class Q1Song {
	//입력받을 멤버변수
	String title;
	//다른 클래스 에서 문자열 입력 
//	Song my = new Song(sc.next()); 로 적으면 
//	스트링 형식의 my 변수에 글자 넣음 
	public Q1Song(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubwd

		Scanner sc = new Scanner(System.in);

		System.out.println("노래 이름을 입력하세요");
		Q1Song my = new Q1Song(sc.next());

		System.out.println("노래 이름을 입력하세요");
		Q1Song your = new Q1Song(sc.next());

		System.out.println("내 노래는 " + my.getTitle());
		System.out.println("너 노래는 " + your.getTitle());

	}

}
