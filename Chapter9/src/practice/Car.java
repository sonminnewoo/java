package practice;

public abstract class Car {
	
	public abstract void startCar();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public abstract void showLevelMessage();
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
		showLevelMessage();
	}
}
