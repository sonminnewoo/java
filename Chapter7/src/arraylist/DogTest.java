package arraylist;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		Dog [] dog = new Dog[5];
		
//		String dogname = "";
//		String dogInfo = "";
		
		for(int i = 0; i<=dog.length ; i++) {
			
			dog[i] = new Dog("","") ;
			System.out.println(dog[i]);
			dog[i].showInfo();
			
//			package remind;
//-------------------다른 방법 
//			import arraylist.Dog;
//
//			public class Dogtest {
//
//				public static void main(String[] args) {
//					// TODO Auto-generated method stub
//					Dog[] dogs = new Dog[5];
//					dogs[0] = new Dog("진도","진돗개");
//					dogs[1] = new Dog("진도1","진돗개1");
//					dogs[2] = new Dog("진도2","진돗개2");
//					dogs[3] = new Dog("진도3","진돗개3");
//					dogs[4] = new Dog("진도4","진돗개4");
//					
//					for(int i=0; i<dogs.length; i++) {
//						System.out.print(dogs[i].showInfo());
//					}
//				}
//
//			}

		}
	}
}
