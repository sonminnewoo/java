package practice;

public abstract class Car {
	public abstract void startCar();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public void wash() {
		System.out.println("새차를 합니다.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wash();
	}
}
