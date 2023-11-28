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
	public int hashCode() {
		String date = ""+year+month+day;
		return Integer.parseInt(date);
	}
	
	@Override
	public String toString() {
		return "저장된 날짜는 "+year+"년 "+month+"월 "+day+"일 입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		if(obj instanceof MyDate) {
//			MyDate myDate = (MyDate)obj;
//			if(this.year == myDate.year
//				&&this.month == myDate.month
//				&&this.day == myDate.day) {
//				return true;
//			}else {
//				return false;
//			}
//		}
		if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}
}
public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(2023,11,22);
		MyDate date2 = new MyDate(2023,11,22);
		System.out.println(date1.toString());
		//결과 : 저장된 날짜는 2023년 11월 22일 입니다.
		if(date1.equals(date2)) {
			System.out.println("두 날짜는 같습니다.");
		}else {
			System.out.println("두 날짜는 다릅니다.");
		}
		//결과 : 두 날짜는 같습니다.
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		//결과 : 20231122
	}

}




