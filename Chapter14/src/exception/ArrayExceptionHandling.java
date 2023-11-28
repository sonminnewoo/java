package exception;

import java.io.IOException;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
//		int [] arr = new int[5];  같은 이름의 변수를 두번 선언했기 때문에 컴파일 에러 발생
		//컴파일 에러: 이크립스에서 확인 할수 있는(빨간줄 뜨는 에러)
//		문법이나 사용방법을 틀렸을때
	
//		런타임 에러: 실행 하기 전에는 알수없는 에러, 실행중에 발생하는 에러
//		for(int i = 0; i<=5; i++) {
//			arr[i] = i ;
//			System.out.println(arr[i]);
//		}
		
		try { //  예외가 발생할수 있는 코드 . 
			for(int i = 0; i<=5; i++) {
					arr[i] = i ;
					System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
//			에러가 발생되었을때 실행되는 코드
				System.out.println(e);
				System.out.println("예외 처리부분");
		} catch(Exception e) {
			System.out.println("IOException 부분실행");
		}
		System.out.println("프로그램종료");
//		에러가 발생하면 프로그램이꺼지는데 그부분 에서 에러 뜨고 그다음 실행이 진행되지않음
//		하지만 try-catch 문을 이용해서 정상적으로 실행되었다 
	}

}
