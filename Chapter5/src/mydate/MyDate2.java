package mydate;

public class MyDate2 {
	//MyDate 클래스 완성하기
	// year, month, day 변수를 private으로 선언
	// 각 변수의 get,set 메서드를 public으로 작성
	// MyDate(int year,int month,int day) 생성자를 작성
	// isValid() : 날짜가 정상인지 판단하는 메서드 작성
	// 반환값 : String -> 유효하지 않은 날짜입니다. OR 유효한 날짜 입니다.
	//멤버 변수
	private int year;
	private int month;
	private int day;
	private final String FALSE_MESSAGE = "유효하지 않은 날짜입니다.";
	private final String TRUE_MESSAGE = "유효한 날짜 입니다.";
	
	public MyDate2(int year,int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String isValid() {
		String str = FALSE_MESSAGE;
		if(year >= 1) {
			if(month>=1 && month<=12) {
				switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(day>=1 && day<=31) {
						str = TRUE_MESSAGE;
					}
					break;
				case 4: case 6: case 9: case 11:
					if(day>=1 && day<=30) {
						str = TRUE_MESSAGE;
					}
				case 2:
					if(year%400==0 || (year%4==0 && year%100!=0)) {
						if(day>=1 && day<=28) {
							str = TRUE_MESSAGE;
						}
					}else {
						if(day>=1 && day<=29) {
							str = TRUE_MESSAGE;
						}
					}
					break;
				}
			}
		}
		return str;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}









