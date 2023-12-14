package practice;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("진도","진돗개");
		dogs[1] = new Dog("진도1","진돗개");
		dogs[2] = new Dog("진도2","진돗개");
		dogs[3] = new Dog("진도3","진돗개");
		dogs[4] = new Dog("진도4","진돗개");
		
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo()); 
		}
	}

}









