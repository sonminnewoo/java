package practice.copy;

public class Car {
	String carName;
	public Car(String carName) {
		this.carName = carName;
	}
	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println(carName + "시동을 켭니다");
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(carName + "운전을 합니다");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(carName + "시동을 멈춥니다");

	}

	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(carName + "시동을 끕니다");

	}

	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다");

	}

	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
		showLevelMessage();
	}
}
