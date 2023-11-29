package array;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열
		int[][] arr = new int[3][3];
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int [][] bookArr = new int[3][10]; 
		// 3차원 배열
		int[][][] arr3 = new int[2][2][2];
		int[][][] arr4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				for(int k=0; k<arr4[i][j].length; k++) {
					System.out.println(arr4[i][j][k]);
				}
			}
		}
		//4차원 배열
		int [][][][] arr5 = new int[2][2][2][2];
		int [][][][] arr6 = 
			{{{{1,2},{1,2}},{{1,2},{1,2}}},{{{1,2},{1,2}},{{1,2},{1,2}}}};
		
		int [][][] gugudan = new int[10][10][3];
		for(int i=0; i<gugudan.length; i++) {
			for(int j=0; j<gugudan[i].length; j++) {
				for(int k=0; k<gugudan[i][j].length; k++) {
					if(k==0) {
						gugudan[i][j][k] = i;
					}else if(k==1) {
						gugudan[i][j][k] = j;
					}else {
						gugudan[i][j][k] = i*j;
					}
				}
			}
		}
		System.out.println("asd");
	}
}









