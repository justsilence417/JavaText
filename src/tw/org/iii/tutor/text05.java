package tw.org.iii.tutor;

public class text05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//兩個以上叫字串 非基本型別 是物件 與js不同
		//字串原理是字元集合
		char c1 = 'a'; //97
		char c2 = 65; // char 2^16次方 => 0~65535
		System.out.println(c1);
		System.out.println(c2);
		//查詢ascii
		int var1 = c1 + c2;
		System.out.println(var1);
		char c3 = '資';
		int var2 = c3;
		System.out.println(var2);
	}

}
