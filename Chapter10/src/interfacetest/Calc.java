package interfacetest;

// 인터페이스 : 상속과 다형성을 위한 설계도
public interface Calc {
	// 인터페이스에서 선언한 변수는 상수로서 선언되고
	// final을 적지 않아도 상수로서 선언 됩니다.
	double PI = 3.14;
	int ERROR = -999999999;
	int MAX_VALUE = 99999;
	int MIN_VALUE = 0;
	
	//인터페이스에서 선언한 메서드는 자동적으로 추상(abstract) 메서드로 만들어집니다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num1);
	
	//디폴트 메서드 : 인터페이스 안에서 추상메서드가 아닌 일반(구현된) 메서드를 사용하고싶을 선언
	// 재정의 (오버라이드) 하는것이 가능
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
		myStaticMethod();
	}
	
	//정적 메서드 : 인터페이스의 이름으로 인스턴스를 생성하지 않고 부를 수 있는 메서드
	static int total(int [] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		//myMethod(); //일반메서드는 사용불가
		myStaticMethod();
		return total;
	}
	
	//private 메서드 : 인터페이스 안에서만 부를 수 있고, 외부에서는 부를 수 없도록 만드는 접근제어자
	private void myMethod() {
		System.out.println("Calc의 private 메소드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("Calc의 private static 메소드 입니다.");
	}
}














