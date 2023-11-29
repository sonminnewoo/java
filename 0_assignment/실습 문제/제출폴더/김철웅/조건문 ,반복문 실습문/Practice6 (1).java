package practice1;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("돈의 액수를 입력하세요: ");


        int amount = scanner.nextInt();

        int fiftyThousand = amount / 50000;
        amount %= 50000;
        int tenThousand = amount / 10000;
        amount %= 10000;
        int thousand = amount / 1000;
        amount %= 1000;
        int fiveHundred = amount / 500;
        amount %= 500;
        int hundred = amount / 100;
        amount %= 100;
        int ten = amount / 10;
        amount %=10;
        int one = amount / 1;
        amount %= 1;

      

    System.out.print    (  "오만원 " + fiftyThousand + "개, 만원 " + tenThousand + "개, 천원 " + thousand + "개, 500원 " + fiveHundred + "개, 100원 " + hundred + "개, 10원 " + ten + "개, 1원 " + one + "개");

        scanner.close();
	}

}
