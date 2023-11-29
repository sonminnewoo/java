package practice;

public class Sonata extends Car {
	String carName = "Sonata";
	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println(carName + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(carName + " 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(carName + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(carName + " 시동을 끕니다.");
	}

}
