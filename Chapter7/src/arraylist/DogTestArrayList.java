package arraylist;

// 2. 임포트 추가 
import java.util.ArrayList;

public class DogTestArrayList {
//	1. 멤버변수 선언 
	ArrayList<Dog> dogList = new ArrayList<Dog>();
//	3. 추가하는 add 
	public void addDog(String name,String type) {
		dogList.add(new Dog(name,type));
	}
	
//	4. 쇼도그 리스트를 불러오면 배열의 내용을 출력하는 구문 작성 
	public void showDogList() {
//		향상된 포문 으로 dogList 의 배열 길이 만큼 반복 출력 하게끔 
//	    도그 형식의 도그 배열의 도그배열 리스트 길이만큼 출력 
		
		for(Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		생성자를 생성하고 배열 형식에 맞게 매개 변수를 입력받고 
//		위에 작성한것처럼 배열의 길이만큼 반복해서 출력 해준다 
		DogTestArrayList dogList = new DogTestArrayList();
		dogList.addDog("진도", "진돗개");
		dogList.addDog("진도1", "진돗개");
		dogList.addDog("진도2", "진돗개");
		dogList.addDog("진도3", "진돗개");
		dogList.addDog("진도4", "진돗개");
		dogList.addDog("진도5", "진돗개");
		dogList.showDogList();
	}
}
