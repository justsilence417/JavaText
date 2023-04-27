package tw.org.iii.tutor;

import java.util.Scanner;

public class text02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 是靜態的 不用宣告
		//void 代表方法返回類型
		//main 是方法名
		//String args[]表示入口是一個指向字符串的數組
		
		//input =>10 + 3 = 13;
		Scanner scanner = new Scanner(System.in);
		//創出物件從鍵盤輸入
		
		int x = scanner.nextInt();
		//System.out.print("x = ");
		//不想換列 將ln去掉
		//從串流取得整數 存放在x
		int y = scanner.nextInt();
		//System.out.print("y = ");
		//不想換列 將ln去掉
		int r = x+y;
		//System.out.println(r);
		//印出r
		int z = x - y;
		int a = x * y;
		int b = x / y;
		int mod =x % y;
		//mod顯示餘數
		System.out.printf("%d + %d = %d\n", x, y,r);
		//格式化輸出 %d十進位進數值
		System.out.printf("%d - %d = %d\n", x, y, z);
		//printf不會自己換列因此加上\n
		System.out.printf("%d x %d = %d\n",x,y,a);
		System.out.printf("%d / %d = %d....%d", x, y, b, mod);
		
	}

}
