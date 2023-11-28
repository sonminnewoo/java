package practice;

import java.util.HashMap;

class Car{
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	private HashMap<String,Car> carMap = new HashMap<String,Car>();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String str) {
		if(carMap.containsKey(str)) {
			return carMap.get(str);
		}
		Car car = new Car(str);
		carMap.put(str, car);
		return car;
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수차");
		Car sonata2 = factory.createCar("연수차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("승연차");
		Car avante2 = factory.createCar("승연차");
		System.out.println(avante1 == avante2);
		
		System.out.println(sonata1 == avante1);
	}

}









