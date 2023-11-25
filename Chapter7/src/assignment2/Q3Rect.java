package assignment2;

//멤버변수 선언
private int width  ;
private int height ;

class Q3Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		생성자 선언 
		public Q3Rect(int width,int height) {
			this.width = width ;
			this.height = height ; 
		}
		 public int getArea() { return width*height;}
		 
	System.out.println("당신이 만들고 싶은 사각형의 가로 세로를 입력하세요");
	Q3Rect na = new Q3Rect;
	
	System.out.println("당신이 만든 사각형의 가로 세로는"+na+"입니다");
	}
}
