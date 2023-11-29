package test;

public class Test2Num6
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		int b = 0;
		int d = 7;
		String str = "*";
		for(a=0 ; a<=7 ; a++)
		{
			
			if(a%2 ==0) 
			{	
				for(d=2; d<=a; d++)
				{
					d++;
					System.out.print(" ");
				}
				for(b=7; b>a; b--)
				{
					System.out.print(str);
				}
				System.out.println();
			}
		}
		

	}

}
