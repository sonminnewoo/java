package singleton;

public class CarFactory  {
	
		private static int serialNum = 10000;
		
		private static CarFactory instance = new CarFactory (); // 인스턴스 
		
		private CarFactory() {} // 생성자
		
		static CarFactory getInstance(){  // 겟 인스턴스 
			if(instance == null) {
				instance = new CarFactory (); // 공간 만들기 
			}
			return instance ; 
		}
		public Car createCar() {
			serialNum++;
			Car car = new Car(serialNum);
			return car;
		}
	}
