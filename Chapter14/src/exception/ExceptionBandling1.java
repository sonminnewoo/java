package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionBandling1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {

			int[] arr = new int[5];
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			fis = new FileInputStream("a.txt"); 
			
//		이부분 을 for 문 이전에 놔두면 실행결과가 다르게 실행된다
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {// 반드시 마지막에 !
//			캐치문, 에러나던 무조건 시행되게 되어서 항상 수행되는 파이널리 를 작성해줘야한다
			if (fis != null) {
				try {
					fis.close();
//					이게 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally : 에러가 나던 나지않던 항상수행됩니다");
		}
		System.out.println("여기도 수행됩니다.");
	}

}
