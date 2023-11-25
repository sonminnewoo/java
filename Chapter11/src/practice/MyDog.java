package practice;

class Dog {
	String name;
	String type;
	
	public Dog(String name, String type) {
		this.name = type;
		this.type = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+type;
	}
//			System.out.println(dog); () 안 동작은 toString 으로 되기
//	떼문에 오버라이드 해서 투스트링부분을 수정 해준다
}

public class MyDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스만 수정하여 위의 내용이 오류가 나지 않도록 수정하고 
//		출력결과대로 콘솔차에 출력하세요 .
//		출력결과 : 진돗개 멍멍이
		
		Dog dog = new Dog("멍멍이", "진돗개");
		
		System.out.println(dog);

	}

}
