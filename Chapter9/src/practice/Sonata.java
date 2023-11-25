package practice;

public class Sonata extends Car {
	String carName = "Sonata";

	@Override
		public void startCar() {
			// TODO Auto-generated method stub
			System.out.println(carName+"시동을 켭니다");
		}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(carName+"운전을 합니다");
	}
	@Override
		public void stop() {
			// TODO Auto-generated method stub
		System.out.println(carName+"시동을 멈춥니다");
			
		}
	@Override
		public void turnoff() {
			// TODO Auto-generated method stub
		System.out.println(carName+"시동을 끕니다");
			
		}
	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
	System.out.println("세차를 합니다");
		
	}
}
