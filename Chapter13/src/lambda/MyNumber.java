package lambda;

//함수형 인터페이스 를 뜻하는 어노테이션
// 한개의 추상 메서드만 만들수 있다. int getMax(int num1, int num2); 이런형식

@FunctionalInterface

public interface MyNumber {
	int getMax(int num1, int num2);
}
