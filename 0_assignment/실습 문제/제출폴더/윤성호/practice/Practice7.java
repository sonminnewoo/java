package practice;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 4; j++) {

			for (int k = 4; k > j; k--) {
				System.out.print(" ");

			}
			for (int i = 0; i < (j * 2) - 1; i++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int a = 1; a <= 3; a++) {

			for (int s = 1; s <= (a * 2) - 1; s++) {
				System.out.print(" ");

			}
			for (int d = 5; d >= (a * 2) - 1; d--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
