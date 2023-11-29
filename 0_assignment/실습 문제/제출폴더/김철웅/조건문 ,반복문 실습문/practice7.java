package practice;

public class practice7 {
	
	    public static void main(String[] args) {
	      
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" "); // 왼쪽 상단 공백
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*"); // 상단 삼각형 출력
	            }
	            System.out.println(); // 다음 행으로 이동
	        }

	        for (int i = 5 - 1; i >= 1; i--) {
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" "); // 왼쪽 하단 공백
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*"); // 하단 삼각형 출력
	            }
	            System.out.println(); // 다음 행으로 이동
	        }
	    }
	

}
