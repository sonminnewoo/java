package practice;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 4; i < 5; i-- ) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==0) {
				break;
			}
		}

	}

}
