package practice2;

public class Practice2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. 5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.

		for(int i= 1; i < 8; i+=2) {
			for(int j = 7; j > i ;j-=2) {
				System.out.print(" ");
			}
			for(int j= 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i= 0; i < 7; i+=2) {
			for(int j = 0; j < i; j+=2) {
				System.out.print(" ");
			}	
			for(int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		
	}
	}



