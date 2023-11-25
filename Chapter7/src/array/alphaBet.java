package array;

public class alphaBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이차원 배열 char[][] 안에 알파벳 소문자를 2글자씩 13줄 로 출력하는 프로그램을 작성하세요 
		

		char[][] alphabet = new char[13][2];
		char min1 = 'a' ;
		for(int i = 0 ; i<alphabet.length; i++ ) { // 첫번째 인덱스 값은 배열 이름.length
			for(int j = 0 ; j<alphabet[i].length; j++ ) {// 두번째 인덱스 값은 배열 이름[i].length
				
				alphabet[i][j] = min1 ;
				System.out.print(alphabet[i][j]);
				min1 ++;
			}
			System.out.println();
		}
	}
}
