package abstracttest;

public class Desktop extends Computer{

	//추상클래스를 상속 받은 후 추상메서드를 구현하면 일반 클래스 사용할 수 있습니다.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing()");
	}

}





