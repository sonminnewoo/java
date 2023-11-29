package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//추상 클래스에서 final예약어를 사용하여 템플릿 메서드를 작성
	//템플릿 메서드: 오버 라이드를 할 수 없는 메서드를 만들어 
	//각각의 메서드가 순서대로 실행되록 만들어놓은 메서드 
	//싱글톤 패턴처럼 하나의 디자인 패턴으로 필요한 곳에 사용
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}










