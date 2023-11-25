package practice4;

import java.util.Scanner;

public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rect[] rectArr = new Rect[4];
		
		for(int i=0; i<rectArr.length; i++) {
		System.out.print("너비와 높이 >>");
			rectArr[i] =  new Rect(sc.nextInt(),sc.nextInt());
		}
		
		int total = 0;
		for(Rect rect : rectArr) {
			total += rect.getArea();
		}
		
		System.out.println("저장하엿습니다..");
		System.out.println("사각형의 전페 합은 "+total);
	}

}
