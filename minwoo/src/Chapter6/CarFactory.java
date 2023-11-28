package Chapter6;

class Car {
	int carNum1 ;
	static String carName ;
	Company company;

	public Car(String carName) {
		this.carName = carName;
		carNum1 = CarFactory.carNum;
		company = Company.getInstance();
		CarFactory.carNum++;
	}
	public void showInfo(){
		System.out.println(carName+carNum1);
		System.out.println("??");
	}
	
}
public class CarFactory {

	public static int carNum = 10001;
	
	public static void main(String[] args) {

		Car car1 = new Car("sonata");
		car1.showInfo();
		Car car2 = new Car("niro");
		car2.showInfo();
		
	}

}
