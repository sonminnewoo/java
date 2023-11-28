package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		위에서 에러 발생시 미루는 throws 를 이용해서 미뤘다  throws FileNotFoundException 처럼
//		클래스 뒤에 생겼고 이걸 main 에서 처리하기위해 아래를 작성한다
//		 new ThrowsException(); 으로 ThrowsException 형식의 test 으로 실행하여 
//		("a.txt", "java.lang.String"); 로 텍스트 파일 로드 , 두번째 
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("b.txt", "java.lang.String");
//			java.lang.String 는 a.txt 가 없을때 실행시켜주는 것
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			이걸 
			System.out.println(e);
//			로 하면 검게 표시
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 직전");
	}

}
