package String;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String : 문자열 객체 자료형 은 Char 형식배열을
//		final char[] : = String / final로 되어있어서 재정의 할수 없다.
//		여럭 문자열을 이어 붙이거나 할경우 메모리 를 많이 활용하게 된다 .
		String str = "String 입니다";
		System.out.println(str+" : "+System.identityHashCode(str));
		str += " 한번 수정했습니다.";
		System.out.println(str+" : "+System.identityHashCode(str));
//		위를 출력 하면 System.identityHashCode(str) 로 메모리 주소가 계속 추가 되는걸 알수 있다
//		그래서 메모리 주소가 낭비 될수 있다 .
		
//		identityHashCode : 실제 메모리 주소 반환
		
//		StringBuilder , StringBuffer : 메모리를 낭비하지 않고 값을 변경 가능
		
//		StringBuilder : 일반 단일 프로세스 프로그램에서 사용
		StringBuilder strBuilder = new StringBuilder("StringBuilder 입니다");
		System.out.println(strBuilder+" : "+System.identityHashCode(strBuilder));
		strBuilder.append("한번수정했습니다");
		System.out.println(strBuilder+" : "+System.identityHashCode(strBuilder));
//		StringBuffer : 멀티 스레드 프로그램에서 같은 변수를 여러 스레드에서 사용하면 값에 오류가 발생합니다
//		StringBuffer 사용하면 그런 오류를 막을 수 있습니다 . 대신 StringBuilder 보다 실행속도가 느리다
//		지원하는 역할(하나의 주소에서 데이터를 바꿀수있는것)을 같지만 빠른 StringBuilder ,
//		느린 StringBuffer 를 선택해서 사용하면된다 
		StringBuffer strBuffer = new StringBuffer("StringBuffer 입니다");
		System.out.println(strBuffer+" : "+System.identityHashCode(strBuffer));
		strBuffer.append("한번 수정했습니다");
		System.out.println(strBuffer+" : "+System.identityHashCode(strBuffer));
		
	}

}
