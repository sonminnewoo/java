package array;

public class min_ArrayTest {
	
	public static void main(String[] args) {
		int student1 = 1;
		int student2 = 2;
		
		int [] studentArr = new int[10];
		Student[] students = new Student[10];
		
		int [] studentIDs= {1000,1001,1002};
		
		studentIDs[1] = 1001;
		
		System.out.println(studentIDs[1]);
		
		int id = 1;
		for(int i=2; i<=9; i++) {   // 이부분의 조건문을 10로 바꾸면 에러가 발생한다
			studentArr[i] = id;   //이런 부분은 바로 오류가 안나타 나기 때문에 배열사용하면 실행해볼것!
			id+=1;
			System.out.println(studentArr[i]);
		}
		System.out.println(studentArr.length);
		System.out.println(studentIDs.length);
	}
}
