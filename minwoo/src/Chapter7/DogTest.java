package Chapter7;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog min = new Dog("민우강아지",123);
		
		System.out.println(min.dogName+min.dogAge);
		
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("민우0",123);
		dogArray[1] = new Dog("민우1",123);
		dogArray[2] = new Dog("민우2",123);
		for (int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].dogName+":"+dogArray[i].dogAge);
		}
		System.out.println();
	}

}
