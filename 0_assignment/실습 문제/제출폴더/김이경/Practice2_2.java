package practice2;

public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요 사용 . (break )

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= i; j++) {
				if(j > i) {
					break;
				}

				System.out.println(i + "*" + j + " = " + (i * j));

			}

		}
		
	}
}

/*
 * for (int j=0; ; j++ ) { if(j>10) { break;
 * 
 * 
 */
