package practice;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <=4; j++) {

			for (int k = 4 ; k  > j ; k--) {
				System.out.print(" ");
			
			}
			for (int i = 0; i <(j*2)-1 ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
