package classtest;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
//		이부분은 기능 있다 정도만 확인하기
		
		Person person1 = new Person("이순신",50);
		System.out.println(person1);
		
//		newInstance() 를 이용한 인스턴스 생성 방식 
//		클래스 동적 로딩하기
//		forName 의 매개변수인 문자열은 (패키지명.클래스명) 괄호 안의 내용이 틀리면 에러가 발생한다 
		Class pClass = Class.forName("classtest.Person");
//		for 문이나 비교 구문으로 여러가지 만드는식으로 사용 한다 
		
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
	}

}

