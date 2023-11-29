package interfacetest;

public class CompleteCalc extends Calculator{

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

}










