package practice1;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		 System.out.print("학점을 입력하세요 (A, B, C, D, F): ");
		
        String grade = scanner.nextLine();
        String result  ;
        switch (grade) {
        
        case "A" :
        	 result = "Excellent" ;
        	
        	
        case "B" : 
        	result = "Excellent" ;
        	
        	break;
        case "C" :
        	result = "good" ;
        case "D" :
        	result = "good " ;
        	break;
        case "F" :
        	result = "Bye" ;
        	break;
        default:
           result = " 올바른 학점을 입력하세요 ";
            break;
        
        }
          
        System.out.println(result);

		
	}

}
