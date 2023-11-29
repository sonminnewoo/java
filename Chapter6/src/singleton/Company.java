package singleton;

public class Company {
	//싱글톤 패턴
	//인스턴스를 단 하나만 생성하고 더 이상 생성할 수 없도록 만드는 패턴
	private static Company instance = new Company();
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}







