package exception;

// try-with-resource 문을 사용했을때 반드시 close() 문이 실행되도록 만들어 주는 클래스
public class AutoCloseObj implements AutoCloseable {
	
@Override
public void close() throws Exception {
	// void 옆 클로즈가 파일 을 닫는 close() 이다!
	System.out.println("리소스가 close() 되었습니다.");
}
}
