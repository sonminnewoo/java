package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String : 문자열 객체 자료형
		// final char[] : 한번 값을 설정하면 값을 바꿀 수 없습니다. 
		// 값을 변경하는경우 계속해서 메모리를 새롭게 사용하게 되어 메모리 낭비가 심해집니다.
		String str = "String 입니다.";
		System.out.println(str+" : "+System.identityHashCode(str));
		str += " 한번 수정했습니다.";
		System.out.println(str+" : "+System.identityHashCode(str));
		//StringBuilder, StringBuffer 메모리를 낭비하지 않고 값을 변경 가능
		//StringBuilder : 일반 단일 프로세스 프로그램에서 사용
		StringBuilder strBuilder = new StringBuilder("StirngBuilder 입니다.");
		System.out.println(strBuilder+" : "+System.identityHashCode(strBuilder));
		strBuilder.append("한번 수정했습니다.");
		System.out.println(strBuilder+" : "+System.identityHashCode(strBuilder));
		//StringBuffer : 멀티스레드 프로그램에서 같은 변수를 여러 스레드에서 사용하면 값에 오류가 발생하게 됩니다.
		// StringBuffer를 사용하면 그런 오류를 막을 수 있습니다 대신 StringBuilder 실행속도가 느립니다.
		StringBuffer strBuffer = new StringBuffer("StringBuffer 입니다.");
		System.out.println(strBuffer+" : "+System.identityHashCode(strBuffer));
		strBuffer.append("한번 수정했습니다.");
		System.out.println(strBuffer+" : "+System.identityHashCode(strBuffer));
		
	}

}
