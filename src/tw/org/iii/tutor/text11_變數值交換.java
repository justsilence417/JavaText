package tw.org.iii.tutor;

public class text11_變數值交換 {
	public static void main(String[] args) {
		//二進位 變數值的交換
		int a =3;
		int b =2;
		System.out.println(a & b);		
		System.out.println(a | b);
		System.out.println(a ^ b);	
		a = a^b; 
		b = a^b;
		a = a^b;
		System.out.printf("a = %d; b = %d\n", a ,b);	
	}

}
