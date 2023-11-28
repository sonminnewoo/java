package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("==고객명단 추가된 순서대로 출력 ==");
//		map():중간연산 : 객체의 데이터 하나를 가지고 오는 역할 , 문자열 을 가지고 올수 있는 메서드
		customerList.stream().map(c-> c.getName()).forEach(s->System.out.println(s));
//		c 는 TravelCustomer 를 의미한다 , 모든 c 는 TravelCustomer 로 바꿀수 있다
//		s 는 TravelName 을 의미한다
//		mapToInt : 중간연산 : int 값을 가지고 오는 메서드
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
//		Price 를 퍼블릭으로 선언하면 Price 만적으면 된다
		System.out.println("총 여행 비용은 :"+total+"입니다");
		
		
		System.out.println("==20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
//		filler : c.getAge()>=20 20살 이상의 대산만 출력하게 하는구문 
//		sorted() 를 추가하면 문자열을 정렬해준다 .
	}

}
