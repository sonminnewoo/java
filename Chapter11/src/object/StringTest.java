package object;

public class StringTest extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest st = new StringTest();
		String str = "String입니다";
		System.out.println(st); //메모리 주소
		System.out.println(str); //안의 내용
		System.out.println(st.toString()); //메모리 주소
		System.out.println(str.toString()); //안의 내용
	}
}
