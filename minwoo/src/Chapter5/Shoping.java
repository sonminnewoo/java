package Chapter5;

public class Shoping {

	int oderNum = 201800001;
	String oderId = "abc123";
	String oderDate = "2018년3월12일";
	String oderName = "홍길순";
	String oderItemNum = "PD0345-12";
	String oderAdress = "서울시 영등포구 여의도동 20번지";
	
	
	
	
	public static void main(String[] args) {
		Shoping o1 = new Shoping();
		
		System.out.println("주문 번호 :"+o1.oderNum);
		System.out.println("주문 아이디 :"+o1.oderId);
		System.out.println("주문 이름 :"+o1.oderName);
		System.out.println("주문 날짜 :"+o1.oderDate);
		System.out.println("주문 제품 번호 :"+o1.oderItemNum);
		System.out.println("배송 정보 :"+o1.oderAdress);
	}

}
