package practice;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <=4; j++) {

			for (int k = 1 ; k  < (j*2)-1; k++) {
				System.out.print(" ");
			
			}
			for (int i = 7; i >=(j*2)-1 ; i--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
