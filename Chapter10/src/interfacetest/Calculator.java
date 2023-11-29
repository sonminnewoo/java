package interfacetest;

// 인터페이스를 상속 받을 경우 implements를 사용
// 인터페이스는 여러개를 상속 받을 수 있음
// 인터페이스는 추상클래스도 상속 받는것이 가능, 일반 상속 받는것이 가능
public abstract class Calculator implements Calc{
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	@Override
	public int square(int num1) {
		return num1 * num1;
	}
}
