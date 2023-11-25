package abstracttest;

//추상 클래스 : 구체적이지 않은 클래스, 
//일부 메서드를 구현하지 않고 생성하는 클래스를 뜻합니다.
// 추상 클래스는 상속을 위해 만들어지는 클래스로 추상 메서드를 구현하지 않으면 사용할 수 없습니다.
// 추상클래스에 구현하는 메서드는 공통기능을 구현
// 추상클래스에서 구현하지 않은 메서드는 각각 실행되는 내용이 다를때 상속을 하여 구현
public abstract class Computer { // 추상 클래스 : 추상 메서드가 존재하는 클래스
	public abstract void display(); //추상 메서드 : 구현되지 않은 메서드
	public abstract void typing();  //추상 메서드는 다른 클래스에서 추상 클래스를 상속받아 
									// 오버라이드를 이용하여 구현한 후 사용 가능
	public void turnOn() { // 메서드 : 실행하는 내용이 구현되어 있어 바로 실행 가능
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원 끕니다.");
	}
}
