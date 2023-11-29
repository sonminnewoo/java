package interfacetest;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		//square(int) : 제곱을 실행하는 메서드
		System.out.println(calc.square(num1));
		calc.description();
		
		int [] arr = {1,3,5,7,9};
		System.out.println(Calc.total(arr));
		//Calc.myStaticMethod(); private 메소드는 외부에서 부를 수 없습니다.
	}

}







