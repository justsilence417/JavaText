package tw.org.iii.tutor;

public class text22_string {

	public static void main(String[] args) {
		//字串是物件 
		//方法一
		String s1 = "Apire"; //只要雙引號一出現代表就是物件
		System.out.println(s1);
		System.out.println("Apire".charAt(0));
		//.代表物件都有的 
		//方法二
		String s2 =new String();
		System.out.println(s2);
		
		//方法三
		byte [] b1 = {97,66,99,69};
		String s3 = new String(b1);
		System.out.println(s3);
	}

}
