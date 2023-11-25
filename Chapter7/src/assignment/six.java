package assignment;

import java.util.Arrays;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] i = new int[10];
		for(int j = 0; j >=10 ; j++) {
			i[j] = (int)(Math.random()*10);
		}
		
		System.out.println("정렬전의 숫자");
		System.out.println(Arrays.toString(i));
		
		for(int c =0; c < i.length-1; c++) {
			int MinIndex = c;
			for(int d = c+1; d<i.length; d++) {
				if(i[MinIndex]> i[d]) 
					MinIndex = d;
			}
			
			int temp = i[MinIndex];
			i[MinIndex] = i[c];
			i[c]=temp;
		}
		System.out.println("정렬후");
		System.out.println(Arrays.toString(i));
	}

}
