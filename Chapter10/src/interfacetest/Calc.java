package interfacetest;
// 인터페이스 
// 앞에 final 을 안붙여도 상수로 선언된다 
// 인터페이스 : 상속과 다양성을 위한 설계도
public interface Calc {
	// 인터페이스 에서 선언한 변수는 상수로서 선언되고 
	// final 를 적어주지 않아도 상수로서 선언 됩니다.
	
	double IP = 3.14;
	int ERROR = 1233123123;
	int MAX_VALUE = 99999;
	int MIN_VALUE = 0;
	
	// 인터페이스에서 선언한 메서드는 자동적으로 ★추상 메서드로 선언된다 추상이라면 구현되어있어야 한다
	// 만들어집니다. ; 으로 중간에 {} 를 안적어도 된다 
	// 메서드 앞에 abstract 을 안적어도 된다 , 변수 동일 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num1);
	
//	디폴트 메서드 : 인터페이스 안에서 추상메서드가 아닌 일반(구현된)메서드를 사용하고싶을때 사용
//	myMethod,myStaticMethod 이 거를 사용하는 차이에 있다 Description,total 메서드 에서 구분해서
//	사용하는 걸 참고하면 된다 
//	재정의(오버라이드) 하는것이 가능
	
	default void Description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();    //일반 메서드에서 사용할수 없다 . 
	}
	//void Description2(); // 추상화 된것 ★
//	정적 메서드 : 인터페이스의 이름으로 인스턴스를 생성하지 않고 부를수 있는 메서드 
//	static 메서드 : 프로그램이 실행될때 처리되는 메서드 
	static int total(int [] arr) {
		int total = 0;
		for(int i : arr) {
			total += i ;
		}
		myStaticMethod();
		return total;
	}
	// private 메서드 : 인터페이스 안에서만 부를 수 있고 , 외부에서는 부를수 없도록 만드는 접근제어자
	/// 디폴트, 프라이빗, 프로텍티드 메서드 랑 동일하다 
	
	private void myMethod() {
		System.out.println("Calc의 private 메소드 입니다.");
	}
	private static void myStaticMethod() {
		System.out.println("Calc의 private static 메소드 입니다.");
	}
}
