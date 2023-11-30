package Chapter7;

public class Array1 {

	public static void main(String[] args) {
		
		int[] min = {1,2,3,4};
		int[] min2 = new int[4];
		
		System.out.println(min[0]);
		
		for (int i =0; i<min.length; i++) {
			System.out.print(min[i]);
			System.out.println(min2[i]);
		}
		for(int i : min) {
			System.out.println(i);
		}
	}

}
