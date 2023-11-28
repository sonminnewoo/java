package Chapter5;

public class Person {
//	아래 public 을 private 으로 변경 해서 사용
//	public String name;
	private String name;
//	private 으로 선언한 변수를 사용하기 위해서 아래 처럼 get,set 을 이용해 외부에서 사용할수 있게 한다 .
	float height;
	float weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String pname) {
		name = pname;
	}
	public Person(String name, float height,float weight ) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
//	디폴트 생성자 : 일반적으로 아래 형식의 디폴트생성자가 
//	만들어 진다 하지만 , 위 처럼 name 에 매개변수를 받아오는 생성자를 만들게되면 
//	디폴트 생성자가 만들어 지지않게 되고 생성자를 호출하는 곳에서 오류가 발생한다
//	그래서 생성자는 처음부터 초기화를 진행하는 생성자와 그냥 인스턴스 를 생성한후 나중에 수정하는
//	두가지 방식의 생성자가 존재 한다 .
	
	public Person() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person lee = new Person("만유");
//		System.out.println(lee.name);
		
		Person son = new Person("손민우" , 170 , 63 );
		System.out.println(son.name+":"+son.height+":"+son.weight);
		
	}

}
