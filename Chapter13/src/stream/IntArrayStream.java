package stream;

import java.util.Arrays;

public class IntArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		int sumVal = Arrays.stream(arr).sum();
//		길이까지 더하기
		int [] arr2 = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		
		int count = (int)Arrays.stream(arr).count();
//		리스트 길이 확인하기
		
		
		
		System.out.println(sumVal);
		System.out.println(count);
		
		
	}

}
