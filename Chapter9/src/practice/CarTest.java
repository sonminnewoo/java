package practice;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
//		향상된 포문
		
		for(Car car : carList) {
			car.run();
			System.out.println("=========================================");
		}
	}

}
