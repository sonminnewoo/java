package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Wrapper 클래스 : 기본자료형을 객체자료형으로 사용해야할 때 사용 할때 
//		이전 '버블솔트' 할때 int 를 Integer 로 사용했다
//		Integer i2 = 100; int 가아닌 Integer 같이 표현한 형식을
//		말한다
//		여러가지 메서드들 사용이 가능합니다.
		
		boolean bool = true;
		Boolean bool2 = false;	
		byte b = 1;
		Byte b2 = 2;
		short s = 3; 
		Short s2 = 4;
		int i = 10;
//		System.out.println(i); 기본 자료형 으론 아래 toString() 처럼 기능 사용할수 없다 
		Integer i2 = 100;
		System.out.println(i2.toString());
//		이런 형식을 wrapper자료형이라고 한다
		int sum = i + i2;
		Integer sum2 = i+i2;
//		언박싱 : 객체 자료형을 기본 자료형으로 변환할 때
		int i3 = i2.intValue();
//		예전에는 위처름 언박싱을 일일이 해줘야했지만 지금은 그냥 바로 사용가능하다
//		오토박싱 : 기본 자료형이 객체 자료형 변환될 때
		System.out.println(sum+","+sum2);
//		이런 식으로 다를 자료형을 사용할수 있다
		long l =10000l;
		Long l2 =1000l;
		double d = 3.14;
		Double d2 = 3.14;
		float f = 3.16f;
		Float f2 = 3.16f;
		char c = 'c';
		Character c2 = 'c';
		
		
	}
}
