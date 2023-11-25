package practice.copy;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("Sonata"));
		carList.add(new Car("Grandeur"));
		carList.add(new Car("Avante"));
		carList.add(new Car("Genesis"));
		
//		향상된 포문
		
		for(Car car : carList) {
			car.run();
			System.out.println("=========================================");
		}
	}

}
