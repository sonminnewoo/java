package generics;

import java.util.ArrayList;

// 제네릭이란 : 변수나 메서드의 자료형을 필요에따라 여러가지 자료형으로 바꿀수 있도록 만들어주는 기능
// < > (다이아몬드 연산자) : 제네릭을 선언하는 기호
//  T(type의 약자)  : 임의의 자료형이 들어가는 자료형의 이름
// 제네릭과 스태틱의 관계 : 제네릭은 스태틱으로 선언할 수 없음. 
// 프로그램이 실행될때는 자료형이 정해지지 않았기 때문에
// extends 추상클래스 : 추상클래스를 상속받은 클래스만 제네릭 자료형으로 설정 가능하도록 만드는 기능
class GenericPrinter<T extends Material>{ //제네릭 클래스 선언
	private T material; //제네릭 변수 선언
	public void setMaterial(T material) { // 제네릭 매개변수 사용
		this.material = material;
	}
	public T getMaterial() { // 제네릭 반환값 사용
		return material;
	}
	@Override
	public String toString() {
		return material.toString();
	}
}

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		powder.doPrinting();
		powderPrinter.getMaterial().doPrinting();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		plasticPrinter.getMaterial().doPrinting();
		
		//GenericPrinter<Integer> integerPrinter = new GenericPrinter<Integer>();
		
	}

}









