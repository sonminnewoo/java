package Chapter9;

public class DeskTop extends Computer {
//	추상화 된 computer 클래스 에서 추상화된 메서드 상송 받아 사용 
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Typing");
	}

}
