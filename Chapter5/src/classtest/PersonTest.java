package classtest;

public class PersonTest {
	int devide(int x, int y) {
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 선언
		//클래스명 변수명 = new 클래스명();
		//자료형 변수명 = new 생성자();
		Person kim = new Person();
		kim.name = "김유신";
		kim.height = 180;
		kim.weight = 80;
		kim.gender = 'm';
		kim.married = true;
		//변수명.메서드명() : 메서드 실행 방법
		kim.showPersonInfo();
		//변수명.멤버변수명 : 멤버 변수 사용방법
		System.out.println(kim.name);
		System.out.println(kim.add(10,20));
		
		PersonTest pt = new PersonTest();
		System.out.println(pt.devide(10,2));
	}
	

}






