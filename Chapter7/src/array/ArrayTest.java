package array;

import java.lang.reflect.Array;
import java.util.Arrays;

class Student {
	
}

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 Array (이 여러가지 있지만 배열만 배움 !)
	
		int student1 = 1001;
		int student2 = 1002;
		
		// 위 반복을 줄이기 위해
		// 자료형 [] , 객체도 가능 !!! 클래스 !
		// 배열을 처음부터 개수를 정해놓고 만든다 !!
		
		// 배열 선언 방식 1 : 자료형 [] 배열이름 = new 자료형[배열개수];
		
		int [] studentArr = new int[100]; // 이 [] 안에 정확히 생성할 배열수를 입력해야 한다
		Student[] students = new Student[10]; // 객체
		
		// 배열 선언 방식 2 : 자료형 [] 배열이름 = {자료형에 맞는 값, 자료형에 맞는 값 };
		
		int [] studentIDs = {1001,1002,1003,1004,1105};
		// 배열 사용하는 방법 
		// 배열의 인덱스는 [] 안에 적는다 목차라 고 생각한다 
		// 인덱스는 0 부터 사용한다 .
		// 인덱스는 넘으면 오류가 발생한다
		studentArr[0] = 1001;
		studentArr[1] = 1002;
		
		//배열 출력
		System.out.println(studentArr[0]);
		System.out.println(studentArr[1]);

		int id = 1003;
		for(int i=2; i<=9; i++) {   // 이부분의 조건문을 10로 바꾸면 에러가 발생한다
			studentArr[i] = id;   //이런 부분은 바로 오류가 안나타 나기 때문에 배열사용하면 실행해볼것!
			id++;
			System.out.println(studentArr[i]);
		}
		//배열의 갯수 확인 변수, 배열의 실제 데이터가 저장되어 있는 크기가 아닌 
		// 처음 배열을 설정 할때 만든 배열의 크기를 알려준다 
		System.out.println(studentArr.length);
		// 위 for 문에 조건문에 위 출력 문의 매개변수 를 넣을수도 있다
		
		
		// cahr 사용
		char[] charArr = new char[26];
		char start = 'A';  //char 값은 모두다 유니코드로 되어있다
		for(int i = 0; i<charArr.length;i++) {
			charArr[i] = start;
			start++;
			System.out.println(charArr[i]+","+(int)charArr[i]);
			
		}
		System.out.println(Arrays.toString(charArr)); //toString 한줄로 배열 표시하려면 배열이름.toString 하면된다 
	}
	
}
