package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new AICar();
		Car yourCar = new ManualCar();
		myCar.run();
		System.out.println("---------------------");
		yourCar.run();
	}

}
