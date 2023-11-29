package sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort implements Sort {
	String sortName = "BubbleSort";
	@Override
	public void ascending(Integer[] arr) {
		System.out.print(sortName + " ascending ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public void descending(Integer[] arr) {
		System.out.println(sortName + " descending");
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 "+sortName+"입니다.");
	}

}
