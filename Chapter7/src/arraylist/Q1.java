package arraylist;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 1번 문제 
		
		int[] arr = new int[5];
//		배열의 길이가 5인 정수형 배열을 선언하고,
		int arrCount = 0 ;
		for(int i =1; i<=10; i++) {
//			조건문은 배열 길이와 고려해서 정해줘야하는데 
//			리스트는 자동으로 생성되기 때문에 사용에 편리 하다 
			if(i%2 == 0) {
			arr[arrCount] = i;
			arrCount ++;
			}
		}
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);

	}

}
