package classtest;

public class FunctionTest {
	//1부터 파라미터로 받아온 값까지 더해주는 메서드를 작성해보세요.
	int fac(int value) {
		int result = 0;
		for(int i=0; i<=value; i++) {
			//result += i;
			result = result + i;
		}
		return result;
	}
	// 사칙연산을 실행하는 메서드 작성
	int add(int x, int y){
		return x+y;
	}
	int subtract(int x, int y){
		return x-y;
	}
	int multiply(int x, int y){
		return x*y;
	}
	int divide(int x, int y){
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionTest ft = new FunctionTest();
		System.out.println(ft.fac(10));
		System.out.println(ft.add(50, 100));
		System.out.println(ft.subtract(50, 100));
		System.out.println(ft.multiply(50, 100));
		System.out.println(ft.divide(50, 100));
	}

}







