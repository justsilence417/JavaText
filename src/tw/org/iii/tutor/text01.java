package tw.org.iii.tutor;

public class text01 {
	
	 /*
	  * 註解只有區塊註解跟單列註解//
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte var1; //這句代表進行宣告 
		 byte var2 = -123; //宣告同時給值 若超出byte的-128~127之外的數字 數字是int無法塞不進去byte
		 System.out.println(var2);
		 int var5 = var2 + 1 ; //出現錯誤  byte var5 = var4 + 1 ;的var4 + 1會被換成int，但要宣告byte所以錯誤，要變成宣告int
		 short var6 = 313,var7 = 123;
		 int var8 = var6 + var7;
		 
		 //------------------------------
		 //變數名稱:正規表示法 [a-zA-Z$_][a-zA-Z0-9$]*
		 byte $_$= 101;
		 System.out.println($_$);
		 int 變數1 =125;
		 System.out.println(變數1);
		
	}

}
