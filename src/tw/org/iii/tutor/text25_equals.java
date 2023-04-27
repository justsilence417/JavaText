package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class text25_equals {

	public static void main(String[] args) {
		String str1 = "vivi";
		String str2 = "vivi";
		System.out.println(str1.equals(str2)); //true
//		比字串內容是否相同用:equals  = 是比較引用地址是否相同
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.equals(b2)); //false
		Bike b3 = b2;
		System.out.println(b2.equals(b3)); //true
		
		

	}

}
