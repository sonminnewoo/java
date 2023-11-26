package minwooChapter5_Student;

//	Student 클래스 를 실행하기 위한 테스트 클래스 //같은 클래스에 위치 시켜야 한다 
public class StudentTest {

	public static void main(String[] args) {
		
//		Student 클래스를 들고와 son 이라는 인스턴스를 만든다
//		
		Student son3 = new Student();
		son3.studentName = "손석희";
		
		System.out.println(son3.studentName);
		System.out.println(son3.getStudentName());
//		아래 son3 를 출력하면 '클래스이름@주소' 값 이다 이값을 다른말로 
//		해시코드 값이라고 한다 . 자바가상머신 에서 객체가 생성될때 객체에 할당하는
//		가상 주소이다/ 그래서 son3 를 사용해서 son3 의 인스턴스를 참조할수 있다 . 
//		이떄 son3 를 참조변수 주소값을 참조 값이라고 한다 . 
		System.out.println(son3);
		
		
//		이렇게 같은 패키지에 있는 Student 클래스 의 요소와 메서드를 이용해서 
//		간단한 프로그램 을 작성할수 있다 . 그런데 . 만약 패키지가 다르다면
//		import 문을 사용해서 함께 사용하기 원하는 클래스를 불러와야 한다 
//		! 클래스 이름이 같지만 패키지가 다르면, class full name 은 결국
//		다른 패키지에 있는 클래스 이므로 풀네임으로는 다르게 된다 그래서 같은 패키지이면 오류
//		다른 패키지이면 사용이 가능하다 .
		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		System.out.println(student1);
//		System.out.println(student2);
	}
}