package practice;

class Dog{
	String name;
	String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return type + " " + name;
	}
}

public class MyDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("멍멍이","진돗개");
		System.out.println(dog);
		//클래스만 수정하여 위의 내용이 오류가 나지 않도록 수정하고 출력결과대로 콘솔창에 출력하세요.
		//출력결과 : 진돗개 멍멍이
	}

}
