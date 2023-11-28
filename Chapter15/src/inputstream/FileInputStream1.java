package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			//폴더 및 파일 상대 위치
			// 최상위 폴더  :프로그램 이름으로 된폴더
			// / : 폴더하위 폴더로 이동
			// 정대경로 : 전체 경로를 적는것을 말합니다.C:\Users\admin\Desktop\Developer\code\Chapter15\input.txt
			// 상대경로 : 최상위 폴더를 기준으로 파일 경로를 적는것을 말합니다. input.txt
			// ./ : 현재 파일이 있는 위치
			// ../ : 현재 파일의 한단계 상위 폴더
			fis = new FileInputStream("./input.txt");
			//C:\Users\admin\Desktop\Developer\code\Chapter15\input.txt 라고 되어있는걸 정대 폴더
//		지금은 input.txt 로 되어있다 이걸 위처럼 바꿀수 있다 
//			"./input.txt" 같은 폴더에 있는경우 ./ 라고 하고 원하는 대상을 적는다
			
//			System.out.println((char)fis.read()); // 1바이트 읽기
//			System.out.println((char)fis.read()); // 1바이트 읽기
////			(char)
//			System.out.println((char)fis.read()); // 1바이트 읽기
			int i;
			while((i = fis.read())!= -1) {
//				System.out.println((char)i);
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
}
