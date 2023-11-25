package assignment;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] min = new int[10];
		int j =0;
		while(true) {
			int i = (int)(Math.random() * 99) + 1;
//			System.out.println(i);
			if(i%3==0) {
			min[j] = i;
			System.out.println("배열"+j+"에 저장된값은"+min[j]+"입니다");
			j++;
			if(min.length>10) {
				break;
			}
			}
		}
	}
}
