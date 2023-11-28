package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
			byte[] bs = new byte[26];
			byte a = 'a';
			for(int i =0; i<bs.length; i++) {
				bs[i] = a;
				a++;
			}
			fos.write(bs);
//			실행후 해당파일의 패키지 밖에 output.txt 가 60,66,67 로 ABC 로 작성된다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
