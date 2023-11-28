package classtest;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Person person1 = new Person("이순신",50);
		System.out.println(person1);
		
		// 클래스 동적 로딩하기
		//newInstance() 를 이용한 인스턴스 생성 방식
		//forName의 매개변수인 문자열은 (패키지명.클래스명) 틀리면 에러가 발생하게됨 
		Class pClass = Class.forName("classtest.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}







