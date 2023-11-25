package mydate;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyDate 클래스 완성하기
		// year, month, day 변수를 private으로 선언
		// 각 변수의 get,set 메서드를 public으로 작성
		// MyDate(int year,int month,int day) 생성자를 작성
		// isValid() : 날짜가 정상인지 판단하는 메서드 작성
		// 반환값 : String -> 유효하지 않은 날짜입니다. OR 유효한 날짜 입니다.
		MyDate date1 = new MyDate(2000,2,30);
		System.out.println(date1.isValid());
		//유효하지 않은 날짜입니다.
		MyDate date2 = new MyDate(2006,2,10);
		System.out.println(date2.isValid());
		//유효한 날짜 입니다.
		date2 = new MyDate(2001,13,10);
		System.out.println(date2.isValid());
		date2 = new MyDate(2001,12,32);
		System.out.println(date2.isValid());
		
	}

}




