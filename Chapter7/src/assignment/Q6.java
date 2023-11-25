package assignment;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬의 예시
		
		int [] arr = {15,7,2,9,10,12,17,11,20,5};
		int tempValue = 0;
		int tempJ = 0;
		System.out.println("정렬전"+Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {  // 배열을 처음부터 끝까지 실행하기 위한 반복문
			int min = Integer.MAX_VALUE; // 정수형 int 중의 min에 넣을수 있는 가장 큰값을 입력  !!
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					tempJ = j;
				}
			}
			tempValue = arr[i]; // 원래 값을 저장하는 변수 
			arr[i] = arr[tempJ]; // 웝래 값의 위치에 가자 작은 값의 인덱스로 해당값을 입력해주고 
			arr[tempJ] = tempValue; // 처음 자리의 값은 바꾼 값의 자리에 입력
			// 이걸 반복해서 정렬 
		}
		System.out.println("정렬후"+Arrays.toString(arr));
		int[] arr2 = {15,7,2,9,10,12,17,11,20,5};
		Arrays.sort(arr2);
		System.out.println("자바에서 지원하는 기능으로 정렬구현");
		System.out.println(Arrays.toString(arr2));
		}
		
	}


