package operator;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// = : 대입 연산자, 변수에 값을 대입하는 역할
		int i = 24;
		// +, - 부호 연산자
		i = +1;
		i = -1;
		//+-*/% : 산술연산자
		i = 1+2; // 3
		System.out.println(i);
		i = 1-2; // -1
		System.out.println(i);
		i = 10*2; // 20
		System.out.println(i);
		i = 10/2; // 5
		System.out.println(i);
		i = 12%2; // 1
		System.out.println(i);
		
		// ++, -- : 증가 감소 연산자 
		// ++를 변수의 앞에 붙였을 경우 먼저 +1 한 결과값이 출력.
		// ++를 변수의 뒤에 붙였을 경우 결과값이 출력된 후 +1이 계산.
		i = 200;
		--i;
		int j = i + 10;
		System.out.println(i);
		System.out.println(j);
	}

}




















