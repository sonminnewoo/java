package generics;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/main
public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);
		
	/*	GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder = (Powder)powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		*/
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	
	}
<<<<<<< HEAD
=======
=======
import java.util.ArrayList;

//	�젣�꼫由��씠��� : 蹂��닔�굹 硫붿꽌�뱶�쓽 �옄猷뚰삎�쓣 �븘�슂�뿉 �떎�씪 �뿬�윭媛�吏� �옄猷뚰삎�쑝濡� 
//	諛붽���닔�엳�룄濡� 留뚮뱾�뼱二쇰뒗 湲곕뒫
//	<�젣�꼫由�> (�떎�씠�븘紐щ뱶 �뿰�궛�옄) : �젣�꼫由��쓣 �꽑�뼵(�궗�슜�븯寃좊떎!)�븯�뒗 湲고샇
//	T(Type�쓽 �빟�옄) : �엫�쓽�쓽 �옄猷뚰삎�씠 �뱾�뼱媛��뒗 �옄猷뚰삎�쓽 �씠由�
//	�젣�꽕由�怨� �뒪�깭�떛�쓽 愿�怨� : �젣�꽕由���� �뒪�깭�떛 �쑝濡� �꽑�뼵�븷�닔 �뾾�떎. �븘吏� �봽濡쒓렇�옩(main)�씠 �떎�뻾�맆�븣�뒗
//	�옄猷뚰삎�씠 �젙�빐吏�吏� �븡�븯湲� ���臾몄뿉
class GenericPrinter<T>{  // �젣�꼫由� �겢�옒�뒪 �꽑�뼵
	private T material;    // �젣�꽕由� 蹂��닔 �꽑�뼵  
	public void setMaterial(T material) {  // �젣�꽕由� 留ㅺ컻蹂��닔 �궗�슜
		this.material = material; 
	}
	public T getMaterial() { // �젣�꽕由� 諛섑솚媛� �궗�슜
	return material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
}

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

	}

>>>>>>> origin/main
>>>>>>> origin/main
}
