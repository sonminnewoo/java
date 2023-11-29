package hello;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요. >>");
		int n = sc.nextInt();

		int oManwon = n / 50000;
		int manwon = (n - 50000 * oManwon) / 10000;
		int cheonwon = (n - 50000 * oManwon - 10000 * manwon) / 1000;
		int obaekwon = (n - 50000 * oManwon - 10000 * manwon - 1000 * cheonwon) / 500;
		int baekwon = (n - 50000 * oManwon - 10000 * manwon - 1000 * cheonwon - 500 * obaekwon) / 100;
		int shipwon = (n - 50000 * oManwon - 10000 * manwon - 1000 * cheonwon - 500 * obaekwon - 100 * baekwon) / 10;
		int ilwon = (n - 50000 * oManwon - 10000 * manwon - 1000 * cheonwon - 500 * obaekwon - 100 * baekwon
				- 10 * shipwon) % 10;

		System.out.println("50,000원권: " + oManwon + "개");
		System.out.println("10,000원권: " + manwon + "개");
		System.out.println("1,000원권: " + cheonwon + "개");
		System.out.println("500원: " + obaekwon + "개");
		System.out.println("100원: " + baekwon + "개");
		System.out.println("10원: " + shipwon + "개");
		System.out.println("1원: " + ilwon + "개");

	}
}
