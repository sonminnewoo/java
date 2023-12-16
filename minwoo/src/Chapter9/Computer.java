package Chapter9;
//	추상화 된 Computer 클래스 ,display,typing 메서드
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("컴퓨터 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다");
	}
	
	final public void don() { 
		display();
		typing();
		turnOff();
		turnOn();
	}
}
