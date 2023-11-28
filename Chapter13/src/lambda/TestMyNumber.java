package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> x >= y ? x : y; 
//		인터페이스에 서 추가한 메서드 / 메서드의 이름 / 계산식 
		System.out.println(max.getMax(40,20));
//		자료형 생략하기 : 조건에 상관없이 생략 가능
//		매개변수 괄호 생략하기 : 매개변수가 하나라면 괄호 생략 가능
//		여기서 x,y 두개 인데 x 가 하나라면 괄호 생략 가능 
//		중괄호 생략하기 : 실행문이 한문장이라면 중괄호 생략 가능
//		return 생략하기 : 구현부분이 return문 하나라면 ㅈreturn 생략가능 
	}
	public int getMax(int num1,int num2) {
		return num1>num2 ? num1 : num2;
//		return x>=y ? x : y;
		
	}

}
