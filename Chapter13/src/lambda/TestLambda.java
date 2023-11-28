package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}

	public static void showMyString(PrintString p) {
		p.showString("Hello lamda_2");
	}
	
	public static PrintString returnString() {
		PrintString str = s -> System.out.println(s+"World");
		return str;
	}

}
