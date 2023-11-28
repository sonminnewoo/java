package Chapter5;

class Subject {
	String sName;
	int sScore;
	
	public void showInfo() {
		System.out.println(sName);
		System.out.println(sScore);
	}
}

public class PersonTest {
//	아래 public 을 private 으로 변경 해서 사용
	public String name;
//	private String name;
	
//	private 으로 선언한 변수를 사용하기 위해서 아래 처럼 get,set 을 이용해 외부에서 사용할수 있게 한다 .


	public int age;
	public Subject math;
	public Subject English;
	public int total;
	
	public PersonTest() {}
	
	public PersonTest(String pname , int page) {
		this.name = pname;
		this.age = page;
		math = new Subject();
		English = new Subject();
	}
	
//	public 이라고 클래스, 변수, 메서드, 함수 앞에 선언했는데 외부 클래스 에서 사용가능하다는 의미
//	public 이라고 붙이면 별다른 조치 없이 외부 클래스에서 Student 클래스의 것을 StudentTest 에서
//	활용 하던것처럼 사용할수 있다 . 하지만 Private 으로 바꾸면 오류가 발생한다 
	
	public static void main(String[] args) {
		PersonTest son = new PersonTest("손민우", 30);
		Person son2 = new Person();
		
//		son2 는 Person 클래스 를 이용하는 인스턴스인데 
//		name 부분을 private 으로 변경하면 아래 son2.name 에 오류가 발생한다
//		그래서 Person 클래스에 get,set 메서드를 이용해서 사용할수 있게하고 아래 형식을 변경한다
//		son2.name = "손손민우";
//		위를 아래처럼 바꾸고 set메서드를 이용한다 
		son2.setName("손손민우didi");
		son.math.sName = "수학";
		son.math.sScore = 80;
		son.English.sName = "영어";
		son.English.sScore = 90;
		System.out.println(son.name + son.age);
		son.math.showInfo();
		son.English.showInfo();
//		외부 클래스 를 사용해서 변수를 출력할때 기존 public 클래스는 name 출력시
//		System.out.println(son2.name); 이렇게 작성하면 됬다 
//		하지만 지금 private 으로 변경했으므로 아래처럼 바꿔준다. get 메서드를 이용한다
		System.out.println(son2.getName());
//		접근제어자
//		public : 외부 클래스 어디에서나 접근할수 있다.
//		protected : 같은 패키지 내부와 상속! 관계의 클래스에서 만! 접근가능 
//		private : 같은 클래스 내부에서만 접근할 수 있다. get,set 으로 외부 클래스에서 접근할수는 있다
//		아무것도 정하지 않음 : default 이며 같은 패키지 내부에서만 접근할수 있다 
//		이런식으로 private,protected 처럼 하는 이유는 데이터의 접근을제한하여 권한있는 클래스 에서만 설정 하도록해
//		정보 오류를 막을수 있다 . 어떤달은 31 일 까지 인데 29일로 일수가 변경되면 안되는것처럼 , 이런것을 '정보은닉' 이라고 한다.
	}
}
