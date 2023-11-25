
package object;
class MyDate{
	int year;
	int month;
	int day;
	
	public MyDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "저장된 날짜는 "+year+"년"+month+"월"+day+"일 입니다";
		}

	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
//		if(obj instanceof MyDate) {
//			MyDate myDate = (MyDate)obj;
//			if(this.year == myDate.year) {
//				return true;
//			}
//			return false;
//		}
//		위 방법 1 
//		아래 방법2

		int i = this.hashCode();

//		if(date1.equals(date2)) 는 this 에 자기 자신 date1
//		obj 는 equals(date2) 의 () 안의값

		int j = obj.hashCode();

		if(i==j) {
			return true;
		} 
		return false;
	}

	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
	//		return super.hashCode();
		String date = ""+year+month+day;
		return Integer.parseInt(date);
//		오버라이드는 리턴값을 반환 해줘야 한다 
	}
}

public class MyDateTest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyDate date1 = new MyDate(2023,11,22);
//		MyDate date2 = new MyDate(2023,11,22);
//		
//		System.out.println(date1.toString());
//		
////		결과 : 저장된 날짜는 2023년 11월 11일 입니다.
//		
//		if(date1.equals(date2)) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다");
//		}
////		결과: 두 날짜는 같습니다.
//		System.out.println(date1.hashCode());
////		결과 : 20231122
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyDate date1 = new MyDate(2023,11,22);
//		MyDate date2 = new MyDate(2023,11,22);
		MyDate date1 = new MyDate(2023,11,23);
		MyDate date2 = new MyDate(2023,11,22);
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		
//		결과 : 저장된 날짜는 2023년 11월 22일 입니다.
		
		if(date1.equals(date2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다");
		}
//		결과: 두 날짜는 같습니다.
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
//		결과 : 20231122
//		값이 같을때만 같은 값을 가지고 있다.
//		현업에서는 언어에서 만들어진 오브젝트 클래스를 페이지로보여주지만
//		실제 도움말로 확인할수있다
	}

	
	
	
}
