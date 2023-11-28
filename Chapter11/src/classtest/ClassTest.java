package classtest;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		// 인스턴스의 클래스 정보를 확인하는 방법
		Person person = new Person("이순신",50);
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//클래스이름을 사용하여 확인하는 방법
		//다른 메서드의 매개변수(파라미터)로 사용하는 경우가 많음
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//클래스의 패키지명.클래스명의 문자열로 확인하는 방법
		//문자열을 사용하게 때문에 같은 코드로 내용을 계속 바꾸어 클래스 선언(인스턴스 생성)이 가능합니다.
		// DB연동에 많이 사용함
		Class pClass3 = Class.forName("classtest.Person");
		System.out.println(pClass3.getName());
	}

}






