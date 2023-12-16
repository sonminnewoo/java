package Chapter9;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new DeskTop();
		
		c1.turnOn();
		c1.display();
		c1.typing();
		c1.turnOff();
		System.out.println("------------템플릿 메서드-------------");
		c1.don();
		
		Computer c2 = new SamsungNotbook();
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();
		System.out.println("------------템플릿 메서드-------------");
		c2.don();
		
		Computer c3 = new SamsungNotbook2();
		c3.turnOn();
		c3.display();
		c3.typing();
		c3.turnOff();
		System.out.println("------------템플릿 메서드-------------");
		c3.don();
		
		
	}
}
