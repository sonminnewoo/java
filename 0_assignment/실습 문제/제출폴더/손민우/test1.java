import java.util.Scanner; //입력 받을 객체 생성

public class minwoo { //클래스 생성
    public static void main(String[] args) { //메인함수 생성
        Scanner sc = new Scanner(System.in);   //입력 받는 시스템 자원 사용

        // System.out.println("두개 수를 입력해주세요!");

        // int gbb1 = sc.nextInt();
        // int gbb2 = sc.nextInt();

        // System.out.println("당신이 입력한 수는"+gbb1+"와"+gbb2+"입니다");
        // System.out.println("두수의 합은"+(gbb1+gbb2));

        // System.out.println("-----------------다른문제---------------------");
        // System.out.println("건물의 층수를 입력하세요");
        // int level = sc.nextInt();
        // System.out.println("당신이 입력한 층수는"+level+"입니다");
        // System.out.println("건물의 높이는"+level*5+"m 입니다");
        
        // System.out.println("-----------------다른문제---------------------");
        // System.out.println("x값을 입력하세요");
        // int x = sc.nextInt();
        // System.out.println("당신이 입력한 x 값은"+x+"입니다");
        // System.out.println("계산식은 y = x²-3x+7 입니다 정답 y은"+((x*x)-3*x+7)+"입니다");
        
        // System.out.println("AND 와 OR 을 입력하세요");
        // String op = sc.next();
        // System.out.println("FALSE 와 TRUE 을 입력하세요");
        // boolean a = sc.nextBoolean();
        // System.out.println("FALSE 와 TRUE 을 입력하세요");
        // boolean b = sc.nextBoolean();
        // switch (op) {
        //     case "AND" : System.out.println(a&&b);
        //         break;
        //     case "OR" : System.out.println(a||b);
        //         break;
        //     default:
        //         break;
        // }
        System.out.println("금액을 입력하세요");
        int cash = sc.nextInt();
        System.out.println(cash+"원 받았습니다");
        System.out.println("지폐 종류 별로 분류 해드리겠습니다");
        int ohman_won = cash/50000;  //5만원
        int man_won = cash/10000;  //1만원
        int chunwon = cash/1000; //1천원
        int ohbeck_won = cash/500; //500원
        int beck_won = cash/100; //100원
        int sib_won = cash/10; //10원
        int il_won = cash/1; //1원
        System.out.println("5만원 권은"+ohman_won);
        System.out.println("1만원 권은"+man_won);
        System.out.println("1천원 권은"+chunwon);
        System.out.println("500원 권은"+ohbeck_won);
        System.out.println("100원 권은"+beck_won);
        System.out.println("10원 권은"+sib_won);
        System.out.println("1원 권은"+il_won);

                
        // System.out.println("-----------------다른문제---------------------");
        // System.out.println("x값을 입력하세요");
        // int x = sc.nextInt();
        // System.out.println("당신이 입력한 x 값은"+x+"입니다");
        // System.out.println("계산식은 y = x²-3x+7 입니다 정답 y은"+x2-3x+7+"입니다");
        
        // System.out.println("학점을 입력하세요");
        // String str = sc.nextLine();
        // System.out.println("입력받은 점수는"+str+"입니다");
        // switch (str) {
        //     case "A", "B":
        //         System.out.println("Excellent");
        //         break;
        //     case "C", "D":
        //         System.out.println("Good");
        //         break;
        //     case "Fa" :
        //         System.out.println("Bye");
        //         break;
        
        //     default:
        //         break;
        // }
       
        for(int i = 0 ; i <4 ; i++){
            System.out.println("커피 종류를 알려주세요");
            String str = sc.nextLine();
            switch (str) {
            case "에스프레소" : 
                System.out.println("몇잔드릴까요?");
                int cup = sc.nextLine();    
                 int menu1 = 2000 + cup;
            case "아메리카노" : 
                System.out.println("몇잔드릴까요?");
                cup = sc.nextLine();    
                 int menu2 = 2500 + cup;
    
            case "카푸치노" : 
                System.out.println("몇잔드릴까요?");
                cup = sc.nextLine();    
                int menu3 = 3000 + cup;
    
            case "카페라떼" : 
                System.out.println("몇잔드릴까요?");
                cup = sc.nextLine();    
                int menu4 = 3500 + cup;
    
            default : 
            break;
            }
        }

    }
}
