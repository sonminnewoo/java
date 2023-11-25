package array;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {10,20,30,40,50};
		int [] arr2 = {1,2,3,4,5};
		
		for(int i = 2 ; i<arr1.length; i++) {
			arr2[i] = arr1[i] ;
			
		}
		
		System.arraycopy(arr1,0,arr2,1,4);
		// arraycopy배열 을 반복문을 쓰지 않고 복사하는 기능
		// 사용법 : System.arraycopy(복사할대상,시작인덱스,복사위치,복사 결과대상의 시작인덱스, 복사갯수);
		// 로 적으면 된다 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// toString 으로 값을 들고옴 ,Arrays 는 본래 array 에 대한 함수 
		
		
	}

}
