package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper 클래스 : 기본자료형을 객체자료형으로 사용해야할때,
		//여러가지 메서드들 사용이 가능합니다.
		boolean bool = true;
		Boolean bool2 = false;
		byte b = 1;
		Byte b2 = 2;
		short s = 3;
		Short s2 = 4;
		int i = 10;
		Integer i2 = 100;
		System.out.println(i2.toString());
		//언박싱 : 객체 자료형을 기본 자료형으로 변환할 때
		int i3 = i2.intValue();
		//오토박싱 : 기본자료형이 객체자료형 변환될 때 
		int sum = i + i2;
		Integer sum2 = i+i2;
		System.out.println(sum + "," +sum2);
		
		long l = 1000l;
		Long l2 = 1000l;
		double d = 3.14;
		Double d2 = 3.15;
		float f = 3.16f;
		Float f2 = 3.17f;
		char c = 'c';
		Character c2 = 'c';
		
		
		
	}

}





