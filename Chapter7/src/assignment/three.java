package assignment;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] multi = new int[10][10];
	
		System.out.println("곱셈표 를 출력하겠습니다");
		System.out.println("   | 1  2  3  4  5  6  7  8  9 ");
		System.out.println("---+---------------------------");
		for(int i =1; i<=9; i++ ) {
			System.out.print(" "+i+" |");
			for(int j = 1; j<=9; j++) {
				System.out.print(i*j+" ");
				} 
			System.out.println();
			}
		
		}

	}

