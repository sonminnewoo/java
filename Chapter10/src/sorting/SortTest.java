package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		Integer [] arr = {17,5,8,3,4,9,1,11};
		sort.ascending(arr); //오름차순
		sort.descending(arr); // 내림차순
		sort.description();
	}

}








