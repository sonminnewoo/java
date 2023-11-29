package interfacetest;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		X x = myClass;
		x.x();
		//x.y();
		//x.myMethod();
		Y y = myClass;
		y.y();
		//y.x();
		//y.myMethod();
		MyInterface myInterface = myClass;
		myInterface.x();
		myInterface.y();
		myInterface.myMethod();
	}

}







