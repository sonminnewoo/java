package interfacetest;

public class CompleteCalc2 implements Calc{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return Calc.ERROR;
		}else {
			return num1/num2;
		}
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int square(int num1) {
		// TODO Auto-generated method stub
		return 0;
	}

}










