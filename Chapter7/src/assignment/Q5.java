package assignment;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10]; 
//		배열 만들고
		
		for(int i = 0; i<arr.length; i++) {
			
//			int randomNum = (int)(Math.random()*100+1); // 1~100 까지의 랜덤값 저장
////			랜덤수 만들고 
//			boolean flag = true; // 값이 중복되거나 3의 배수가 아닌 경우 한번더 반복 시키는 플래그 
//			
//			if(randomNum%3==0) { //3의 배수인지 확인하는 if 문
//				for(int j=0; j<arr.length; j++) { // 배열 안의 값이 중복되는 확인하는 반복문
//					if(arr[i] != randomNum) { // 배열의 값과 랜덤값 비교하는 if 문 
//						arr[i] = randomNum; // 배열에 3의 배수 저장 
//						flag = false; // 3의 배수였으므로 다음 반복을 실행
//						break;
//					} 
//				}
//			}
//			if(flag == true) {// 중복이거나 3의 배수가 아니면 다음 반복실행하지 않도록 해주는 if 
//				i--; //같은 반복을 계속하도록 i 에서 1빼줌
//			}
////			나와 다른점은 중복되는 수가 없게 계속 리턴 시키는 구문 을 넣는게 다르다 
			
			
			int randomNum = (int)(Math.random()*100+1); // 1~100 까지의 랜덤값 저장
//			랜덤수 만들고 
			boolean flag = true; // 값이 중복되거나 3의 배수가 아닌 경우 한번더 반복 시키는 플래그 
			
			if(randomNum%3==0) { //3의 배수인지 확인하는 if 문
				for(int j=0; j<arr.length; j++) { // 배열 안의 값이 중복되는 확인하는 반복문
					   // 배열의 값과 랜덤값 비교하는 if 문 
						if(arr[i] == randomNum) {; // 배열에 3의 배수 저장 
						flag = false; // 3의 배수였으므로 다음 반복을 실행
						} 
					}
				
			} else { //10으로 나누어 떨어지지 않는 경우 false 설정 
				flag = false;
			}
			if(flag == false) {// 중복이거나 3의 배수가 아니면 다음 반복실행하지 않도록 해주는 if 
				i--; //같은 반복을 계속하도록 i 에서 1빼줌
			} else {
				arr[i] = randomNum; //배열에 3의 배수 저장 
			}
//			나와 다른점은 중복되는 수가 없게 계속 리턴 시키는 구문 을 넣는게 다르다 
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
