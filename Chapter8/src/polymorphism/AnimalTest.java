package polymorphism;

//	이 위에 클래스 선언 한다 
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}
}
class Human extends Animal{
@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷습니다. ");
	}	
	public void readbook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Eagle extends Animal{
@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사독수리가 하늘을 납니다. ");
	}		public void flying() {
		System.out.println("독수리는 하늘을 날아 갑니다");
	}
}
class Tiger extends Animal{
@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 뜁니다. ");
		
	}	
		public void hunting() {
			System.out.println("호랑이가 사냥을 합니다 ");
			}
}

class Minwoo{
	public void move() {
		System.out.println("민우 는 운동한다, 오늘도 운동한다 ");
	}	
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Animal());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Tiger());
		
		// 위 와 다르게 오버로드 가 아닌 방법 으로 불러오는 경우
//		
//		Animal human = new Human();
//		//묵시적 형변환
//		Human cHuman = (Human)human;
//		cHuman.readbook();

		// 그냥 human.readbook 으로는 불러올수 없다 
		// 상위클래스 형 변환 되어있던 클래스를 본래의 하위클래스로 형 변환 하는것을 타운 캐스팅 이라고 한다
		
		// 다운캐스팅이 가능하려면 형 변환 퇴기전의 자료형이 같아야 합니다.
		
		System.out.println("--------------다운캐스팅");
		Animal human = new Tiger();
		if(human instanceof Human) { // 인스턴스 오버 , if 로 제대로 지정이 자로딘는지 확인하는것
		Human cHuman = (Human)human;
		cHuman.readbook();
		} else if (human instanceof Eagle) {
			Eagle cEagle = (Eagle)human;
			cEagle.flying();
		} else if (human instanceof Tiger) {
			Tiger cTiger = (Tiger)human;
			cTiger.hunting();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
//	이 내욜을 오버라이드  이용하지않고 어버 라이드를 이용해서 
//	여러개 의 	
	
//	public void moveAnimal(Animal animal) {
//	animal.move();
//	을 생성해야 한다 

}
