package tw.org.iii.tutor;

public class text15_陣列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//陣列就是物件 與js一樣 =object
		//char 
		//boolean =>false
		//short => 0 
		int a;
		//整數陣列其名稱叫b
		int [] b;
		a=1;
		//因為她是陣列因此用new，放整數有三個元素
		b = new int [3];
		//被new 出來記憶體的位置，b有給到值代表完成初始化
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
		System.out.println(b.length);
		for (int i = 0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		b[0]=123;
		b[2]=-5;
		System.out.println("---");
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("------");
		System.out.println(a); //傳值
		System.out.println(b); //存放記憶體位置 =>
		System.out.println(b[0]);
		//[]中括號(肚子)裝的東西，代表index 像書籤直接代表在哪位置
		
	}

}
