package innerclass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass(); // ���� Ŭ���� ����
	}
	
	class InClass{
		
		int inNum = 100;
		//static int sInNum = 200;  //���� ��
		
		void inTest(){
			System.out.println("OutClass num = " +num + "ㅇ");
			System.out.println("OutClass sNum = " + sNum + "ㅇ");
		}
		
	    //static void sTest(){  //���� ��
	    	
	    //}
		
	}
	
	public void usingClass(){
		inClass.inTest(); //���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	
	static class InStaticClass{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest(){   //���� Ŭ������ �Ϲ� �޼���
			//num += 10;    // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("InStaticClass inNum = " + inNum + "ㅇ"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "ㅇ");
			System.out.println("OutClass sNum = " + sNum + "ㅇ");
		}
		
		static void sTest(){  // ���� Ŭ������ static �޼���
			//num += 10;   // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			//inNum += 10; // ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			
			System.out.println("OutClass sNum = " + sNum + "ㅇ");
			System.out.println("InStaticClass sInNum = " + sInNum + "ㅇ");
			
		}
	}	
}


public class InnerTest{
	
	public static void main(String[] args){
	
		OutClass outClass = new OutClass();
		System.out.println("ㅇ");
		outClass.usingClass();    // ���� Ŭ���� ��� ȣ��
	    System.out.println();
	    
	/*	OutClass.InClass inClass = outClass.new InClass();   // �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		
		System.out.println();
		
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
		*/
	}
}