package Chapter7;

import java.util.ArrayList;

import array.Dog;

public class DogTest2 {

	public static void main(String[] args) {
		ArrayList<Dog> doglist = new ArrayList<Dog>();
		
		doglist.add(new Dog("alsdn1",123));
		doglist.add(new Dog("alsdn1",123));
		
		for(int i = 0 ; i<doglist.size(); i++) {
		doglist.get(i).showInfo();
		Dog dog = doglist.get(i);
		System.out.println(dog.showInfo());
		}
		for(Dog dog2 : doglist) {
			dog2.showInfo();
		}
	}

}
