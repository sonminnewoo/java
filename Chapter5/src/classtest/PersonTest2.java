package classtest;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person();
		kim.name = "김유신";
		kim.height = 180;
		kim.weight = 80;
		kim.gender = 'M';
		kim.married = true;
		Person lee = new Person();
		lee.name = "이순신";
		Person ahn = new Person();
		ahn.name = "안연수";
		Person song = new Person();
		song.name = "송치원";
		kim.showPersonInfo();
		lee.showPersonInfo();
		ahn.showPersonInfo();
		song.showPersonInfo();
		Person lim = new Person("임꺽정", 180, 80, 'M', true);
		lim.showPersonInfo();
	}

}







