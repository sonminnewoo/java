package practice;

import java.util.ArrayList;

import arraylist.Dog;

public class DogTestArrayList {
	ArrayList<Dog> dogList = new ArrayList<Dog>();
	public void addDog(String name, String type) {
		dogList.add(new Dog(name,type));
	}
	public void showDogList() {
		for(Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogTestArrayList dogList = new DogTestArrayList();
		dogList.addDog("진도1", "진돗개");
		dogList.addDog("진도2", "진돗개");
		dogList.addDog("진도3", "진돗개");
		dogList.addDog("진도4", "진돗개");
		dogList.addDog("진도5", "진돗개");
		dogList.showDogList();
	}

}









