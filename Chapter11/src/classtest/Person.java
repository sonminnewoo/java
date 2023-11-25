package classtest;

public class Person {

//	멤버 변수는 반드시 클래스 안에서 선언 해줘야 한다 
//	일반 변수 는 메인 함수 안에서 선언할수 있지만 
	
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	설계도
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
