package practice1;

import java.util.Scanner;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 'true AND false' 또는 'true OR false'): ");
        boolean a = scanner.nextBoolean();
        String op = scanner.next();
        boolean b = scanner.nextBoolean();

        boolean result;

        switch (op) {
            case "AND":
                result = a && b;
                break;
            case "OR":
                result = a || b;
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요 (AND 또는 OR).");
                return; // 프로그램 종료
        }

        System.out.println("결과: " + result);

       
    }
}
