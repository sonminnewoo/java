package Chapter9;

public abstract class MyNoteBook extends Computer {
//	추상화된 computer 클래스 에서 추상화된 display,typing 상속 받아 사용 하기 및 자신도 추상화 하기

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook display()");
	}
}
