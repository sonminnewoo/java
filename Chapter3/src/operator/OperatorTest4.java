package operator;

public class OperatorTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건 연산자, 삼항 연산자 
		//      조건식 ? true : false
		int i = 10<20 ? 10 : 20;
		System.out.println(i);
		String str = 10<20 ? "참" : "거짓";
		System.out.println(str);
		
		//연산자의 우선 순위
		// 1 : (), [] , .
		// 2 : !, ++2 , --2 , -2 , +2
		// 3 : % , / , *
		// 4 : + , -
		// 5 : <, > , >=, <=
		// 6 : &&
		// 7 : ||
		// 8 : ?: (조건 연산자)
		// 9 : =, +=, -=, *=, /= (대입 연산자)
		// 10 : 2++, 2--
		int result = (-10)+(-1)+(10*2)-(10/2)+10 > 10 ? 0 : 1 ;
		System.out.println(result);
	}

}






