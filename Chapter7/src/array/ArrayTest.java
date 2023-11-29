package array;

import java.util.Arrays;

class Student {
	
}
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 Array
		int studnet1 = 1001;
		int student2 = 1002;
		int student3 = 1003;
		//자료형 : 기본자료형 ,객체자료형
		//자료형 [] 배열이름 = new 자료형[배열의 갯수];
		int [] studentArr = new int[100];
		Student[] students = new Student[10];
		//자료형 [] 배열이름 = {자료형에 맞는 값,자료형에 맞는 값};
		int [] studentIDs = {1001,1002,1003,1004,1005};
		
		//배열의 인덱스는 0번부터 시작함
		studentArr[0] = 1001;
		studentArr[1] = 1002;
		System.out.println(studentArr[0]);
		System.out.println(studentArr[1]);
		
		int id = 1003;
		for(int i=2; i<50; i++) {
			studentArr[i] = id;
			id++;
			System.out.println(studentArr[i]);
		}
		//배열의 갯수 확인 변수, 배열의 데이터가 저장되어있는 크기가 아닌 처음에 설정한 크기 반환
		System.out.println(studentArr.length);
		
		char[] charArr = new char[26];
		char start = 'A';
		for(int i=0; i<charArr.length;i++) {
			charArr[i] = start;
			start++;
			System.out.println(charArr[i]+","+(int)charArr[i]);
		}
		System.out.println(Arrays.toString(charArr));
	}

}







