package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// try-with-resource : try(close() 실행해야할 인스턴스 선언 코드)
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
//			throw 강제로 에러문 발생, ArrayIndexOutOfBoundsException,Exception
		} catch(ArrayIndexOutOfBoundsException e) {  // Exception 에서 상속받기때문에 ArrayIndexOutOfBoundsException
//			은 상위에 위치 시켜야 올바르게 실행된다 
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("예외 부분입니다.");
		}
		
		AutoCloseObj obj2 =  new AutoCloseObj();
//		AutoCloseObj 는 Exception 을 사용하면 알람이 발생하지않음 . 
//		이거는 여러개 쓸수 있다
//		위 try 와 다르게 
			try(obj2){
				throw new Exception();
			} catch(Exception e) { 
				System.out.println(e);
			} 
		}
	}


