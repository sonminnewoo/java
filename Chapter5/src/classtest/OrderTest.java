package classtest;
class Order{
// 주문번호, 주문자 아이디, 주문 날짜, 주문자 이름, 주문 상품 번호, 배송 주소
//201803120001, abc123, 2018년3월12일, 홍길동,PD0345-12, 서울시 영등포구 여의도동 20
// 기능 : 모든 내용을 출력하는 기능 (showOrderInfo)
	long orderNumber;
	String userID;
	String orderDate;
	String userName;
	String goodsID;
	String orderAddress;
	public Order() {} // 기본생성자 : 작성하지 않더라도 실행 가능(프로그램이 생성될때 컴퓨터가 생성해주어서)
	//생성자 : 인스턴스를 생성할때 사용되는 메서드
	//반드시 클래스 이름으로 만들어야하며 생성자를 작성하면 기본생성자는 없어지게됨
	//여러개의 생성자 작성 방법 (생성자 오버로드)
	//생성자의 매개변수의 갯수를 다르게 한다.
	//생성자의 매개변수 자료형을 다르게 한다. (같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	public Order(long orderNumber,String userID,
			String orderDate,String userName,
			String goodsID,String orderAddress) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.userName = userName;
		this.goodsID = goodsID;
		this.orderAddress = orderAddress;
	}
	public Order(long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Order(String userID) {
		this.userID = userID;
	}
	public Order(long orderNumber,String userID) {
		this.orderNumber = orderNumber;
		this.userID = userID;
	}
	public Order(long orderNumber,String userID,
			String orderDate) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
	}
	public Order(long orderNumber,String userID,
			String orderDate,String userName) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.userName = userName;
	}
	public Order(long orderNumber,String userID,
			String orderDate,String userName,
			String goodsID) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.userName = userName;
		this.goodsID = goodsID;
	}
	void showOrderInfo() {
		System.out.println("주문번호 :" + orderNumber);
		System.out.println("주문자 아이디 :" + userID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + userName);
		System.out.println("주문 상품 번호 : " + goodsID);
		System.out.println("배송 주소 : " + orderAddress);
	}
	//여러개의 매서드 작성 방법 (메서드 오버로드)
	//메서드의 매개변수의 갯수를 다르게 한다.
	//메서드의 매개변수 자료형을 다르게 한다. (같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	int add(int x) {
		return x+x;
	}
	long add(long x) {
		return x+x;
	}
	int add(int x, int y) {
		return x+y;
	}
	long add(long x, int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order();
		order1.orderNumber = 201803120001L;
		order1.userID = "abc123";
		order1.orderDate = "2018년3월12일";
		order1.userName = "홍길동";
		order1.goodsID = "PD0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20";
		//ctrl + 메서드 이름 클릭 : 메서드가 선언되있는 코드로 이동
		order1.showOrderInfo();
		
		Order order2 = new Order(202311030001L, "def123" , "2023년11월03일"
								, "이순신","PD7890-54","부산시 부산진구");
		order2.showOrderInfo();

	}

}






