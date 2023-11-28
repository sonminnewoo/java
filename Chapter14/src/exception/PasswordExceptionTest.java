package exception;

public class PasswordExceptionTest {
	private String pass;
	
	public void setUserpass(String pass) throws PasswordException {
//		PasswordException 부분이 이전에 한 IDFormatException 으로 되어있으면 
//			e.printStackTrace(); 로 출력하게 했을때 나오는 첫째 구문이  
//		exception.IDFormatException: 비밀번호는 5자 이상으로 쓰세요 << 에서 경로가 잘못되게됨
//		그래서 PasswordException 최종 바꿨다
		if(pass == null) {
			throw new PasswordException("아이디는 null일수 없습니다.");
			
		} else if(pass.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상으로 쓰세요");
		}
		this.pass = pass;
	}
	public static void main(String[] args) {
		
		PasswordExceptionTest test = new PasswordExceptionTest();
		String pass = new String("abc");
		System.out.println(pass.matches(pass));
		
		String pass2 = new String("abc1");
		System.out.println(pass.matches(pass));
		
		String pass3 = null;
		try {
			test.setUserpass(pass);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		pass = null;
		try {
			test.setUserpass(pass);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료 직전");
	}

}
