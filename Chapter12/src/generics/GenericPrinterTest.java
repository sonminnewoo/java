package generics;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/main
public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(plasticPrinter);
		
	/*	GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder = (Powder)powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		*/
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	
	}
<<<<<<< HEAD
=======
=======
import java.util.ArrayList;

//	제너릭이란 : 변수나 메서드의 자료형을 필요에 다라 여러가지 자료형으로 
//	바꿀수있도록 만들어주는 기능
//	<제너릭> (다이아몬드 연산자) : 제너릭을 선언(사용하겠다!)하는 기호
//	T(Type의 약자) : 임의의 자료형이 들어가는 자료형의 이름
//	제네릭과 스태틱의 관계 : 제네릭은 스태틱 으로 선언할수 없다. 아직 프로그램(main)이 실행될때는
//	자료형이 정해지지 않았기 대문에
class GenericPrinter<T>{  // 제너릭 클래스 선언
	private T material;    // 제네릭 변수 선언  
	public void setMaterial(T material) {  // 제네릭 매개변수 사용
		this.material = material; 
	}
	public T getMaterial() { // 제네릭 반환값 사용
	return material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
}

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

	}

>>>>>>> origin/main
>>>>>>> origin/main
}
