package interfacetest;

public class Customer implements Buy, Sell {
	// implements 는 콤마를 사용해서 여러개 부를수 있고 ,익스 텐스 는 한개만 부른다
//	인터페이스는 여러개의 인터페이스를 동시에 상속 가능
//	여러개의 인터페이스에 존재하는 모든 추상메서드를 구현하면 된다
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	@Override
	public void sell() {
		System.out.println("판매하기");	
	}
	//default 메서드가 중복될 경우 상속을 받는 자식 클래스에서 구현해야 실행가능
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
	}
	
}
