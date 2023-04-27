package tw.org.iii.tutor;

public class text17_開始二維陣列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a =new int [3][];

		//宣告一個二維陣列名叫a 也new出來 有三個元素存放到a
		//用一維陣列的觀念去看並想成樹狀圖
		//第二個維度
		a[0] = new int [2]; //一維陣列
		a[1] = new int [3];
		a[2] = new int [4];
		System.out.print(a); //a的位置
		//只為了存取全部的元素值就用底下第一個for
		for(int[] a1 : a) {
			for(int a2 :a1) {
				System.out.print(a2+"");
			}
			System.out.println();
		}
		System.out.println("-----底下用傳統的for迴圈'");
		System.out.print(a); //a的位置
		//若還想知道i與j的index
		for(int i = 0; i<a.length;i++) {
			for(int j = 0 ;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
