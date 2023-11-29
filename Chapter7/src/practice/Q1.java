package practice;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int arrCount = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				arr[arrCount] = i;
				arrCount++;
			}
		}
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}

}








