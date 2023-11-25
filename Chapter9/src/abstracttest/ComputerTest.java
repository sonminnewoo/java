package abstracttest;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스는 인스턴스를 만들 수 없습니다.
		Computer myComputer = new Desktop();
		myComputer.turnOn();
		myComputer.display();
		myComputer.typing();
		myComputer.turnOff();
		System.out.println("--------------------");
		Computer noteBook = new LGGram();
		noteBook.turnOn();
		noteBook.display();
		noteBook.typing();
		noteBook.turnOff();
	}

}









