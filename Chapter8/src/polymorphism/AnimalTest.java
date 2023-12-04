package polymorphism;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리는 하늘을 날 수 있습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 잘 합니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest aTest = new AnimalTest();
//		1 : 자기 자신을 새로 생성 한다 
		aTest.moveAnimal(new Animal());
//		자기 자신의 형태로 생성한 것에 moveAnimal 이라는 메서드를 이용해서 
//		동물을 인수를 넣어준다 
//		동물은 , Animal , Human , Eagle , Tiger 가 있다
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Tiger());
		System.out.println("----------다운 캐스팅 ----------");
		
		//다운 캐스팅 : 상위클래스 형 변환 되어있던 클래스를 본래의 하위클래스로 형 변환 하는 것
		// 다운 캐스팅이 가능하려면 형 변환 되기전의 자료형과 같아야 합니다.
		Animal human = new Tiger();
		
		if(human instanceof Human) { // 이부분은 인스턴스 를 생성할때 지정한human이 
			Human cHuman = (Human)human; // Human의 human 인지 확인하는 구문 그게 맞으면 cHuman 으로 Human 을 만들고 ,
			cHuman.readBook(); //  해당클래스의 메서드를 호출한다 , (Human)human 어떤의미인지 선생님한테 물어보기 !!
//			human 을 생성 ㅎreadBook 
		}else if(human instanceof Eagle) {
			Eagle cEagle = (Eagle)human;
			cEagle.flying();
		}else if(human instanceof Tiger) {
			Tiger cTiger = (Tiger)human;
			cTiger.hunting();
		}else {
			human.move();
		}
		
		
	}
	public void moveAnimal(Animal animal) {
//		프로그램 내용 main 에서 프로그램 실행
//		atest 라는 이름으로 AnimalTest 클래스 형태를 생성 
//		atest 로 moveAnimal 메소드를 실행 , 이때 ! 
//		메서드가 인수로 받는 자료형을 Animal 클래스 를 new 로 생성해서 지정했다.
//		Animal 을 new 해서 생성했고 . 그걸 animal 이라는 변수로 받아왔는데 
//		그걸 move() 메서드를 실행했다. Animal 클래스에도 move() 메서드가 있지만 
//		Human, Egle, Tiger 클래스에도 동일하게 move() 메서드가 있어서 오류 없이 
//		moveAnimal 를 실행하면 클래스를 생성하고 생성한클래스를 animal 로 지정 하고 
//		지정한 클래스를 animal 이라는 소문자 이름으로 받아온뒤 .move(); 메서드를 실행한다 
//		아래든 Anlmal d형식으로 human 이라는 변수 이름으로 생성하고 new Tiger() ; 로
//		tuger 클래스를 생성 해준다 . 그 변수를 지정하고 instanceof 을 이용해서
//		생성한 클래스 를 확인해서 일치하는 클래스 명을 확인 그러면 그 클래스 형태로 지정한 이름대로 
//		
//		생성자로 생성자를 생성하고 , 그생성자로 , 메서드를 출력하는데 
		
//		이렇게 메서드 안에 
		animal.move();
	}

}
















