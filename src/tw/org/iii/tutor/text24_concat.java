package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class text24_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "RRRr";
		String s2 = s1.concat("chao");
		String s3 = s1.replace('r', 'R'); //字元用單引號 讓r變R
		
		System.out.println(s1);
		System.out.println(s2); //RRRrchao
		System.out.println(s3);  //RRRR
		
		System.out.println("----");
		
		//比對  ==
		int a =10, b=3;
		System.out.println(a==b); //false
		String str1 = "vooo";
		String str2 = "vooo";
		System.out.println(str1 == str2); //true
		//必較是否相同物件
		String str3 = new String("vooo");
		String str4 = new String("vooo");	
		System.out.println(str3 == str4); //false
		//因內容一樣但物件不一樣
		System.out.println(str1 == str3);
		System.out.println(str1);
		
		System.out.println("----");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1);
		
		
	}

}
