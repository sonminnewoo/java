package interfacetest;

// interface 를 상속받을 경우 implements 를 사용한다
// 인터페이스는 여러개를 상속 받을 수 있음 ( implements Calc(여기){ 에 콤마를 넣고 추가하면된다
// 인터페이스는 추상클래스도 상속 받는것이 가능 , 일반 상속 받는것이 가능
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
			// TODO Auto-generated method stub
			return num1*num1;
		}
}
