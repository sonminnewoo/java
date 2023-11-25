package array;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[] 를 최대 4개 까지 만들어서 차원을 만들어줌 4차원까지 
		
		//2차원 배열
		int [][] arr = new int[3][3];  // 방식 1
		int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}}; // 방식2 {} , 구분 한게 앞 [3] 안에 1,2,3 으로
	
		//0 번 인덱스 
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		//1번 인덱스
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//2번 인덱스
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int [][] bookArr = new int[3][10];
		//요소가 1~10
		
		//3차원 배열
		int [][][] arr3 = new int[2][2][2]; //방식1
		
		int [][][] arr4 = {{{1,2},{3,4}},{{5,6},{7,8}}}; //방식2
		//{{{1,2},{1,2}},{{1,2},{1,2}}}; //방식2
		
		for(int i = 0 ; i<arr4.length; i++) {
			for(int j = 0 ; j<arr4[i].length; j++) {
				for(int k=0; k < arr4[i][j].length; k++) {
					System.out.println(arr4[i][j][k]);
				}
			}
		}
		
		//[][] 뒤에 [] 더생기면 가로,세로 바둑판 모양에서 뒤에 [] 추가해서 동일한 바둑판모양의 페이지 를 추가해준다
		//한게 뒤에 [3]
		
		//4차원 배열 
		
		int [][][][] arr5 = new int[2][2][2][2];
		int [][][][] arr6 = {{{{1,2},{1,2}},{{1,2},{1,2}}},{{{1,2},{1,2}},{{1,2},{1,2}}}};
		
	}
}