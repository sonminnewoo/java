package arraylist;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
//		생성자를 이용해서 ,생성자의 형태로 리스트를 만드는 구문
		
		Dog [] dog = new Dog[5];
//		dog 이름으로 5개 배열 을 가진 dog 형식의 배열이 생김 
//		ArrayList<Dog> dogList = new ArrayList<Dog>(); 을 적어줘야 사용할수있다.
		
//		String dogname = "";
//		String dogInfo = "";
		
		for(int i = 0; i<dog.length ; i++) {
			
			dog[0] = new Dog("손민우","멋져1") ;
			dog[1] = new Dog("손민우","멋져2") ;
			dog[2] = new Dog("손민우","멋져3") ;
			dog[3] = new Dog("손민우","멋져4") ;
			dog[4] = new Dog("손민우","멋져5") ;
			System.out.println(dog[i].showInfo());
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
