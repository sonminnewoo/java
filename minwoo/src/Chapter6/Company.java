package Chapter6;
// 싱글톤패턴으로 회사 구현하기
public class Company {
	//싱글톤 패턴 에서 는 개발자가 직접 명시적으로
	// 생성자를 만들고 접근제어자르 private 으로 한다
//	이렇게 하면 외부 클래스에서 마음대로 인스턴스를 생성할수 없게 된다
	private Company() {}
//	하지만 회사 클래스에서 인스턴스가 하나는 필요하다
//	아래 인스턴스가 이 프로그램에서 유일한 인스턴스이다.
//	데이터 오류 방지를 위해 private 으로 선언한다 
	private static Company instance = new Company();
//	외부에서 사용할수 있게 public 메서드를 만들어 준다 
//	인스턴스를 반환하는 메서드는 static 으로 공통으로 사용할수 있게 선언한다
//	이 getInstance메서드는 인스턴스 생성과 사완없이 호출 할수 있어야 한다
//	static 은 프로그램 메모리에 상주함으로 인스턴스 생성과 
//	관련없이 사용할수 있기 때문 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	public static void setInstance(Company instance) {
		Company.instance = instance;
	}
	
}
